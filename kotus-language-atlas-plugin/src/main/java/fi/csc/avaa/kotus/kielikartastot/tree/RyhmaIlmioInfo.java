/**
 * 
 */
package fi.csc.avaa.kotus.kielikartastot.tree;

import java.util.Collections;
import java.util.List;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.server.ExternalResource;
import com.vaadin.server.FontAwesome;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.JavaScript;
import com.vaadin.ui.Label;
import com.vaadin.ui.Link;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.kotus.kielikartastot.KartastoConst;
import fi.csc.avaa.kotus.kielikartastot.KotusDbUtils;
import fi.csc.avaa.kotus.kielikartastot.KotusSearchUI;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.RelatedRyhmas;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil;
import fi.csc.avaa.liferay.ipc.IPCDataXCoder;
import fi.csc.avaa.tools.StringTools;
import fi.csc.avaa.tools.vaadin.customcomponent.HorizontalKeyValueComponent;
import fi.csc.avaa.tools.vaadin.customcomponent.HorizontalKeyValueLabel;
import fi.csc.avaa.tools.vaadin.customcomponent.CollapsibleLayout;

/**
 * @author jmlehtin
 *
 */
public class RyhmaIlmioInfo extends CustomComponent {

	private static final long serialVersionUID = 1L;
	private static final Log LOG = LogFactoryUtil.getLog(RyhmaIlmioInfo.class);
	// Base layout for the tab
	private VerticalLayout murreTreeLayout;
	private HorizontalLayout contentLayout;
	private LiferayIPC ipc;
	private MurreTree ryhmaTree;
	private VerticalLayout infoLayout;
	private CollapsibleLayout treeInfo;
	
	public RyhmaIlmioInfo(LiferayIPC ipc, TabSheet tabs) {
		this.murreTreeLayout = new VerticalLayout();
		this.murreTreeLayout.setSizeFull();
		this.murreTreeLayout.setSpacing(true);
		this.murreTreeLayout.setMargin(true);
		this.murreTreeLayout.setImmediate(true);
		
		this.contentLayout = new HorizontalLayout();
		this.contentLayout.setSizeFull();
		this.contentLayout.setSpacing(true);
		this.contentLayout.setMargin(true);
		this.contentLayout.setImmediate(true);
		this.ipc = ipc;
		
		this.ryhmaTree = new MurreTree(this.ipc);
		this.infoLayout = new VerticalLayout();
		this.infoLayout.setSpacing(true);
		this.infoLayout.setMargin(true);
		this.infoLayout.addStyleName("info-layout-container");
		
		this.treeInfo = new CollapsibleLayout(KartastoConst.RYHMA_INFO_TREE_PAGE_INFO, KartastoConst.SHOW_INFO, KartastoConst.HIDE_INFO);
		Button collapseLink = treeInfo.getCollapseLink();
		murreTreeLayout.addComponent(collapseLink);
		murreTreeLayout.setComponentAlignment(collapseLink, Alignment.MIDDLE_RIGHT);
		murreTreeLayout.addComponent(treeInfo);
		collapseLink.click();
		
		murreTreeLayout.addComponent(contentLayout);
		
		addIPCListener(tabs);
		setCompositionRoot(this.murreTreeLayout);
	}
	
