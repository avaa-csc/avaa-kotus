package fi.csc.avaa.kotus.kielikartastot.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.kotus.kielikartastot.db.service.http.RyhmaServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.http.RyhmaServiceSoap
 * @generated
 */
public class RyhmaSoap implements Serializable {
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

    public RyhmaSoap() {
    }

    public static RyhmaSoap toSoapModel(Ryhma model) {
        RyhmaSoap soapModel = new RyhmaSoap();

        soapModel.setRyhma_id(model.getRyhma_id());
        soapModel.setAineisto_id(model.getAineisto_id());
        soapModel.setNimi(model.getNimi());
        soapModel.setTyyppi(model.getTyyppi());
        soapModel.setYlaryhma(model.getYlaryhma());
        soapModel.setSelite(model.getSelite());
        soapModel.setKartta_kuva_linkki(model.getKartta_kuva_linkki());
        soapModel.setTuotu_kantaan(model.getTuotu_kantaan());
        soapModel.setMuutettu(model.getMuutettu());
        soapModel.setMuuttaja(model.getMuuttaja());
        soapModel.setPoistettu(model.getPoistettu());
        soapModel.setTmp(model.getTmp());
        soapModel.setTunnus(model.getTunnus());

        return soapModel;
    }

    public static RyhmaSoap[] toSoapModels(Ryhma[] models) {
        RyhmaSoap[] soapModels = new RyhmaSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static RyhmaSoap[][] toSoapModels(Ryhma[][] models) {
        RyhmaSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new RyhmaSoap[models.length][models[0].length];
        } else {
            soapModels = new RyhmaSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static RyhmaSoap[] toSoapModels(List<Ryhma> models) {
        List<RyhmaSoap> soapModels = new ArrayList<RyhmaSoap>(models.size());

        for (Ryhma model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new RyhmaSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _ryhma_id;
    }

    public void setPrimaryKey(int pk) {
        setRyhma_id(pk);
    }

    public int getRyhma_id() {
        return _ryhma_id;
    }

    public void setRyhma_id(int ryhma_id) {
        _ryhma_id = ryhma_id;
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

    public String getTyyppi() {
        return _tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        _tyyppi = tyyppi;
    }

    public int getYlaryhma() {
        return _ylaryhma;
    }

    public void setYlaryhma(int ylaryhma) {
        _ylaryhma = ylaryhma;
    }

    public String getSelite() {
        return _selite;
    }

    public void setSelite(String selite) {
        _selite = selite;
    }

    public String getKartta_kuva_linkki() {
        return _kartta_kuva_linkki;
    }

    public void setKartta_kuva_linkki(String kartta_kuva_linkki) {
        _kartta_kuva_linkki = kartta_kuva_linkki;
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

    public String getTmp() {
        return _tmp;
    }

    public void setTmp(String tmp) {
        _tmp = tmp;
    }

    public String getTunnus() {
        return _tunnus;
    }

    public void setTunnus(String tunnus) {
        _tunnus = tunnus;
    }
}
