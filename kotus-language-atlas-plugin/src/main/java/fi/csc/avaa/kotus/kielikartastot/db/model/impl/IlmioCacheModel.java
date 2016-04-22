package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * The cache model class for representing Ilmio in entity cache.
 *
 * @author CSC
 * @see Ilmio
 * @generated
 */
public class IlmioCacheModel implements CacheModel<Ilmio>, Externalizable {
    public int ilmio_id;
    public int aineisto_id;
    public int ryhma_id;
    public int lajikoodi_id;
    public String ilmio;
    public String tyyppi;
    public String kieli_ISO639_3;
    public String murre;
    public String havaintoaika;
    public String kuvaus;
    public String lisatieto;
    public long tuotu_kantaan;
    public long muutettu;
    public String muuttaja;
    public long poistettu;
    public String tunnus;
    public String ryhma_tunnus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(35);

        sb.append("{ilmio_id=");
        sb.append(ilmio_id);
        sb.append(", aineisto_id=");
        sb.append(aineisto_id);
        sb.append(", ryhma_id=");
        sb.append(ryhma_id);
        sb.append(", lajikoodi_id=");
        sb.append(lajikoodi_id);
        sb.append(", ilmio=");
        sb.append(ilmio);
        sb.append(", tyyppi=");
        sb.append(tyyppi);
        sb.append(", kieli_ISO639_3=");
        sb.append(kieli_ISO639_3);
        sb.append(", murre=");
        sb.append(murre);
        sb.append(", havaintoaika=");
        sb.append(havaintoaika);
        sb.append(", kuvaus=");
        sb.append(kuvaus);
        sb.append(", lisatieto=");
        sb.append(lisatieto);
        sb.append(", tuotu_kantaan=");
        sb.append(tuotu_kantaan);
        sb.append(", muutettu=");
        sb.append(muutettu);
        sb.append(", muuttaja=");
        sb.append(muuttaja);
        sb.append(", poistettu=");
        sb.append(poistettu);
        sb.append(", tunnus=");
        sb.append(tunnus);
        sb.append(", ryhma_tunnus=");
        sb.append(ryhma_tunnus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Ilmio toEntityModel() {
        IlmioImpl ilmioImpl = new IlmioImpl();

        ilmioImpl.setIlmio_id(ilmio_id);
        ilmioImpl.setAineisto_id(aineisto_id);
        ilmioImpl.setRyhma_id(ryhma_id);
        ilmioImpl.setLajikoodi_id(lajikoodi_id);

        if (ilmio == null) {
            ilmioImpl.setIlmio(StringPool.BLANK);
        } else {
            ilmioImpl.setIlmio(ilmio);
        }

        if (tyyppi == null) {
            ilmioImpl.setTyyppi(StringPool.BLANK);
        } else {
            ilmioImpl.setTyyppi(tyyppi);
        }

        if (kieli_ISO639_3 == null) {
            ilmioImpl.setKieli_ISO639_3(StringPool.BLANK);
        } else {
            ilmioImpl.setKieli_ISO639_3(kieli_ISO639_3);
        }

        if (murre == null) {
            ilmioImpl.setMurre(StringPool.BLANK);
        } else {
            ilmioImpl.setMurre(murre);
        }

        if (havaintoaika == null) {
            ilmioImpl.setHavaintoaika(StringPool.BLANK);
        } else {
            ilmioImpl.setHavaintoaika(havaintoaika);
        }

        if (kuvaus == null) {
            ilmioImpl.setKuvaus(StringPool.BLANK);
        } else {
            ilmioImpl.setKuvaus(kuvaus);
        }

        if (lisatieto == null) {
            ilmioImpl.setLisatieto(StringPool.BLANK);
        } else {
            ilmioImpl.setLisatieto(lisatieto);
        }

        if (tuotu_kantaan == Long.MIN_VALUE) {
            ilmioImpl.setTuotu_kantaan(null);
        } else {
            ilmioImpl.setTuotu_kantaan(new Date(tuotu_kantaan));
        }

        if (muutettu == Long.MIN_VALUE) {
            ilmioImpl.setMuutettu(null);
        } else {
            ilmioImpl.setMuutettu(new Date(muutettu));
        }

        if (muuttaja == null) {
            ilmioImpl.setMuuttaja(StringPool.BLANK);
        } else {
            ilmioImpl.setMuuttaja(muuttaja);
        }

        if (poistettu == Long.MIN_VALUE) {
            ilmioImpl.setPoistettu(null);
        } else {
            ilmioImpl.setPoistettu(new Date(poistettu));
        }

        if (tunnus == null) {
            ilmioImpl.setTunnus(StringPool.BLANK);
        } else {
            ilmioImpl.setTunnus(tunnus);
        }

        if (ryhma_tunnus == null) {
            ilmioImpl.setRyhma_tunnus(StringPool.BLANK);
        } else {
            ilmioImpl.setRyhma_tunnus(ryhma_tunnus);
        }

        ilmioImpl.resetOriginalValues();

        return ilmioImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        ilmio_id = objectInput.readInt();
        aineisto_id = objectInput.readInt();
        ryhma_id = objectInput.readInt();
        lajikoodi_id = objectInput.readInt();
        ilmio = objectInput.readUTF();
        tyyppi = objectInput.readUTF();
        kieli_ISO639_3 = objectInput.readUTF();
        murre = objectInput.readUTF();
        havaintoaika = objectInput.readUTF();
        kuvaus = objectInput.readUTF();
        lisatieto = objectInput.readUTF();
        tuotu_kantaan = objectInput.readLong();
        muutettu = objectInput.readLong();
        muuttaja = objectInput.readUTF();
        poistettu = objectInput.readLong();
        tunnus = objectInput.readUTF();
        ryhma_tunnus = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(ilmio_id);
        objectOutput.writeInt(aineisto_id);
        objectOutput.writeInt(ryhma_id);
        objectOutput.writeInt(lajikoodi_id);

        if (ilmio == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ilmio);
        }

        if (tyyppi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tyyppi);
        }

        if (kieli_ISO639_3 == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kieli_ISO639_3);
        }

        if (murre == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(murre);
        }

        if (havaintoaika == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(havaintoaika);
        }

        if (kuvaus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kuvaus);
        }

        if (lisatieto == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(lisatieto);
        }

        objectOutput.writeLong(tuotu_kantaan);
        objectOutput.writeLong(muutettu);

        if (muuttaja == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(muuttaja);
        }

        objectOutput.writeLong(poistettu);

        if (tunnus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tunnus);
        }

        if (ryhma_tunnus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ryhma_tunnus);
        }
    }
}