	private void addIPCListener(TabSheet tabs) {
		// Disable and clear this tab when this event is received
		ipc.addLiferayIPCEventListener(KartastoConst.IPC_EVENT_START_SEARCH, event -> {
			contentLayout.removeAllComponents();
			contentLayout.addComponent(ryhmaTree);
			contentLayout.addComponent(infoLayout);
			contentLayout.setExpandRatio(ryhmaTree, 3.0f);
			contentLayout.setExpandRatio(infoLayout, 10.0f);
			tabs.getTab(KotusSearchUI.RYHMA_ILMIO_INFO_TAB_POSITION).setEnabled(false);
		});
		
		// Update ryhma tree contents (and info content) when this event is received
		ipc.addLiferayIPCEventListener(KartastoConst.IPC_EVENT_ILMIO_SELECTED_FROM_RESULTS, event -> {
			if(event.getData() != null) {
				IlmioRyhmaIPCBean ilmioData = (IlmioRyhmaIPCBean) IPCDataXCoder.decode(event.getData());
				ryhmaTree.updateTree(ilmioData.getYlinRyhmaId(), ilmioData.getSelectedIlmio().getIlmio_id());
				JavaScript.getCurrent().execute(KartastoConst.getHideNotificationJSForClassNames(KartastoConst.NOTIFICATION_CLASSNAMES_RESULT));
				tabs.getTab(KotusSearchUI.RYHMA_ILMIO_INFO_TAB_POSITION).setEnabled(true);
				tabs.setSelectedTab(KotusSearchUI.RYHMA_ILMIO_INFO_TAB_POSITION);
			}
		});
		
		// Update info tab with Ilmio data when this event is received
		ipc.addLiferayIPCEventListener(KartastoConst.IPC_EVENT_ILMIO_SELECTED_FROM_TREE, event -> {
			if(event.getData() != null) {
				IlmioRyhmaIPCBean ilmioData = (IlmioRyhmaIPCBean) IPCDataXCoder.decode(event.getData());
				updateInfoIlmioContent(ilmioData.getSelectedIlmio().getIlmio_id());
				tabs.getTab(KotusSearchUI.RYHMA_ILMIO_INFO_TAB_POSITION).setEnabled(true);
				tabs.setSelectedTab(KotusSearchUI.RYHMA_ILMIO_INFO_TAB_POSITION);
			}
		});
		
		// Update info tab with Ryhma data when this event is received
		ipc.addLiferayIPCEventListener(KartastoConst.IPC_EVENT_RYHMA_SELECTED_FROM_TREE, event -> {
			if(event.getData() != null) {
				String ipcData = event.getData();
				String[] attrs = ipcData.split(",");
				Integer ryhmaId = Integer.parseInt(attrs[0]);
				Integer relatedIlmioCount = Integer.parseInt(attrs[1]);
				Boolean isYlaYlaRyhma = Boolean.parseBoolean(attrs[2]);
				updateInfoRyhmaContent(ryhmaId, relatedIlmioCount, isYlaYlaRyhma);
				tabs.getTab(KotusSearchUI.RYHMA_ILMIO_INFO_TAB_POSITION).setEnabled(true);
				tabs.setSelectedTab(KotusSearchUI.RYHMA_ILMIO_INFO_TAB_POSITION);
			}
		});
	}
	
	/**
	 * @param ryhmaId
	 * @param ilmioCount
	 */
	private void updateInfoRyhmaContent(Integer ryhmaId, Integer ilmioCount, boolean isYlaYlaRyhma) {
		// First remove old stuff
		infoLayout.removeAllComponents();
		Ryhma ryhma = null;
		// Fetch the Ryhma referred by ryhmaId
		try {
			ryhma = RyhmaLocalServiceUtil.getRyhma(ryhmaId);
		} catch (PortalException | SystemException e) {
			LOG.error("Unable to fetch ryhma ID " + ryhmaId + " from database");
		}
		
		if(ryhma != null) {
			String ryhmaName = ryhma.getNimi();
			String ryhmaTyyppi = ryhma.getTyyppi();
			String karttaKuvaLinkki = ryhma.getKartta_kuva_linkki();
			
			// First part of the tab is related to Ilmio basic info 
			VerticalLayout  basicInfoLayout = getBasicInfoLayout();
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_RYHMA_LABEL_RYHMA_ID + ":", 3.0f, String.valueOf(ryhmaId), 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_RYHMA_LABEL_RYHMA_TYYPPI + ":", 3.0f, ryhmaTyyppi, 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_RYHMA_LABEL_RYHMA_NIMI + ":", 3.0f, ryhmaName, 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			if(!StringTools.isEmptyOrNull(karttaKuvaLinkki)) {
				basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_RYHMA_LABEL_RYHMA_KARTTA_LINKKI + ":", 3.0f, karttaKuvaLinkki, 10.0f, true, "medium-font-size", "medium-font-size key-value-label-link", null, new ExternalResource(karttaKuvaLinkki), null, null));
			}
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_RYHMA_LABEL_ILMIO_COUNT + ":", 3.0f, ilmioCount.toString(), 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			infoLayout.addComponent(basicInfoLayout);
			infoLayout.setComponentAlignment(basicInfoLayout, Alignment.TOP_LEFT);

