package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * Provides the local service utility for Ilmio. This utility wraps
 * {@link fi.csc.avaa.kotus.kielikartastot.db.service.impl.IlmioLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author CSC
 * @see IlmioLocalService
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.base.IlmioLocalServiceBaseImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.impl.IlmioLocalServiceImpl
 * @generated
 */
public class IlmioLocalServiceUtil {
    private static IlmioLocalService _service;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Add custom service methods to {@link fi.csc.avaa.kotus.kielikartastot.db.service.impl.IlmioLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
     */

    /**
    * Adds the ilmio to the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio the ilmio
    * @return the ilmio that was added
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio addIlmio(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().addIlmio(ilmio);
    }

    /**
    * Creates a new ilmio with the primary key. Does not add the ilmio to the database.
    *
    * @param ilmio_id the primary key for the new ilmio
    * @return the new ilmio
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio createIlmio(int ilmio_id) {
        return getService().createIlmio(ilmio_id);
    }

    /**
    * Deletes the ilmio with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio that was removed
    * @throws PortalException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio deleteIlmio(int ilmio_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteIlmio(ilmio_id);
    }

    /**
    * Deletes the ilmio from the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio the ilmio
    * @return the ilmio that was removed
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio deleteIlmio(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().deleteIlmio(ilmio);
    }

    public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return getService().dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @SuppressWarnings("rawtypes")
    public static java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    public static long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().dynamicQueryCount(dynamicQuery, projection);
    }

    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio fetchIlmio(int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().fetchIlmio(ilmio_id);
    }

    /**
    * Returns the ilmio with the primary key.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio
    * @throws PortalException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio getIlmio(int ilmio_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getIlmio(ilmio_id);
    }

    public static com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return getService().getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the ilmios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of ilmios
    * @param end the upper bound of the range of ilmios (not inclusive)
    * @return the range of ilmios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> getIlmios(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getIlmios(start, end);
    }

    /**
    * Returns the number of ilmios.
    *
    * @return the number of ilmios
    * @throws SystemException if a system exception occurred
    */
    public static int getIlmiosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().getIlmiosCount();
    }

    /**
    * Updates the ilmio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ilmio the ilmio
    * @return the ilmio that was updated
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio updateIlmio(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().updateIlmio(ilmio);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    public static java.lang.String getBeanIdentifier() {
        return getService().getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    public static void setBeanIdentifier(java.lang.String beanIdentifier) {
        getService().setBeanIdentifier(beanIdentifier);
    }

    public static java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return getService().invokeMethod(name, parameterTypes, arguments);
    }

    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findByAineistoIlmioTyyppiKuvausPaikka(
        int aineistoIdVal, java.lang.String ilmioVal,
        java.lang.String tyyppiVal, java.lang.String kuvausVal,
        java.lang.String paikkaVal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService()
                   .findByAineistoIlmioTyyppiKuvausPaikka(aineistoIdVal,
            ilmioVal, tyyppiVal, kuvausVal, paikkaVal);
    }

    public static java.util.List<java.lang.Object> findIlmioPaikkaByRyhmaId(
        int[] groupIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findIlmioPaikkaByRyhmaId(groupIds);
    }

    public static java.util.List<java.lang.Object> findByRyhmaId(int[] groupIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getService().findByRyhmaId(groupIds);
    }

    public static void clearService() {
        _service = null;
    }

    public static IlmioLocalService getService() {
        if (_service == null) {
            InvokableLocalService invokableLocalService = (InvokableLocalService) PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
                    IlmioLocalService.class.getName());

            if (invokableLocalService instanceof IlmioLocalService) {
                _service = (IlmioLocalService) invokableLocalService;
            } else {
                _service = new IlmioLocalServiceClp(invokableLocalService);
            }

            ReferenceRegistry.registerReference(IlmioLocalServiceUtil.class,
                "_service");
        }

        return _service;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setService(IlmioLocalService service) {
    }
}
