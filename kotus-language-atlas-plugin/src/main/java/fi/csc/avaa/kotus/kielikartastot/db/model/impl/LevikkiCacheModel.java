package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import fi.csc.avaa.kotus.kielikartastot.db.model.Levikki;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Levikki in entity cache.
 *
 * @author CSC
 * @see Levikki
 * @generated
 */
public class LevikkiCacheModel implements CacheModel<Levikki>, Externalizable {
    public int levikki_id;
    public int ilmio_id;
    public int paikka_id;
    public String paikka_tunniste;
    public String ilmio_tunnus;
    public int uusi;

    @Override
    public String toString() {
        StringBundler sb = new StringBundler(13);

        sb.append("{levikki_id=");
        sb.append(levikki_id);
        sb.append(", ilmio_id=");
        sb.append(ilmio_id);
        sb.append(", paikka_id=");
        sb.append(paikka_id);
        sb.append(", paikka_tunniste=");
        sb.append(paikka_tunniste);
        sb.append(", ilmio_tunnus=");
        sb.append(ilmio_tunnus);
        sb.append(", uusi=");
        sb.append(uusi);
        sb.append("}");

        return sb.toString();
    }

    @Override
    public Levikki toEntityModel() {
        LevikkiImpl levikkiImpl = new LevikkiImpl();

        levikkiImpl.setLevikki_id(levikki_id);
        levikkiImpl.setIlmio_id(ilmio_id);
        levikkiImpl.setPaikka_id(paikka_id);

        if (paikka_tunniste == null) {
            levikkiImpl.setPaikka_tunniste(StringPool.BLANK);
        } else {
            levikkiImpl.setPaikka_tunniste(paikka_tunniste);
        }

        if (ilmio_tunnus == null) {
            levikkiImpl.setIlmio_tunnus(StringPool.BLANK);
        } else {
            levikkiImpl.setIlmio_tunnus(ilmio_tunnus);
        }

        levikkiImpl.setUusi(uusi);

        levikkiImpl.resetOriginalValues();

        return levikkiImpl;
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException {
        levikki_id = objectInput.readInt();
        ilmio_id = objectInput.readInt();
        paikka_id = objectInput.readInt();
        paikka_tunniste = objectInput.readUTF();
        ilmio_tunnus = objectInput.readUTF();
        uusi = objectInput.readInt();
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput)
        throws IOException {
        objectOutput.writeInt(levikki_id);
        objectOutput.writeInt(ilmio_id);
        objectOutput.writeInt(paikka_id);

        if (paikka_tunniste == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(paikka_tunniste);
        }

        if (ilmio_tunnus == null) {
            objectOutput.writeUTF(StringPool.BLANK);
        } else {
            objectOutput.writeUTF(ilmio_tunnus);
        }

        objectOutput.writeInt(uusi);
    }
}
