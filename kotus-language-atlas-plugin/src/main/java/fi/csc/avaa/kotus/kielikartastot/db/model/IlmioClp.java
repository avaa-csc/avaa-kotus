package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class IlmioClp extends BaseModelImpl<Ilmio> implements Ilmio {
    private int _ilmio_id;
    private int _aineisto_id;
    private int _ryhma_id;
    private int _lajikoodi_id;
    private String _ilmio;
    private String _tyyppi;
    private String _kieli_ISO639_3;
    private String _murre;
    private String _havaintoaika;
    private String _kuvaus;
    private String _lisatieto;
    private Date _tuotu_kantaan;
    private Date _muutettu;
    private String _muuttaja;
    private Date _poistettu;
    private String _tunnus;
    private String _ryhma_tunnus;
    private BaseModel<?> _ilmioRemoteModel;

    public IlmioClp() {
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
    public int getPrimaryKey() {
        return _ilmio_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setIlmio_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _ilmio_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getIlmio_id() {
        return _ilmio_id;
    }

    @Override
    public void setIlmio_id(int ilmio_id) {
        _ilmio_id = ilmio_id;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setIlmio_id", int.class);

                method.invoke(_ilmioRemoteModel, ilmio_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getAineisto_id() {
        return _aineisto_id;
    }

    @Override
    public void setAineisto_id(int aineisto_id) {
        _aineisto_id = aineisto_id;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setAineisto_id", int.class);

                method.invoke(_ilmioRemoteModel, aineisto_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getRyhma_id() {
        return _ryhma_id;
    }

    @Override
    public void setRyhma_id(int ryhma_id) {
        _ryhma_id = ryhma_id;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setRyhma_id", int.class);

                method.invoke(_ilmioRemoteModel, ryhma_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLajikoodi_id() {
        return _lajikoodi_id;
    }

    @Override
    public void setLajikoodi_id(int lajikoodi_id) {
        _lajikoodi_id = lajikoodi_id;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setLajikoodi_id", int.class);

                method.invoke(_ilmioRemoteModel, lajikoodi_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIlmio() {
        return _ilmio;
    }

    @Override
    public void setIlmio(String ilmio) {
        _ilmio = ilmio;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setIlmio", String.class);

                method.invoke(_ilmioRemoteModel, ilmio);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTyyppi() {
        return _tyyppi;
    }

    @Override
    public void setTyyppi(String tyyppi) {
        _tyyppi = tyyppi;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setTyyppi", String.class);

                method.invoke(_ilmioRemoteModel, tyyppi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKieli_ISO639_3() {
        return _kieli_ISO639_3;
    }

    @Override
    public void setKieli_ISO639_3(String kieli_ISO639_3) {
        _kieli_ISO639_3 = kieli_ISO639_3;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setKieli_ISO639_3",
                        String.class);

                method.invoke(_ilmioRemoteModel, kieli_ISO639_3);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMurre() {
        return _murre;
    }

    @Override
    public void setMurre(String murre) {
        _murre = murre;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setMurre", String.class);

                method.invoke(_ilmioRemoteModel, murre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getHavaintoaika() {
        return _havaintoaika;
    }

    @Override
    public void setHavaintoaika(String havaintoaika) {
        _havaintoaika = havaintoaika;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setHavaintoaika", String.class);

                method.invoke(_ilmioRemoteModel, havaintoaika);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKuvaus() {
        return _kuvaus;
    }

    @Override
    public void setKuvaus(String kuvaus) {
        _kuvaus = kuvaus;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setKuvaus", String.class);

                method.invoke(_ilmioRemoteModel, kuvaus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLisatieto() {
        return _lisatieto;
    }

    @Override
    public void setLisatieto(String lisatieto) {
        _lisatieto = lisatieto;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setLisatieto", String.class);

                method.invoke(_ilmioRemoteModel, lisatieto);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getTuotu_kantaan() {
        return _tuotu_kantaan;
    }

    @Override
    public void setTuotu_kantaan(Date tuotu_kantaan) {
        _tuotu_kantaan = tuotu_kantaan;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setTuotu_kantaan", Date.class);

                method.invoke(_ilmioRemoteModel, tuotu_kantaan);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getMuutettu() {
        return _muutettu;
    }

    @Override
    public void setMuutettu(Date muutettu) {
        _muutettu = muutettu;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setMuutettu", Date.class);

                method.invoke(_ilmioRemoteModel, muutettu);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMuuttaja() {
        return _muuttaja;
    }

    @Override
    public void setMuuttaja(String muuttaja) {
        _muuttaja = muuttaja;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setMuuttaja", String.class);

                method.invoke(_ilmioRemoteModel, muuttaja);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public Date getPoistettu() {
        return _poistettu;
    }

    @Override
    public void setPoistettu(Date poistettu) {
        _poistettu = poistettu;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setPoistettu", Date.class);

                method.invoke(_ilmioRemoteModel, poistettu);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTunnus() {
        return _tunnus;
    }

    @Override
    public void setTunnus(String tunnus) {
        _tunnus = tunnus;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setTunnus", String.class);

                method.invoke(_ilmioRemoteModel, tunnus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getRyhma_tunnus() {
        return _ryhma_tunnus;
    }

    @Override
    public void setRyhma_tunnus(String ryhma_tunnus) {
        _ryhma_tunnus = ryhma_tunnus;

        if (_ilmioRemoteModel != null) {
            try {
                Class<?> clazz = _ilmioRemoteModel.getClass();

                Method method = clazz.getMethod("setRyhma_tunnus", String.class);

                method.invoke(_ilmioRemoteModel, ryhma_tunnus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getIlmioRemoteModel() {
        return _ilmioRemoteModel;
    }

    public void setIlmioRemoteModel(BaseModel<?> ilmioRemoteModel) {
        _ilmioRemoteModel = ilmioRemoteModel;
    }

    public Object invokeOnRemoteModel(String methodName,
        Class<?>[] parameterTypes, Object[] parameterValues)
        throws Exception {
        Object[] remoteParameterValues = new Object[parameterValues.length];

        for (int i = 0; i < parameterValues.length; i++) {
            if (parameterValues[i] != null) {
                remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
            }
        }

        Class<?> remoteModelClass = _ilmioRemoteModel.getClass();

        ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

        Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

        for (int i = 0; i < parameterTypes.length; i++) {
            if (parameterTypes[i].isPrimitive()) {
                remoteParameterTypes[i] = parameterTypes[i];
            } else {
                String parameterTypeName = parameterTypes[i].getName();

                remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
            }
        }

        Method method = remoteModelClass.getMethod(methodName,
                remoteParameterTypes);

        Object returnValue = method.invoke(_ilmioRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            IlmioLocalServiceUtil.addIlmio(this);
        } else {
            IlmioLocalServiceUtil.updateIlmio(this);
        }
    }

    @Override
    public Ilmio toEscapedModel() {
        return (Ilmio) ProxyUtil.newProxyInstance(Ilmio.class.getClassLoader(),
            new Class[] { Ilmio.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        IlmioClp clone = new IlmioClp();

        clone.setIlmio_id(getIlmio_id());
        clone.setAineisto_id(getAineisto_id());
        clone.setRyhma_id(getRyhma_id());
        clone.setLajikoodi_id(getLajikoodi_id());
        clone.setIlmio(getIlmio());
        clone.setTyyppi(getTyyppi());
        clone.setKieli_ISO639_3(getKieli_ISO639_3());
        clone.setMurre(getMurre());
        clone.setHavaintoaika(getHavaintoaika());
        clone.setKuvaus(getKuvaus());
        clone.setLisatieto(getLisatieto());
        clone.setTuotu_kantaan(getTuotu_kantaan());
        clone.setMuutettu(getMuutettu());
        clone.setMuuttaja(getMuuttaja());
        clone.setPoistettu(getPoistettu());
        clone.setTunnus(getTunnus());
        clone.setRyhma_tunnus(getRyhma_tunnus());

        return clone;
    }

    @Override
    public int compareTo(Ilmio ilmio) {
        int primaryKey = ilmio.getPrimaryKey();

        if (getPrimaryKey() < primaryKey) {
            return -1;
        } else if (getPrimaryKey() > primaryKey) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof IlmioClp)) {
            return false;
        }

        IlmioClp ilmio = (IlmioClp) obj;

        int primaryKey = ilmio.getPrimaryKey();

        if (getPrimaryKey() == primaryKey) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getPrimaryKey();
    }

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append("{ilmio_id=");
        sb.append(getIlmio_id());
        sb.append(", aineisto_id=");
        sb.append(getAineisto_id());
        sb.append(", ryhma_id=");
        sb.append(getRyhma_id());
        sb.append(", lajikoodi_id=");
        sb.append(getLajikoodi_id());
        sb.append(", ilmio=");
        sb.append(getIlmio());
        sb.append(", tyyppi=");
        sb.append(getTyyppi());
        sb.append(", kieli_ISO639_3=");
        sb.append(getKieli_ISO639_3());
        sb.append(", murre=");
        sb.append(getMurre());
        sb.append(", havaintoaika=");
        sb.append(getHavaintoaika());
        sb.append(", kuvaus=");
        sb.append(getKuvaus());
        sb.append(", lisatieto=");
        sb.append(getLisatieto());
        sb.append(", tuotu_kantaan=");
        sb.append(getTuotu_kantaan());
        sb.append(", muutettu=");
        sb.append(getMuutettu());
        sb.append(", muuttaja=");
        sb.append(getMuuttaja());
        sb.append(", poistettu=");
        sb.append(getPoistettu());
        sb.append(", tunnus=");
        sb.append(getTunnus());
        sb.append(", ryhma_tunnus=");
        sb.append(getRyhma_tunnus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(55);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>ilmio_id</column-name><column-value><![CDATA[");
        sb.append(getIlmio_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aineisto_id</column-name><column-value><![CDATA[");
        sb.append(getAineisto_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ryhma_id</column-name><column-value><![CDATA[");
        sb.append(getRyhma_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lajikoodi_id</column-name><column-value><![CDATA[");
        sb.append(getLajikoodi_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ilmio</column-name><column-value><![CDATA[");
        sb.append(getIlmio());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tyyppi</column-name><column-value><![CDATA[");
        sb.append(getTyyppi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kieli_ISO639_3</column-name><column-value><![CDATA[");
        sb.append(getKieli_ISO639_3());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>murre</column-name><column-value><![CDATA[");
        sb.append(getMurre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>havaintoaika</column-name><column-value><![CDATA[");
        sb.append(getHavaintoaika());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kuvaus</column-name><column-value><![CDATA[");
        sb.append(getKuvaus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lisatieto</column-name><column-value><![CDATA[");
        sb.append(getLisatieto());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tuotu_kantaan</column-name><column-value><![CDATA[");
        sb.append(getTuotu_kantaan());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>muutettu</column-name><column-value><![CDATA[");
        sb.append(getMuutettu());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>muuttaja</column-name><column-value><![CDATA[");
        sb.append(getMuuttaja());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>poistettu</column-name><column-value><![CDATA[");
        sb.append(getPoistettu());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tunnus</column-name><column-value><![CDATA[");
        sb.append(getTunnus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ryhma_tunnus</column-name><column-value><![CDATA[");
        sb.append(getRyhma_tunnus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
