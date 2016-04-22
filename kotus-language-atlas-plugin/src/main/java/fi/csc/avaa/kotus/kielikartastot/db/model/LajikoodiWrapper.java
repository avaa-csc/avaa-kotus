package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Lajikoodi}.
 * </p>
 *
 * @author CSC
 * @see Lajikoodi
 * @generated
 */
public class LajikoodiWrapper implements Lajikoodi, ModelWrapper<Lajikoodi> {
    private Lajikoodi _lajikoodi;

    public LajikoodiWrapper(Lajikoodi lajikoodi) {
        _lajikoodi = lajikoodi;
    }

    @Override
    public Class<?> getModelClass() {
        return Lajikoodi.class;
    }

    @Override
    public String getModelClassName() {
        return Lajikoodi.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("lajikoodi_id", getLajikoodi_id());
        attributes.put("lajikoodi", getLajikoodi());
        attributes.put("laji", getLaji());
        attributes.put("aineistot", getAineistot());
        attributes.put("viite", getViite());
        attributes.put("tuotu_kantaan", getTuotu_kantaan());
        attributes.put("muutettu", getMuutettu());
        attributes.put("muuttaja", getMuuttaja());
        attributes.put("poistettu", getPoistettu());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer lajikoodi_id = (Integer) attributes.get("lajikoodi_id");

        if (lajikoodi_id != null) {
            setLajikoodi_id(lajikoodi_id);
        }

        Integer lajikoodi = (Integer) attributes.get("lajikoodi");

        if (lajikoodi != null) {
            setLajikoodi(lajikoodi);
        }

        String laji = (String) attributes.get("laji");

        if (laji != null) {
            setLaji(laji);
        }

        String aineistot = (String) attributes.get("aineistot");

        if (aineistot != null) {
            setAineistot(aineistot);
        }

        String viite = (String) attributes.get("viite");

        if (viite != null) {
            setViite(viite);
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
    * Returns the primary key of this lajikoodi.
    *
    * @return the primary key of this lajikoodi
    */
    @Override
    public int getPrimaryKey() {
        return _lajikoodi.getPrimaryKey();
    }

    /**
    * Sets the primary key of this lajikoodi.
    *
    * @param primaryKey the primary key of this lajikoodi
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _lajikoodi.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the lajikoodi_id of this lajikoodi.
    *
    * @return the lajikoodi_id of this lajikoodi
    */
    @Override
    public int getLajikoodi_id() {
        return _lajikoodi.getLajikoodi_id();
    }

    /**
    * Sets the lajikoodi_id of this lajikoodi.
    *
    * @param lajikoodi_id the lajikoodi_id of this lajikoodi
    */
    @Override
    public void setLajikoodi_id(int lajikoodi_id) {
        _lajikoodi.setLajikoodi_id(lajikoodi_id);
    }

    /**
    * Returns the lajikoodi of this lajikoodi.
    *
    * @return the lajikoodi of this lajikoodi
    */
    @Override
    public int getLajikoodi() {
        return _lajikoodi.getLajikoodi();
    }

    /**
    * Sets the lajikoodi of this lajikoodi.
    *
    * @param lajikoodi the lajikoodi of this lajikoodi
    */
    @Override
    public void setLajikoodi(int lajikoodi) {
        _lajikoodi.setLajikoodi(lajikoodi);
    }

    /**
    * Returns the laji of this lajikoodi.
    *
    * @return the laji of this lajikoodi
    */
    @Override
    public java.lang.String getLaji() {
        return _lajikoodi.getLaji();
    }

    /**
    * Sets the laji of this lajikoodi.
    *
    * @param laji the laji of this lajikoodi
    */
    @Override
    public void setLaji(java.lang.String laji) {
        _lajikoodi.setLaji(laji);
    }

    /**
    * Returns the aineistot of this lajikoodi.
    *
    * @return the aineistot of this lajikoodi
    */
    @Override
    public java.lang.String getAineistot() {
        return _lajikoodi.getAineistot();
    }

    /**
    * Sets the aineistot of this lajikoodi.
    *
    * @param aineistot the aineistot of this lajikoodi
    */
    @Override
    public void setAineistot(java.lang.String aineistot) {
        _lajikoodi.setAineistot(aineistot);
    }

    /**
    * Returns the viite of this lajikoodi.
    *
    * @return the viite of this lajikoodi
    */
    @Override
    public java.lang.String getViite() {
        return _lajikoodi.getViite();
    }

    /**
    * Sets the viite of this lajikoodi.
    *
    * @param viite the viite of this lajikoodi
    */
    @Override
    public void setViite(java.lang.String viite) {
        _lajikoodi.setViite(viite);
    }

    /**
    * Returns the tuotu_kantaan of this lajikoodi.
    *
    * @return the tuotu_kantaan of this lajikoodi
    */
    @Override
    public java.util.Date getTuotu_kantaan() {
        return _lajikoodi.getTuotu_kantaan();
    }

    /**
    * Sets the tuotu_kantaan of this lajikoodi.
    *
    * @param tuotu_kantaan the tuotu_kantaan of this lajikoodi
    */
    @Override
    public void setTuotu_kantaan(java.util.Date tuotu_kantaan) {
        _lajikoodi.setTuotu_kantaan(tuotu_kantaan);
    }

    /**
    * Returns the muutettu of this lajikoodi.
    *
    * @return the muutettu of this lajikoodi
    */
    @Override
    public java.util.Date getMuutettu() {
        return _lajikoodi.getMuutettu();
    }

    /**
    * Sets the muutettu of this lajikoodi.
    *
    * @param muutettu the muutettu of this lajikoodi
    */
    @Override
    public void setMuutettu(java.util.Date muutettu) {
        _lajikoodi.setMuutettu(muutettu);
    }

    /**
    * Returns the muuttaja of this lajikoodi.
    *
    * @return the muuttaja of this lajikoodi
    */
    @Override
    public java.lang.String getMuuttaja() {
        return _lajikoodi.getMuuttaja();
    }

    /**
    * Sets the muuttaja of this lajikoodi.
    *
    * @param muuttaja the muuttaja of this lajikoodi
    */
    @Override
    public void setMuuttaja(java.lang.String muuttaja) {
        _lajikoodi.setMuuttaja(muuttaja);
    }

    /**
    * Returns the poistettu of this lajikoodi.
    *
    * @return the poistettu of this lajikoodi
    */
    @Override
    public java.util.Date getPoistettu() {
        return _lajikoodi.getPoistettu();
    }

    /**
    * Sets the poistettu of this lajikoodi.
    *
    * @param poistettu the poistettu of this lajikoodi
    */
    @Override
    public void setPoistettu(java.util.Date poistettu) {
        _lajikoodi.setPoistettu(poistettu);
    }

    @Override
    public boolean isNew() {
        return _lajikoodi.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _lajikoodi.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _lajikoodi.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _lajikoodi.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _lajikoodi.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _lajikoodi.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _lajikoodi.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _lajikoodi.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _lajikoodi.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _lajikoodi.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _lajikoodi.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LajikoodiWrapper((Lajikoodi) _lajikoodi.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi) {
        return _lajikoodi.compareTo(lajikoodi);
    }

    @Override
    public int hashCode() {
        return _lajikoodi.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> toCacheModel() {
        return _lajikoodi.toCacheModel();
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi toEscapedModel() {
        return new LajikoodiWrapper(_lajikoodi.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi toUnescapedModel() {
        return new LajikoodiWrapper(_lajikoodi.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _lajikoodi.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _lajikoodi.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _lajikoodi.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LajikoodiWrapper)) {
            return false;
        }

        LajikoodiWrapper lajikoodiWrapper = (LajikoodiWrapper) obj;

        if (Validator.equals(_lajikoodi, lajikoodiWrapper._lajikoodi)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Lajikoodi getWrappedLajikoodi() {
        return _lajikoodi;
    }

    @Override
    public Lajikoodi getWrappedModel() {
        return _lajikoodi;
    }

    @Override
    public void resetOriginalValues() {
        _lajikoodi.resetOriginalValues();
    }
}
