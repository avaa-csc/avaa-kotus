package fi.csc.avaa.kotus.kielikartastot;

import com.vaadin.shared.ui.label.ContentMode;
import com.vaadin.ui.CustomComponent;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;



/**
 * Class for creating Kotus Murrehaku home page
 * 
 * @author jmlehtin
 *
 */
public class HomePage extends CustomComponent {

	private static final long serialVersionUID = 1L;
	// Base layout for the search form tab
	private VerticalLayout tabLayout;
	
	public HomePage() {
		this.tabLayout = new VerticalLayout();
		this.tabLayout.setMargin(true);
		createHomePageContents();
		setCompositionRoot(tabLayout);
	}
	
	/**
	 * Create the actual home page contents
	 * 
	 * @param tabs
	 */
	private void createHomePageContents() {
		Label ohjeLabel = new Label(KartastoConst.HOME_TAB_OHJE_TEXT);
		ohjeLabel.addStyleName("medium-font-size");
		ohjeLabel.setContentMode(ContentMode.HTML);
		tabLayout.addComponent(ohjeLabel);
		
	}
	
}
