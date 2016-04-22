package fi.csc.avaa.kotus.kielikartastot.db.model;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer;
import fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalServiceUtil;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;


public class LevikkiClp extends BaseModelImpl<Levikki> implements Levikki {
    private int _levikki_id;
    private int _ilmio_id;
    private int _paikka_id;
    private String _paikka_tunniste;
    private String _ilmio_tunnus;
    private int _uusi;
    private BaseModel<?> _levikkiRemoteModel;

    public LevikkiClp() {
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
    public int getPrimaryKey() {
        return _levikki_id;
    }

    @Override
    public void setPrimaryKey(int primaryKey) {
        setLevikki_id(primaryKey);
    }

    @Override
    public Serializable getPrimaryKeyObj() {
        return _levikki_id;
    }

    @Override
    public void setPrimaryKeyObj(Serializable primaryKeyObj) {
        setPrimaryKey(((Integer) primaryKeyObj).intValue());
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

    @Override
    public int getLevikki_id() {
        return _levikki_id;
    }

    @Override
    public void setLevikki_id(int levikki_id) {
        _levikki_id = levikki_id;

        if (_levikkiRemoteModel != null) {
            try {
                Class<?> clazz = _levikkiRemoteModel.getClass();

                Method method = clazz.getMethod("setLevikki_id", int.class);

                method.invoke(_levikkiRemoteModel, levikki_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getIlmio_id() {
        return _ilmio_id;
    }

    @Override
    public void setIlmio_id(int ilmio_id) {
        _ilmio_id = ilmio_id;

        if (_levikkiRemoteModel != null) {
            try {
                Class<?> clazz = _levikkiRemoteModel.getClass();

                Method method = clazz.getMethod("setIlmio_id", int.class);

                method.invoke(_levikkiRemoteModel, ilmio_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getPaikka_id() {
        return _paikka_id;
    }

    @Override
    public void setPaikka_id(int paikka_id) {
        _paikka_id = paikka_id;

        if (_levikkiRemoteModel != null) {
            try {
                Class<?> clazz = _levikkiRemoteModel.getClass();

                Method method = clazz.getMethod("setPaikka_id", int.class);

                method.invoke(_levikkiRemoteModel, paikka_id);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getPaikka_tunniste() {
        return _paikka_tunniste;
    }

    @Override
    public void setPaikka_tunniste(String paikka_tunniste) {
        _paikka_tunniste = paikka_tunniste;

        if (_levikkiRemoteModel != null) {
            try {
                Class<?> clazz = _levikkiRemoteModel.getClass();

                Method method = clazz.getMethod("setPaikka_tunniste",
                        String.class);

                method.invoke(_levikkiRemoteModel, paikka_tunniste);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public String getIlmio_tunnus() {
        return _ilmio_tunnus;
    }

    @Override
    public void setIlmio_tunnus(String ilmio_tunnus) {
        _ilmio_tunnus = ilmio_tunnus;

        if (_levikkiRemoteModel != null) {
            try {
                Class<?> clazz = _levikkiRemoteModel.getClass();

                Method method = clazz.getMethod("setIlmio_tunnus", String.class);

                method.invoke(_levikkiRemoteModel, ilmio_tunnus);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    @Override
    public int getUusi() {
        return _uusi;
    }

    @Override
    public void setUusi(int uusi) {
        _uusi = uusi;

        if (_levikkiRemoteModel != null) {
            try {
                Class<?> clazz = _levikkiRemoteModel.getClass();

                Method method = clazz.getMethod("setUusi", int.class);

                method.invoke(_levikkiRemoteModel, uusi);
            } catch (Exception e) {
                throw new UnsupportedOperationException(e);
            }
        }
    }

    public BaseModel<?> getLevikkiRemoteModel() {
        return _levikkiRemoteModel;
    }

    public void setLevikkiRemoteModel(BaseModel<?> levikkiRemoteModel) {
        _levikkiRemoteModel = levikkiRemoteModel;
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

        Class<?> remoteModelClass = _levikkiRemoteModel.getClass();

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

        Object returnValue = method.invoke(_levikkiRemoteModel,
                remoteParameterValues);

        if (returnValue != null) {
            returnValue = ClpSerializer.translateOutput(returnValue);
        }

        return returnValue;
    }

    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LevikkiLocalServiceUtil.addLevikki(this);
        } else {
            LevikkiLocalServiceUtil.updateLevikki(this);
        }
    }

    @Override
    public Levikki toEscapedModel() {
        return (Levikki) ProxyUtil.newProxyInstance(Levikki.class.getClassLoader(),
            new Class[] { Levikki.class }, new AutoEscapeBeanHandler(this));
    }

    @Override
    public Object clone() {
        LevikkiClp clone = new LevikkiClp();

        clone.setLevikki_id(getLevikki_id());
        clone.setIlmio_id(getIlmio_id());
        clone.setPaikka_id(getPaikka_id());
        clone.setPaikka_tunniste(getPaikka_tunniste());
        clone.setIlmio_tunnus(getIlmio_tunnus());
        clone.setUusi(getUusi());

        return clone;
    }

    @Override
    public int compareTo(Levikki levikki) {
        int primaryKey = levikki.getPrimaryKey();

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

        if (!(obj instanceof LevikkiClp)) {
            return false;
        }

        LevikkiClp levikki = (LevikkiClp) obj;

        int primaryKey = levikki.getPrimaryKey();

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
        StringBundler sb = new StringBundler(13);

        sb.append("{levikki_id=");
        sb.append(getLevikki_id());
        sb.append(", ilmio_id=");
        sb.append(getIlmio_id());
        sb.append(", paikka_id=");
        sb.append(getPaikka_id());
        sb.append(", paikka_tunniste=");
        sb.append(getPaikka_tunniste());
        sb.append(", ilmio_tunnus=");
        sb.append(getIlmio_tunnus());
        sb.append(", uusi=");
        sb.append(getUusi());
        sb.append("}");

        return sb.toString();
    }

    @Override
    public String toXmlString() {
        StringBundler sb = new StringBundler(22);

        sb.append("<model><model-name>");
        sb.append("fi.csc.avaa.kotus.kielikartastot.db.model.Levikki");
        sb.append("</model-name>");

        sb.append(
            "<column><column-name>levikki_id</column-name><column-value><![CDATA[");
        sb.append(getLevikki_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ilmio_id</column-name><column-value><![CDATA[");
        sb.append(getIlmio_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paikka_id</column-name><column-value><![CDATA[");
        sb.append(getPaikka_id());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>paikka_tunniste</column-name><column-value><![CDATA[");
        sb.append(getPaikka_tunniste());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>ilmio_tunnus</column-name><column-value><![CDATA[");
        sb.append(getIlmio_tunnus());
        sb.append("]]></column-value></column>");
        sb.append(
            "<column><column-name>uusi</column-name><column-value><![CDATA[");
        sb.append(getUusi());
        sb.append("]]></column-value></column>");

        sb.append("</model>");

        return sb.toString();
    }
}
