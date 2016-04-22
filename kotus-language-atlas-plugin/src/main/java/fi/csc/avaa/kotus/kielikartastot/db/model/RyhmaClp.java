package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer;
import fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class RyhmaClp extends BaseModelImpl<Ryhma> implements Ryhma {
    private int _ryhma_id;
    private int _aineisto_id;
    private String _nimi;
    private String _tyyppi;
    private int _ylaryhma;
    private String _selite;
    private String _kartta_kuva_linkki;
    private Date _tuotu_kantaan;
    private Date _muutettu;
    private String _muuttaja;
    private Date _poistettu;
    private String _tmp;
    private String _tunnus;
    private BaseModel<?> _ryhmaRemoteModel;

    public RyhmaClp() {
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
    public int getPrimaryKey() {
        return _ryhma_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setRyhma_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _ryhma_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getRyhma_id() {
        return _ryhma_id;
    }

    @Override
    public void setRyhma_id(int ryhma_id) {
        _ryhma_id = ryhma_id;

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setRyhma_id", int.class);

                method.invoke(_ryhmaRemoteModel, ryhma_id);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setAineisto_id", int.class);

                method.invoke(_ryhmaRemoteModel, aineisto_id);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setNimi", String.class);

                method.invoke(_ryhmaRemoteModel, nimi);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setTyyppi", String.class);

                method.invoke(_ryhmaRemoteModel, tyyppi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getYlaryhma() {
        return _ylaryhma;
    }

    @Override
    public void setYlaryhma(int ylaryhma) {
        _ylaryhma = ylaryhma;

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setYlaryhma", int.class);

                method.invoke(_ryhmaRemoteModel, ylaryhma);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setSelite", String.class);

                method.invoke(_ryhmaRemoteModel, selite);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getKartta_kuva_linkki() {
        return _kartta_kuva_linkki;
    }

    @Override
    public void setKartta_kuva_linkki(String kartta_kuva_linkki) {
        _kartta_kuva_linkki = kartta_kuva_linkki;

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setKartta_kuva_linkki",
                        String.class);

                method.invoke(_ryhmaRemoteModel, kartta_kuva_linkki);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setTuotu_kantaan", Date.class);

                method.invoke(_ryhmaRemoteModel, tuotu_kantaan);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setMuutettu", Date.class);

                method.invoke(_ryhmaRemoteModel, muutettu);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setMuuttaja", String.class);

                method.invoke(_ryhmaRemoteModel, muuttaja);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setPoistettu", Date.class);

                method.invoke(_ryhmaRemoteModel, poistettu);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getTmp() {
        return _tmp;
    }

    @Override
    public void setTmp(String tmp) {
        _tmp = tmp;

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setTmp", String.class);

                method.invoke(_ryhmaRemoteModel, tmp);
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

        if (_ryhmaRemoteModel != null) {
            try {
                Class<?> clazz = _ryhmaRemoteModel.getClass();

                Method method = clazz.getMethod("setTunnus", String.class);

                method.invoke(_ryhmaRemoteModel, tunnus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getRyhmaRemoteModel() {
        return _ryhmaRemoteModel;
    }

    public void setRyhmaRemoteModel(BaseModel<?> ryhmaRemoteModel) {
        _ryhmaRemoteModel = ryhmaRemoteModel;
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

        Class<?> remoteModelClass = _ryhmaRemoteModel.getClass();

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

        Object returnValue = method.invoke(_ryhmaRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            RyhmaLocalServiceUtil.addRyhma(this);
        } else {
            RyhmaLocalServiceUtil.updateRyhma(this);
        }
    }

    @Override
    public Ryhma toEscapedModel() {
        return (Ryhma) ProxyUtil.newProxyInstance(Ryhma.class.getClassLoader(),
            new Class[] { Ryhma.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        RyhmaClp clone = new RyhmaClp();

        clone.setRyhma_id(getRyhma_id());
        clone.setAineisto_id(getAineisto_id());
        clone.setNimi(getNimi());
        clone.setTyyppi(getTyyppi());
        clone.setYlaryhma(getYlaryhma());
        clone.setSelite(getSelite());
        clone.setKartta_kuva_linkki(getKartta_kuva_linkki());
        clone.setTuotu_kantaan(getTuotu_kantaan());
        clone.setMuutettu(getMuutettu());
        clone.setMuuttaja(getMuuttaja());
        clone.setPoistettu(getPoistettu());
        clone.setTmp(getTmp());
        clone.setTunnus(getTunnus());

        return clone;
    }

    @Override
    public int compareTo(Ryhma ryhma) {
        int primaryKey = ryhma.getPrimaryKey();

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

        if (!(obj instanceof RyhmaClp)) {
            return false;
        }

        RyhmaClp ryhma = (RyhmaClp) obj;

        int primaryKey = ryhma.getPrimaryKey();

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
        StringBundler sb = new StringBundler(27);

        sb.append("{ryhma_id=");
        sb.append(getRyhma_id());
        sb.append(", aineisto_id=");
        sb.append(getAineisto_id());
        sb.append(", nimi=");
        sb.append(getNimi());
        sb.append(", tyyppi=");
        sb.append(getTyyppi());
        sb.append(", ylaryhma=");
        sb.append(getYlaryhma());
        sb.append(", selite=");
        sb.append(getSelite());
        sb.append(", kartta_kuva_linkki=");
        sb.append(getKartta_kuva_linkki());
        sb.append(", tuotu_kantaan=");
        sb.append(getTuotu_kantaan());
        sb.append(", muutettu=");
        sb.append(getMuutettu());
        sb.append(", muuttaja=");
        sb.append(getMuuttaja());
        sb.append(", poistettu=");
        sb.append(getPoistettu());
        sb.append(", tmp=");
        sb.append(getTmp());
        sb.append(", tunnus=");
        sb.append(getTunnus());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(43);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>ryhma_id</column-name><column-value><![CDATA[");
        sb.append(getRyhma_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aineisto_id</column-name><column-value><![CDATA[");
        sb.append(getAineisto_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>nimi</column-name><column-value><![CDATA[");
        sb.append(getNimi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tyyppi</column-name><column-value><![CDATA[");
        sb.append(getTyyppi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ylaryhma</column-name><column-value><![CDATA[");
        sb.append(getYlaryhma());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>selite</column-name><column-value><![CDATA[");
        sb.append(getSelite());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>kartta_kuva_linkki</column-name><column-value><![CDATA[");
        sb.append(getKartta_kuva_linkki());
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
            "<column><column-name>tmp</column-name><column-value><![CDATA[");
        sb.append(getTmp());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>tunnus</column-name><column-value><![CDATA[");
        sb.append(getTunnus());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
