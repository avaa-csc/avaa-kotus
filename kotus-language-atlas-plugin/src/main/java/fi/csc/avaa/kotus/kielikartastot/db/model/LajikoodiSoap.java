package fi.csc.avaa.kotus.kielikartastot.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.kotus.kielikartastot.db.service.http.LajikoodiServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.http.LajikoodiServiceSoap
 * @generated
 */
public class LajikoodiSoap implements Serializable {
    private int _lajikoodi_id;
    private int _lajikoodi;
    private String _laji;
    private String _aineistot;
    private String _viite;
    private Date _tuotu_kantaan;
    private Date _muutettu;
    private String _muuttaja;
    private Date _poistettu;

    public LajikoodiSoap() {
    }

    public static LajikoodiSoap toSoapModel(Lajikoodi model) {
        LajikoodiSoap soapModel = new LajikoodiSoap();

        soapModel.setLajikoodi_id(model.getLajikoodi_id());
        soapModel.setLajikoodi(model.getLajikoodi());
        soapModel.setLaji(model.getLaji());
        soapModel.setAineistot(model.getAineistot());
        soapModel.setViite(model.getViite());
        soapModel.setTuotu_kantaan(model.getTuotu_kantaan());
        soapModel.setMuutettu(model.getMuutettu());
        soapModel.setMuuttaja(model.getMuuttaja());
        soapModel.setPoistettu(model.getPoistettu());

        return soapModel;
    }

    public static LajikoodiSoap[] toSoapModels(Lajikoodi[] models) {
        LajikoodiSoap[] soapModels = new LajikoodiSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LajikoodiSoap[][] toSoapModels(Lajikoodi[][] models) {
        LajikoodiSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LajikoodiSoap[models.length][models[0].length];
        } else {
            soapModels = new LajikoodiSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LajikoodiSoap[] toSoapModels(List<Lajikoodi> models) {
        List<LajikoodiSoap> soapModels = new ArrayList<LajikoodiSoap>(models.size());

        for (Lajikoodi model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LajikoodiSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _lajikoodi_id;
    }

    public void setPrimaryKey(int pk) {
        setLajikoodi_id(pk);
    }

    public int getLajikoodi_id() {
        return _lajikoodi_id;
    }

    public void setLajikoodi_id(int lajikoodi_id) {
        _lajikoodi_id = lajikoodi_id;
    }

    public int getLajikoodi() {
        return _lajikoodi;
    }

    public void setLajikoodi(int lajikoodi) {
        _lajikoodi = lajikoodi;
    }

    public String getLaji() {
        return _laji;
    }

    public void setLaji(String laji) {
        _laji = laji;
    }

    public String getAineistot() {
        return _aineistot;
    }

    public void setAineistot(String aineistot) {
        _aineistot = aineistot;
    }

    public String getViite() {
        return _viite;
    }

    public void setViite(String viite) {
        _viite = viite;
    }

    public Date getTuotu_kantaan() {
        return _tuotu_kantaan;
    }

    public void setTuotu_kantaan(Date tuotu_kantaan) {
        _tuotu_kantaan = tuotu_kantaan;
    }

    public Date getMuutettu() {
        return _muutettu;
    }

    public void setMuutettu(Date muutettu) {
        _muutettu = muutettu;
    }

    public String getMuuttaja() {
        return _muuttaja;
    }

    public void setMuuttaja(String muuttaja) {
        _muuttaja = muuttaja;
    }

    public Date getPoistettu() {
        return _poistettu;
    }

    public void setPoistettu(Date poistettu) {
        _poistettu = poistettu;
    }
}
