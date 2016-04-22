package fi.csc.avaa.kotus.kielikartastot.search;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.data.Property;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.event.ShortcutAction.KeyCode;
import com.vaadin.shared.Position;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.Label;
import com.vaadin.ui.NativeSelect;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.kotus.kielikartastot.KartastoConst;
import fi.csc.avaa.kotus.kielikartastot.KotusDbUtils;
import fi.csc.avaa.kotus.kielikartastot.KotusSearchUI;
import fi.csc.avaa.liferay.ipc.IPCDataXCoder;
import fi.csc.avaa.tools.vaadin.customcomponent.CollapsibleLayout;
import fi.csc.avaa.tools.vaadin.helper.FormFieldDataBinder;



/**
 * Class for creating Kotus Murrehaku search form as a custom Vaadin component
 * 
 * @author jmlehtin
 *
 */
public class SearchForm extends CustomComponent {

	private static final long serialVersionUID = 1L;
	// Binds form fields to data source
	public FormFieldDataBinder formBinder = new FormFieldDataBinder();
	// Base layout for the search form tab
	private VerticalLayout searchFormTabLayout;
	// Header info for the search form
	private Label searchFormHeader;
	// Form info
	private CollapsibleLayout formInfo;
	// The actual form base layout
	private FormLayout form;
	private LiferayIPC ipc;
	
