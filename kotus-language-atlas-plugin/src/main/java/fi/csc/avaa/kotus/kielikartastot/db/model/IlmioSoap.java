package fi.csc.avaa.kotus.kielikartastot.db.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link fi.csc.avaa.kotus.kielikartastot.db.service.http.IlmioServiceSoap}.
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.http.IlmioServiceSoap
 * @generated
 */
public class IlmioSoap implements Serializable {
    private int _ilmio_id;
    private int _aineisto_id;
    private int _ryhma_id;
    private int _lajikoodi_id;
    private String _ilmio;
    private String _tyyppi;
    private String _kieli_ISO639_3;
    private String _murre;
    private String _havaintoaika;
    private String _kuvaus;
    private String _lisatieto;
    private Date _tuotu_kantaan;
    private Date _muutettu;
    private String _muuttaja;
    private Date _poistettu;
    private String _tunnus;
    private String _ryhma_tunnus;

    public IlmioSoap() {
    }

    public static IlmioSoap toSoapModel(Ilmio model) {
        IlmioSoap soapModel = new IlmioSoap();

        soapModel.setIlmio_id(model.getIlmio_id());
        soapModel.setAineisto_id(model.getAineisto_id());
        soapModel.setRyhma_id(model.getRyhma_id());
        soapModel.setLajikoodi_id(model.getLajikoodi_id());
        soapModel.setIlmio(model.getIlmio());
        soapModel.setTyyppi(model.getTyyppi());
        soapModel.setKieli_ISO639_3(model.getKieli_ISO639_3());
        soapModel.setMurre(model.getMurre());
        soapModel.setHavaintoaika(model.getHavaintoaika());
        soapModel.setKuvaus(model.getKuvaus());
        soapModel.setLisatieto(model.getLisatieto());
        soapModel.setTuotu_kantaan(model.getTuotu_kantaan());
        soapModel.setMuutettu(model.getMuutettu());
        soapModel.setMuuttaja(model.getMuuttaja());
        soapModel.setPoistettu(model.getPoistettu());
        soapModel.setTunnus(model.getTunnus());
        soapModel.setRyhma_tunnus(model.getRyhma_tunnus());

        return soapModel;
    }

    public static IlmioSoap[] toSoapModels(Ilmio[] models) {
        IlmioSoap[] soapModels = new IlmioSoap[models.length];

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModel(models[i]);
        }

        return soapModels;
    }

    public static IlmioSoap[][] toSoapModels(Ilmio[][] models) {
        IlmioSoap[][] soapModels = null;

        if (models.length > 0) {
            soapModels = new IlmioSoap[models.length][models[0].length];
        } else {
            soapModels = new IlmioSoap[0][0];
        }

        for (int i = 0; i < models.length; i++) {
            soapModels[i] = toSoapModels(models[i]);
        }

        return soapModels;
    }

    public static IlmioSoap[] toSoapModels(List<Ilmio> models) {
        List<IlmioSoap> soapModels = new ArrayList<IlmioSoap>(models.size());

        for (Ilmio model : models) {
            soapModels.add(toSoapModel(model));
        }

        return soapModels.toArray(new IlmioSoap[soapModels.size()]);
    }

    public int getPrimaryKey() {
        return _ilmio_id;
    }

    public void setPrimaryKey(int pk) {
        setIlmio_id(pk);
    }

    public int getIlmio_id() {
        return _ilmio_id;
    }

    public void setIlmio_id(int ilmio_id) {
        _ilmio_id = ilmio_id;
    }

    public int getAineisto_id() {
        return _aineisto_id;
    }

    public void setAineisto_id(int aineisto_id) {
        _aineisto_id = aineisto_id;
    }

    public int getRyhma_id() {
        return _ryhma_id;
    }

    public void setRyhma_id(int ryhma_id) {
        _ryhma_id = ryhma_id;
    }

    public int getLajikoodi_id() {
        return _lajikoodi_id;
    }

    public void setLajikoodi_id(int lajikoodi_id) {
        _lajikoodi_id = lajikoodi_id;
    }

    public String getIlmio() {
        return _ilmio;
    }

    public void setIlmio(String ilmio) {
        _ilmio = ilmio;
    }

    public String getTyyppi() {
        return _tyyppi;
    }

    public void setTyyppi(String tyyppi) {
        _tyyppi = tyyppi;
    }

    public String getKieli_ISO639_3() {
        return _kieli_ISO639_3;
    }

    public void setKieli_ISO639_3(String kieli_ISO639_3) {
        _kieli_ISO639_3 = kieli_ISO639_3;
    }

    public String getMurre() {
        return _murre;
    }

    public void setMurre(String murre) {
        _murre = murre;
    }

    public String getHavaintoaika() {
        return _havaintoaika;
    }

    public void setHavaintoaika(String havaintoaika) {
        _havaintoaika = havaintoaika;
    }

    public String getKuvaus() {
        return _kuvaus;
    }

    public void setKuvaus(String kuvaus) {
        _kuvaus = kuvaus;
    }

    public String getLisatieto() {
        return _lisatieto;
    }

    public void setLisatieto(String lisatieto) {
        _lisatieto = lisatieto;
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

    public String getTunnus() {
        return _tunnus;
    }

    public void setTunnus(String tunnus) {
        _tunnus = tunnus;
    }

    public String getRyhma_tunnus() {
        return _ryhma_tunnus;
    }

    public void setRyhma_tunnus(String ryhma_tunnus) {
        _ryhma_tunnus = ryhma_tunnus;
    }
}
