package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Ryhma}.
 * </p>
 *
 * @author CSC
 * @see Ryhma
 * @generated
 */
public class RyhmaWrapper implements Ryhma, ModelWrapper<Ryhma> {
    private Ryhma _ryhma;

    public RyhmaWrapper(Ryhma ryhma) {
        _ryhma = ryhma;
    }

    @Override
    public Class<?> getModelClass() {
        return Ryhma.class;
    }

    @Override
    public String getModelClassName() {
        return Ryhma.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("ryhma_id", getRyhma_id());
        attributes.put("aineisto_id", getAineisto_id());
        attributes.put("nimi", getNimi());
        attributes.put("tyyppi", getTyyppi());
        attributes.put("ylaryhma", getYlaryhma());
        attributes.put("selite", getSelite());
        attributes.put("kartta_kuva_linkki", getKartta_kuva_linkki());
        attributes.put("tuotu_kantaan", getTuotu_kantaan());
        attributes.put("muutettu", getMuutettu());
        attributes.put("muuttaja", getMuuttaja());
        attributes.put("poistettu", getPoistettu());
        attributes.put("tmp", getTmp());
        attributes.put("tunnus", getTunnus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer ryhma_id = (Integer) attributes.get("ryhma_id");

        if (ryhma_id != null) {
            setRyhma_id(ryhma_id);
        }

        Integer aineisto_id = (Integer) attributes.get("aineisto_id");

        if (aineisto_id != null) {
            setAineisto_id(aineisto_id);
        }

        String nimi = (String) attributes.get("nimi");

        if (nimi != null) {
            setNimi(nimi);
        }

        String tyyppi = (String) attributes.get("tyyppi");

        if (tyyppi != null) {
            setTyyppi(tyyppi);
        }

        Integer ylaryhma = (Integer) attributes.get("ylaryhma");

        if (ylaryhma != null) {
            setYlaryhma(ylaryhma);
        }

        String selite = (String) attributes.get("selite");

        if (selite != null) {
            setSelite(selite);
        }

        String kartta_kuva_linkki = (String) attributes.get(
                "kartta_kuva_linkki");

        if (kartta_kuva_linkki != null) {
            setKartta_kuva_linkki(kartta_kuva_linkki);
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

        String tmp = (String) attributes.get("tmp");

        if (tmp != null) {
            setTmp(tmp);
        }

        String tunnus = (String) attributes.get("tunnus");

        if (tunnus != null) {
            setTunnus(tunnus);
        }
    }

    /**
    * Returns the primary key of this ryhma.
    *
    * @return the primary key of this ryhma
    */
    @Override
    public int getPrimaryKey() {
        return _ryhma.getPrimaryKey();
    }

    /**
    * Sets the primary key of this ryhma.
    *
    * @param primaryKey the primary key of this ryhma
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _ryhma.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ryhma_id of this ryhma.
    *
    * @return the ryhma_id of this ryhma
    */
    @Override
    public int getRyhma_id() {
        return _ryhma.getRyhma_id();
    }

    /**
    * Sets the ryhma_id of this ryhma.
    *
    * @param ryhma_id the ryhma_id of this ryhma
    */
    @Override
    public void setRyhma_id(int ryhma_id) {
        _ryhma.setRyhma_id(ryhma_id);
    }

    /**
    * Returns the aineisto_id of this ryhma.
    *
    * @return the aineisto_id of this ryhma
    */
    @Override
    public int getAineisto_id() {
        return _ryhma.getAineisto_id();
    }

    /**
    * Sets the aineisto_id of this ryhma.
    *
    * @param aineisto_id the aineisto_id of this ryhma
    */
    @Override
    public void setAineisto_id(int aineisto_id) {
        _ryhma.setAineisto_id(aineisto_id);
    }

    /**
    * Returns the nimi of this ryhma.
    *
    * @return the nimi of this ryhma
    */
    @Override
    public java.lang.String getNimi() {
        return _ryhma.getNimi();
    }

    /**
    * Sets the nimi of this ryhma.
    *
    * @param nimi the nimi of this ryhma
    */
    @Override
    public void setNimi(java.lang.String nimi) {
        _ryhma.setNimi(nimi);
    }

    /**
    * Returns the tyyppi of this ryhma.
    *
    * @return the tyyppi of this ryhma
    */
    @Override
    public java.lang.String getTyyppi() {
        return _ryhma.getTyyppi();
    }

    /**
    * Sets the tyyppi of this ryhma.
    *
    * @param tyyppi the tyyppi of this ryhma
    */
    @Override
    public void setTyyppi(java.lang.String tyyppi) {
        _ryhma.setTyyppi(tyyppi);
    }

    /**
    * Returns the ylaryhma of this ryhma.
    *
    * @return the ylaryhma of this ryhma
    */
    @Override
    public int getYlaryhma() {
        return _ryhma.getYlaryhma();
    }

    /**
    * Sets the ylaryhma of this ryhma.
    *
    * @param ylaryhma the ylaryhma of this ryhma
    */
    @Override
    public void setYlaryhma(int ylaryhma) {
        _ryhma.setYlaryhma(ylaryhma);
    }

    /**
    * Returns the selite of this ryhma.
    *
    * @return the selite of this ryhma
    */
    @Override
    public java.lang.String getSelite() {
        return _ryhma.getSelite();
    }

    /**
    * Sets the selite of this ryhma.
    *
    * @param selite the selite of this ryhma
    */
    @Override
    public void setSelite(java.lang.String selite) {
        _ryhma.setSelite(selite);
    }

    /**
    * Returns the kartta_kuva_linkki of this ryhma.
    *
    * @return the kartta_kuva_linkki of this ryhma
    */
    @Override
    public java.lang.String getKartta_kuva_linkki() {
        return _ryhma.getKartta_kuva_linkki();
    }

    /**
    * Sets the kartta_kuva_linkki of this ryhma.
    *
    * @param kartta_kuva_linkki the kartta_kuva_linkki of this ryhma
    */
    @Override
    public void setKartta_kuva_linkki(java.lang.String kartta_kuva_linkki) {
        _ryhma.setKartta_kuva_linkki(kartta_kuva_linkki);
    }

    /**
    * Returns the tuotu_kantaan of this ryhma.
    *
    * @return the tuotu_kantaan of this ryhma
    */
    @Override
    public java.util.Date getTuotu_kantaan() {
        return _ryhma.getTuotu_kantaan();
    }

    /**
    * Sets the tuotu_kantaan of this ryhma.
    *
    * @param tuotu_kantaan the tuotu_kantaan of this ryhma
    */
    @Override
    public void setTuotu_kantaan(java.util.Date tuotu_kantaan) {
        _ryhma.setTuotu_kantaan(tuotu_kantaan);
    }

    /**
    * Returns the muutettu of this ryhma.
    *
    * @return the muutettu of this ryhma
    */
    @Override
    public java.util.Date getMuutettu() {
        return _ryhma.getMuutettu();
    }

    /**
    * Sets the muutettu of this ryhma.
    *
    * @param muutettu the muutettu of this ryhma
    */
    @Override
    public void setMuutettu(java.util.Date muutettu) {
        _ryhma.setMuutettu(muutettu);
    }

    /**
    * Returns the muuttaja of this ryhma.
    *
    * @return the muuttaja of this ryhma
    */
    @Override
    public java.lang.String getMuuttaja() {
        return _ryhma.getMuuttaja();
    }

    /**
    * Sets the muuttaja of this ryhma.
    *
    * @param muuttaja the muuttaja of this ryhma
    */
    @Override
    public void setMuuttaja(java.lang.String muuttaja) {
        _ryhma.setMuuttaja(muuttaja);
    }

    /**
    * Returns the poistettu of this ryhma.
    *
    * @return the poistettu of this ryhma
    */
    @Override
    public java.util.Date getPoistettu() {
        return _ryhma.getPoistettu();
    }

    /**
    * Sets the poistettu of this ryhma.
    *
    * @param poistettu the poistettu of this ryhma
    */
    @Override
    public void setPoistettu(java.util.Date poistettu) {
        _ryhma.setPoistettu(poistettu);
    }

    /**
    * Returns the tmp of this ryhma.
    *
    * @return the tmp of this ryhma
    */
    @Override
    public java.lang.String getTmp() {
        return _ryhma.getTmp();
    }

    /**
    * Sets the tmp of this ryhma.
    *
    * @param tmp the tmp of this ryhma
    */
    @Override
    public void setTmp(java.lang.String tmp) {
        _ryhma.setTmp(tmp);
    }

    /**
    * Returns the tunnus of this ryhma.
    *
    * @return the tunnus of this ryhma
    */
    @Override
    public java.lang.String getTunnus() {
        return _ryhma.getTunnus();
    }

    /**
    * Sets the tunnus of this ryhma.
    *
    * @param tunnus the tunnus of this ryhma
    */
    @Override
    public void setTunnus(java.lang.String tunnus) {
        _ryhma.setTunnus(tunnus);
    }

    @Override
    public boolean isNew() {
        return _ryhma.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _ryhma.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _ryhma.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _ryhma.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _ryhma.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _ryhma.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _ryhma.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _ryhma.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _ryhma.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _ryhma.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _ryhma.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new RyhmaWrapper((Ryhma) _ryhma.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma ryhma) {
        return _ryhma.compareTo(ryhma);
    }

    @Override
    public int hashCode() {
        return _ryhma.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma> toCacheModel() {
        return _ryhma.toCacheModel();
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma toEscapedModel() {
        return new RyhmaWrapper(_ryhma.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma toUnescapedModel() {
        return new RyhmaWrapper(_ryhma.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _ryhma.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _ryhma.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _ryhma.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof RyhmaWrapper)) {
            return false;
        }

        RyhmaWrapper ryhmaWrapper = (RyhmaWrapper) obj;

        if (Validator.equals(_ryhma, ryhmaWrapper._ryhma)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Ryhma getWrappedRyhma() {
        return _ryhma;
    }

    @Override
    public Ryhma getWrappedModel() {
        return _ryhma;
    }

    @Override
    public void resetOriginalValues() {
        _ryhma.resetOriginalValues();
    }
}
