package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer;
import fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalServiceUtil;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class PaikkaClp extends BaseModelImpl<Paikka> implements Paikka {
    private int _paikka_id;
    private String _aineistot;
    private String _tunniste;
    private String _nimi_fin;
    private String _nimi_kieli;
    private String _tyyppi;
    private String _alue;
    private String _maa_ISO3166_1;
    private String _ajankohta;
    private String _selite;
    private String _kielet;
    private String _murre;
    private String _sapo_linkki;
    private int _mml_paikkaID;
    private Date _tuotu_kantaan;
    private Date _muutettu;
    private String _muuttaja;
    private Date _poistettu;
    private BaseModel<?> _paikkaRemoteModel;

    public PaikkaClp() {
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
    public int getPrimaryKey() {
        return _paikka_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setPaikka_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _paikka_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getPaikka_id() {
        return _paikka_id;
    }

    @Override
    public void setPaikka_id(int paikka_id) {
        _paikka_id = paikka_id;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setPaikka_id", int.class);

                method.invoke(_paikkaRemoteModel, paikka_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAineistot() {
        return _aineistot;
    }

    @Override
    public void setAineistot(String aineistot) {
        _aineistot = aineistot;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setAineistot", String.class);

                method.invoke(_paikkaRemoteModel, aineistot);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTunniste() {
        return _tunniste;
    }

    @Override
    public void setTunniste(String tunniste) {
        _tunniste = tunniste;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setTunniste", String.class);

                method.invoke(_paikkaRemoteModel, tunniste);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNimi_fin() {
        return _nimi_fin;
    }

    @Override
    public void setNimi_fin(String nimi_fin) {
        _nimi_fin = nimi_fin;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi_fin", String.class);

                method.invoke(_paikkaRemoteModel, nimi_fin);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getNimi_kieli() {
        return _nimi_kieli;
    }

    @Override
    public void setNimi_kieli(String nimi_kieli) {
        _nimi_kieli = nimi_kieli;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi_kieli", String.class);

                method.invoke(_paikkaRemoteModel, nimi_kieli);
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

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setTyyppi", String.class);

                method.invoke(_paikkaRemoteModel, tyyppi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAlue() {
        return _alue;
    }

    @Override
    public void setAlue(String alue) {
        _alue = alue;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setAlue", String.class);

                method.invoke(_paikkaRemoteModel, alue);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getMaa_ISO3166_1() {
        return _maa_ISO3166_1;
    }

    @Override
    public void setMaa_ISO3166_1(String maa_ISO3166_1) {
        _maa_ISO3166_1 = maa_ISO3166_1;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setMaa_ISO3166_1", String.class);

                method.invoke(_paikkaRemoteModel, maa_ISO3166_1);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getAjankohta() {
        return _ajankohta;
    }

    @Override
    public void setAjankohta(String ajankohta) {
        _ajankohta = ajankohta;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setAjankohta", String.class);

                method.invoke(_paikkaRemoteModel, ajankohta);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSelite() {
        return _selite;
    }

    @Override
    public void setSelite(String selite) {
        _selite = selite;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setSelite", String.class);

                method.invoke(_paikkaRemoteModel, selite);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKielet() {
        return _kielet;
    }

    @Override
    public void setKielet(String kielet) {
        _kielet = kielet;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setKielet", String.class);

                method.invoke(_paikkaRemoteModel, kielet);
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

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setMurre", String.class);

                method.invoke(_paikkaRemoteModel, murre);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getSapo_linkki() {
        return _sapo_linkki;
    }

    @Override
    public void setSapo_linkki(String sapo_linkki) {
        _sapo_linkki = sapo_linkki;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setSapo_linkki", String.class);

                method.invoke(_paikkaRemoteModel, sapo_linkki);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getMml_paikkaID() {
        return _mml_paikkaID;
    }

    @Override
    public void setMml_paikkaID(int mml_paikkaID) {
        _mml_paikkaID = mml_paikkaID;

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setMml_paikkaID", int.class);

                method.invoke(_paikkaRemoteModel, mml_paikkaID);
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

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setTuotu_kantaan", Date.class);

                method.invoke(_paikkaRemoteModel, tuotu_kantaan);
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

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setMuutettu", Date.class);

                method.invoke(_paikkaRemoteModel, muutettu);
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

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setMuuttaja", String.class);

                method.invoke(_paikkaRemoteModel, muuttaja);
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

        if (_paikkaRemoteModel != null) {
            try {
                Class<?> clazz = _paikkaRemoteModel.getClass();

                Method method = clazz.getMethod("setPoistettu", Date.class);

                method.invoke(_paikkaRemoteModel, poistettu);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getPaikkaRemoteModel() {
        return _paikkaRemoteModel;
    }

    public void setPaikkaRemoteModel(BaseModel<?> paikkaRemoteModel) {
        _paikkaRemoteModel = paikkaRemoteModel;
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

        Class<?> remoteModelClass = _paikkaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_paikkaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaikkaLocalServiceUtil.addPaikka(this);
        } else {
            PaikkaLocalServiceUtil.updatePaikka(this);
        }
    }

    @Override
    public Paikka toEscapedModel() {
        return (Paikka) ProxyUtil.newProxyInstance(Paikka.class.getClassLoader(),
            new Class[] { Paikka.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        PaikkaClp clone = new PaikkaClp();

        clone.setPaikka_id(getPaikka_id());
        clone.setAineistot(getAineistot());
        clone.setTunniste(getTunniste());
        clone.setNimi_fin(getNimi_fin());
        clone.setNimi_kieli(getNimi_kieli());
        clone.setTyyppi(getTyyppi());
        clone.setAlue(getAlue());
        clone.setMaa_ISO3166_1(getMaa_ISO3166_1());
        clone.setAjankohta(getAjankohta());
        clone.setSelite(getSelite());
        clone.setKielet(getKielet());
        clone.setMurre(getMurre());
        clone.setSapo_linkki(getSapo_linkki());
        clone.setMml_paikkaID(getMml_paikkaID());
        clone.setTuotu_kantaan(getTuotu_kantaan());
        clone.setMuutettu(getMuutettu());
        clone.setMuuttaja(getMuuttaja());
        clone.setPoistettu(getPoistettu());

        return clone;
    }

    @Override
    public int compareTo(Paikka paikka) {
        int primaryKey = paikka.getPrimaryKey();

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

        if (!(obj instanceof PaikkaClp)) {
            return false;
        }

        PaikkaClp paikka = (PaikkaClp) obj;

        int primaryKey = paikka.getPrimaryKey();

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
        StringBundler sb = new StringBundler(37);

        sb.append("{paikka_id=");
        sb.append(getPaikka_id());
        sb.append(", aineistot=");
        sb.append(getAineistot());
        sb.append(", tunniste=");
        sb.append(getTunniste());
        sb.append(", nimi_fin=");
        sb.append(getNimi_fin());
        sb.append(", nimi_kieli=");
        sb.append(getNimi_kieli());
        sb.append(", tyyppi=");
        sb.append(getTyyppi());
        sb.append(", alue=");
        sb.append(getAlue());
        sb.append(", maa_ISO3166_1=");
        sb.append(getMaa_ISO3166_1());
        sb.append(", ajankohta=");
        sb.append(getAjankohta());
        sb.append(", selite=");
        sb.append(getSelite());
        sb.append(", kielet=");
        sb.append(getKielet());
        sb.append(", murre=");
        sb.append(getMurre());
        sb.append(", sapo_linkki=");
        sb.append(getSapo_linkki());
        sb.append(", mml_paikkaID=");
        sb.append(getMml_paikkaID());
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
        StringBundler sb = new StringBundler(58);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.kotus.kielikartastot.db.model.Paikka");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>paikka_id</column-name><column-value><![CDATA[");
        sb.append(getPaikka_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aineistot</column-name><column-value><![CDATA[");
        sb.append(getAineistot());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tunniste</column-name><column-value><![CDATA[");
        sb.append(getTunniste());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nimi_fin</column-name><column-value><![CDATA[");
        sb.append(getNimi_fin());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nimi_kieli</column-name><column-value><![CDATA[");
        sb.append(getNimi_kieli());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tyyppi</column-name><column-value><![CDATA[");
        sb.append(getTyyppi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>alue</column-name><column-value><![CDATA[");
        sb.append(getAlue());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>maa_ISO3166_1</column-name><column-value><![CDATA[");
        sb.append(getMaa_ISO3166_1());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ajankohta</column-name><column-value><![CDATA[");
        sb.append(getAjankohta());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>selite</column-name><column-value><![CDATA[");
        sb.append(getSelite());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kielet</column-name><column-value><![CDATA[");
        sb.append(getKielet());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>murre</column-name><column-value><![CDATA[");
        sb.append(getMurre());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>sapo_linkki</column-name><column-value><![CDATA[");
        sb.append(getSapo_linkki());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>mml_paikkaID</column-name><column-value><![CDATA[");
        sb.append(getMml_paikkaID());
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