	public SearchForm(TabSheet tabs, LiferayIPC ipc) {
		this.searchFormTabLayout = new VerticalLayout();
		this.ipc = ipc;
		this.searchFormTabLayout.setMargin(true);
		this.searchFormTabLayout.addStyleName("murre-search-form-container");
		this.searchFormHeader = new Label();
		this.searchFormHeader.setContentMode(ContentMode.HTML);
		this.searchFormHeader.setImmediate(true);
		this.formInfo = new CollapsibleLayout(KartastoConst.SEARCH_FORM_PAGE_INFO, KartastoConst.SHOW_INFO, KartastoConst.HIDE_INFO);
		Button infoCollapseLink = this.formInfo.getCollapseLink();
		this.form = new FormLayout();
		this.searchFormTabLayout.addComponent(searchFormHeader);
		this.searchFormTabLayout.addComponent(infoCollapseLink);
		this.searchFormTabLayout.addComponent(this.formInfo);
		this.searchFormTabLayout.addComponent(this.form);
		// Fetch and set the mapping between aineisto IDs and names
		KotusDbUtils.setAineistoIdNameMap(KotusDbUtils.getAineistot(QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		createForm(tabs);
		this.searchFormTabLayout.setComponentAlignment(infoCollapseLink, Alignment.MIDDLE_RIGHT);
		infoCollapseLink.click();
		setCompositionRoot(searchFormTabLayout);
	}
	
	/**
	 * Create the actual form fields and functionalities
	 * 
	 * @param tabs
	 */
	private void createForm(TabSheet tabs) {
		searchFormHeader.setValue(KartastoConst.FORM_HEADER);
		List<String> aineistoNames = KotusDbUtils.getAllAineistoNames();
		// Create dropdown for aineistos
		NativeSelect aineistoInput = createAineistoDropdown(aineistoNames, KartastoConst.FORM_LABEL_AINEISTO);
		aineistoInput.setStyleName("aineisto-dropdown-div");
		// Create text fields. Set height because of Firefox inability to show letters fully
		TextField ilmioInput = createTextField(KartastoConst.FORM_LABEL_ILMIO, null);
		ilmioInput.setHeight(28, Unit.PIXELS);
		ilmioInput.setWidth(285, Unit.PIXELS);
		TextField tyyppiInput = createTextField(KartastoConst.FORM_LABEL_TYYPPI, null);
		tyyppiInput.setHeight(28, Unit.PIXELS);
		tyyppiInput.setWidth(285, Unit.PIXELS);
		TextField kuvausInput = createTextField(KartastoConst.FORM_LABEL_KUVAUS, null);
		kuvausInput.setHeight(28, Unit.PIXELS);
		kuvausInput.setWidth(285, Unit.PIXELS);
		TextField paikkaInput = createTextField(KartastoConst.FORM_LABEL_PAIKKA, null);
		paikkaInput.setHeight(28, Unit.PIXELS);
		paikkaInput.setWidth(285, Unit.PIXELS);
		
		// Create datasource properties to match the form fields
		Property<String> aineistoProperty = new ObjectProperty<>(KartastoConst.EMPTY_STRING);
		Property<String> ilmioProperty = new ObjectProperty<>(KartastoConst.EMPTY_STRING);
		Property<String> tyyppiProperty = new ObjectProperty<>(KartastoConst.EMPTY_STRING);
		Property<String> kuvausProperty = new ObjectProperty<>(KartastoConst.EMPTY_STRING);
		Property<String> paikkaProperty = new ObjectProperty<>(KartastoConst.EMPTY_STRING);
		
		form.addComponent(aineistoInput);
		form.addComponent(ilmioInput);
		form.addComponent(tyyppiInput);
		form.addComponent(kuvausInput);
		form.addComponent(paikkaInput);
		
		// Bind form fields to properties
		formBinder.bindField(aineistoInput, KartastoConst.FORM_LABEL_AINEISTO, aineistoProperty);
		formBinder.bindField(ilmioInput, KartastoConst.FORM_LABEL_ILMIO, ilmioProperty);
		formBinder.bindField(tyyppiInput, KartastoConst.FORM_LABEL_TYYPPI, tyyppiProperty);
		formBinder.bindField(kuvausInput, KartastoConst.FORM_LABEL_KUVAUS, kuvausProperty);
		formBinder.bindField(paikkaInput, KartastoConst.FORM_LABEL_PAIKKA, paikkaProperty);

		// Search button. Pressing ENTER will invoke search button click
		Button searchButton = new Button(KartastoConst.FORM_SUBMIT_LABEL);
		searchButton.addStyleName("kotus-search-button");
		searchButton.setClickShortcut(KeyCode.ENTER);
		form.addComponent(searchButton);
		addSearchClickListener(searchButton, tabs);
		addSearchCompletedListener(tabs);		
	}
	
	/**
	 * Do this when search results are available
	 * 
	 * @param tabs
	 */
	private void addSearchCompletedListener(TabSheet tabs) {
		ipc.addLiferayIPCEventListener(KartastoConst.IPC_EVENT_SEARCH_COMPLETED, e -> {
			// Enable result table tab and select it
			JavaScript.getCurrent().execute(KartastoConst.getHideNotificationJSForClassNames(KartastoConst.NOTIFICATION_CLASSNAMES_SEARCH));
			tabs.getTab(KotusSearchUI.RESULT_TABLE_POSITION).setEnabled(true);
 			tabs.setSelectedTab(KotusSearchUI.RESULT_TABLE_POSITION);
 			UI.getCurrent().setPollInterval(-1);
		});
	}
	
	private void addSearchClickListener(Button searchBtn, TabSheet tabs) {
		// When search button is clicked, display a notification
		searchBtn.addClickListener(event -> {
			UI.getCurrent().setPollInterval(100);
			Notification searchNotif = new Notification(KartastoConst.NOTIFICATION_SEARCH_MAIN, KartastoConst.NOTIFICATION_INFO, Notification.Type.HUMANIZED_MESSAGE);
			// Customize it
			searchNotif.setPosition(Position.MIDDLE_CENTER);
			searchNotif.setStyleName(KartastoConst.NOTIFICATION_CLASSNAMES_SEARCH);
			searchNotif.setDelayMsec(20000);
			// Show it in the page
			searchNotif.show(UI.getCurrent().getPage());
			// Start a new thread to fetch the results of the query
			class WorkThread extends Thread {
				@Override
		        public void run() {
					try {
						UI.getCurrent().getSession().getLockInstance().lock();
						// Resolve aineisto ID
						Integer aineistoId = KotusDbUtils.getAineistoIdFromAineistoName(formBinder.getField(KartastoConst.FORM_LABEL_AINEISTO).toString());
						// Create bean to enable sending data to result table via IPC (formBinder cannot be directly sent, IPC will fail)
						IlmioIPCBean bean = new IlmioIPCBean(aineistoId, formBinder.getField(KartastoConst.FORM_LABEL_ILMIO).toString(), formBinder.getField(KartastoConst.FORM_LABEL_TYYPPI).toString(), formBinder.getField(KartastoConst.FORM_LABEL_KUVAUS).toString(), formBinder.getField(KartastoConst.FORM_LABEL_PAIKKA).toString());
						// Serialize form data
						String encoded = IPCDataXCoder.encode(bean);
						ipc.sendEvent(KartastoConst.IPC_EVENT_START_SEARCH, encoded);
						ipc.sendEvent(KartastoConst.IPC_EVENT_HIDE_MAP, null);
					} finally {
			        	UI.getCurrent().setPollInterval(-1);
			 			UI.getCurrent().getSession().getLockInstance().unlock();
			        }
		         }
		      }
			new WorkThread().start();
		});
	}

	private NativeSelect createAineistoDropdown(List<String> aineistot, String label) {
		NativeSelect selection = new NativeSelect(label);
        for (String aineisto : aineistot) {
        	selection.addItem(aineisto);
        }
 
        selection.setNullSelectionItemId(KartastoConst.FORM_ALL_AINEISTOT);
        selection.setNullSelectionAllowed(true);
        selection.setValue(KartastoConst.FORM_ALL_AINEISTOT);
        selection.setImmediate(true);
        return selection;
	}

	private TextField createTextField(String label, String inputPrompt) {
		 TextField tf = new TextField();
		 tf.setCaption(label);
		 tf.setImmediate(true);
		 if(inputPrompt != null) {
			 tf.setInputPrompt(inputPrompt);
		 }
		 return tf;
	}
}
