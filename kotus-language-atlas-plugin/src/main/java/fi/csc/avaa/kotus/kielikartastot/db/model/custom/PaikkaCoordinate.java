/**
 * 
 */
package fi.csc.avaa.kotus.kielikartastot.db.model.custom;

import java.util.ArrayList;
import java.util.List;

import com.liferay.portal.kernel.json.JSONArray;

import fi.csc.avaa.tools.StringTools;

/**
 * Helper database POJO for SQL custom query sql id="fi.csc.avaa.kotus.kielikartastot.db.service.persistence.PaikkaFinder.findByIlmioId"
 * 
 * @author jmlehtin
 *
 */
/**
 * @author jmlehtin
 *
 */
public class PaikkaCoordinate {

	int queryIlmioId = 0;
	int paikka_id;
	String nimi_fin = null;
	String tyyppi = null;
	String alue = null;
	String sapo_linkki = null;
	double x = 0.0d;
	double y = 0.0d;
	
	public int getQueryIlmioId() {
		return queryIlmioId;
	}
	public void setQueryIlmioId(int queryIlmioId) {
		this.queryIlmioId = queryIlmioId;
	}
	public int getPaikka_id() {
		return paikka_id;
	}
	public void setPaikka_id(int paikka_id) {
		this.paikka_id = paikka_id;
	}
	public String getNimi_fin() {
		return nimi_fin;
	}
	public void setNimi_fin(String nimi_fin) {
		this.nimi_fin = nimi_fin;
	}
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public String getAlue() {
		return alue;
	}
	public void setAlue(String alue) {
		this.alue = alue;
	}
	public String getSapo_linkki() {
		return sapo_linkki;
	}
	public void setSapo_linkki(String sapo_linkki) {
		this.sapo_linkki = sapo_linkki;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	public static List<PaikkaCoordinate> getPaikkaCoordinates(List<JSONArray> dataAsJSON, int queryId) {
		List<PaikkaCoordinate> list = new ArrayList<>();
		for(JSONArray array : dataAsJSON) {
			PaikkaCoordinate pc = new PaikkaCoordinate();
			pc.setQueryIlmioId(queryId);
			pc.setPaikka_id(StringTools.isEmptyOrNull(array.getString(0)) ? 0 : Integer.parseInt(array.getString(0)));
			pc.setNimi_fin(StringTools.isEmptyOrNull(array.getString(1)) ? null : array.getString(1));
			pc.setTyyppi(StringTools.isEmptyOrNull(array.getString(2)) ? null : array.getString(2));
			pc.setAlue(StringTools.isEmptyOrNull(array.getString(3)) ? null : array.getString(3));
			pc.setSapo_linkki(StringTools.isEmptyOrNull(array.getString(4)) ? null : array.getString(4));
			pc.setX(StringTools.isEmptyOrNull(array.getString(5)) ? 0.0d : Double.parseDouble(array.getString(5)));
			pc.setY(StringTools.isEmptyOrNull(array.getString(6)) ? 0.0d : Double.parseDouble(array.getString(6)));
			list.add(pc);
		}
		return list;
	}
	
}
