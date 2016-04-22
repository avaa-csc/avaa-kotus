package fi.csc.avaa.kotus.kielikartastot.result;

import java.util.Locale;

import org.tepi.filtertable.FilterDecorator;
import org.tepi.filtertable.numberfilter.NumberFilterPopupConfig;

import com.vaadin.server.Resource;
import com.vaadin.shared.ui.datefield.Resolution;

import fi.csc.avaa.kotus.kielikartastot.KartastoConst;

/**
 * Filter table decorator
 * 
 * @author jmlehtin
 *
 */
public class ResultTableDecorator implements FilterDecorator {

	private static final long serialVersionUID = 1L;

	@Override
	public String getEnumFilterDisplayName(Object propertyId, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource getEnumFilterIcon(Object propertyId, Object value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getBooleanFilterDisplayName(Object propertyId, boolean value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resource getBooleanFilterIcon(Object propertyId, boolean value) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isTextFilterImmediate(Object propertyId) {
		return true;
	}

	@Override
	public int getTextChangeTimeout(Object propertyId) {
		return KartastoConst.TABLE_FILTER_SEARCH_TIMEOUT;
	}

	@Override
	public String getFromCaption() {
		return "From";
	}

	@Override
	public String getToCaption() {
		return "To";
	}

	@Override
	public String getSetCaption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getClearCaption() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Resolution getDateFieldResolution(Object propertyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDateFormatPattern(Object propertyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getAllItemsVisibleString() {
		// TODO Auto-generated method stub
		return KartastoConst.TABLE_FILTER_TEXT;
	}

	@Override
	public NumberFilterPopupConfig getNumberFilterPopupConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean usePopupForNumericProperty(Object propertyId) {
		// TODO Auto-generated method stub
		return false;
	}

}
