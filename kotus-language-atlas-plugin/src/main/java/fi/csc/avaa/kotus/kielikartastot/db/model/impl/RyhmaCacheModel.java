package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * The cache model class for representing Ryhma in entity cache.
 *
 * @author CSC
 * @see Ryhma
 * @generated
 */
public class RyhmaCacheModel implements CacheModel<Ryhma>, Externalizable {
    public int ryhma_id;
    public int aineisto_id;
    public String nimi;
    public String tyyppi;
    public int ylaryhma;
    public String selite;
    public String kartta_kuva_linkki;
    public long tuotu_kantaan;
    public long muutettu;
    public String muuttaja;
    public long poistettu;
    public String tmp;
    public String tunnus;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(27);

        sb.append("{ryhma_id=");
        sb.append(ryhma_id);
        sb.append(", aineisto_id=");
        sb.append(aineisto_id);
        sb.append(", nimi=");
        sb.append(nimi);
        sb.append(", tyyppi=");
        sb.append(tyyppi);
        sb.append(", ylaryhma=");
        sb.append(ylaryhma);
        sb.append(", selite=");
        sb.append(selite);
        sb.append(", kartta_kuva_linkki=");
        sb.append(kartta_kuva_linkki);
        sb.append(", tuotu_kantaan=");
        sb.append(tuotu_kantaan);
        sb.append(", muutettu=");
        sb.append(muutettu);
        sb.append(", muuttaja=");
        sb.append(muuttaja);
        sb.append(", poistettu=");
        sb.append(poistettu);
        sb.append(", tmp=");
        sb.append(tmp);
        sb.append(", tunnus=");
        sb.append(tunnus);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Ryhma toEntityModel() {
        RyhmaImpl ryhmaImpl = new RyhmaImpl();

        ryhmaImpl.setRyhma_id(ryhma_id);
        ryhmaImpl.setAineisto_id(aineisto_id);

        if (nimi == null) {
            ryhmaImpl.setNimi(StringPool.BLANK);
        } else {
            ryhmaImpl.setNimi(nimi);
        }

        if (tyyppi == null) {
            ryhmaImpl.setTyyppi(StringPool.BLANK);
        } else {
            ryhmaImpl.setTyyppi(tyyppi);
        }

        ryhmaImpl.setYlaryhma(ylaryhma);

        if (selite == null) {
            ryhmaImpl.setSelite(StringPool.BLANK);
        } else {
            ryhmaImpl.setSelite(selite);
        }

        if (kartta_kuva_linkki == null) {
            ryhmaImpl.setKartta_kuva_linkki(StringPool.BLANK);
        } else {
            ryhmaImpl.setKartta_kuva_linkki(kartta_kuva_linkki);
        }

        if (tuotu_kantaan == Long.MIN_VALUE) {
            ryhmaImpl.setTuotu_kantaan(null);
        } else {
            ryhmaImpl.setTuotu_kantaan(new Date(tuotu_kantaan));
        }

        if (muutettu == Long.MIN_VALUE) {
            ryhmaImpl.setMuutettu(null);
        } else {
            ryhmaImpl.setMuutettu(new Date(muutettu));
        }

        if (muuttaja == null) {
            ryhmaImpl.setMuuttaja(StringPool.BLANK);
        } else {
            ryhmaImpl.setMuuttaja(muuttaja);
        }

        if (poistettu == Long.MIN_VALUE) {
            ryhmaImpl.setPoistettu(null);
        } else {
            ryhmaImpl.setPoistettu(new Date(poistettu));
        }

        if (tmp == null) {
            ryhmaImpl.setTmp(StringPool.BLANK);
        } else {
            ryhmaImpl.setTmp(tmp);
        }

        if (tunnus == null) {
            ryhmaImpl.setTunnus(StringPool.BLANK);
        } else {
            ryhmaImpl.setTunnus(tunnus);
        }

        ryhmaImpl.resetOriginalValues();

        return ryhmaImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        ryhma_id = objectInput.readInt();
        aineisto_id = objectInput.readInt();
        nimi = objectInput.readUTF();
        tyyppi = objectInput.readUTF();
        ylaryhma = objectInput.readInt();
        selite = objectInput.readUTF();
        kartta_kuva_linkki = objectInput.readUTF();
        tuotu_kantaan = objectInput.readLong();
        muutettu = objectInput.readLong();
        muuttaja = objectInput.readUTF();
        poistettu = objectInput.readLong();
        tmp = objectInput.readUTF();
        tunnus = objectInput.readUTF();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(ryhma_id);
        objectOutput.writeInt(aineisto_id);

        if (nimi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(nimi);
        }

        if (tyyppi == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tyyppi);
        }

        objectOutput.writeInt(ylaryhma);

        if (selite == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(selite);
        }

        if (kartta_kuva_linkki == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(kartta_kuva_linkki);
        }

        objectOutput.writeLong(tuotu_kantaan);
        objectOutput.writeLong(muutettu);

        if (muuttaja == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(muuttaja);
        }

        objectOutput.writeLong(poistettu);

        if (tmp == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tmp);
        }

        if (tunnus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(tunnus);
        }
    }
}
