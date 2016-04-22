package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.dao.orm.BaseActionableDynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto;
import fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalServiceUtil;

/**
 * @author CSC
 * @generated
 */
public abstract class AineistoActionableDynamicQuery
    extends BaseActionableDynamicQuery {
    public AineistoActionableDynamicQuery() throws SystemException {
        setBaseLocalService(AineistoLocalServiceUtil.getService());
        setClass(Aineisto.class);

        setClassLoader(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.class.getClassLoader());

        setPrimaryKeyPropertyName("aineisto_id");
    }
}
