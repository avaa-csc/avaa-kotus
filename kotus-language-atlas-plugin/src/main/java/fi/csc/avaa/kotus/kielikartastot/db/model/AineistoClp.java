package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class AineistoClp extends BaseModelImpl<Aineisto> implements Aineisto {
    private int _aineisto_id;
    private String _nimi;
    private String _tunnus;
    private String _kuvaus;
    private String _paikkatietosysteemi;
    private String _infolinkki;
    private String _kayttolupa;
    private Date _tuotu_kantaan;
    private Date _muutettu;
    private String _muuttaja;
    private Date _poistettu;
    private BaseModel<?> _aineistoRemoteModel;

    public AineistoClp() {
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
    public int getPrimaryKey() {
        return _aineisto_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setAineisto_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _aineisto_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getAineisto_id() {
        return _aineisto_id;
    }

    @Override
    public void setAineisto_id(int aineisto_id) {
        _aineisto_id = aineisto_id;

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setAineisto_id", int.class);

                method.invoke(_aineistoRemoteModel, aineisto_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNimi() {
        return _nimi;
    }

    @Override
    public void setNimi(String nimi) {
        _nimi = nimi;

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi", String.class);

                method.invoke(_aineistoRemoteModel, nimi);
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

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setTunnus", String.class);

                method.invoke(_aineistoRemoteModel, tunnus);
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

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setKuvaus", String.class);

                method.invoke(_aineistoRemoteModel, kuvaus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPaikkatietosysteemi() {
        return _paikkatietosysteemi;
    }

    @Override
    public void setPaikkatietosysteemi(String paikkatietosysteemi) {
        _paikkatietosysteemi = paikkatietosysteemi;

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setPaikkatietosysteemi",
                        String.class);

                method.invoke(_aineistoRemoteModel, paikkatietosysteemi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getInfolinkki() {
        return _infolinkki;
    }

    @Override
    public void setInfolinkki(String infolinkki) {
        _infolinkki = infolinkki;

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setInfolinkki", String.class);

                method.invoke(_aineistoRemoteModel, infolinkki);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKayttolupa() {
        return _kayttolupa;
    }

    @Override
    public void setKayttolupa(String kayttolupa) {
        _kayttolupa = kayttolupa;

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setKayttolupa", String.class);

                method.invoke(_aineistoRemoteModel, kayttolupa);
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

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setTuotu_kantaan", Date.class);

                method.invoke(_aineistoRemoteModel, tuotu_kantaan);
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

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setMuutettu", Date.class);

                method.invoke(_aineistoRemoteModel, muutettu);
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

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setMuuttaja", String.class);

                method.invoke(_aineistoRemoteModel, muuttaja);
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

        if (_aineistoRemoteModel != null) {
            try {
                Class<?> clazz = _aineistoRemoteModel.getClass();

                Method method = clazz.getMethod("setPoistettu", Date.class);

                method.invoke(_aineistoRemoteModel, poistettu);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getAineistoRemoteModel() {
        return _aineistoRemoteModel;
    }

    public void setAineistoRemoteModel(BaseModel<?> aineistoRemoteModel) {
        _aineistoRemoteModel = aineistoRemoteModel;
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

        Class<?> remoteModelClass = _aineistoRemoteModel.getClass();

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

        Object returnValue = method.invoke(_aineistoRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AineistoLocalServiceUtil.addAineisto(this);
        } else {
            AineistoLocalServiceUtil.updateAineisto(this);
        }
    }

    @Override
    public Aineisto toEscapedModel() {
        return (Aineisto) ProxyUtil.newProxyInstance(Aineisto.class.getClassLoader(),
            new Class[] { Aineisto.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        AineistoClp clone = new AineistoClp();

        clone.setAineisto_id(getAineisto_id());
        clone.setNimi(getNimi());
        clone.setTunnus(getTunnus());
        clone.setKuvaus(getKuvaus());
        clone.setPaikkatietosysteemi(getPaikkatietosysteemi());
        clone.setInfolinkki(getInfolinkki());
        clone.setKayttolupa(getKayttolupa());
        clone.setTuotu_kantaan(getTuotu_kantaan());
        clone.setMuutettu(getMuutettu());
        clone.setMuuttaja(getMuuttaja());
        clone.setPoistettu(getPoistettu());

        return clone;
    }

    @Override
    public int compareTo(Aineisto aineisto) {
        int primaryKey = aineisto.getPrimaryKey();

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

        if (!(obj instanceof AineistoClp)) {
            return false;
        }

        AineistoClp aineisto = (AineistoClp) obj;

        int primaryKey = aineisto.getPrimaryKey();

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
        StringBundler sb = new StringBundler(23);

        sb.append("{aineisto_id=");
        sb.append(getAineisto_id());
        sb.append(", nimi=");
        sb.append(getNimi());
        sb.append(", tunnus=");
        sb.append(getTunnus());
        sb.append(", kuvaus=");
        sb.append(getKuvaus());
        sb.append(", paikkatietosysteemi=");
        sb.append(getPaikkatietosysteemi());
        sb.append(", infolinkki=");
        sb.append(getInfolinkki());
        sb.append(", kayttolupa=");
        sb.append(getKayttolupa());
        sb.append(", tuotu_kantaan=");
        sb.append(getTuotu_kantaan());
        sb.append(", muutettu=");
        sb.append(getMuutettu());
        sb.append(", muuttaja=");
        sb.append(getMuuttaja());
        sb.append(", poistettu=");
        sb.append(getPoistettu());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(37);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>aineisto_id</column-name><column-value><![CDATA[");
        sb.append(getAineisto_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nimi</column-name><column-value><![CDATA[");
        sb.append(getNimi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tunnus</column-name><column-value><![CDATA[");
        sb.append(getTunnus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kuvaus</column-name><column-value><![CDATA[");
        sb.append(getKuvaus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paikkatietosysteemi</column-name><column-value><![CDATA[");
        sb.append(getPaikkatietosysteemi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>infolinkki</column-name><column-value><![CDATA[");
        sb.append(getInfolinkki());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kayttolupa</column-name><column-value><![CDATA[");
        sb.append(getKayttolupa());
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

        sb.append("</model>");

        return sb.toString();
    }
}
