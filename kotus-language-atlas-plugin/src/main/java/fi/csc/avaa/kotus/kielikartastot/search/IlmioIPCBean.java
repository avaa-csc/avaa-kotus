package fi.csc.avaa.kotus.kielikartastot.search;

import java.io.Serializable;

/**
 * @author jmlehtin
 *
 */
public class IlmioIPCBean implements Serializable {

	private static final long serialVersionUID = 3860900080589181835L;
	private int aineistoId;
	private String ilmio;
	private String tyyppi;
	private String kuvaus;
	private String paikka;
	
	public IlmioIPCBean(int aineistoId, String ilmio, String tyyppi, String kuvaus, String paikka) {
		this.aineistoId = aineistoId;
		this.ilmio = ilmio;
		this.tyyppi = tyyppi;
		this.kuvaus = kuvaus;
		this.paikka = paikka;
	}

	public int getAineistoId() {
		return aineistoId;
	}
	public void setAineistoId(int aineistoId) {
		this.aineistoId = aineistoId;
	}
	public String getIlmio() {
		return ilmio;
	}
	public void setIlmio(String ilmio) {
		this.ilmio = ilmio;
	}
	public String getTyyppi() {
		return tyyppi;
	}
	public void setTyyppi(String tyyppi) {
		this.tyyppi = tyyppi;
	}
	public String getKuvaus() {
		return kuvaus;
	}
	public void setKuvaus(String kuvaus) {
		this.kuvaus = kuvaus;
	}
	public String getPaikka() {
		return paikka;
	}
	public void setPaikka(String paikka) {
		this.paikka = paikka;
	}
}
