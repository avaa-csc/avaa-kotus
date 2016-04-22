package fi.csc.avaa.kotus.kielikartastot.result;

import java.util.List;

import org.tepi.filtertable.FilterTable;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.data.Item;
import com.vaadin.shared.Position;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.kotus.kielikartastot.KartastoConst;
import fi.csc.avaa.kotus.kielikartastot.KotusDbUtils;
import fi.csc.avaa.kotus.kielikartastot.KotusSearchUI;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.search.IlmioIPCBean;
import fi.csc.avaa.kotus.kielikartastot.tree.IlmioRyhmaIPCBean;
import fi.csc.avaa.liferay.ipc.IPCDataXCoder;
import fi.csc.avaa.tools.vaadin.customcomponent.CollapsibleLayout;


/**
 * Class for creating Kotus Murrehaku search result table as a custom Vaadin component.
 * 
 * @author jmlehtin
 *
 */
public class ResultTable extends CustomComponent {

	private static final Log LOG = LogFactoryUtil.getLog(ResultTable.class);
	private static final long serialVersionUID = 1L;
	// Table with the ability to filter data
	private FilterTable table;
	// Base layout for result table tab
	private VerticalLayout resultTableTabLayout;
	private LiferayIPC ipc;
	// Holds info of selected ilmio and all related ryhmas it belongs to
	private IlmioRyhmaIPCBean ipcData;
	
	public ResultTable(String caption, TabSheet tabs, LiferayIPC ipc) {
		this.ipc = ipc;
		this.resultTableTabLayout = new VerticalLayout();
		this.resultTableTabLayout.setSizeFull();
		this.resultTableTabLayout.setSpacing(true);
		this.resultTableTabLayout.setMargin(true);
		this.resultTableTabLayout.addStyleName("murre-result-table-container");
		
		if(caption != null) {
			this.table = new FilterTable();
		} else {
			this.table = new FilterTable(caption);
		}

		// Table info above the actual table
		VerticalLayout tableInfoLayout = new VerticalLayout();
		tableInfoLayout.setMargin(true);
		tableInfoLayout.setSpacing(true);
		// Label containing search result metainfo
		Label tableInfoLabel = new Label();
		tableInfoLabel.setContentMode(ContentMode.HTML);
		tableInfoLabel.setImmediate(true);
		// Add label to table info layout
		tableInfoLayout.addComponent(tableInfoLabel);

		CollapsibleLayout tableInfo = new CollapsibleLayout(KartastoConst.TABLE_PAGE_INFO, KartastoConst.SHOW_INFO, KartastoConst.HIDE_INFO);
		Button collapseLink = tableInfo.getCollapseLink();
		tableInfoLayout.addComponent(collapseLink);
    	tableInfoLayout.setComponentAlignment(collapseLink, Alignment.MIDDLE_RIGHT);
		tableInfoLayout.addComponent(tableInfo);
		collapseLink.click();
		
		// Layout for the actual table
		VerticalLayout tableLayout = new VerticalLayout();
		tableLayout.setSpacing(true);
		tableLayout.setSizeFull();
		
		// Add properties (table columns) for the datasource container
		KotusSearchUI.qResultContainer.addContainerProperty(KartastoConst.TABLE_HEADER_ILMIO, Label.class, null);
		KotusSearchUI.qResultContainer.addContainerProperty(KartastoConst.TABLE_HEADER_TYYPPI, String.class, null);
		KotusSearchUI.qResultContainer.addContainerProperty(KartastoConst.TABLE_HEADER_KUVAUS, String.class, null);
		KotusSearchUI.qResultContainer.addContainerProperty(KartastoConst.TABLE_HEADER_AINEISTO, String.class, null);
		// Set table datasource
		this.table.setContainerDataSource(KotusSearchUI.qResultContainer);
		// Initially sort results based on the following column
		this.table.setSortContainerPropertyId(KartastoConst.TABLE_HEADER_ILMIO);
		
		// Set widths for potentially long column values
		this.table.setColumnExpandRatio(KartastoConst.TABLE_HEADER_ILMIO, 3.0f);
		this.table.setColumnExpandRatio(KartastoConst.TABLE_HEADER_TYYPPI, 1.0f);
		this.table.setColumnExpandRatio(KartastoConst.TABLE_HEADER_KUVAUS, 4.5f);
		this.table.setColumnExpandRatio(KartastoConst.TABLE_HEADER_AINEISTO, 2.5f);

		// Set decorator to control e.g. timeout for filtering
		this.table.setFilterDecorator(new ResultTableDecorator());
		// Table properties
		this.table.setMultiSelect(false);
		this.table.setSelectable(true);
		this.table.setImmediate(true);
		this.table.setSizeFull();
		this.table.setFilterBarVisible(true);
		this.table.setSortEnabled(true);
		this.table.setNullSelectionAllowed(false);
		addListeners(tableInfoLabel);
		tableLayout.addComponent(this.table);
		this.resultTableTabLayout.addComponent(tableInfoLayout);
		this.resultTableTabLayout.addComponent(tableLayout);
		setCompositionRoot(resultTableTabLayout);
	}
	
