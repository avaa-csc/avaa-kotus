package fi.csc.avaa.kotus.kielikartastot.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.kotus.kielikartastot.db.service.http.AineistoServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.http.AineistoServiceSoap
 * @generated
 */
public class AineistoSoap implements Serializable {
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

    public AineistoSoap() {
    }

    public static AineistoSoap toSoapModel(Aineisto model) {
        AineistoSoap soapModel = new AineistoSoap();

        soapModel.setAineisto_id(model.getAineisto_id());
        soapModel.setNimi(model.getNimi());
        soapModel.setTunnus(model.getTunnus());
        soapModel.setKuvaus(model.getKuvaus());
        soapModel.setPaikkatietosysteemi(model.getPaikkatietosysteemi());
        soapModel.setInfolinkki(model.getInfolinkki());
        soapModel.setKayttolupa(model.getKayttolupa());
        soapModel.setTuotu_kantaan(model.getTuotu_kantaan());
        soapModel.setMuutettu(model.getMuutettu());
        soapModel.setMuuttaja(model.getMuuttaja());
        soapModel.setPoistettu(model.getPoistettu());

        return soapModel;
    }

    public static AineistoSoap[] toSoapModels(Aineisto[] models) {
        AineistoSoap[] soapModels = new AineistoSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static AineistoSoap[][] toSoapModels(Aineisto[][] models) {
        AineistoSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new AineistoSoap[models.length][models[0].length];
        } else {
            soapModels = new AineistoSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static AineistoSoap[] toSoapModels(List<Aineisto> models) {
        List<AineistoSoap> soapModels = new ArrayList<AineistoSoap>(models.size());

        for (Aineisto model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new AineistoSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _aineisto_id;
    }

    public void setPrimaryKey(int pk) {
        setAineisto_id(pk);
    }

    public int getAineisto_id() {
        return _aineisto_id;
    }

    public void setAineisto_id(int aineisto_id) {
        _aineisto_id = aineisto_id;
    }

    public String getNimi() {
        return _nimi;
    }

    public void setNimi(String nimi) {
        _nimi = nimi;
    }

    public String getTunnus() {
        return _tunnus;
    }

    public void setTunnus(String tunnus) {
        _tunnus = tunnus;
    }

    public String getKuvaus() {
        return _kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        _kuvaus = kuvaus;
    }

    public String getPaikkatietosysteemi() {
        return _paikkatietosysteemi;
    }

    public void setPaikkatietosysteemi(String paikkatietosysteemi) {
        _paikkatietosysteemi = paikkatietosysteemi;
    }

    public String getInfolinkki() {
        return _infolinkki;
    }

    public void setInfolinkki(String infolinkki) {
        _infolinkki = infolinkki;
    }

    public String getKayttolupa() {
        return _kayttolupa;
    }

    public void setKayttolupa(String kayttolupa) {
        _kayttolupa = kayttolupa;
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