			// Second part of the tab is a link to API to display paikkatieto related to the particular Ilmio
			VerticalLayout  linkLayout = getMoveToMapLinkLayout();
			infoLayout.addComponent(linkLayout);
			infoLayout.setComponentAlignment(linkLayout, Alignment.TOP_LEFT);

			HorizontalLayout linkToDownloadsLayout = getDownloadLinkLayout(KartastoConst.INFO_RYHMA_LINK_DOWNLOAD_RYHMA_DATA, ryhmaId, true, !isYlaYlaRyhma);
			if(linkToDownloadsLayout != null) {
				// Third part of the tab is a link to API to display download links
				infoLayout.addComponent(linkToDownloadsLayout);
				infoLayout.setComponentAlignment(linkToDownloadsLayout, Alignment.TOP_LEFT);
			}
			
		}
	}

	/**
	 * Update the contents of this tab based on given ilmioId.
	 * 
	 * @param ilmioId
	 */
	private void updateInfoIlmioContent(int ilmioId) {
		// First remove old stuff
		infoLayout.removeAllComponents();
		Ilmio ilmio = null;
		// Fetch the Ilmio referred by ilmioId
		try {
			ilmio = IlmioLocalServiceUtil.getIlmio(ilmioId);
		} catch (PortalException | SystemException e) {
			LOG.error("Unable to fetch ilmio ID " + ilmioId + " from database");
		}
		
		if(ilmio != null) {
			String ilmioName = ilmio.getIlmio();
			String ilmioTyyppi = ilmio.getTyyppi();
			String ilmioKuvaus = ilmio.getKuvaus();
			String aineisto = KotusDbUtils.getAineistoNameFromAineistoId(ilmio.getAineisto_id());
			// Fetch info regarding ryhma, ylaryhma and ylaylaryhma related to this Ilmio
			RelatedRyhmas relatedRyhmas = KotusDbUtils.getRelatedRyhmasByRyhmaId(ilmio.getRyhma_id());
			List<String> relatedPaikkas = KotusDbUtils.getRelatedPaikkaNamesByIlmioId(ilmio.getIlmio_id());
			
			// First part of the tab is related to Ilmio basic info 
			VerticalLayout  basicInfoLayout = getBasicInfoLayout();
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_ILMIO_LABEL_ILMIO_ID + ":", 3.0f, String.valueOf(ilmioId), 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_ILMIO_LABEL_ILMIO + ":", 3.0f, ilmioName, 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_ILMIO_LABEL_TYYPPI + ":", 3.0f, ilmioTyyppi, 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_ILMIO_LABEL_KUVAUS + ":", 3.0f, ilmioKuvaus, 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			basicInfoLayout.addComponent(new HorizontalKeyValueLabel(KartastoConst.INFO_ILMIO_LABEL_AINEISTO + ":", 3.0f, aineisto, 10.0f, true, "medium-font-size", "medium-font-size", null, null, null, null));
			// Show also breadcrumbs of ryhma, ylaryhma and ylaylaryhmas of Ilmio
			HorizontalLayout groupLayout = getRyhmaHorizontalLayout(relatedRyhmas);
			HorizontalKeyValueComponent groupInfoLayout = new HorizontalKeyValueComponent(KartastoConst.INFO_ILMIO_LABEL_KUULUU_RYHMIIN + ":", 3.0f, groupLayout, 10.0f, true, "medium-font-size", null, null);
			basicInfoLayout.addComponent(groupInfoLayout);
			infoLayout.addComponent(basicInfoLayout);
			infoLayout.setComponentAlignment(basicInfoLayout, Alignment.TOP_LEFT);
			
			if(!relatedPaikkas.isEmpty()) {
				// Second part of the tab is a link to the map
				VerticalLayout  linkToMapLayout = getMoveToMapLinkLayout();
				infoLayout.addComponent(linkToMapLayout);
				infoLayout.setComponentAlignment(linkToMapLayout, Alignment.TOP_LEFT);
			}
			
			HorizontalLayout linkToDownloadsLayout = getDownloadLinkLayout(KartastoConst.INFO_ILMIO_LINK_DOWNLOAD_ILMIO_DATA, ilmioId, false, true);
			if(linkToDownloadsLayout != null) {
				// Third part of the tab is a link to API to display download links
				infoLayout.addComponent(linkToDownloadsLayout);
				infoLayout.setComponentAlignment(linkToDownloadsLayout, Alignment.TOP_LEFT);
			}
			
			// Third part of the tab is related to paikkas related to the Ilmio
			VerticalLayout locationInfoLayout = getIlmioLocationsVerticalLayout(relatedPaikkas);
			infoLayout.addComponent(locationInfoLayout);
			infoLayout.setComponentAlignment(locationInfoLayout, Alignment.TOP_LEFT);
		}
	}
	
	private HorizontalLayout getDownloadLinkLayout(String downloadLabel, int id, boolean isRyhma, boolean showDownloadLink) {
		HorizontalLayout downloadLayout = null;
		if(showDownloadLink) {
			downloadLayout = new HorizontalLayout();
			downloadLayout.setSizeUndefined();
			downloadLayout.setSpacing(true);
			downloadLayout.addStyleName("download-link-container");
			Label label = new Label(downloadLabel);
			label.addStyleName("medium-font-size");
			downloadLayout.addComponent(label);
		
			Link linkToCsvData = getDownloadLink(isRyhma, KartastoConst.INFO_DOWNLOAD_CSV, id);
			linkToCsvData.addStyleName("medium-font-size link-to-download csv-download");
			// Open in new tab
			linkToCsvData.setTargetName("_new");
			downloadLayout.addComponent(linkToCsvData);
			
			Link linkToShapeData = getDownloadLink(isRyhma, KartastoConst.INFO_DOWNLOAD_SHAPE_ZIP, id);
			linkToShapeData.addStyleName("medium-font-size link-to-download shape-download");
			// Open in new tab
			linkToShapeData.setTargetName("_new");
			downloadLayout.addComponent(linkToShapeData);
		}
		return downloadLayout;
	}

	/**
	 * @return
	 */
	private VerticalLayout getBasicInfoLayout() {
		VerticalLayout  basicInfoLayout = new VerticalLayout();
		basicInfoLayout.setWidth(100, Unit.PERCENTAGE);
		basicInfoLayout.setSpacing(true);
		return basicInfoLayout;
	}
	
	/**
	 * @param downloadLabel
	 * @param urlResource
	 * @return
	 */
	private VerticalLayout getMoveToMapLinkLayout() {
		VerticalLayout linkLayout = new VerticalLayout();
		linkLayout.setWidth(100, Unit.PERCENTAGE);
		linkLayout.setSpacing(true);
		linkLayout.addStyleName("info-link-container");
		
		Button toMapBtn = new Button();
		toMapBtn.setCaption(KartastoConst.INFO_ILMIO_LINK_JUMP_TO_MAP);
		toMapBtn.setHtmlContentAllowed(true);
		toMapBtn.addStyleName("link medium-font-size link-to-map");
		JavaScript.getCurrent().execute("$('.link-to-map').attr('href', '#map-anchor');");
    	// Add click listener scroll to map
		toMapBtn.addClickListener(e -> {
			JavaScript.getCurrent().execute("$('html, body').animate({scrollTop: $($('.link-to-map').attr('href')).offset().top}, 500);return false;");
    	});
		linkLayout.addComponent(toMapBtn);
		
		return linkLayout;
	}
	
	private Link getDownloadLink(boolean isRyhma, String downloadType, int id) {
		ExternalResource extRes = null;
		if(isRyhma) {
			if(KartastoConst.INFO_DOWNLOAD_SHAPE_ZIP.equals(downloadType)) {
				extRes = new ExternalResource(KartastoConst.getGeoserverDownloadURL(KartastoConst.URL_GEOSERVER_RYHMA_ZIP_FORMAT_API, id, downloadType));
			} else if(KartastoConst.INFO_DOWNLOAD_CSV.equals(downloadType)) {
				extRes = new ExternalResource(KartastoConst.getGeoserverDownloadURL(KartastoConst.URL_GEOSERVER_RYHMA_CSV_FORMAT_API, id, downloadType));
			}
		} else {
			if(KartastoConst.INFO_DOWNLOAD_SHAPE_ZIP.equals(downloadType)) {
				extRes = new ExternalResource(KartastoConst.getGeoserverDownloadURL(KartastoConst.URL_GEOSERVER_ILMIO_ZIP_FORMAT_API, id, downloadType));
			} else if(KartastoConst.INFO_DOWNLOAD_CSV.equals(downloadType)) {
				extRes = new ExternalResource(KartastoConst.getGeoserverDownloadURL(KartastoConst.URL_GEOSERVER_ILMIO_CSV_FORMAT_API, id, downloadType));
			}
		}
		return new Link(downloadType, extRes);
	}
	
	/**
	 * 
	 * 
	 * @param ilmio
	 * @return
	 */
	private VerticalLayout getIlmioLocationsVerticalLayout(List<String> relatedPaikkas) {
		Collections.sort(relatedPaikkas);

		VerticalLayout locationInfoLayout = new VerticalLayout();
		locationInfoLayout.setStyleName("location-info-container");
		locationInfoLayout.setWidth(100, Unit.PERCENTAGE);
		locationInfoLayout.setSpacing(true);
		
		Label locationHeader = new Label();
		locationHeader.setContentMode(ContentMode.HTML);
		locationHeader.setValue("<b>" + KartastoConst.INFO_ILMIO_LOCATION_HEADER + ":</b>");
		locationHeader.addStyleName("info-location-header medium-font-size");
		Label locationValues = new Label();
		locationValues.addStyleName("small-font-size");
		locationValues.setSizeFull();
		
		StringBuffer sb = new StringBuffer();
		if(!relatedPaikkas.isEmpty()) {
			sb.append(relatedPaikkas.get(0));
			for(int i=1; i < relatedPaikkas.size(); i++) {
				sb.append(", " + relatedPaikkas.get(i));
			}
		}
		if(sb.length() > 0) {
			locationValues.setValue(sb.toString());
		} else {
			locationValues.setValue(KartastoConst.INFO_ILMIO_LOCATION_NO_LOCATIONS);
		}
		locationInfoLayout.addComponent(locationHeader);
		locationInfoLayout.addComponent(locationValues);
		return locationInfoLayout;
	}

	/**
	 * Build a breadcrumb layout using Ilmio-related ryhmas
	 * 
	 * @param relatedRyhmas
	 * @return
	 */
	private HorizontalLayout getRyhmaHorizontalLayout(RelatedRyhmas relatedRyhmas) {
		HorizontalLayout layout = new HorizontalLayout();
		if(relatedRyhmas.hasRyhma()) {
			layout.setSizeUndefined();
			HorizontalKeyValueLabel ryhma = new HorizontalKeyValueLabel(relatedRyhmas.getRyhmaTyyppi() + ": ", 2.0f, relatedRyhmas.getRyhmaNimi(), 6.0f, false, "medium-font-size", "medium-font-size", relatedRyhmas.hasYlaRyhma() ? FontAwesome.ANGLE_DOUBLE_RIGHT : null, null, null, null);
			layout.addComponentAsFirst(ryhma);
			if(relatedRyhmas.hasYlaRyhma()) {
				HorizontalKeyValueLabel ylaRyhma = new HorizontalKeyValueLabel(relatedRyhmas.getYlaryhmaTyyppi() + ": ", 2.0f, relatedRyhmas.getYlaryhmaNimi(), 6.0f, false, "medium-font-size", "medium-font-size extra-margin-right", relatedRyhmas.hasYlaYlaRyhma() ? FontAwesome.ANGLE_DOUBLE_RIGHT : null, null, null, null);
				layout.addComponentAsFirst(ylaRyhma);
				if(relatedRyhmas.hasYlaYlaRyhma()) {
					HorizontalKeyValueLabel ylaylaRyhma = new HorizontalKeyValueLabel(relatedRyhmas.getYlaylaryhmaTyyppi() + ": ", 2.0f, relatedRyhmas.getYlaylaryhmaNimi(), 6.0f, false, "medium-font-size", "medium-font-size extra-margin-right", null, null, null, null);
					layout.addComponentAsFirst(ylaylaRyhma);
				}
			}
			
		}
		return layout;
	}
}
