package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi;
import fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class LajikoodiActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public LajikoodiActionableDynamicQuery() throws SystemException {
        setBaseLocalService(LajikoodiLocalServiceUtil.getService());
        setClass(Lajikoodi.class);

        setClassLoader(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("lajikoodi_id");
    }
}
