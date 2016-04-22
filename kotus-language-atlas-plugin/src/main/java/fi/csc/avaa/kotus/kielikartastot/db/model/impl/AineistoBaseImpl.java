package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto;
import fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalServiceUtil;

/**
 * The extended model base implementation for the Aineisto service. Represents a row in the &quot;aineisto&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AineistoImpl}.
 * </p>
 *
 * @author CSC
 * @see AineistoImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto
 * @generated
 */
public abstract class AineistoBaseImpl extends AineistoModelImpl
    implements Aineisto {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a aineisto model instance should use the {@link Aineisto} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            AineistoLocalServiceUtil.addAineisto(this);
        } else {
            AineistoLocalServiceUtil.updateAineisto(this);
        }
    }
}