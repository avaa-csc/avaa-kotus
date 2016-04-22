package fi.csc.avaa.kotus.kielikartastot.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.kotus.kielikartastot.db.service.http.PaikkaServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.http.PaikkaServiceSoap
 * @generated
 */
public class PaikkaSoap implements Serializable {
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

    public PaikkaSoap() {
    }

    public static PaikkaSoap toSoapModel(Paikka model) {
        PaikkaSoap soapModel = new PaikkaSoap();

        soapModel.setPaikka_id(model.getPaikka_id());
        soapModel.setAineistot(model.getAineistot());
        soapModel.setTunniste(model.getTunniste());
        soapModel.setNimi_fin(model.getNimi_fin());
        soapModel.setNimi_kieli(model.getNimi_kieli());
        soapModel.setTyyppi(model.getTyyppi());
        soapModel.setAlue(model.getAlue());
        soapModel.setMaa_ISO3166_1(model.getMaa_ISO3166_1());
        soapModel.setAjankohta(model.getAjankohta());
        soapModel.setSelite(model.getSelite());
        soapModel.setKielet(model.getKielet());
        soapModel.setMurre(model.getMurre());
        soapModel.setSapo_linkki(model.getSapo_linkki());
        soapModel.setMml_paikkaID(model.getMml_paikkaID());
        soapModel.setTuotu_kantaan(model.getTuotu_kantaan());
        soapModel.setMuutettu(model.getMuutettu());
        soapModel.setMuuttaja(model.getMuuttaja());
        soapModel.setPoistettu(model.getPoistettu());

        return soapModel;
    }

    public static PaikkaSoap[] toSoapModels(Paikka[] models) {
        PaikkaSoap[] soapModels = new PaikkaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static PaikkaSoap[][] toSoapModels(Paikka[][] models) {
        PaikkaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new PaikkaSoap[models.length][models[0].length];
        } else {
            soapModels = new PaikkaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static PaikkaSoap[] toSoapModels(List<Paikka> models) {
        List<PaikkaSoap> soapModels = new ArrayList<PaikkaSoap>(models.size());

        for (Paikka model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new PaikkaSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _paikka_id;
    }

    public void setPrimaryKey(int pk) {
        setPaikka_id(pk);
    }

    public int getPaikka_id() {
        return _paikka_id;
    }

    public void setPaikka_id(int paikka_id) {
        _paikka_id = paikka_id;
    }

    public String getAineistot() {
        return _aineistot;
    }

    public void setAineistot(String aineistot) {
        _aineistot = aineistot;
    }

    public String getTunniste() {
        return _tunniste;
    }

    public void setTunniste(String tunniste) {
        _tunniste = tunniste;
    }

    public String getNimi_fin() {
        return _nimi_fin;
    }

    public void setNimi_fin(String nimi_fin) {
        _nimi_fin = nimi_fin;
    }

    public String getNimi_kieli() {
        return _nimi_kieli;
    }

    public void setNimi_kieli(String nimi_kieli) {
        _nimi_kieli = nimi_kieli;
    }

    public String getTyyppi() {
        return _tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        _tyyppi = tyyppi;
    }

    public String getAlue() {
        return _alue;
    }

    public void setAlue(String alue) {
        _alue = alue;
    }

    public String getMaa_ISO3166_1() {
        return _maa_ISO3166_1;
    }

    public void setMaa_ISO3166_1(String maa_ISO3166_1) {
        _maa_ISO3166_1 = maa_ISO3166_1;
    }

    public String getAjankohta() {
        return _ajankohta;
    }

    public void setAjankohta(String ajankohta) {
        _ajankohta = ajankohta;
    }

    public String getSelite() {
        return _selite;
    }

    public void setSelite(String selite) {
        _selite = selite;
    }

    public String getKielet() {
        return _kielet;
    }

    public void setKielet(String kielet) {
        _kielet = kielet;
    }

    public String getMurre() {
        return _murre;
    }

    public void setMurre(String murre) {
        _murre = murre;
    }

    public String getSapo_linkki() {
        return _sapo_linkki;
    }

    public void setSapo_linkki(String sapo_linkki) {
        _sapo_linkki = sapo_linkki;
    }

    public int getMml_paikkaID() {
        return _mml_paikkaID;
    }

    public void setMml_paikkaID(int mml_paikkaID) {
        _mml_paikkaID = mml_paikkaID;
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
