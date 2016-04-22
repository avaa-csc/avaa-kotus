package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Paikka}.
 * </p>
 *
 * @author CSC
 * @see Paikka
 * @generated
 */
public class PaikkaWrapper implements Paikka, ModelWrapper<Paikka> {
    private Paikka _paikka;

    public PaikkaWrapper(Paikka paikka) {
        _paikka = paikka;
    }

    @Override
    public Class<?> getModelClass() {
        return Paikka.class;
    }

    @Override
    public String getModelClassName() {
        return Paikka.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("paikka_id", getPaikka_id());
        attributes.put("aineistot", getAineistot());
        attributes.put("tunniste", getTunniste());
        attributes.put("nimi_fin", getNimi_fin());
        attributes.put("nimi_kieli", getNimi_kieli());
        attributes.put("tyyppi", getTyyppi());
        attributes.put("alue", getAlue());
        attributes.put("maa_ISO3166_1", getMaa_ISO3166_1());
        attributes.put("ajankohta", getAjankohta());
        attributes.put("selite", getSelite());
        attributes.put("kielet", getKielet());
        attributes.put("murre", getMurre());
        attributes.put("sapo_linkki", getSapo_linkki());
        attributes.put("mml_paikkaID", getMml_paikkaID());
        attributes.put("tuotu_kantaan", getTuotu_kantaan());
        attributes.put("muutettu", getMuutettu());
        attributes.put("muuttaja", getMuuttaja());
        attributes.put("poistettu", getPoistettu());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer paikka_id = (Integer) attributes.get("paikka_id");

        if (paikka_id != null) {
            setPaikka_id(paikka_id);
        }

        String aineistot = (String) attributes.get("aineistot");

        if (aineistot != null) {
            setAineistot(aineistot);
        }

        String tunniste = (String) attributes.get("tunniste");

        if (tunniste != null) {
            setTunniste(tunniste);
        }

        String nimi_fin = (String) attributes.get("nimi_fin");

        if (nimi_fin != null) {
            setNimi_fin(nimi_fin);
        }

        String nimi_kieli = (String) attributes.get("nimi_kieli");

        if (nimi_kieli != null) {
            setNimi_kieli(nimi_kieli);
        }

        String tyyppi = (String) attributes.get("tyyppi");

        if (tyyppi != null) {
            setTyyppi(tyyppi);
        }

        String alue = (String) attributes.get("alue");

        if (alue != null) {
            setAlue(alue);
        }

        String maa_ISO3166_1 = (String) attributes.get("maa_ISO3166_1");

        if (maa_ISO3166_1 != null) {
            setMaa_ISO3166_1(maa_ISO3166_1);
        }

        String ajankohta = (String) attributes.get("ajankohta");

        if (ajankohta != null) {
            setAjankohta(ajankohta);
        }

        String selite = (String) attributes.get("selite");

        if (selite != null) {
            setSelite(selite);
        }

        String kielet = (String) attributes.get("kielet");

        if (kielet != null) {
            setKielet(kielet);
        }

        String murre = (String) attributes.get("murre");

        if (murre != null) {
            setMurre(murre);
        }

        String sapo_linkki = (String) attributes.get("sapo_linkki");

        if (sapo_linkki != null) {
            setSapo_linkki(sapo_linkki);
        }

        Integer mml_paikkaID = (Integer) attributes.get("mml_paikkaID");

        if (mml_paikkaID != null) {
            setMml_paikkaID(mml_paikkaID);
        }

        Date tuotu_kantaan = (Date) attributes.get("tuotu_kantaan");

        if (tuotu_kantaan != null) {
            setTuotu_kantaan(tuotu_kantaan);
        }

        Date muutettu = (Date) attributes.get("muutettu");

        if (muutettu != null) {
            setMuutettu(muutettu);
        }

        String muuttaja = (String) attributes.get("muuttaja");

        if (muuttaja != null) {
            setMuuttaja(muuttaja);
        }

        Date poistettu = (Date) attributes.get("poistettu");

        if (poistettu != null) {
            setPoistettu(poistettu);
        }
    }

    /**
    * Returns the primary key of this paikka.
    *
    * @return the primary key of this paikka
    */
    @Override
    public int getPrimaryKey() {
        return _paikka.getPrimaryKey();
    }

    /**
    * Sets the primary key of this paikka.
    *
    * @param primaryKey the primary key of this paikka
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _paikka.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the paikka_id of this paikka.
    *
    * @return the paikka_id of this paikka
    */
    @Override
    public int getPaikka_id() {
        return _paikka.getPaikka_id();
    }

