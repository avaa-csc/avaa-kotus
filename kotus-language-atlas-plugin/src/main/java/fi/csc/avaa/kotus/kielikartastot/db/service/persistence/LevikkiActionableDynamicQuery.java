package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Levikki;
import fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class LevikkiActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LevikkiActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LevikkiLocalServiceUtil.getService());
        setClass(Levikki.class);

        setClassLoader(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("levikki_id");
    }
}
