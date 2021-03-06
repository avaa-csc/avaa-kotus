package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;
import fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalServiceUtil;

/**
 * The extended model base implementation for the Paikka service. Represents a row in the &quot;paikka&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PaikkaImpl}.
 * </p>
 *
 * @author CSC
 * @see PaikkaImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.Paikka
 * @generated
 */
public abstract class PaikkaBaseImpl extends PaikkaModelImpl implements Paikka {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a paikka model instance should use the {@link Paikka} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            PaikkaLocalServiceUtil.addPaikka(this);
        } else {
            PaikkaLocalServiceUtil.updatePaikka(this);
        }
    }
}
