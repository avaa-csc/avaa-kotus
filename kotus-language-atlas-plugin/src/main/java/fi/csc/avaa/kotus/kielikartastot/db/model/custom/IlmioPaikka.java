package fi.csc.avaa.kotus.kielikartastot.db.model.custom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.liferay.portal.kernel.json.JSONArray;

import fi.csc.avaa.tools.StringTools;

public class IlmioPaikka {

	int[] queryGroupIds;
	int ilmio_id = 0;
	String ilmioIlmio = null;
	int ilmioRyhma_id = 0;
	int ilmioAineisto_id = 0;
	String ilmioTyyppi = null;
	String ilmioKuvaus = null;
	int paikka_id = 0;
	String paikkaNimi_fin = null;
	String paikkaTyyppi = null;
	String paikkaAlue = null;
	String paikkaSapo_linkki = null;
	double paikkaX = 0.0d;
	double paikkaY = 0.0d;
	
	public int[] getQueryGroupIds() {
		return queryGroupIds;
	}
	public void setQueryGroupIds(int[] queryGroupIds) {
		this.queryGroupIds = queryGroupIds;
	}
	public int getIlmio_id() {
		return ilmio_id;
	}
	public void setIlmio_id(int ilmio_id) {
		this.ilmio_id = ilmio_id;
	}
	public String getIlmioIlmio() {
		return ilmioIlmio;
	}
	public void setIlmioIlmio(String ilmioIlmio) {
		this.ilmioIlmio = ilmioIlmio;
	}
	public int getPaikka_id() {
		return paikka_id;
	}
	public void setPaikka_id(int paikka_id) {
		this.paikka_id = paikka_id;
	}
	public String getPaikkaNimi_fin() {
		return paikkaNimi_fin;
	}
	public void setPaikkaNimi_fin(String paikkaNimi_fin) {
		this.paikkaNimi_fin = paikkaNimi_fin;
	}
	public String getPaikkaTyyppi() {
		return paikkaTyyppi;
	}
	public void setPaikkaTyyppi(String paikkaTyyppi) {
		this.paikkaTyyppi = paikkaTyyppi;
	}
	public String getPaikkaAlue() {
		return paikkaAlue;
	}
	public void setPaikkaAlue(String paikkaAlue) {
		this.paikkaAlue = paikkaAlue;
	}
	public String getPaikkaSapo_linkki() {
		return paikkaSapo_linkki;
	}
	public void setPaikkaSapo_linkki(String paikkaSapo_linkki) {
		this.paikkaSapo_linkki = paikkaSapo_linkki;
	}
	public double getPaikkaX() {
		return paikkaX;
	}
	public void setPaikkaX(double paikkaX) {
		this.paikkaX = paikkaX;
	}
	public double getPaikkaY() {
		return paikkaY;
	}
	public void setPaikkaY(double paikkaY) {
		this.paikkaY = paikkaY;
	}
	public int getIlmioRyhma_id() {
		return ilmioRyhma_id;
	}
	public void setIlmioRyhma_id(int ilmioRyhma_id) {
		this.ilmioRyhma_id = ilmioRyhma_id;
	}
	public int getIlmioAineisto_id() {
		return ilmioAineisto_id;
	}
	public void setIlmioAineisto_id(int ilmioAineisto_id) {
		this.ilmioAineisto_id = ilmioAineisto_id;
	}
	public String getIlmioTyyppi() {
		return ilmioTyyppi;
	}
	public void setIlmioTyyppi(String ilmioTyyppi) {
		this.ilmioTyyppi = ilmioTyyppi;
	}
	public String getIlmioKuvaus() {
		return ilmioKuvaus;
	}
	public void setIlmioKuvaus(String ilmioKuvaus) {
		this.ilmioKuvaus = ilmioKuvaus;
	}
	
	public static List<IlmioPaikka> getIlmioPaikkas(List<JSONArray> dataAsJSON, int[] queryIds) {
		List<IlmioPaikka> list = new ArrayList<>();
		for(JSONArray array : dataAsJSON) {
			IlmioPaikka ip = new IlmioPaikka();
			ip.setQueryGroupIds(queryIds);
			ip.setIlmio_id(StringTools.isEmptyOrNull(array.getString(0)) ? 0 : Integer.parseInt(array.getString(0)));
			ip.setIlmioIlmio(StringTools.isEmptyOrNull(array.getString(1)) ? null : array.getString(1));
			ip.setIlmioRyhma_id(StringTools.isEmptyOrNull(array.getString(2)) ? 0 : Integer.parseInt(array.getString(2)));
			ip.setIlmioAineisto_id(StringTools.isEmptyOrNull(array.getString(3)) ? 0 : Integer.parseInt(array.getString(3)));
			ip.setIlmioTyyppi(StringTools.isEmptyOrNull(array.getString(4)) ? null : array.getString(4));
			ip.setIlmioKuvaus(StringTools.isEmptyOrNull(array.getString(5)) ? null : array.getString(5));
			ip.setPaikka_id(StringTools.isEmptyOrNull(array.getString(6)) ? 0 : Integer.parseInt(array.getString(6)));
			ip.setPaikkaNimi_fin(StringTools.isEmptyOrNull(array.getString(7)) ? null : array.getString(7));
			ip.setPaikkaTyyppi(StringTools.isEmptyOrNull(array.getString(8)) ? null : array.getString(8));
			ip.setPaikkaAlue(StringTools.isEmptyOrNull(array.getString(9)) ? null : array.getString(9));
			ip.setPaikkaSapo_linkki(StringTools.isEmptyOrNull(array.getString(10)) ? null : array.getString(10));
			ip.setPaikkaX(StringTools.isEmptyOrNull(array.getString(11)) ? 0.0d : Double.parseDouble(array.getString(11)));
			ip.setPaikkaY(StringTools.isEmptyOrNull(array.getString(12)) ? 0.0d : Double.parseDouble(array.getString(12)));
			list.add(ip);
		}
		return list;
	}
	
	public static Map<Integer, List<IlmioPaikka>> getIlmioPaikkasGroupedByIlmioId(List<IlmioPaikka> ilmioPaikkas) {
		Map<Integer, List<IlmioPaikka>> grouping = new HashMap<>();
		for(IlmioPaikka ip : ilmioPaikkas) {
			int ilmioId = ip.getIlmio_id();
			List<IlmioPaikka> groupedIps = grouping.get(ilmioId);
			if(groupedIps == null) {
				groupedIps = new ArrayList<IlmioPaikka>();
			}
			groupedIps.add(ip);
			grouping.put(ilmioId, groupedIps);
		}
		return grouping;
	}
}
	