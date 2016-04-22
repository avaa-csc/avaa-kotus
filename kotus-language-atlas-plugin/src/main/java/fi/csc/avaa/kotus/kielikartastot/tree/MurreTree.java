package fi.csc.avaa.kotus.kielikartastot.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.vaadin.addon.ipcforliferay.LiferayIPC;
import com.vaadin.data.Item;
import com.vaadin.data.util.HierarchicalContainer;
import com.vaadin.server.FontAwesome;
import com.vaadin.server.Resource;
import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.AbstractSelect.ItemCaptionMode;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.Tree;
import com.vaadin.ui.Tree.TreeDragMode;
import com.vaadin.ui.VerticalLayout;

import fi.csc.avaa.kotus.kielikartastot.KartastoConst;
import fi.csc.avaa.kotus.kielikartastot.KotusDbUtils;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.MinimalIlmio;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.MinimalRyhma;
import fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil;
import fi.csc.avaa.liferay.ipc.IPCDataXCoder;

/**
 * @author jmlehtin
 *
 */
public class MurreTree extends CustomComponent {

	private static final long serialVersionUID = 1L;
	private static final Log LOG = LogFactoryUtil.getLog(MurreTree.class);
	private VerticalLayout baseLayout;
	private Tree murreTree;
	private HierarchicalContainer container;
	private List<Integer> effectivelySelectedIlmioIds = new ArrayList<>();
	private Object selectedRyhmaItemId = null;
	private Object selectedIlmioItemId = null;
	private Object rootItemId = null;
	private int maxTreeDepth;
	private boolean valueChangedInUI;
	private static final int TREE_ROOT_DEPTH = 1;
	private LiferayIPC ipc;
	
	public MurreTree(LiferayIPC ipc) {
		this.baseLayout = new VerticalLayout();
		this.baseLayout.setImmediate(true);
		this.ipc = ipc;
		this.container = new HierarchicalContainer();
		this.container.addContainerProperty(KartastoConst.MURRE_TREE_PROPERTY_CAPTION, Label.class, null);
		this.container.addContainerProperty(KartastoConst.MURRE_TREE_PROPERTY_ICON, Resource.class, null);
		this.container.addContainerProperty(KartastoConst.MURRE_TREE_PROPERTY_ILMIO_ID, Integer.class, 0);
		this.container.addContainerProperty(KartastoConst.MURRE_TREE_PROPERTY_RYHMA_ID, Integer.class, 0);
		this.container.addContainerProperty(KartastoConst.MURRE_TREE_PROPERTY_ITEM_DEPTH, Integer.class, 0);
		this.murreTree = new Tree(KartastoConst.MURRE_TREE_CAPTION, this.container);
		this.murreTree.addStyleName("murre-tree");
		// Items can't be dragged
		this.murreTree.setDragMode(TreeDragMode.NONE);
		this.murreTree.setImmediate(true);
		// Items cannot be added to the tree (in the UI)
		this.murreTree.setNewItemsAllowed(false);
		// Something needs to be always selected
		this.murreTree.setNullSelectionAllowed(false);
		// Visible text for a tree item is derived from an item property
		this.murreTree.setItemCaptionMode(ItemCaptionMode.PROPERTY);
		// Visible text property ID
		this.murreTree.setItemCaptionPropertyId(KartastoConst.MURRE_TREE_PROPERTY_CAPTION);
		// Icon property ID
		this.murreTree.setItemIconPropertyId(KartastoConst.MURRE_TREE_PROPERTY_ICON);
		
		setListeners();
		this.baseLayout.addComponent(this.murreTree);
		setCompositionRoot(this.baseLayout);
	}
	