	private void addListeners(Label tableInfoLabel) {
		// When a row in the table is clicked, get the row ID = ilmioId
		// Then update ilmio info tab using ilmioId. Enable the ilmio info tab and select it.
		// Send an IPC message so that the map (that should be on the same page with this portlet) is also updated
		this.table.addValueChangeListener(event -> {
			if(event != null && event.getProperty() != null && event.getProperty().getValue() != null) {
				UI.getCurrent().setPollInterval(100);
				Notification searchNotif = new Notification(KartastoConst.NOTIFICATION_RESULT_MAIN, KartastoConst.NOTIFICATION_INFO, Notification.Type.HUMANIZED_MESSAGE);
				// Customize it
				searchNotif.setPosition(Position.MIDDLE_CENTER);
				searchNotif.setStyleName(KartastoConst.NOTIFICATION_CLASSNAMES_RESULT);
				searchNotif.setDelayMsec(20000);
				// Show it in the page
				searchNotif.show(UI.getCurrent().getPage());
				// Start a new thread to fetch the results of the query
				class WorkThread extends Thread {
					@Override
			        public void run() {
						try {
							UI.getCurrent().getSession().getLockInstance().lock();
							Integer clickedRowIlmioId = (Integer) event.getProperty().getValue();
							ipcData = new IlmioRyhmaIPCBean(clickedRowIlmioId);
							if(ipcData.getSelectedIlmio() != null && ipcData.getRelatedRyhmas() != null) {
								ipc.sendEvent(KartastoConst.IPC_EVENT_ILMIO_SELECTED_UPDATE_MAP, clickedRowIlmioId.toString());
								ipc.sendEvent(KartastoConst.IPC_EVENT_ILMIO_SELECTED_FROM_RESULTS, IPCDataXCoder.encode(ipcData));
							}
						} finally {
				        	UI.getCurrent().setPollInterval(-1);
				 			UI.getCurrent().getSession().getLockInstance().unlock();
				        }
			         }
			      }
				new WorkThread().start();
			}
		});
		
		// When the items in the table (container) change, update the text informing the amount of rows in the table
		this.table.addItemSetChangeListener(event -> {
			if(event.getContainer().size() > 0) {
				tableInfoLabel.setValue("<h3>Hakutulokset: </h3><h4> " + event.getContainer().size() + " kpl</h4>");
			}
		});
		
		// When this is received, start ilmio query and update table with the results
		ipc.addLiferayIPCEventListener(KartastoConst.IPC_EVENT_START_SEARCH, e -> {
			if(e.getData() != null) {
				// Create bean from serialized IPC data
				IlmioIPCBean searchParams = (IlmioIPCBean) IPCDataXCoder.decode(e.getData());
				// Get a list of Ilmio objects from the query
				List<Ilmio> searchResults = KotusDbUtils.getIlmios(	searchParams.getAineistoId(), 
																	searchParams.getIlmio(),
																	searchParams.getTyyppi(),
																	searchParams.getKuvaus(),
																	searchParams.getPaikka());
				updateResultContainer(searchResults, tableInfoLabel);
				// Send IPC message search has been completed
				ipc.sendEvent(KartastoConst.IPC_EVENT_SEARCH_COMPLETED, null);
			} else {
				LOG.warn("Received empty IPC message");
			}
		});
	}

	/**
	 * Update table datasource container with new data.
	 * 
	 * 
	 * @param searchResults
	 */
	@SuppressWarnings("unchecked")
	private void updateResultContainer(List<Ilmio> searchResults, Label tableInfoLabel) {
		int itemAmt = searchResults.size();
		// Empty container first
		KotusSearchUI.qResultContainer.removeAllItems();
		if(itemAmt > 0) {
			this.table.setVisible(true);
			this.table.setPageLength(itemAmt < 15 ? itemAmt : 15);
			this.table.select(null);
			// Then populate the datasource for each Ilmio, field by field
			for(int i=0; i < searchResults.size(); i++) {
				Ilmio ilmio = searchResults.get(i);
				int ilmioIdI = ilmio.getIlmio_id();
				String ilmioS = ilmio.getIlmio();
				String tyyppiS = ilmio.getTyyppi();
				String kuvausS = ilmio.getKuvaus();
				String aineistoNameS = KotusDbUtils.getAineistoNameFromAineistoId(ilmio.getAineisto_id());
				
				// Item corresponds to a row in the table. Item ID will be ilmioId, which is used when a row is clicked to know which Ilmio was clicked
				Item ilmioRow = KotusSearchUI.qResultContainer.addItem(ilmioIdI);
				ilmioRow.getItemProperty(KartastoConst.TABLE_HEADER_ILMIO).setValue(new Label(ilmioS, ContentMode.HTML));
				ilmioRow.getItemProperty(KartastoConst.TABLE_HEADER_TYYPPI).setValue(tyyppiS);
				ilmioRow.getItemProperty(KartastoConst.TABLE_HEADER_KUVAUS).setValue(kuvausS);
				ilmioRow.getItemProperty(KartastoConst.TABLE_HEADER_AINEISTO).setValue(aineistoNameS);
			}
		} else {
			this.table.setVisible(false);
			tableInfoLabel.setValue("<br/><br/><h4>Ei hakutuloksia</h4>");
		}
	}
}
