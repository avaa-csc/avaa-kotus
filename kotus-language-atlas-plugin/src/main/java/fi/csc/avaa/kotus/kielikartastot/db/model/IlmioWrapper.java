package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Ilmio}.
 * </p>
 *
 * @author CSC
 * @see Ilmio
 * @generated
 */
public class IlmioWrapper implements Ilmio, ModelWrapper<Ilmio> {
    private Ilmio _ilmio;

    public IlmioWrapper(Ilmio ilmio) {
        _ilmio = ilmio;
    }

    @Override
    public Class<?> getModelClass() {
        return Ilmio.class;
    }

    @Override
    public String getModelClassName() {
        return Ilmio.class.getName();
    }

    @Override
    public Map<String, Object> getModelAttributes() {
        Map<String, Object> attributes = new HashMap<String, Object>();

        attributes.put("ilmio_id", getIlmio_id());
        attributes.put("aineisto_id", getAineisto_id());
        attributes.put("ryhma_id", getRyhma_id());
        attributes.put("lajikoodi_id", getLajikoodi_id());
        attributes.put("ilmio", getIlmio());
        attributes.put("tyyppi", getTyyppi());
        attributes.put("kieli_ISO639_3", getKieli_ISO639_3());
        attributes.put("murre", getMurre());
        attributes.put("havaintoaika", getHavaintoaika());
        attributes.put("kuvaus", getKuvaus());
        attributes.put("lisatieto", getLisatieto());
        attributes.put("tuotu_kantaan", getTuotu_kantaan());
        attributes.put("muutettu", getMuutettu());
        attributes.put("muuttaja", getMuuttaja());
        attributes.put("poistettu", getPoistettu());
        attributes.put("tunnus", getTunnus());
        attributes.put("ryhma_tunnus", getRyhma_tunnus());

        return attributes;
    }

