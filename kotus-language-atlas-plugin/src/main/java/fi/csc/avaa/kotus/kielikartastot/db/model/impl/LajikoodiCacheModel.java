package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * The cache model class for representing Lajikoodi in entity cache.
 *
 * @author CSC
 * @see Lajikoodi
 * @generated
 */
public class LajikoodiCacheModel implements CacheModel<Lajikoodi>,
    Externalizable {
    public int lajikoodi_id;
    public int lajikoodi;
    public String laji;
    public String aineistot;
    public String viite;
    public long tuotu_kantaan;
    public long muutettu;
    public String muuttaja;
    public long poistettu;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(19);

        sb.append("{lajikoodi_id=");
        sb.append(lajikoodi_id);
        sb.append(", lajikoodi=");
        sb.append(lajikoodi);
        sb.append(", laji=");
        sb.append(laji);
        sb.append(", aineistot=");
        sb.append(aineistot);
        sb.append(", viite=");
        sb.append(viite);
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
    public Lajikoodi toEntityModel() {
        LajikoodiImpl lajikoodiImpl = new LajikoodiImpl();

        lajikoodiImpl.setLajikoodi_id(lajikoodi_id);
        lajikoodiImpl.setLajikoodi(lajikoodi);

        if (laji == null) {
            lajikoodiImpl.setLaji(StringPool.BLANK);
        } else {
            lajikoodiImpl.setLaji(laji);
        }

        if (aineistot == null) {
            lajikoodiImpl.setAineistot(StringPool.BLANK);
        } else {
            lajikoodiImpl.setAineistot(aineistot);
        }

        if (viite == null) {
            lajikoodiImpl.setViite(StringPool.BLANK);
        } else {
            lajikoodiImpl.setViite(viite);
        }

        if (tuotu_kantaan == Long.MIN_VALUE) {
            lajikoodiImpl.setTuotu_kantaan(null);
        } else {
            lajikoodiImpl.setTuotu_kantaan(new Date(tuotu_kantaan));
        }

        if (muutettu == Long.MIN_VALUE) {
            lajikoodiImpl.setMuutettu(null);
        } else {
            lajikoodiImpl.setMuutettu(new Date(muutettu));
        }

        if (muuttaja == null) {
            lajikoodiImpl.setMuuttaja(StringPool.BLANK);
        } else {
            lajikoodiImpl.setMuuttaja(muuttaja);
        }

        if (poistettu == Long.MIN_VALUE) {
            lajikoodiImpl.setPoistettu(null);
        } else {
            lajikoodiImpl.setPoistettu(new Date(poistettu));
        }

        lajikoodiImpl.resetOriginalValues();

        return lajikoodiImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        lajikoodi_id = objectInput.readInt();
        lajikoodi = objectInput.readInt();
        laji = objectInput.readUTF();
        aineistot = objectInput.readUTF();
        viite = objectInput.readUTF();
        tuotu_kantaan = objectInput.readLong();
        muutettu = objectInput.readLong();
        muuttaja = objectInput.readUTF();
        poistettu = objectInput.readLong();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(lajikoodi_id);
        objectOutput.writeInt(lajikoodi);

        if (laji == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(laji);
        }

        if (aineistot == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(aineistot);
        }

        if (viite == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(viite);
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