    /**
    * Sets the paikka_id of this paikka.
    *
    * @param paikka_id the paikka_id of this paikka
    */
    @Override
    public void setPaikka_id(int paikka_id) {
        _paikka.setPaikka_id(paikka_id);
    }

    /**
    * Returns the aineistot of this paikka.
    *
    * @return the aineistot of this paikka
    */
    @Override
    public java.lang.String getAineistot() {
        return _paikka.getAineistot();
    }

    /**
    * Sets the aineistot of this paikka.
    *
    * @param aineistot the aineistot of this paikka
    */
    @Override
    public void setAineistot(java.lang.String aineistot) {
        _paikka.setAineistot(aineistot);
    }

    /**
    * Returns the tunniste of this paikka.
    *
    * @return the tunniste of this paikka
    */
    @Override
    public java.lang.String getTunniste() {
        return _paikka.getTunniste();
    }

    /**
    * Sets the tunniste of this paikka.
    *
    * @param tunniste the tunniste of this paikka
    */
    @Override
    public void setTunniste(java.lang.String tunniste) {
        _paikka.setTunniste(tunniste);
    }

    /**
    * Returns the nimi_fin of this paikka.
    *
    * @return the nimi_fin of this paikka
    */
    @Override
    public java.lang.String getNimi_fin() {
        return _paikka.getNimi_fin();
    }

    /**
    * Sets the nimi_fin of this paikka.
    *
    * @param nimi_fin the nimi_fin of this paikka
    */
    @Override
    public void setNimi_fin(java.lang.String nimi_fin) {
        _paikka.setNimi_fin(nimi_fin);
    }

    /**
    * Returns the nimi_kieli of this paikka.
    *
    * @return the nimi_kieli of this paikka
    */
    @Override
    public java.lang.String getNimi_kieli() {
        return _paikka.getNimi_kieli();
    }

    /**
    * Sets the nimi_kieli of this paikka.
    *
    * @param nimi_kieli the nimi_kieli of this paikka
    */
    @Override
    public void setNimi_kieli(java.lang.String nimi_kieli) {
        _paikka.setNimi_kieli(nimi_kieli);
    }

    /**
    * Returns the tyyppi of this paikka.
    *
    * @return the tyyppi of this paikka
    */
    @Override
    public java.lang.String getTyyppi() {
        return _paikka.getTyyppi();
    }

    /**
    * Sets the tyyppi of this paikka.
    *
    * @param tyyppi the tyyppi of this paikka
    */
    @Override
    public void setTyyppi(java.lang.String tyyppi) {
        _paikka.setTyyppi(tyyppi);
    }

    /**
    * Returns the alue of this paikka.
    *
    * @return the alue of this paikka
    */
    @Override
    public java.lang.String getAlue() {
        return _paikka.getAlue();
    }

    /**
    * Sets the alue of this paikka.
    *
    * @param alue the alue of this paikka
    */
    @Override
    public void setAlue(java.lang.String alue) {
        _paikka.setAlue(alue);
    }

    /**
    * Returns the maa_ i s o3166_1 of this paikka.
    *
    * @return the maa_ i s o3166_1 of this paikka
    */
    @Override
    public java.lang.String getMaa_ISO3166_1() {
        return _paikka.getMaa_ISO3166_1();
    }

    /**
    * Sets the maa_ i s o3166_1 of this paikka.
    *
    * @param maa_ISO3166_1 the maa_ i s o3166_1 of this paikka
    */
    @Override
    public void setMaa_ISO3166_1(java.lang.String maa_ISO3166_1) {
        _paikka.setMaa_ISO3166_1(maa_ISO3166_1);
    }

    /**
    * Returns the ajankohta of this paikka.
    *
    * @return the ajankohta of this paikka
    */
    @Override
    public java.lang.String getAjankohta() {
        return _paikka.getAjankohta();
    }

    /**
    * Sets the ajankohta of this paikka.
    *
    * @param ajankohta the ajankohta of this paikka
    */
    @Override
    public void setAjankohta(java.lang.String ajankohta) {
        _paikka.setAjankohta(ajankohta);
    }

    /**
    * Returns the selite of this paikka.
    *
    * @return the selite of this paikka
    */
    @Override
    public java.lang.String getSelite() {
        return _paikka.getSelite();
    }

    /**
    * Sets the selite of this paikka.
    *
    * @param selite the selite of this paikka
    */
    @Override
    public void setSelite(java.lang.String selite) {
        _paikka.setSelite(selite);
    }

    /**
    * Returns the kielet of this paikka.
    *
    * @return the kielet of this paikka
    */
    @Override
    public java.lang.String getKielet() {
        return _paikka.getKielet();
    }

