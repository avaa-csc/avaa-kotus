package fi.csc.avaa.kotus.kielikartastot.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.kotus.kielikartastot.db.service.http.LevikkiServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.http.LevikkiServiceSoap
 * @generated
 */
public class LevikkiSoap implements Serializable {
    private int _levikki_id;
    private int _ilmio_id;
    private int _paikka_id;
    private String _paikka_tunniste;
    private String _ilmio_tunnus;
    private int _uusi;

    public LevikkiSoap() {
    }

    public static LevikkiSoap toSoapModel(Levikki model) {
        LevikkiSoap soapModel = new LevikkiSoap();

        soapModel.setLevikki_id(model.getLevikki_id());
        soapModel.setIlmio_id(model.getIlmio_id());
        soapModel.setPaikka_id(model.getPaikka_id());
        soapModel.setPaikka_tunniste(model.getPaikka_tunniste());
        soapModel.setIlmio_tunnus(model.getIlmio_tunnus());
        soapModel.setUusi(model.getUusi());

        return soapModel;
    }

    public static LevikkiSoap[] toSoapModels(Levikki[] models) {
        LevikkiSoap[] soapModels = new LevikkiSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static LevikkiSoap[][] toSoapModels(Levikki[][] models) {
        LevikkiSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new LevikkiSoap[models.length][models[0].length];
        } else {
            soapModels = new LevikkiSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static LevikkiSoap[] toSoapModels(List<Levikki> models) {
        List<LevikkiSoap> soapModels = new ArrayList<LevikkiSoap>(models.size());

        for (Levikki model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new LevikkiSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _levikki_id;
    }

    public void setPrimaryKey(int pk) {
        setLevikki_id(pk);
    }

    public int getLevikki_id() {
        return _levikki_id;
    }

    public void setLevikki_id(int levikki_id) {
        _levikki_id = levikki_id;
    }

    public int getIlmio_id() {
        return _ilmio_id;
    }

    public void setIlmio_id(int ilmio_id) {
        _ilmio_id = ilmio_id;
    }

    public int getPaikka_id() {
        return _paikka_id;
    }

    public void setPaikka_id(int paikka_id) {
        _paikka_id = paikka_id;
    }

    public String getPaikka_tunniste() {
        return _paikka_tunniste;
    }

    public void setPaikka_tunniste(String paikka_tunniste) {
        _paikka_tunniste = paikka_tunniste;
    }

    public String getIlmio_tunnus() {
        return _ilmio_tunnus;
    }

    public void setIlmio_tunnus(String ilmio_tunnus) {
        _ilmio_tunnus = ilmio_tunnus;
    }

    public int getUusi() {
        return _uusi;
    }

    public void setUusi(int uusi) {
        _uusi = uusi;
    }
}
