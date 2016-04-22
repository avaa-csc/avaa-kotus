package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * The cache model class for representing Paikka in entity cache.
 *
 * @author CSC
 * @see Paikka
 * @generated
 */
public class PaikkaCacheModel implements CacheModel<Paikka>, Externalizable {
    public int paikka_id;
    public String aineistot;
    public String tunniste;
    public String nimi_fin;
    public String nimi_kieli;
    public String tyyppi;
    public String alue;
    public String maa_ISO3166_1;
    public String ajankohta;
    public String selite;
    public String kielet;
    public String murre;
    public String sapo_linkki;
    public int mml_paikkaID;
    public long tuotu_kantaan;
    public long muutettu;
    public String muuttaja;
    public long poistettu;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(37);

        sb.append("{paikka_id=");
        sb.append(paikka_id);
        sb.append(", aineistot=");
        sb.append(aineistot);
        sb.append(", tunniste=");
        sb.append(tunniste);
        sb.append(", nimi_fin=");
        sb.append(nimi_fin);
        sb.append(", nimi_kieli=");
        sb.append(nimi_kieli);
        sb.append(", tyyppi=");
        sb.append(tyyppi);
        sb.append(", alue=");
        sb.append(alue);
        sb.append(", maa_ISO3166_1=");
        sb.append(maa_ISO3166_1);
        sb.append(", ajankohta=");
        sb.append(ajankohta);
        sb.append(", selite=");
        sb.append(selite);
        sb.append(", kielet=");
        sb.append(kielet);
        sb.append(", murre=");
        sb.append(murre);
        sb.append(", sapo_linkki=");
        sb.append(sapo_linkki);
        sb.append(", mml_paikkaID=");
        sb.append(mml_paikkaID);
        sb.append(", tuotu_kantaan=");
        sb.append(tuotu_kantaan);
        sb.append(", muutettu=");
        sb.append(muutettu);
        sb.append(", muuttaja=");
        sb.append(muuttaja);
        sb.append(", poistettu=");
        sb.append(poistettu);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Paikka toEntityModel() {
        PaikkaImpl paikkaImpl = new PaikkaImpl();

        paikkaImpl.setPaikka_id(paikka_id);

        if (aineistot == null) {
            paikkaImpl.setAineistot(StringPool.BLANK);
        } else {
            paikkaImpl.setAineistot(aineistot);
        }

        if (tunniste == null) {
            paikkaImpl.setTunniste(StringPool.BLANK);
        } else {
            paikkaImpl.setTunniste(tunniste);
        }

        if (nimi_fin == null) {
            paikkaImpl.setNimi_fin(StringPool.BLANK);
        } else {
            paikkaImpl.setNimi_fin(nimi_fin);
        }

        if (nimi_kieli == null) {
            paikkaImpl.setNimi_kieli(StringPool.BLANK);
        } else {
            paikkaImpl.setNimi_kieli(nimi_kieli);
        }

        if (tyyppi == null) {
            paikkaImpl.setTyyppi(StringPool.BLANK);
        } else {
            paikkaImpl.setTyyppi(tyyppi);
        }

        if (alue == null) {
            paikkaImpl.setAlue(StringPool.BLANK);
        } else {
            paikkaImpl.setAlue(alue);
        }

        if (maa_ISO3166_1 == null) {
            paikkaImpl.setMaa_ISO3166_1(StringPool.BLANK);
        } else {
            paikkaImpl.setMaa_ISO3166_1(maa_ISO3166_1);
        }

        if (ajankohta == null) {
            paikkaImpl.setAjankohta(StringPool.BLANK);
        } else {
            paikkaImpl.setAjankohta(ajankohta);
        }

        if (selite == null) {
            paikkaImpl.setSelite(StringPool.BLANK);
        } else {
            paikkaImpl.setSelite(selite);
        }

        if (kielet == null) {
            paikkaImpl.setKielet(StringPool.BLANK);
        } else {
            paikkaImpl.setKielet(kielet);
        }

        if (murre == null) {
            paikkaImpl.setMurre(StringPool.BLANK);
        } else {
            paikkaImpl.setMurre(murre);
        }

        if (sapo_linkki == null) {
            paikkaImpl.setSapo_linkki(StringPool.BLANK);
        } else {
            paikkaImpl.setSapo_linkki(sapo_linkki);
        }

        paikkaImpl.setMml_paikkaID(mml_paikkaID);

        if (tuotu_kantaan == Long.MIN_VALUE) {
            paikkaImpl.setTuotu_kantaan(null);
        } else {
            paikkaImpl.setTuotu_kantaan(new Date(tuotu_kantaan));
        }

        if (muutettu == Long.MIN_VALUE) {
            paikkaImpl.setMuutettu(null);
        } else {
            paikkaImpl.setMuutettu(new Date(muutettu));
        }

        if (muuttaja == null) {
            paikkaImpl.setMuuttaja(StringPool.BLANK);
        } else {
            paikkaImpl.setMuuttaja(muuttaja);
        }

        if (poistettu == Long.MIN_VALUE) {
            paikkaImpl.setPoistettu(null);
        } else {
            paikkaImpl.setPoistettu(new Date(poistettu));
        }

        paikkaImpl.resetOriginalValues();

        return paikkaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        paikka_id = objectInput.readInt();
        aineistot = objectInput.readUTF();
        tunniste = objectInput.readUTF();
        nimi_fin = objectInput.readUTF();
        nimi_kieli = objectInput.readUTF();
        tyyppi = objectInput.readUTF();
        alue = objectInput.readUTF();
        maa_ISO3166_1 = objectInput.readUTF();
        ajankohta = objectInput.readUTF();
        selite = objectInput.readUTF();
        kielet = objectInput.readUTF();
        murre = objectInput.readUTF();
        sapo_linkki = objectInput.readUTF();
        mml_paikkaID = objectInput.readInt();
        tuotu_kantaan = objectInput.readLong();
        muutettu = objectInput.readLong();
        muuttaja = objectInput.readUTF();
        poistettu = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(paikka_id);

        if (aineistot == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(aineistot);
        }

        if (tunniste == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tunniste);
        }

        if (nimi_fin == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nimi_fin);
        }

        if (nimi_kieli == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nimi_kieli);
        }

        if (tyyppi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tyyppi);
        }

        if (alue == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(alue);
        }

        if (maa_ISO3166_1 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(maa_ISO3166_1);
        }

        if (ajankohta == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ajankohta);
        }

        if (selite == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(selite);
        }

        if (kielet == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kielet);
        }

        if (murre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(murre);
        }

        if (sapo_linkki == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(sapo_linkki);
        }

        objectOutput.writeInt(mml_paikkaID);
        objectOutput.writeLong(tuotu_kantaan);
        objectOutput.writeLong(muutettu);

        if (muuttaja == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(muuttaja);
        }

        objectOutput.writeLong(poistettu);
    }
}
