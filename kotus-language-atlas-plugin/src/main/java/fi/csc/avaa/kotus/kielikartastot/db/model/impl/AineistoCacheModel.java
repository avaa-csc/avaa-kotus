package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * The cache model class for representing Aineisto in entity cache.
 *
 * @author CSC
 * @see Aineisto
 * @generated
 */
public class AineistoCacheModel implements CacheModel<Aineisto>, Externalizable {
    public int aineisto_id;
    public String nimi;
    public String tunnus;
    public String kuvaus;
    public String paikkatietosysteemi;
    public String infolinkki;
    public String kayttolupa;
    public long tuotu_kantaan;
    public long muutettu;
    public String muuttaja;
    public long poistettu;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(23);

        sb.append("{aineisto_id=");
        sb.append(aineisto_id);
        sb.append(", nimi=");
        sb.append(nimi);
        sb.append(", tunnus=");
        sb.append(tunnus);
        sb.append(", kuvaus=");
        sb.append(kuvaus);
        sb.append(", paikkatietosysteemi=");
        sb.append(paikkatietosysteemi);
        sb.append(", infolinkki=");
        sb.append(infolinkki);
        sb.append(", kayttolupa=");
        sb.append(kayttolupa);
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
    public Aineisto toEntityModel() {
        AineistoImpl aineistoImpl = new AineistoImpl();

        aineistoImpl.setAineisto_id(aineisto_id);

        if (nimi == null) {
            aineistoImpl.setNimi(StringPool.BLANK);
        } else {
            aineistoImpl.setNimi(nimi);
        }

        if (tunnus == null) {
            aineistoImpl.setTunnus(StringPool.BLANK);
        } else {
            aineistoImpl.setTunnus(tunnus);
        }

        if (kuvaus == null) {
            aineistoImpl.setKuvaus(StringPool.BLANK);
        } else {
            aineistoImpl.setKuvaus(kuvaus);
        }

        if (paikkatietosysteemi == null) {
            aineistoImpl.setPaikkatietosysteemi(StringPool.BLANK);
        } else {
            aineistoImpl.setPaikkatietosysteemi(paikkatietosysteemi);
        }

        if (infolinkki == null) {
            aineistoImpl.setInfolinkki(StringPool.BLANK);
        } else {
            aineistoImpl.setInfolinkki(infolinkki);
        }

        if (kayttolupa == null) {
            aineistoImpl.setKayttolupa(StringPool.BLANK);
        } else {
            aineistoImpl.setKayttolupa(kayttolupa);
        }

        if (tuotu_kantaan == Long.MIN_VALUE) {
            aineistoImpl.setTuotu_kantaan(null);
        } else {
            aineistoImpl.setTuotu_kantaan(new Date(tuotu_kantaan));
        }

        if (muutettu == Long.MIN_VALUE) {
            aineistoImpl.setMuutettu(null);
        } else {
            aineistoImpl.setMuutettu(new Date(muutettu));
        }

        if (muuttaja == null) {
            aineistoImpl.setMuuttaja(StringPool.BLANK);
        } else {
            aineistoImpl.setMuuttaja(muuttaja);
        }

        if (poistettu == Long.MIN_VALUE) {
            aineistoImpl.setPoistettu(null);
        } else {
            aineistoImpl.setPoistettu(new Date(poistettu));
        }

        aineistoImpl.resetOriginalValues();

        return aineistoImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        aineisto_id = objectInput.readInt();
        nimi = objectInput.readUTF();
        tunnus = objectInput.readUTF();
        kuvaus = objectInput.readUTF();
        paikkatietosysteemi = objectInput.readUTF();
        infolinkki = objectInput.readUTF();
        kayttolupa = objectInput.readUTF();
        tuotu_kantaan = objectInput.readLong();
        muutettu = objectInput.readLong();
        muuttaja = objectInput.readUTF();
        poistettu = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(aineisto_id);

        if (nimi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nimi);
        }

        if (tunnus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tunnus);
        }

        if (kuvaus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kuvaus);
        }

        if (paikkatietosysteemi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(paikkatietosysteemi);
        }

        if (infolinkki == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(infolinkki);
        }

        if (kayttolupa == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kayttolupa);
        }

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
