package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer;
import fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiLocalServiceUtil;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class LajikoodiClp extends BaseModelImpl<Lajikoodi> implements Lajikoodi {
    private int _lajikoodi_id;
    private int _lajikoodi;
    private String _laji;
    private String _aineistot;
    private String _viite;
    private Date _tuotu_kantaan;
    private Date _muutettu;
    private String _muuttaja;
    private Date _poistettu;
    private BaseModel<?> _lajikoodiRemoteModel;

    public LajikoodiClp() {
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
    public int getPrimaryKey() {
        return _lajikoodi_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setLajikoodi_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _lajikoodi_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getLajikoodi_id() {
        return _lajikoodi_id;
    }

    @Override
    public void setLajikoodi_id(int lajikoodi_id) {
        _lajikoodi_id = lajikoodi_id;

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setLajikoodi_id", int.class);

                method.invoke(_lajikoodiRemoteModel, lajikoodi_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getLajikoodi() {
        return _lajikoodi;
    }

    @Override
    public void setLajikoodi(int lajikoodi) {
        _lajikoodi = lajikoodi;

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setLajikoodi", int.class);

                method.invoke(_lajikoodiRemoteModel, lajikoodi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getLaji() {
        return _laji;
    }

    @Override
    public void setLaji(String laji) {
        _laji = laji;

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setLaji", String.class);

                method.invoke(_lajikoodiRemoteModel, laji);
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

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setAineistot", String.class);

                method.invoke(_lajikoodiRemoteModel, aineistot);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getViite() {
        return _viite;
    }

    @Override
    public void setViite(String viite) {
        _viite = viite;

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setViite", String.class);

                method.invoke(_lajikoodiRemoteModel, viite);
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

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setTuotu_kantaan", Date.class);

                method.invoke(_lajikoodiRemoteModel, tuotu_kantaan);
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

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setMuutettu", Date.class);

                method.invoke(_lajikoodiRemoteModel, muutettu);
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

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setMuuttaja", String.class);

                method.invoke(_lajikoodiRemoteModel, muuttaja);
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

        if (_lajikoodiRemoteModel != null) {
            try {
                Class<?> clazz = _lajikoodiRemoteModel.getClass();

                Method method = clazz.getMethod("setPoistettu", Date.class);

                method.invoke(_lajikoodiRemoteModel, poistettu);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLajikoodiRemoteModel() {
        return _lajikoodiRemoteModel;
    }

    public void setLajikoodiRemoteModel(BaseModel<?> lajikoodiRemoteModel) {
        _lajikoodiRemoteModel = lajikoodiRemoteModel;
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

        Class<?> remoteModelClass = _lajikoodiRemoteModel.getClass();

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

        Object returnValue = method.invoke(_lajikoodiRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LajikoodiLocalServiceUtil.addLajikoodi(this);
        } else {
            LajikoodiLocalServiceUtil.updateLajikoodi(this);
        }
    }

    @Override
    public Lajikoodi toEscapedModel() {
        return (Lajikoodi) ProxyUtil.newProxyInstance(Lajikoodi.class.getClassLoader(),
            new Class[] { Lajikoodi.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LajikoodiClp clone = new LajikoodiClp();

        clone.setLajikoodi_id(getLajikoodi_id());
        clone.setLajikoodi(getLajikoodi());
        clone.setLaji(getLaji());
        clone.setAineistot(getAineistot());
        clone.setViite(getViite());
        clone.setTuotu_kantaan(getTuotu_kantaan());
        clone.setMuutettu(getMuutettu());
        clone.setMuuttaja(getMuuttaja());
        clone.setPoistettu(getPoistettu());

        return clone;
    }

    @Override
    public int compareTo(Lajikoodi lajikoodi) {
        int primaryKey = lajikoodi.getPrimaryKey();

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

        if (!(obj instanceof LajikoodiClp)) {
            return false;
        }

        LajikoodiClp lajikoodi = (LajikoodiClp) obj;

        int primaryKey = lajikoodi.getPrimaryKey();

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
        StringBundler sb = new StringBundler(19);

        sb.append("{lajikoodi_id=");
        sb.append(getLajikoodi_id());
        sb.append(", lajikoodi=");
        sb.append(getLajikoodi());
        sb.append(", laji=");
        sb.append(getLaji());
        sb.append(", aineistot=");
        sb.append(getAineistot());
        sb.append(", viite=");
        sb.append(getViite());
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
        StringBundler sb = new StringBundler(31);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>lajikoodi_id</column-name><column-value><![CDATA[");
        sb.append(getLajikoodi_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>lajikoodi</column-name><column-value><![CDATA[");
        sb.append(getLajikoodi());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>laji</column-name><column-value><![CDATA[");
        sb.append(getLaji());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>aineistot</column-name><column-value><![CDATA[");
        sb.append(getAineistot());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>viite</column-name><column-value><![CDATA[");
        sb.append(getViite());
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
