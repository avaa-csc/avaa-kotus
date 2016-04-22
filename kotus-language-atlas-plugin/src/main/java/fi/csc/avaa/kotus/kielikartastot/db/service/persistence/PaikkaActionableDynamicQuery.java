package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;
import fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class PaikkaActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public PaikkaActionableDynamicQuery() throws SystemException {
        setBaseLocalService(PaikkaLocalServiceUtil.getService());
        setClass(Paikka.class);

        setClassLoader(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("paikka_id");
    }
}