    /**
    * Sets the kielet of this paikka.
    *
    * @param kielet the kielet of this paikka
    */
    @Override
    public void setKielet(java.lang.String kielet) {
        _paikka.setKielet(kielet);
    }

    /**
    * Returns the murre of this paikka.
    *
    * @return the murre of this paikka
    */
    @Override
    public java.lang.String getMurre() {
        return _paikka.getMurre();
    }

    /**
    * Sets the murre of this paikka.
    *
    * @param murre the murre of this paikka
    */
    @Override
    public void setMurre(java.lang.String murre) {
        _paikka.setMurre(murre);
    }

    /**
    * Returns the sapo_linkki of this paikka.
    *
    * @return the sapo_linkki of this paikka
    */
    @Override
    public java.lang.String getSapo_linkki() {
        return _paikka.getSapo_linkki();
    }

    /**
    * Sets the sapo_linkki of this paikka.
    *
    * @param sapo_linkki the sapo_linkki of this paikka
    */
    @Override
    public void setSapo_linkki(java.lang.String sapo_linkki) {
        _paikka.setSapo_linkki(sapo_linkki);
    }

    /**
    * Returns the mml_paikka i d of this paikka.
    *
    * @return the mml_paikka i d of this paikka
    */
    @Override
    public int getMml_paikkaID() {
        return _paikka.getMml_paikkaID();
    }

    /**
    * Sets the mml_paikka i d of this paikka.
    *
    * @param mml_paikkaID the mml_paikka i d of this paikka
    */
    @Override
    public void setMml_paikkaID(int mml_paikkaID) {
        _paikka.setMml_paikkaID(mml_paikkaID);
    }

    /**
    * Returns the tuotu_kantaan of this paikka.
    *
    * @return the tuotu_kantaan of this paikka
    */
    @Override
    public java.util.Date getTuotu_kantaan() {
        return _paikka.getTuotu_kantaan();
    }

    /**
    * Sets the tuotu_kantaan of this paikka.
    *
    * @param tuotu_kantaan the tuotu_kantaan of this paikka
    */
    @Override
    public void setTuotu_kantaan(java.util.Date tuotu_kantaan) {
        _paikka.setTuotu_kantaan(tuotu_kantaan);
    }

    /**
    * Returns the muutettu of this paikka.
    *
    * @return the muutettu of this paikka
    */
    @Override
    public java.util.Date getMuutettu() {
        return _paikka.getMuutettu();
    }

    /**
    * Sets the muutettu of this paikka.
    *
    * @param muutettu the muutettu of this paikka
    */
    @Override
    public void setMuutettu(java.util.Date muutettu) {
        _paikka.setMuutettu(muutettu);
    }

    /**
    * Returns the muuttaja of this paikka.
    *
    * @return the muuttaja of this paikka
    */
    @Override
    public java.lang.String getMuuttaja() {
        return _paikka.getMuuttaja();
    }

    /**
    * Sets the muuttaja of this paikka.
    *
    * @param muuttaja the muuttaja of this paikka
    */
    @Override
    public void setMuuttaja(java.lang.String muuttaja) {
        _paikka.setMuuttaja(muuttaja);
    }

    /**
    * Returns the poistettu of this paikka.
    *
    * @return the poistettu of this paikka
    */
    @Override
    public java.util.Date getPoistettu() {
        return _paikka.getPoistettu();
    }

    /**
    * Sets the poistettu of this paikka.
    *
    * @param poistettu the poistettu of this paikka
    */
    @Override
    public void setPoistettu(java.util.Date poistettu) {
        _paikka.setPoistettu(poistettu);
    }

    @Override
    public boolean isNew() {
        return _paikka.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _paikka.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _paikka.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _paikka.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _paikka.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _paikka.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _paikka.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _paikka.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _paikka.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _paikka.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _paikka.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new PaikkaWrapper((Paikka) _paikka.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka) {
        return _paikka.compareTo(paikka);
    }

    @Override
    public int hashCode() {
        return _paikka.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> toCacheModel() {
        return _paikka.toCacheModel();
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka toEscapedModel() {
        return new PaikkaWrapper(_paikka.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka toUnescapedModel() {
        return new PaikkaWrapper(_paikka.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _paikka.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _paikka.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _paikka.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof PaikkaWrapper)) {
            return false;
        }

        PaikkaWrapper paikkaWrapper = (PaikkaWrapper) obj;

        if (Validator.equals(_paikka, paikkaWrapper._paikka)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Paikka getWrappedPaikka() {
        return _paikka;
    }

    @Override
    public Paikka getWrappedModel() {
        return _paikka;
    }

    @Override
    public void resetOriginalValues() {
        _paikka.resetOriginalValues();
    }
}
