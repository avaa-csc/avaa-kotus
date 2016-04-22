package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Aineisto}.
 * </p>
 *
 * @author CSC
 * @see Aineisto
 * @generated
 */
public class AineistoWrapper implements Aineisto, ModelWrapper<Aineisto> {
    private Aineisto _aineisto;

    public AineistoWrapper(Aineisto aineisto) {
        _aineisto = aineisto;
    }

    @Override
    public Class<?> getModelClass() {
        return Aineisto.class;
    }

    @Override
    public String getModelClassName() {
        return Aineisto.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("aineisto_id", getAineisto_id());
        attributes.put("nimi", getNimi());
        attributes.put("tunnus", getTunnus());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("paikkatietosysteemi", getPaikkatietosysteemi());
        attributes.put("infolinkki", getInfolinkki());
        attributes.put("kayttolupa", getKayttolupa());
        attributes.put("tuotu_kantaan", getTuotu_kantaan());
        attributes.put("muutettu", getMuutettu());
        attributes.put("muuttaja", getMuuttaja());
        attributes.put("poistettu", getPoistettu());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer aineisto_id = (Integer) attributes.get("aineisto_id");

        if (aineisto_id != null) {
            setAineisto_id(aineisto_id);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String tunnus = (String) attributes.get("tunnus");

        if (tunnus != null) {
            setTunnus(tunnus);
        }

        String kuvaus = (String) attributes.get("kuvaus");

        if (kuvaus != null) {
            setKuvaus(kuvaus);
        }

        String paikkatietosysteemi = (String) attributes.get(
                "paikkatietosysteemi");

        if (paikkatietosysteemi != null) {
            setPaikkatietosysteemi(paikkatietosysteemi);
        }

        String infolinkki = (String) attributes.get("infolinkki");

        if (infolinkki != null) {
            setInfolinkki(infolinkki);
        }

        String kayttolupa = (String) attributes.get("kayttolupa");

        if (kayttolupa != null) {
            setKayttolupa(kayttolupa);
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
    * Returns the primary key of this aineisto.
    *
    * @return the primary key of this aineisto
    */
    @Override
    public int getPrimaryKey() {
        return _aineisto.getPrimaryKey();
    }

    /**
    * Sets the primary key of this aineisto.
    *
    * @param primaryKey the primary key of this aineisto
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _aineisto.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the aineisto_id of this aineisto.
    *
    * @return the aineisto_id of this aineisto
    */
    @Override
    public int getAineisto_id() {
        return _aineisto.getAineisto_id();
    }

    /**
    * Sets the aineisto_id of this aineisto.
    *
    * @param aineisto_id the aineisto_id of this aineisto
    */
    @Override
    public void setAineisto_id(int aineisto_id) {
        _aineisto.setAineisto_id(aineisto_id);
    }

    /**
    * Returns the nimi of this aineisto.
    *
    * @return the nimi of this aineisto
    */
    @Override
    public java.lang.String getNimi() {
        return _aineisto.getNimi();
    }

    /**
    * Sets the nimi of this aineisto.
    *
    * @param nimi the nimi of this aineisto
    */
    @Override
    public void setNimi(java.lang.String nimi) {
        _aineisto.setNimi(nimi);
    }

    /**
    * Returns the tunnus of this aineisto.
    *
    * @return the tunnus of this aineisto
    */
    @Override
    public java.lang.String getTunnus() {
        return _aineisto.getTunnus();
    }

    /**
    * Sets the tunnus of this aineisto.
    *
    * @param tunnus the tunnus of this aineisto
    */
    @Override
    public void setTunnus(java.lang.String tunnus) {
        _aineisto.setTunnus(tunnus);
    }

    /**
    * Returns the kuvaus of this aineisto.
    *
    * @return the kuvaus of this aineisto
    */
    @Override
    public java.lang.String getKuvaus() {
        return _aineisto.getKuvaus();
    }

    /**
    * Sets the kuvaus of this aineisto.
    *
    * @param kuvaus the kuvaus of this aineisto
    */
    @Override
    public void setKuvaus(java.lang.String kuvaus) {
        _aineisto.setKuvaus(kuvaus);
    }

    /**
    * Returns the paikkatietosysteemi of this aineisto.
    *
    * @return the paikkatietosysteemi of this aineisto
    */
    @Override
    public java.lang.String getPaikkatietosysteemi() {
        return _aineisto.getPaikkatietosysteemi();
    }

    /**
    * Sets the paikkatietosysteemi of this aineisto.
    *
    * @param paikkatietosysteemi the paikkatietosysteemi of this aineisto
    */
    @Override
    public void setPaikkatietosysteemi(java.lang.String paikkatietosysteemi) {
        _aineisto.setPaikkatietosysteemi(paikkatietosysteemi);
    }

    /**
    * Returns the infolinkki of this aineisto.
    *
    * @return the infolinkki of this aineisto
    */
    @Override
    public java.lang.String getInfolinkki() {
        return _aineisto.getInfolinkki();
    }

    /**
    * Sets the infolinkki of this aineisto.
    *
    * @param infolinkki the infolinkki of this aineisto
    */
    @Override
    public void setInfolinkki(java.lang.String infolinkki) {
        _aineisto.setInfolinkki(infolinkki);
    }

    /**
    * Returns the kayttolupa of this aineisto.
    *
    * @return the kayttolupa of this aineisto
    */
    @Override
    public java.lang.String getKayttolupa() {
        return _aineisto.getKayttolupa();
    }

    /**
    * Sets the kayttolupa of this aineisto.
    *
    * @param kayttolupa the kayttolupa of this aineisto
    */
    @Override
    public void setKayttolupa(java.lang.String kayttolupa) {
        _aineisto.setKayttolupa(kayttolupa);
    }

    /**
    * Returns the tuotu_kantaan of this aineisto.
    *
    * @return the tuotu_kantaan of this aineisto
    */
    @Override
    public java.util.Date getTuotu_kantaan() {
        return _aineisto.getTuotu_kantaan();
    }

    /**
    * Sets the tuotu_kantaan of this aineisto.
    *
    * @param tuotu_kantaan the tuotu_kantaan of this aineisto
    */
    @Override
    public void setTuotu_kantaan(java.util.Date tuotu_kantaan) {
        _aineisto.setTuotu_kantaan(tuotu_kantaan);
    }

    /**
    * Returns the muutettu of this aineisto.
    *
    * @return the muutettu of this aineisto
    */
    @Override
    public java.util.Date getMuutettu() {
        return _aineisto.getMuutettu();
    }

    /**
    * Sets the muutettu of this aineisto.
    *
    * @param muutettu the muutettu of this aineisto
    */
    @Override
    public void setMuutettu(java.util.Date muutettu) {
        _aineisto.setMuutettu(muutettu);
    }

    /**
    * Returns the muuttaja of this aineisto.
    *
    * @return the muuttaja of this aineisto
    */
    @Override
    public java.lang.String getMuuttaja() {
        return _aineisto.getMuuttaja();
    }

    /**
    * Sets the muuttaja of this aineisto.
    *
    * @param muuttaja the muuttaja of this aineisto
    */
    @Override
    public void setMuuttaja(java.lang.String muuttaja) {
        _aineisto.setMuuttaja(muuttaja);
    }

    /**
    * Returns the poistettu of this aineisto.
    *
    * @return the poistettu of this aineisto
    */
    @Override
    public java.util.Date getPoistettu() {
        return _aineisto.getPoistettu();
    }

    /**
    * Sets the poistettu of this aineisto.
    *
    * @param poistettu the poistettu of this aineisto
    */
    @Override
    public void setPoistettu(java.util.Date poistettu) {
        _aineisto.setPoistettu(poistettu);
    }

    @Override
    public boolean isNew() {
        return _aineisto.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _aineisto.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _aineisto.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _aineisto.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _aineisto.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _aineisto.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _aineisto.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _aineisto.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _aineisto.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _aineisto.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _aineisto.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new AineistoWrapper((Aineisto) _aineisto.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto aineisto) {
        return _aineisto.compareTo(aineisto);
    }

    @Override
    public int hashCode() {
        return _aineisto.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> toCacheModel() {
        return _aineisto.toCacheModel();
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto toEscapedModel() {
        return new AineistoWrapper(_aineisto.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto toUnescapedModel() {
        return new AineistoWrapper(_aineisto.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _aineisto.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _aineisto.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _aineisto.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof AineistoWrapper)) {
            return false;
        }

        AineistoWrapper aineistoWrapper = (AineistoWrapper) obj;

        if (Validator.equals(_aineisto, aineistoWrapper._aineisto)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Aineisto getWrappedAineisto() {
        return _aineisto;
    }

    @Override
    public Aineisto getWrappedModel() {
        return _aineisto;
    }

    @Override
    public void resetOriginalValues() {
        _aineisto.resetOriginalValues();
    }
}
