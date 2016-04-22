/**
 * 
 */
package fi.csc.avaa.kotus.kielikartastot.db.model.custom;

import java.io.Serializable;

import com.liferay.portal.kernel.json.JSONArray;

import fi.csc.avaa.tools.StringTools;

/**
 * Helper database POJO for SQL custom query sql id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaFinder.findAllByRyhmaId"
 * 
 * @author jmlehtin
 *
 */
/**
 * @author jmlehtin
 *
 */
public class RelatedRyhmas implements Serializable {

	private static final long serialVersionUID = 8013719989851015698L;
	int queryGroupId;
	String ryhmaNimi = null;
	int ryhmaId = 0;
	String ryhmaTyyppi = null;
	String ylaryhmaNimi = null;
	int ylaryhmaId = 0;
	String ylaryhmaTyyppi = null;
	String ylaylaryhmaNimi = null;
	int ylaylaryhmaId = 0;
	String ylaylaryhmaTyyppi = null;
	
	public int getQueryGroupId() {
		return queryGroupId;
	}
	public void setQueryGroupId(int queryGroupId) {
		this.queryGroupId = queryGroupId;
	}
	public String getRyhmaNimi() {
		return ryhmaNimi;
	}
	public void setRyhmaNimi(String ryhmaNimi) {
		this.ryhmaNimi = ryhmaNimi;
	}
	public String getRyhmaTyyppi() {
		return ryhmaTyyppi;
	}
	public void setRyhmaTyyppi(String ryhmaTyyppi) {
		this.ryhmaTyyppi = ryhmaTyyppi;
	}
	public String getYlaryhmaNimi() {
		return ylaryhmaNimi;
	}
	public void setYlaryhmaNimi(String ylaryhmaNimi) {
		this.ylaryhmaNimi = ylaryhmaNimi;
	}
	public String getYlaryhmaTyyppi() {
		return ylaryhmaTyyppi;
	}
	public void setYlaryhmaTyyppi(String ylaryhmaTyyppi) {
		this.ylaryhmaTyyppi = ylaryhmaTyyppi;
	}
	public String getYlaylaryhmaNimi() {
		return ylaylaryhmaNimi;
	}
	public void setYlaylaryhmaNimi(String ylaylaryhmaNimi) {
		this.ylaylaryhmaNimi = ylaylaryhmaNimi;
	}
	public String getYlaylaryhmaTyyppi() {
		return ylaylaryhmaTyyppi;
	}
	public void setYlaylaryhmaTyyppi(String ylaylaryhmaTyyppi) {
		this.ylaylaryhmaTyyppi = ylaylaryhmaTyyppi;
	}
	public int getRyhmaId() {
		return ryhmaId;
	}
	public void setRyhmaId(int ryhmaId) {
		this.ryhmaId = ryhmaId;
	}
	public int getYlaryhmaId() {
		return ylaryhmaId;
	}
	public void setYlaryhmaId(int ylaryhmaId) {
		this.ylaryhmaId = ylaryhmaId;
	}
	public int getYlaylaryhmaId() {
		return ylaylaryhmaId;
	}
	public void setYlaylaryhmaId(int ylaylaryhmaId) {
		this.ylaylaryhmaId = ylaylaryhmaId;
	}
	
	public boolean hasRyhma() {
		return ryhmaId > 0;
	}
	
	public boolean hasYlaRyhma() {
		return ylaryhmaId > 0;
	}
	
	public boolean hasYlaYlaRyhma() {
		return ylaylaryhmaId > 0;
	}
	
	public static RelatedRyhmas getRelatedRyhmas(JSONArray dataAsJSON, int queryId) {
		RelatedRyhmas rr = new RelatedRyhmas();
		rr.setQueryGroupId(queryId);
		rr.setRyhmaNimi(StringTools.isEmptyOrNull(dataAsJSON.getString(0)) ? null : dataAsJSON.getString(0));
		rr.setRyhmaId(StringTools.isEmptyOrNull(dataAsJSON.getString(1)) ? 0 : Integer.parseInt(dataAsJSON.getString(1)));
		rr.setRyhmaTyyppi(StringTools.isEmptyOrNull(dataAsJSON.getString(2)) ? null : dataAsJSON.getString(2));
		rr.setYlaryhmaNimi(StringTools.isEmptyOrNull(dataAsJSON.getString(3)) ? null : dataAsJSON.getString(3));
		rr.setYlaryhmaId(StringTools.isEmptyOrNull(dataAsJSON.getString(4)) ? 0 : Integer.parseInt(dataAsJSON.getString(4)));
		rr.setYlaryhmaTyyppi(StringTools.isEmptyOrNull(dataAsJSON.getString(5)) ? null : dataAsJSON.getString(5));
		rr.setYlaylaryhmaNimi(StringTools.isEmptyOrNull(dataAsJSON.getString(6)) ? null : dataAsJSON.getString(6));
		rr.setYlaylaryhmaId(StringTools.isEmptyOrNull(dataAsJSON.getString(7)) ? 0 : Integer.parseInt(dataAsJSON.getString(7)));
		rr.setYlaylaryhmaTyyppi(StringTools.isEmptyOrNull(dataAsJSON.getString(8)) ? null : dataAsJSON.getString(8));
		return rr;
	}
	
}
