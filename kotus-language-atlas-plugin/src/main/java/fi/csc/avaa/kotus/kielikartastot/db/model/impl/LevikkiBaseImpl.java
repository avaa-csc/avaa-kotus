package fi.csc.avaa.kotus.kielikartastot.db.model.impl;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Levikki;
import fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalServiceUtil;

/**
 * The extended model base implementation for the Levikki service. Represents a row in the &quot;levikki&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LevikkiImpl}.
 * </p>
 *
 * @author CSC
 * @see LevikkiImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.model.Levikki
 * @generated
 */
public abstract class LevikkiBaseImpl extends LevikkiModelImpl
    implements Levikki {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. All methods that expect a levikki model instance should use the {@link Levikki} interface instead.
     */
    @Override
    public void persist() throws SystemException {
        if (this.isNew()) {
            LevikkiLocalServiceUtil.addLevikki(this);
        } else {
            LevikkiLocalServiceUtil.updateLevikki(this);
        }
    }
}
