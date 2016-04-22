/**
 * 
 */
package fi.csc.avaa.kotus.kielikartastot.db.model.custom;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.json.JSONArray;

import fi.csc.avaa.tools.StringTools;

/**
 * Helper database POJO for SQL custom query sql id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaFinder.findByYlaryhma"
 * 
 * @author jmlehtin
 *
 */
/**
 * @author jmlehtin
 *
 */
public class MinimalRyhma implements Comparable<MinimalRyhma> {

	int[] queryYlaRyhmaIds;
	int ryhma_id = 0;
	int aineisto_id = 0;
	String nimi = null;
	String tyyppi = null;
	int ylaryhma = 0;

	public int[] getQueryYlaRyhmaIds() {
		return queryYlaRyhmaIds;
	}

	public void setQueryYlaRyhmaIds(int[] queryYlaRyhmaIds) {
		this.queryYlaRyhmaIds = queryYlaRyhmaIds;
	}

	public int getRyhma_id() {
		return ryhma_id;
	}

	public void setRyhma_id(int ryhma_id) {
		this.ryhma_id = ryhma_id;
	}

	public int getAineisto_id() {
		return aineisto_id;
	}

	public void setAineisto_id(int aineisto_id) {
		this.aineisto_id = aineisto_id;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getTyyppi() {
		return tyyppi;
	}

	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}

	public int getYlaryhma() {
		return ylaryhma;
	}

	public void setYlaryhma(int ylaryhma) {
		this.ylaryhma = ylaryhma;
	}

	public static List<MinimalRyhma> getMinimalRyhmas(List<JSONArray> dataAsJSON, int[] queryIds) {
		List<MinimalRyhma> list = new ArrayList<>();
		for(JSONArray array : dataAsJSON) {
			MinimalRyhma mr = new MinimalRyhma();
			mr.setQueryYlaRyhmaIds(queryIds);
			mr.setRyhma_id(StringTools.isEmptyOrNull(array.getString(0)) ? 0 : Integer.parseInt(array.getString(0)));
			mr.setAineisto_id(StringTools.isEmptyOrNull(array.getString(1)) ? 0 : Integer.parseInt(array.getString(1)));
			mr.setNimi(StringTools.isEmptyOrNull(array.getString(2)) ? null : array.getString(2));
			mr.setTyyppi(StringTools.isEmptyOrNull(array.getString(3)) ? null : array.getString(3));
			mr.setYlaryhma(StringTools.isEmptyOrNull(array.getString(4)) ? 0 : Integer.parseInt(array.getString(4)));
			list.add(mr);
		}
		return list;
	}

	@Override
	public int compareTo(MinimalRyhma o) {
		return this.getNimi().compareToIgnoreCase(o.getNimi());
	}
	
}
