package fi.csc.avaa.kotus.kielikartastot;

import javax.servlet.annotation.WebServlet;

import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.annotations.Title;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.Container;
import com.vaadin.data.util.IndexedContainer;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.kotus.kielikartastot.result.ResultTable;
import fi.csc.avaa.kotus.kielikartastot.search.SearchForm;
import fi.csc.avaa.kotus.kielikartastot.tree.RyhmaIlmioInfo;

/**
 * Main class for Murrehaku portlet. Builds the UI of the portlet.
 * 
 * @author jmlehtin
 *
 */
@SuppressWarnings("serial")
@Title("Murrehaku")
public class KotusSearchUI extends UI {

    @WebServlet(value = "/VAADIN/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = true, ui = KotusSearchUI.class)
	public static class Servlet extends VaadinServlet {
	}
    
    // Base layout for the portlet
    private VerticalLayout portletLayout;
    // Base layout for the main content of the portlet
    private VerticalLayout murrehakuLayout;
    // Tabs for the portlet layout
    private TabSheet tabs;
    // Home tab
    private HomePage homePage;
    // Search tab
    private SearchForm searchForm;
    // Result table tab
    private ResultTable resultTable;
    // Ilmio and Ryhma info tab
    private RyhmaIlmioInfo murreInfo;
    // Container for holding result table row data
    public static Container qResultContainer;
    // Liferay IPC
	public LiferayIPC ipc;
	
	// Tab indices for each tab
	public static final int HOME_TAB_POSITION = 0;
//	public static final int AINEISTO_TAB_POSITION = 1;
	public static final int SEARCH_FORM_POSITION = 1;
	public static final int RESULT_TABLE_POSITION = 2;
	public static final int RYHMA_ILMIO_INFO_TAB_POSITION = 3;
    
    public KotusSearchUI() {
    	// Init search query container and Database utility class
    	qResultContainer = new IndexedContainer();
    	// IPC
    	this.ipc = new LiferayIPC();
    	ipc.extend(this);
    }

	@Override
    protected void init(VaadinRequest request) {
		// Create base portlet layout
    	portletLayout = new VerticalLayout();
    	portletLayout.setMargin(true);
    	setContent(portletLayout);
    	
    	
    	
    	// Create main content layout
    	murrehakuLayout = new VerticalLayout();
    	murrehakuLayout.setMargin(true);
    	portletLayout.addComponent(murrehakuLayout);
    	
    	// Create tab sheet as the 
    	tabs = new TabSheet();
    	tabs.setHeight(100, Unit.PERCENTAGE);
    	tabs.setImmediate(true);
    	
    	// Create the individual tabs
    	homePage = new HomePage();
    	searchForm = new SearchForm(tabs, ipc);
    	resultTable = new ResultTable(KartastoConst.TABLE_CAPTION, tabs, ipc);
    	murreInfo = new RyhmaIlmioInfo(ipc, tabs);
		
    	// Add custom components as tab components and add to main content layout
    	tabs.addTab(homePage, KartastoConst.TAB_NAME_HOME, FontAwesome.HOME, HOME_TAB_POSITION);
    	tabs.addTab(searchForm, KartastoConst.TAB_NAME_SEARCH, FontAwesome.SEARCH, SEARCH_FORM_POSITION);
    	tabs.addTab(resultTable, KartastoConst.TAB_NAME_RESULTS, FontAwesome.BARS, RESULT_TABLE_POSITION);
    	tabs.addTab(murreInfo, KartastoConst.TAB_NAME_TREE_MAP, FontAwesome.MAP_MARKER, RYHMA_ILMIO_INFO_TAB_POSITION);
    	tabs.getTab(resultTable).setEnabled(false);
    	tabs.getTab(murreInfo).setEnabled(false);
    	murrehakuLayout.addComponent(tabs);
    	
    	tabs.addSelectedTabChangeListener(e -> {
    		if(e.getTabSheet().getSelectedTab() == homePage || e.getTabSheet().getSelectedTab() == searchForm || e.getTabSheet().getSelectedTab() == resultTable) {
    			ipc.sendEvent(KartastoConst.IPC_EVENT_HIDE_MAP, null);
    		} else if(e.getTabSheet().getSelectedTab() == murreInfo) {
    			ipc.sendEvent(KartastoConst.IPC_EVENT_SHOW_MAP, null);
    		}
    	});
    }
}
