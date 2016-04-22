/**
 * 
 */
package fi.csc.avaa.kotus.kielikartastot.db.model.custom;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.json.JSONArray;

import fi.csc.avaa.tools.StringTools;

/**
 * Helper database POJO for SQL custom query sql id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioFinder.findByRyhmaId"
 * 
 * @author jmlehtin
 *
 */
/**
 * @author jmlehtin
 *
 */
public class MinimalIlmio implements Comparable<MinimalIlmio> {

	int[] queryRyhmaIds;
	int ilmio_id = 0;
	int aineisto_id = 0;
	int ryhma_id = 0;
	String ilmio = null;

	public int[] getQueryRyhmaIds() {
		return queryRyhmaIds;
	}

	public void setQueryRyhmaIds(int[] queryRyhmaIds) {
		this.queryRyhmaIds = queryRyhmaIds;
	}

	public int getIlmio_id() {
		return ilmio_id;
	}

	public void setIlmio_id(int ilmio_id) {
		this.ilmio_id = ilmio_id;
	}

	public int getAineisto_id() {
		return aineisto_id;
	}

	public void setAineisto_id(int aineisto_id) {
		this.aineisto_id = aineisto_id;
	}

	public int getRyhma_id() {
		return ryhma_id;
	}

	public void setRyhma_id(int ryhma_id) {
		this.ryhma_id = ryhma_id;
	}

	public String getIlmio() {
		return ilmio;
	}

	public void setIlmio(String ilmio) {
		this.ilmio = ilmio;
	}

	public static List<MinimalIlmio> getMinimalIlmios(List<JSONArray> dataAsJSON, int[] queryIds) {
		List<MinimalIlmio> list = new ArrayList<>();
		for(JSONArray array : dataAsJSON) {
			MinimalIlmio mi = new MinimalIlmio();
			mi.setQueryRyhmaIds(queryIds);
			mi.setIlmio_id(StringTools.isEmptyOrNull(array.getString(0)) ? 0 : Integer.parseInt(array.getString(0)));
			mi.setAineisto_id(StringTools.isEmptyOrNull(array.getString(1)) ? 0 : Integer.parseInt(array.getString(1)));
			mi.setRyhma_id(StringTools.isEmptyOrNull(array.getString(2)) ? 0 : Integer.parseInt(array.getString(2)));
			mi.setIlmio(StringTools.isEmptyOrNull(array.getString(3)) ? null : array.getString(3));
			list.add(mi);
		}
		return list;
	}

	@Override
	public int compareTo(MinimalIlmio o) {
		return this.getIlmio().compareToIgnoreCase(o.getIlmio());
	}
	
}