    @Override
    public void setModelAttributes(Map<String, Object> attributes) {
        Integer ilmio_id = (Integer) attributes.get("ilmio_id");

        if (ilmio_id != null) {
            setIlmio_id(ilmio_id);
        }

        Integer aineisto_id = (Integer) attributes.get("aineisto_id");

        if (aineisto_id != null) {
            setAineisto_id(aineisto_id);
        }

        Integer ryhma_id = (Integer) attributes.get("ryhma_id");

        if (ryhma_id != null) {
            setRyhma_id(ryhma_id);
        }

        Integer lajikoodi_id = (Integer) attributes.get("lajikoodi_id");

        if (lajikoodi_id != null) {
            setLajikoodi_id(lajikoodi_id);
        }

        String ilmio = (String) attributes.get("ilmio");

        if (ilmio != null) {
            setIlmio(ilmio);
        }

        String tyyppi = (String) attributes.get("tyyppi");

        if (tyyppi != null) {
            setTyyppi(tyyppi);
        }

        String kieli_ISO639_3 = (String) attributes.get("kieli_ISO639_3");

        if (kieli_ISO639_3 != null) {
            setKieli_ISO639_3(kieli_ISO639_3);
        }

        String murre = (String) attributes.get("murre");

        if (murre != null) {
            setMurre(murre);
        }

        String havaintoaika = (String) attributes.get("havaintoaika");

        if (havaintoaika != null) {
            setHavaintoaika(havaintoaika);
        }

        String kuvaus = (String) attributes.get("kuvaus");

        if (kuvaus != null) {
            setKuvaus(kuvaus);
        }

        String lisatieto = (String) attributes.get("lisatieto");

        if (lisatieto != null) {
            setLisatieto(lisatieto);
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

        String tunnus = (String) attributes.get("tunnus");

        if (tunnus != null) {
            setTunnus(tunnus);
        }

        String ryhma_tunnus = (String) attributes.get("ryhma_tunnus");

        if (ryhma_tunnus != null) {
            setRyhma_tunnus(ryhma_tunnus);
        }
    }

    /**
    * Returns the primary key of this ilmio.
    *
    * @return the primary key of this ilmio
    */
    @Override
    public int getPrimaryKey() {
        return _ilmio.getPrimaryKey();
    }

    /**
    * Sets the primary key of this ilmio.
    *
    * @param primaryKey the primary key of this ilmio
    */
    @Override
    public void setPrimaryKey(int primaryKey) {
        _ilmio.setPrimaryKey(primaryKey);
    }

    /**
    * Returns the ilmio_id of this ilmio.
    *
    * @return the ilmio_id of this ilmio
    */
    @Override
    public int getIlmio_id() {
        return _ilmio.getIlmio_id();
    }

    /**
    * Sets the ilmio_id of this ilmio.
    *
    * @param ilmio_id the ilmio_id of this ilmio
    */
    @Override
    public void setIlmio_id(int ilmio_id) {
        _ilmio.setIlmio_id(ilmio_id);
    }

    /**
    * Returns the aineisto_id of this ilmio.
    *
    * @return the aineisto_id of this ilmio
    */
    @Override
    public int getAineisto_id() {
        return _ilmio.getAineisto_id();
    }

    /**
    * Sets the aineisto_id of this ilmio.
    *
    * @param aineisto_id the aineisto_id of this ilmio
    */
    @Override
    public void setAineisto_id(int aineisto_id) {
        _ilmio.setAineisto_id(aineisto_id);
    }

    /**
    * Returns the ryhma_id of this ilmio.
    *
    * @return the ryhma_id of this ilmio
    */
    @Override
    public int getRyhma_id() {
        return _ilmio.getRyhma_id();
    }

    /**
    * Sets the ryhma_id of this ilmio.
    *
    * @param ryhma_id the ryhma_id of this ilmio
    */
    @Override
    public void setRyhma_id(int ryhma_id) {
        _ilmio.setRyhma_id(ryhma_id);
    }

    /**
    * Returns the lajikoodi_id of this ilmio.
    *
    * @return the lajikoodi_id of this ilmio
    */
    @Override
    public int getLajikoodi_id() {
        return _ilmio.getLajikoodi_id();
    }

    /**
    * Sets the lajikoodi_id of this ilmio.
    *
    * @param lajikoodi_id the lajikoodi_id of this ilmio
    */
    @Override
    public void setLajikoodi_id(int lajikoodi_id) {
        _ilmio.setLajikoodi_id(lajikoodi_id);
    }

    /**
    * Returns the ilmio of this ilmio.
    *
    * @return the ilmio of this ilmio
    */
    @Override
    public java.lang.String getIlmio() {
        return _ilmio.getIlmio();
    }

    /**
    * Sets the ilmio of this ilmio.
    *
    * @param ilmio the ilmio of this ilmio
    */
    @Override
    public void setIlmio(java.lang.String ilmio) {
        _ilmio.setIlmio(ilmio);
    }

    /**
    * Returns the tyyppi of this ilmio.
    *
    * @return the tyyppi of this ilmio
    */
    @Override
    public java.lang.String getTyyppi() {
        return _ilmio.getTyyppi();
    }

    /**
    * Sets the tyyppi of this ilmio.
    *
    * @param tyyppi the tyyppi of this ilmio
    */
    @Override
    public void setTyyppi(java.lang.String tyyppi) {
        _ilmio.setTyyppi(tyyppi);
    }

    /**
    * Returns the kieli_ i s o639_3 of this ilmio.
    *
    * @return the kieli_ i s o639_3 of this ilmio
    */
    @Override
    public java.lang.String getKieli_ISO639_3() {
        return _ilmio.getKieli_ISO639_3();
    }

    /**
    * Sets the kieli_ i s o639_3 of this ilmio.
    *
    * @param kieli_ISO639_3 the kieli_ i s o639_3 of this ilmio
    */
    @Override
    public void setKieli_ISO639_3(java.lang.String kieli_ISO639_3) {
        _ilmio.setKieli_ISO639_3(kieli_ISO639_3);
    }

    /**
    * Returns the murre of this ilmio.
    *
    * @return the murre of this ilmio
    */
    @Override
    public java.lang.String getMurre() {
        return _ilmio.getMurre();
    }

    /**
    * Sets the murre of this ilmio.
    *
    * @param murre the murre of this ilmio
    */
    @Override
    public void setMurre(java.lang.String murre) {
        _ilmio.setMurre(murre);
    }

    /**
    * Returns the havaintoaika of this ilmio.
    *
    * @return the havaintoaika of this ilmio
    */
    @Override
    public java.lang.String getHavaintoaika() {
        return _ilmio.getHavaintoaika();
    }

    /**
    * Sets the havaintoaika of this ilmio.
    *
    * @param havaintoaika the havaintoaika of this ilmio
    */
    @Override
    public void setHavaintoaika(java.lang.String havaintoaika) {
        _ilmio.setHavaintoaika(havaintoaika);
    }

    /**
    * Returns the kuvaus of this ilmio.
    *
    * @return the kuvaus of this ilmio
    */
    @Override
    public java.lang.String getKuvaus() {
        return _ilmio.getKuvaus();
    }

    /**
    * Sets the kuvaus of this ilmio.
    *
    * @param kuvaus the kuvaus of this ilmio
    */
    @Override
    public void setKuvaus(java.lang.String kuvaus) {
        _ilmio.setKuvaus(kuvaus);
    }

    /**
    * Returns the lisatieto of this ilmio.
    *
    * @return the lisatieto of this ilmio
    */
    @Override
    public java.lang.String getLisatieto() {
        return _ilmio.getLisatieto();
    }

    /**
    * Sets the lisatieto of this ilmio.
    *
    * @param lisatieto the lisatieto of this ilmio
    */
    @Override
    public void setLisatieto(java.lang.String lisatieto) {
        _ilmio.setLisatieto(lisatieto);
    }

    /**
    * Returns the tuotu_kantaan of this ilmio.
    *
    * @return the tuotu_kantaan of this ilmio
    */
    @Override
    public java.util.Date getTuotu_kantaan() {
        return _ilmio.getTuotu_kantaan();
    }

    /**
    * Sets the tuotu_kantaan of this ilmio.
    *
    * @param tuotu_kantaan the tuotu_kantaan of this ilmio
    */
    @Override
    public void setTuotu_kantaan(java.util.Date tuotu_kantaan) {
        _ilmio.setTuotu_kantaan(tuotu_kantaan);
    }

    /**
    * Returns the muutettu of this ilmio.
    *
    * @return the muutettu of this ilmio
    */
    @Override
    public java.util.Date getMuutettu() {
        return _ilmio.getMuutettu();
    }

    /**
    * Sets the muutettu of this ilmio.
    *
    * @param muutettu the muutettu of this ilmio
    */
    @Override
    public void setMuutettu(java.util.Date muutettu) {
        _ilmio.setMuutettu(muutettu);
    }

    /**
    * Returns the muuttaja of this ilmio.
    *
    * @return the muuttaja of this ilmio
    */
    @Override
    public java.lang.String getMuuttaja() {
        return _ilmio.getMuuttaja();
    }

    /**
    * Sets the muuttaja of this ilmio.
    *
    * @param muuttaja the muuttaja of this ilmio
    */
    @Override
    public void setMuuttaja(java.lang.String muuttaja) {
        _ilmio.setMuuttaja(muuttaja);
    }

    /**
    * Returns the poistettu of this ilmio.
    *
    * @return the poistettu of this ilmio
    */
    @Override
    public java.util.Date getPoistettu() {
        return _ilmio.getPoistettu();
    }

    /**
    * Sets the poistettu of this ilmio.
    *
    * @param poistettu the poistettu of this ilmio
    */
    @Override
    public void setPoistettu(java.util.Date poistettu) {
        _ilmio.setPoistettu(poistettu);
    }

    /**
    * Returns the tunnus of this ilmio.
    *
    * @return the tunnus of this ilmio
    */
    @Override
    public java.lang.String getTunnus() {
        return _ilmio.getTunnus();
    }

    /**
    * Sets the tunnus of this ilmio.
    *
    * @param tunnus the tunnus of this ilmio
    */
    @Override
    public void setTunnus(java.lang.String tunnus) {
        _ilmio.setTunnus(tunnus);
    }

    /**
    * Returns the ryhma_tunnus of this ilmio.
    *
    * @return the ryhma_tunnus of this ilmio
    */
    @Override
    public java.lang.String getRyhma_tunnus() {
        return _ilmio.getRyhma_tunnus();
    }

    /**
    * Sets the ryhma_tunnus of this ilmio.
    *
    * @param ryhma_tunnus the ryhma_tunnus of this ilmio
    */
    @Override
    public void setRyhma_tunnus(java.lang.String ryhma_tunnus) {
        _ilmio.setRyhma_tunnus(ryhma_tunnus);
    }

    @Override
    public boolean isNew() {
        return _ilmio.isNew();
    }

    @Override
    public void setNew(boolean n) {
        _ilmio.setNew(n);
    }

    @Override
    public boolean isCachedModel() {
        return _ilmio.isCachedModel();
    }

    @Override
    public void setCachedModel(boolean cachedModel) {
        _ilmio.setCachedModel(cachedModel);
    }

    @Override
    public boolean isEscapedModel() {
        return _ilmio.isEscapedModel();
    }

    @Override
    public java.io.Serializable getPrimaryKeyObj() {
        return _ilmio.getPrimaryKeyObj();
    }

    @Override
    public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
        _ilmio.setPrimaryKeyObj(primaryKeyObj);
    }