	/**
	 * Set listeners for tree events.
	 * NOTE: item click event is fired before value change event!
	 */
	private void setListeners() {
		// When an value change is detected
		murreTree.addValueChangeListener(e -> {
			if(valueChangedInUI) {
				valueChangedInUI = false;
				Object selectedId = new Object();
				if(selectedRyhmaItemId != null) {
					selectedId = selectedRyhmaItemId;
				} else if(selectedIlmioItemId != null) {
					selectedId = selectedIlmioItemId;
				}
				murreTree.setValue(selectedId);
			}
		});
		// When a click is detected
		murreTree.addItemClickListener(e -> {
			valueChangedInUI = true;
			Object clickedItemId = e.getItemId();
			Item clickedItem = container.getItem(clickedItemId);
			int itemDepth = ((Integer) clickedItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ITEM_DEPTH).getValue());
//			if(itemDepth >= maxTreeDepth-2) {
				effectivelySelectedIlmioIds.clear();
				TreeItemType itemType = ((Integer) clickedItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ILMIO_ID).getValue()) != 0 ? TreeItemType.ILMIO : TreeItemType.RYHMA;
				if(itemType == TreeItemType.ILMIO) {
					Integer clickedIlmioId = (Integer) clickedItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ILMIO_ID).getValue();
					Object previouslySelectedIlmioItemId = selectedIlmioItemId;
					if(murreTree.getParent(clickedItemId) != murreTree.getParent(previouslySelectedIlmioItemId)) {
						murreTree.collapseItemsRecursively(rootItemId);
						Object parentId = murreTree.getParent(clickedItemId);
						while(parentId != null) {
							murreTree.expandItem(parentId);
							parentId = murreTree.getParent(parentId);
						}
					}
					selectedIlmioItemId = clickedItemId;
					selectedRyhmaItemId = null;
					effectivelySelectedIlmioIds.add(clickedIlmioId);
					IlmioRyhmaIPCBean ipcData = new IlmioRyhmaIPCBean(clickedIlmioId);
					ipc.sendEvent(KartastoConst.IPC_EVENT_ILMIO_SELECTED_FROM_TREE, IPCDataXCoder.encode(ipcData));
					ipc.sendEvent(KartastoConst.IPC_EVENT_ILMIO_SELECTED_UPDATE_MAP, clickedIlmioId.toString());
				} else if(itemType == TreeItemType.RYHMA) {
					selectedRyhmaItemId = clickedItemId;
					selectedIlmioItemId = null;
					murreTree.collapseItemsRecursively(rootItemId);
					Object parentId = murreTree.getParent(clickedItemId);
					while(parentId != null) {
						murreTree.expandItem(parentId);
						parentId = murreTree.getParent(parentId);
					}
					murreTree.expandItemsRecursively(clickedItemId);
					Integer clickedRyhmaId = (Integer) clickedItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_RYHMA_ID).getValue();
					effectivelySelectedIlmioIds.addAll(KotusDbUtils.getAllLeafIlmiosUnderRyhmaId(clickedRyhmaId).stream().map(ilmio -> ilmio.getIlmio_id()).collect(Collectors.toList()));
					if(effectivelySelectedIlmioIds != null && !effectivelySelectedIlmioIds.isEmpty()) {
						boolean isYlaYlaRyhma = maxTreeDepth == 4 && itemDepth == 1;
						String selectedFromTreeData = clickedRyhmaId.toString() + "," + effectivelySelectedIlmioIds.size() + "," + isYlaYlaRyhma;
						ipc.sendEvent(KartastoConst.IPC_EVENT_RYHMA_SELECTED_FROM_TREE, selectedFromTreeData);
						ipc.sendEvent(KartastoConst.IPC_EVENT_RYHMA_SELECTED_UPDATE_MAP, clickedRyhmaId.toString());
					}
					
				}
