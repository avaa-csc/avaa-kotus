package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;
import fi.csc.avaa.kotus.kielikartastot.db.model.PaikkaModel;
import fi.csc.avaa.kotus.kielikartastot.db.model.PaikkaSoap;

import java.io.Serializable;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Paikka service. Represents a row in the &quot;paikka&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link fi.csc.avaa.kotus.kielikartastot.db.model.PaikkaModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaikkaImpl}.
 * </p>
 *
 * @author CSC
 * @see PaikkaImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.Paikka
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.PaikkaModel
 * @generated
 */
@JSON(strict = true)
public class PaikkaModelImpl extends BaseModelImpl<Paikka>
    implements PaikkaModel {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a paikka model instance should use the {@link fi.csc.avaa.kotus.kielikartastot.db.model.Paikka} interface instead.
     */
    public static final String TABLE_NAME = "paikka";
    public static final Object[][] TABLE_COLUMNS = {
            { "paikka_id", Types.INTEGER },
            { "aineistot", Types.VARCHAR },
            { "tunniste", Types.VARCHAR },
            { "nimi_fin", Types.VARCHAR },
            { "nimi_kieli", Types.VARCHAR },
            { "tyyppi", Types.VARCHAR },
            { "alue", Types.VARCHAR },
            { "maa_ISO3166_1", Types.VARCHAR },
            { "ajankohta", Types.VARCHAR },
            { "selite", Types.VARCHAR },
            { "kielet", Types.VARCHAR },
            { "murre", Types.VARCHAR },
            { "sapo_linkki", Types.VARCHAR },
            { "mml_paikkaID", Types.INTEGER },
            { "tuotu_kantaan", Types.TIMESTAMP },
            { "muutettu", Types.TIMESTAMP },
            { "muuttaja", Types.VARCHAR },
            { "poistettu", Types.TIMESTAMP }
        };
    public static final String TABLE_SQL_CREATE = "create table paikka (paikka_id INTEGER not null primary key,aineistot VARCHAR(75) null,tunniste VARCHAR(75) null,nimi_fin VARCHAR(75) null,nimi_kieli VARCHAR(75) null,tyyppi VARCHAR(75) null,alue VARCHAR(75) null,maa_ISO3166_1 VARCHAR(75) null,ajankohta VARCHAR(75) null,selite VARCHAR(75) null,kielet VARCHAR(75) null,murre VARCHAR(75) null,sapo_linkki VARCHAR(75) null,mml_paikkaID INTEGER,tuotu_kantaan DATE null,muutettu DATE null,muuttaja VARCHAR(75) null,poistettu DATE null)";
    public static final String TABLE_SQL_DROP = "drop table paikka";
    public static final String ORDER_BY_JPQL = " ORDER BY paikka.paikka_id ASC";
    public static final String ORDER_BY_SQL = " ORDER BY paikka.paikka_id ASC";
    public static final String DATA_SOURCE = "kotus_kielikartastot";
    public static final String SESSION_FACTORY = "kotus_kielikartastotSessionFactory";
    public static final String TX_MANAGER = "liferayTransactionManager";
    public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.entity.cache.enabled.fi.csc.avaa.kotus.kielikartastot.db.model.Paikka"),
            true);
    public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
                "value.object.finder.cache.enabled.fi.csc.avaa.kotus.kielikartastot.db.model.Paikka"),
            true);
    public static final boolean COLUMN_BITMASK_ENABLED = false;
    public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
                "lock.expiration.time.fi.csc.avaa.kotus.kielikartastot.db.model.Paikka"));
    private static ClassLoader _classLoader = Paikka.class.getClassLoader();
    private static Class<?>[] _escapedModelInterfaces = new Class[] { Paikka.class };
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
    private Paikka _escapedModel;

    public PaikkaModelImpl() {
    }

    /**
     * Converts the soap model instance into a normal model instance.
     *
     * @param soapModel the soap model instance to convert
     * @return the normal model instance
     */
    public static Paikka toModel(PaikkaSoap soapModel) {
        if (soapModel == null) {
            return null;
        }

        Paikka model = new PaikkaImpl();

        model.setPaikka_id(soapModel.getPaikka_id());
        model.setAineistot(soapModel.getAineistot());
        model.setTunniste(soapModel.getTunniste());
        model.setNimi_fin(soapModel.getNimi_fin());
        model.setNimi_kieli(soapModel.getNimi_kieli());
        model.setTyyppi(soapModel.getTyyppi());
        model.setAlue(soapModel.getAlue());
        model.setMaa_ISO3166_1(soapModel.getMaa_ISO3166_1());
        model.setAjankohta(soapModel.getAjankohta());
        model.setSelite(soapModel.getSelite());
        model.setKielet(soapModel.getKielet());
        model.setMurre(soapModel.getMurre());
        model.setSapo_linkki(soapModel.getSapo_linkki());
        model.setMml_paikkaID(soapModel.getMml_paikkaID());
        model.setTuotu_kantaan(soapModel.getTuotu_kantaan());
        model.setMuutettu(soapModel.getMuutettu());
        model.setMuuttaja(soapModel.getMuuttaja());
        model.setPoistettu(soapModel.getPoistettu());

        return model;
    }

    /**
     * Converts the soap model instances into normal model instances.
     *
     * @param soapModels the soap model instances to convert
     * @return the normal model instances
     */
    public static List<Paikka> toModels(PaikkaSoap[] soapModels) {
        if (soapModels == null) {
            return null;
        }

        List<Paikka> models = new ArrayList<Paikka>(soapModels.length);

        for (PaikkaSoap soapModel : soapModels) {
            models.add(toModel(soapModel));
        }

        return models;
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
    public Class<?> getModelClass() {
        return Paikka.class;
    }

    @Override
    public String getModelClassName() {
        return Paikka.class.getName();
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
    public String getAineistot() {
        if (_aineistot == null) {
            return StringPool.BLANK;
        } else {
            return _aineistot;
        }
    }

    @Override
    public void setAineistot(String aineistot) {
        _aineistot = aineistot;
    }

    @JSON
    @Override
    public String getTunniste() {
        if (_tunniste == null) {
            return StringPool.BLANK;
        } else {
            return _tunniste;
        }
    }

    @Override
    public void setTunniste(String tunniste) {
        _tunniste = tunniste;
    }

    @JSON
    @Override
    public String getNimi_fin() {
        if (_nimi_fin == null) {
            return StringPool.BLANK;
        } else {
            return _nimi_fin;
        }
    }

    @Override
    public void setNimi_fin(String nimi_fin) {
        _nimi_fin = nimi_fin;
    }

    @JSON
    @Override
    public String getNimi_kieli() {
        if (_nimi_kieli == null) {
            return StringPool.BLANK;
        } else {
            return _nimi_kieli;
        }
    }

    @Override
    public void setNimi_kieli(String nimi_kieli) {
        _nimi_kieli = nimi_kieli;
    }

    @JSON
    @Override
    public String getTyyppi() {
        if (_tyyppi == null) {
            return StringPool.BLANK;
        } else {
            return _tyyppi;
        }
    }

    @Override
    public void setTyyppi(String tyyppi) {
        _tyyppi = tyyppi;
    }

    @JSON
    @Override
    public String getAlue() {
        if (_alue == null) {
            return StringPool.BLANK;
        } else {
            return _alue;
        }
    }

    @Override
    public void setAlue(String alue) {
        _alue = alue;
    }

    @JSON
    @Override
    public String getMaa_ISO3166_1() {
        if (_maa_ISO3166_1 == null) {
            return StringPool.BLANK;
        } else {
            return _maa_ISO3166_1;
        }
    }

    @Override
    public void setMaa_ISO3166_1(String maa_ISO3166_1) {
        _maa_ISO3166_1 = maa_ISO3166_1;
    }

    @JSON
    @Override
    public String getAjankohta() {
        if (_ajankohta == null) {
            return StringPool.BLANK;
        } else {
            return _ajankohta;
        }
    }

    @Override
    public void setAjankohta(String ajankohta) {
        _ajankohta = ajankohta;
    }

    @JSON
    @Override
    public String getSelite() {
        if (_selite == null) {
            return StringPool.BLANK;
        } else {
            return _selite;
        }
    }

    @Override
    public void setSelite(String selite) {
        _selite = selite;
    }

    @JSON
    @Override
    public String getKielet() {
        if (_kielet == null) {
            return StringPool.BLANK;
        } else {
            return _kielet;
        }
    }

    @Override
    public void setKielet(String kielet) {
        _kielet = kielet;
    }

    @JSON
    @Override
    public String getMurre() {
        if (_murre == null) {
            return StringPool.BLANK;
        } else {
            return _murre;
        }
    }

    @Override
    public void setMurre(String murre) {
        _murre = murre;
    }

    @JSON
    @Override
    public String getSapo_linkki() {
        if (_sapo_linkki == null) {
            return StringPool.BLANK;
        } else {
            return _sapo_linkki;
        }
    }

    @Override
    public void setSapo_linkki(String sapo_linkki) {
        _sapo_linkki = sapo_linkki;
    }

    @JSON
    @Override
    public int getMml_paikkaID() {
        return _mml_paikkaID;
    }

    @Override
    public void setMml_paikkaID(int mml_paikkaID) {
        _mml_paikkaID = mml_paikkaID;
    }

    @JSON
    @Override
    public Date getTuotu_kantaan() {
        return _tuotu_kantaan;
    }

    @Override
    public void setTuotu_kantaan(Date tuotu_kantaan) {
        _tuotu_kantaan = tuotu_kantaan;
    }

    @JSON
    @Override
    public Date getMuutettu() {
        return _muutettu;
    }

    @Override
    public void setMuutettu(Date muutettu) {
        _muutettu = muutettu;
    }

    @JSON
    @Override
    public String getMuuttaja() {
        if (_muuttaja == null) {
            return StringPool.BLANK;
        } else {
            return _muuttaja;
        }
    }

    @Override
    public void setMuuttaja(String muuttaja) {
        _muuttaja = muuttaja;
    }

    @JSON
    @Override
    public Date getPoistettu() {
        return _poistettu;
    }

    @Override
    public void setPoistettu(Date poistettu) {
        _poistettu = poistettu;
    }

    @Override
    public Paikka toEscapedModel() {
        if (_escapedModel == null) {
            _escapedModel = (Paikka) ProxyUtil.newProxyInstance(_classLoader,
                    _escapedModelInterfaces, new AutoEscapeBeanHandler(this));
        }

        return _escapedModel;
    }

    @Override
    public Object clone() {
        PaikkaImpl paikkaImpl = new PaikkaImpl();

        paikkaImpl.setPaikka_id(getPaikka_id());
        paikkaImpl.setAineistot(getAineistot());
        paikkaImpl.setTunniste(getTunniste());
        paikkaImpl.setNimi_fin(getNimi_fin());
        paikkaImpl.setNimi_kieli(getNimi_kieli());
        paikkaImpl.setTyyppi(getTyyppi());
        paikkaImpl.setAlue(getAlue());
        paikkaImpl.setMaa_ISO3166_1(getMaa_ISO3166_1());
        paikkaImpl.setAjankohta(getAjankohta());
        paikkaImpl.setSelite(getSelite());
        paikkaImpl.setKielet(getKielet());
        paikkaImpl.setMurre(getMurre());
        paikkaImpl.setSapo_linkki(getSapo_linkki());
        paikkaImpl.setMml_paikkaID(getMml_paikkaID());
        paikkaImpl.setTuotu_kantaan(getTuotu_kantaan());
        paikkaImpl.setMuutettu(getMuutettu());
        paikkaImpl.setMuuttaja(getMuuttaja());
        paikkaImpl.setPoistettu(getPoistettu());

        paikkaImpl.resetOriginalValues();

        return paikkaImpl;
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

        if (!(obj instanceof Paikka)) {
            return false;
        }

        Paikka paikka = (Paikka) obj;

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
    public void resetOriginalValues() {
    }

    @Override
    public CacheModel<Paikka> toCacheModel() {
        PaikkaCacheModel paikkaCacheModel = new PaikkaCacheModel();

        paikkaCacheModel.paikka_id = getPaikka_id();

        paikkaCacheModel.aineistot = getAineistot();

        String aineistot = paikkaCacheModel.aineistot;

        if ((aineistot != null) && (aineistot.length() == 0)) {
            paikkaCacheModel.aineistot = null;
        }

        paikkaCacheModel.tunniste = getTunniste();

        String tunniste = paikkaCacheModel.tunniste;

        if ((tunniste != null) && (tunniste.length() == 0)) {
            paikkaCacheModel.tunniste = null;
        }

        paikkaCacheModel.nimi_fin = getNimi_fin();

        String nimi_fin = paikkaCacheModel.nimi_fin;

        if ((nimi_fin != null) && (nimi_fin.length() == 0)) {
            paikkaCacheModel.nimi_fin = null;
        }

        paikkaCacheModel.nimi_kieli = getNimi_kieli();

        String nimi_kieli = paikkaCacheModel.nimi_kieli;

        if ((nimi_kieli != null) && (nimi_kieli.length() == 0)) {
            paikkaCacheModel.nimi_kieli = null;
        }

        paikkaCacheModel.tyyppi = getTyyppi();

        String tyyppi = paikkaCacheModel.tyyppi;

        if ((tyyppi != null) && (tyyppi.length() == 0)) {
            paikkaCacheModel.tyyppi = null;
        }

        paikkaCacheModel.alue = getAlue();

        String alue = paikkaCacheModel.alue;

        if ((alue != null) && (alue.length() == 0)) {
            paikkaCacheModel.alue = null;
        }

        paikkaCacheModel.maa_ISO3166_1 = getMaa_ISO3166_1();

        String maa_ISO3166_1 = paikkaCacheModel.maa_ISO3166_1;

        if ((maa_ISO3166_1 != null) && (maa_ISO3166_1.length() == 0)) {
            paikkaCacheModel.maa_ISO3166_1 = null;
        }

        paikkaCacheModel.ajankohta = getAjankohta();

        String ajankohta = paikkaCacheModel.ajankohta;

        if ((ajankohta != null) && (ajankohta.length() == 0)) {
            paikkaCacheModel.ajankohta = null;
        }

        paikkaCacheModel.selite = getSelite();

        String selite = paikkaCacheModel.selite;

        if ((selite != null) && (selite.length() == 0)) {
            paikkaCacheModel.selite = null;
        }

        paikkaCacheModel.kielet = getKielet();

        String kielet = paikkaCacheModel.kielet;

        if ((kielet != null) && (kielet.length() == 0)) {
            paikkaCacheModel.kielet = null;
        }

        paikkaCacheModel.murre = getMurre();

        String murre = paikkaCacheModel.murre;

        if ((murre != null) && (murre.length() == 0)) {
            paikkaCacheModel.murre = null;
        }

        paikkaCacheModel.sapo_linkki = getSapo_linkki();

        String sapo_linkki = paikkaCacheModel.sapo_linkki;

        if ((sapo_linkki != null) && (sapo_linkki.length() == 0)) {
            paikkaCacheModel.sapo_linkki = null;
        }

        paikkaCacheModel.mml_paikkaID = getMml_paikkaID();

        Date tuotu_kantaan = getTuotu_kantaan();

        if (tuotu_kantaan != null) {
            paikkaCacheModel.tuotu_kantaan = tuotu_kantaan.getTime();
        } else {
            paikkaCacheModel.tuotu_kantaan = Long.MIN_VALUE;
        }

        Date muutettu = getMuutettu();

        if (muutettu != null) {
            paikkaCacheModel.muutettu = muutettu.getTime();
        } else {
            paikkaCacheModel.muutettu = Long.MIN_VALUE;
        }

        paikkaCacheModel.muuttaja = getMuuttaja();

        String muuttaja = paikkaCacheModel.muuttaja;

        if ((muuttaja != null) && (muuttaja.length() == 0)) {
            paikkaCacheModel.muuttaja = null;
        }

        Date poistettu = getPoistettu();

        if (poistettu != null) {
            paikkaCacheModel.poistettu = poistettu.getTime();
        } else {
            paikkaCacheModel.poistettu = Long.MIN_VALUE;
        }

        return paikkaCacheModel;
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