    @Override
    public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
        return _ilmio.getExpandoBridge();
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.model.BaseModel<?> baseModel) {
        _ilmio.setExpandoBridgeAttributes(baseModel);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
        _ilmio.setExpandoBridgeAttributes(expandoBridge);
    }

    @Override
    public void setExpandoBridgeAttributes(
        com.liferay.portal.service.ServiceContext serviceContext) {
        _ilmio.setExpandoBridgeAttributes(serviceContext);
    }

    @Override
    public java.lang.Object clone() {
        return new IlmioWrapper((Ilmio) _ilmio.clone());
    }

    @Override
    public int compareTo(fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio) {
        return _ilmio.compareTo(ilmio);
    }

    @Override
    public int hashCode() {
        return _ilmio.hashCode();
    }

    @Override
    public com.liferay.portal.model.CacheModel<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> toCacheModel() {
        return _ilmio.toCacheModel();
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio toEscapedModel() {
        return new IlmioWrapper(_ilmio.toEscapedModel());
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio toUnescapedModel() {
        return new IlmioWrapper(_ilmio.toUnescapedModel());
    }

    @Override
    public java.lang.String toString() {
        return _ilmio.toString();
    }

    @Override
    public java.lang.String toXmlString() {
        return _ilmio.toXmlString();
    }

    @Override
    public void persist()
        throws com.liferay.portal.kernel.exception.SystemException {
        _ilmio.persist();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof IlmioWrapper)) {
            return false;
        }

        IlmioWrapper ilmioWrapper = (IlmioWrapper) obj;

        if (Validator.equals(_ilmio, ilmioWrapper._ilmio)) {
            return true;
        }

        return false;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
     */
    public Ilmio getWrappedIlmio() {
        return _ilmio;
    }

    @Override
    public Ilmio getWrappedModel() {
        return _ilmio;
    }

    @Override
    public void resetOriginalValues() {
        _ilmio.resetOriginalValues();
    }
}
