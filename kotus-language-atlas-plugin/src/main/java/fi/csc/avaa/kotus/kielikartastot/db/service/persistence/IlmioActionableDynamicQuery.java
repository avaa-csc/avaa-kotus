package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class IlmioActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public IlmioActionableDynamicQuery() throws SystemException {
        setBaseLocalService(IlmioLocalServiceUtil.getService());
        setClass(Ilmio.class);

        setClassLoader(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("ilmio_id");
    }
}
