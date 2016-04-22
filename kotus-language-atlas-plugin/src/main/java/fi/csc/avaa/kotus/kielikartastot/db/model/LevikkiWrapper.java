package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Levikki}.
 * </p>
 *
 * @author CSC
 * @see Levikki
 * @generated
 */
public class LevikkiWrapper implements Levikki, ModelWrapper<Levikki> {
    private Levikki _levikki;

    public LevikkiWrapper(Levikki levikki) {
        _levikki = levikki;
    }

    @Override
    public Class<?> getModelClass() {
        return Levikki.class;
    }

    @Override
    public String getModelClassName() {
        return Levikki.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("levikki_id", getLevikki_id());
        attributes.put("ilmio_id", getIlmio_id());
        attributes.put("paikka_id", getPaikka_id());
        attributes.put("paikka_tunniste", getPaikka_tunniste());
        attributes.put("ilmio_tunnus", getIlmio_tunnus());
        attributes.put("uusi", getUusi());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer levikki_id = (Integer) attributes.get("levikki_id");

        if (levikki_id != null) {
            setLevikki_id(levikki_id);
        }

        Integer ilmio_id = (Integer) attributes.get("ilmio_id");

        if (ilmio_id != null) {
            setIlmio_id(ilmio_id);
        }

        Integer paikka_id = (Integer) attributes.get("paikka_id");

        if (paikka_id != null) {
            setPaikka_id(paikka_id);
        }

        String paikka_tunniste = (String) attributes.get("paikka_tunniste");

        if (paikka_tunniste != null) {
            setPaikka_tunniste(paikka_tunniste);
        }

        String ilmio_tunnus = (String) attributes.get("ilmio_tunnus");

        if (ilmio_tunnus != null) {
            setIlmio_tunnus(ilmio_tunnus);
        }

        Integer uusi = (Integer) attributes.get("uusi");

        if (uusi != null) {
            setUusi(uusi);
        }
    }

    /**
    * Returns the primary key of this levikki.
    *
    * @return the primary key of this levikki
    */
    @Override
    public int getPrimaryKey() {
        return _levikki.getPrimaryKey();
    }

    /**
    * Sets the primary key of this levikki.
    *
    * @param primaryKey the primary key of this levikki
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _levikki.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the levikki_id of this levikki.
    *
    * @return the levikki_id of this levikki
    */
    @Override
    public int getLevikki_id() {
        return _levikki.getLevikki_id();
    }

    /**
    * Sets the levikki_id of this levikki.
    *
    * @param levikki_id the levikki_id of this levikki
    */
    @Override
    public void setLevikki_id(int levikki_id) {
        _levikki.setLevikki_id(levikki_id);
    }

    /**
    * Returns the ilmio_id of this levikki.
    *
    * @return the ilmio_id of this levikki
    */
    @Override
    public int getIlmio_id() {
        return _levikki.getIlmio_id();
    }

    /**
    * Sets the ilmio_id of this levikki.
    *
    * @param ilmio_id the ilmio_id of this levikki
    */
    @Override
    public void setIlmio_id(int ilmio_id) {
        _levikki.setIlmio_id(ilmio_id);
    }

    /**
    * Returns the paikka_id of this levikki.
    *
    * @return the paikka_id of this levikki
    */
    @Override
    public int getPaikka_id() {
        return _levikki.getPaikka_id();
    }

    /**
    * Sets the paikka_id of this levikki.
    *
    * @param paikka_id the paikka_id of this levikki
    */
    @Override
    public void setPaikka_id(int paikka_id) {
        _levikki.setPaikka_id(paikka_id);
    }

    /**
    * Returns the paikka_tunniste of this levikki.
    *
    * @return the paikka_tunniste of this levikki
    */
    @Override
    public java.lang.String getPaikka_tunniste() {
        return _levikki.getPaikka_tunniste();
    }

    /**
    * Sets the paikka_tunniste of this levikki.
    *
    * @param paikka_tunniste the paikka_tunniste of this levikki
    */
    @Override
    public void setPaikka_tunniste(java.lang.String paikka_tunniste) {
        _levikki.setPaikka_tunniste(paikka_tunniste);
    }

    /**
    * Returns the ilmio_tunnus of this levikki.
    *
    * @return the ilmio_tunnus of this levikki
    */
    @Override
    public java.lang.String getIlmio_tunnus() {
        return _levikki.getIlmio_tunnus();
    }

    /**
    * Sets the ilmio_tunnus of this levikki.
    *
    * @param ilmio_tunnus the ilmio_tunnus of this levikki
    */
    @Override
    public void setIlmio_tunnus(java.lang.String ilmio_tunnus) {
        _levikki.setIlmio_tunnus(ilmio_tunnus);
    }

    /**
    * Returns the uusi of this levikki.
    *
    * @return the uusi of this levikki
    */
    @Override
    public int getUusi() {
        return _levikki.getUusi();
    }

    /**
    * Sets the uusi of this levikki.
    *
    * @param uusi the uusi of this levikki
    */
    @Override
    public void setUusi(int uusi) {
        _levikki.setUusi(uusi);
    }

    @Override
    public boolean isNew() {
        return _levikki.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _levikki.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _levikki.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _levikki.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _levikki.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _levikki.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _levikki.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _levikki.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _levikki.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _levikki.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _levikki.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new LevikkiWrapper((Levikki) _levikki.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.kotus.kielikartastot.db.model.Levikki levikki) {
        return _levikki.compareTo(levikki);
    }

    @Override
    public int hashCode() {
        return _levikki.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> toCacheModel() {
        return _levikki.toCacheModel();
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Levikki toEscapedModel() {
        return new LevikkiWrapper(_levikki.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Levikki toUnescapedModel() {
        return new LevikkiWrapper(_levikki.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _levikki.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _levikki.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _levikki.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof LevikkiWrapper)) {
            return false;
        }

        LevikkiWrapper levikkiWrapper = (LevikkiWrapper) obj;

        if (Validator.equals(_levikki, levikkiWrapper._levikki)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Levikki getWrappedLevikki() {
        return _levikki;
    }

    @Override
    public Levikki getWrappedModel() {
        return _levikki;
    }

    @Override
    public void resetOriginalValues() {
        _levikki.resetOriginalValues();
    }
}
