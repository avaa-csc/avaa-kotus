package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma;
import fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class RyhmaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public RyhmaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(RyhmaLocalServiceUtil.getService());
        setClass(Ryhma.class);

        setClassLoader(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("ryhma_id");
    }
}