//			}
		});
	}
	
	public void updateTree(int ylinRyhmaId, int selectedIlmioId) {
		// Create root node
		Ryhma ylinRyhma = null;
		try {
			ylinRyhma = RyhmaLocalServiceUtil.getRyhma(ylinRyhmaId);
		} catch (PortalException | SystemException e) {
			e.printStackTrace();
		} 
		if(ylinRyhma != null) {
			resetTree();
			rootItemId = addNewRyhmaItem(ylinRyhma.getTyyppi() + ": " +  ylinRyhma.getNimi(), ylinRyhma.getRyhma_id(), FontAwesome.ANCHOR, null, TREE_ROOT_DEPTH);
			updateTreeContainer(ylinRyhma.getRyhma_id(), rootItemId, selectedIlmioId, TREE_ROOT_DEPTH + 1);
		} else {
			LOG.error("Unable to create tree");
		}
	}
	
	private void resetTree() {
		container.removeAllItems();
		valueChangedInUI = false;
		effectivelySelectedIlmioIds.clear();
		selectedRyhmaItemId = null;
		selectedIlmioItemId = null;
		rootItemId = null;
		maxTreeDepth = 0;
	}

	public void updateTreeContainer(int ylaRyhmaId, Object parentItemId, int selectedIlmioId, int treeDepth) {
		// Create possible ryhmas contained within given ryhmaId
		List<MinimalRyhma> childrenRyhmas = KotusDbUtils.getRyhmasEnclosedByRyhma(Arrays.asList(ylaRyhmaId));
		Collections.sort(childrenRyhmas);
		for(MinimalRyhma childRyhma : childrenRyhmas) {
			Object newRyhmaItemId = addNewRyhmaItem(childRyhma.getTyyppi() + ": " +  childRyhma.getNimi(), childRyhma.getRyhma_id(), FontAwesome.GROUP, parentItemId, treeDepth);
			updateTreeContainer(childRyhma.getRyhma_id(), newRyhmaItemId, selectedIlmioId, treeDepth + 1);
		}
		// Finally create Ilmio leaf nodes
		if(childrenRyhmas.isEmpty()) {
			List<MinimalIlmio> ilmiosInSameRyhma = KotusDbUtils.getIlmiosByRyhmaId(Arrays.asList(ylaRyhmaId));
			Collections.sort(ilmiosInSameRyhma);
			for(MinimalIlmio ilmio : ilmiosInSameRyhma) {
				Object newIlmioItemId = addNewIlmioItem(ilmio, FontAwesome.LEAF, parentItemId, treeDepth);
				// Select ilmio in the tree that is visible in Ilmio tab
				if(ilmio.getIlmio_id() == selectedIlmioId) {
					effectivelySelectedIlmioIds.add(ilmio.getIlmio_id());
					murreTree.select(newIlmioItemId);
					ipc.sendEvent(KartastoConst.IPC_EVENT_ILMIO_SELECTED_FROM_TREE, IPCDataXCoder.encode(new IlmioRyhmaIPCBean(ilmio.getIlmio_id())));
					// Expand path to the selected ilmio
					Object parentId = container.getParent(newIlmioItemId);
					do {
						murreTree.expandItem(parentId);
					} while((parentId = container.getParent(parentId)) != null);
				}
			}
		}
		if(maxTreeDepth < treeDepth) {
			maxTreeDepth = treeDepth;
		}
	}	
	
	@SuppressWarnings("unchecked")
	private Object addNewRyhmaItem(String caption, Integer ryhmaId, Resource icon, Object parentItemId, int depth) {
		Object newItemId = container.addItem();
		Item ryhmaItem = container.getItem(newItemId);
		ryhmaItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_CAPTION).setValue(new Label(caption, ContentMode.HTML));
		ryhmaItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ICON).setValue(icon);
		ryhmaItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ILMIO_ID).setValue(0);
		ryhmaItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_RYHMA_ID).setValue(ryhmaId);
		ryhmaItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ITEM_DEPTH).setValue(depth);
		container.setParent(newItemId, parentItemId);
		container.setChildrenAllowed(newItemId, true);
		return newItemId;
	}
	
	@SuppressWarnings("unchecked")
	private Object addNewIlmioItem(MinimalIlmio ilmioData, Resource icon, Object parentItemId, int depth) {
		Object newItemId = container.addItem();
		Item ilmioItem = container.getItem(newItemId);
		ilmioItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_CAPTION).setValue(new Label(ilmioData.getIlmio(), ContentMode.HTML));
		ilmioItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ICON).setValue(icon);
		ilmioItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ILMIO_ID).setValue(ilmioData.getIlmio_id());
		ilmioItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_RYHMA_ID).setValue(0);
		ilmioItem.getItemProperty(KartastoConst.MURRE_TREE_PROPERTY_ITEM_DEPTH).setValue(depth);
		container.setChildrenAllowed(newItemId, false);
		container.setParent(newItemId, parentItemId);
		return newItemId;
	}
	
	private enum TreeItemType {
		ILMIO,
		RYHMA;
	}
}
