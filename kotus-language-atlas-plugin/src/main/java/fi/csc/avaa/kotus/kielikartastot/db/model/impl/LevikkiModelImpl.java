package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.model.Levikki;
import fi.csc.avaa.kotus.kielikartastot.db.model.LevikkiModel;
import fi.csc.avaa.kotus.kielikartastot.db.model.LevikkiSoap;

import java.io.Serializable;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Levikki service. Represents a row in the &quot;levikki&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.avaa.kotus.kielikartastot.db.model.LevikkiModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LevikkiImpl}.
 * </p>
 *
 * @author CSC
 * @see LevikkiImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.Levikki
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.LevikkiModel
 * @generated
 */
@JSON(strict = true)
public class LevikkiModelImpl extends BaseModelImpl<Levikki>
    implements LevikkiModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a levikki model instance should use the {@link fi.csc.avaa.kotus.kielikartastot.db.model.Levikki} interface instead.
     */
    public static final String TABLE_NAME = "levikki";
    public static final Object[][] TABLE_COLUMNS = {
            { "levikki_id", Types.INTEGER },
            { "ilmio_id", Types.INTEGER },
            { "paikka_id", Types.INTEGER },
            { "paikka_tunniste", Types.VARCHAR },
            { "ilmio_tunnus", Types.VARCHAR },
            { "uusi", Types.INTEGER }
        };
    public static final String TABLE_SQL_CREATE = "create table levikki (levikki_id INTEGER not null primary key,ilmio_id INTEGER,paikka_id INTEGER,paikka_tunniste VARCHAR(75) null,ilmio_tunnus VARCHAR(75) null,uusi INTEGER)";
    public static final String TABLE_SQL_DROP = "drop table levikki";
    public static final String ORDER_BY_JPQL = " ORDER BY levikki.levikki_id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY levikki.levikki_id ASC";
    public static final String DATA_SOURCE = "kotus_kielikartastot";
    public static final String SESSION_FACTORY = "kotus_kielikartastotSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.avaa.kotus.kielikartastot.db.model.Levikki"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.avaa.kotus.kielikartastot.db.model.Levikki"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.avaa.kotus.kielikartastot.db.model.Levikki"));
    private static ClassLoader _classLoader = Levikki.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] {
            Levikki.class
        };
    private int _levikki_id;
    private int _ilmio_id;
    private int _paikka_id;
    private String _paikka_tunniste;
    private String _ilmio_tunnus;
    private int _uusi;
    private Levikki _escapedModel;

    public LevikkiModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Levikki toModel(LevikkiSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Levikki model = new LevikkiImpl();

        model.setLevikki_id(soapModel.getLevikki_id());
        model.setIlmio_id(soapModel.getIlmio_id());
        model.setPaikka_id(soapModel.getPaikka_id());
        model.setPaikka_tunniste(soapModel.getPaikka_tunniste());
        model.setIlmio_tunnus(soapModel.getIlmio_tunnus());
        model.setUusi(soapModel.getUusi());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Levikki> toModels(LevikkiSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Levikki> models = new ArrayList<Levikki>(soapModels.length);

        for (LevikkiSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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

    @JSON
    @Override
    public int getLevikki_id() {
        return _levikki_id;
    }

    @Override
    public void setLevikki_id(int levikki_id) {
        _levikki_id = levikki_id;
    }

    @JSON
    @Override
    public int getIlmio_id() {
        return _ilmio_id;
    }

    @Override
    public void setIlmio_id(int ilmio_id) {
        _ilmio_id = ilmio_id;
    }

    @JSON
    @Override
    public int getPaikka_id() {
        return _paikka_id;
    }

    @Override
    public void setPaikka_id(int paikka_id) {
        _paikka_id = paikka_id;
    }

    @JSON
    @Override
    public String getPaikka_tunniste() {
        if (_paikka_tunniste == null) {
            return StringPool.BLANK;
        } else {
            return _paikka_tunniste;
        }
    }

    @Override
    public void setPaikka_tunniste(String paikka_tunniste) {
        _paikka_tunniste = paikka_tunniste;
    }

    @JSON
    @Override
    public String getIlmio_tunnus() {
        if (_ilmio_tunnus == null) {
            return StringPool.BLANK;
        } else {
            return _ilmio_tunnus;
        }
    }

    @Override
    public void setIlmio_tunnus(String ilmio_tunnus) {
        _ilmio_tunnus = ilmio_tunnus;
    }

    @JSON
    @Override
    public int getUusi() {
        return _uusi;
    }

    @Override
    public void setUusi(int uusi) {
        _uusi = uusi;
    }

    @Override
    public Levikki toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Levikki) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        LevikkiImpl levikkiImpl = new LevikkiImpl();

        levikkiImpl.setLevikki_id(getLevikki_id());
        levikkiImpl.setIlmio_id(getIlmio_id());
        levikkiImpl.setPaikka_id(getPaikka_id());
        levikkiImpl.setPaikka_tunniste(getPaikka_tunniste());
        levikkiImpl.setIlmio_tunnus(getIlmio_tunnus());
        levikkiImpl.setUusi(getUusi());

        levikkiImpl.resetOriginalValues();

        return levikkiImpl;
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

        if (!(obj instanceof Levikki)) {
            return false;
        }

        Levikki levikki = (Levikki) obj;

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
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Levikki> toCacheModel() {
        LevikkiCacheModel levikkiCacheModel = new LevikkiCacheModel();

        levikkiCacheModel.levikki_id = getLevikki_id();

        levikkiCacheModel.ilmio_id = getIlmio_id();

        levikkiCacheModel.paikka_id = getPaikka_id();

        levikkiCacheModel.paikka_tunniste = getPaikka_tunniste();

        String paikka_tunniste = levikkiCacheModel.paikka_tunniste;

        if ((paikka_tunniste != null) && (paikka_tunniste.length() == 0)) {
            levikkiCacheModel.paikka_tunniste = null;
        }

        levikkiCacheModel.ilmio_tunnus = getIlmio_tunnus();

        String ilmio_tunnus = levikkiCacheModel.ilmio_tunnus;

        if ((ilmio_tunnus != null) && (ilmio_tunnus.length() == 0)) {
            levikkiCacheModel.ilmio_tunnus = null;
        }

        levikkiCacheModel.uusi = getUusi();

        return levikkiCacheModel;
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
