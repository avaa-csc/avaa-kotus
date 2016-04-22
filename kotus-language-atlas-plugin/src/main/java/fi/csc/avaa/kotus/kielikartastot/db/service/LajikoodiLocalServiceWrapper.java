package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LajikoodiLocalService}.
 *
 * @author CSC
 * @see LajikoodiLocalService
 * @generated
 */
public class LajikoodiLocalServiceWrapper implements LajikoodiLocalService,
    ServiceWrapper<LajikoodiLocalService> {
    private LajikoodiLocalService _lajikoodiLocalService;

    public LajikoodiLocalServiceWrapper(
        LajikoodiLocalService lajikoodiLocalService) {
        _lajikoodiLocalService = lajikoodiLocalService;
    }

    /**
    * Adds the lajikoodi to the database. Also notifies the appropriate model listeners.
    *
    * @param lajikoodi the lajikoodi
    * @return the lajikoodi that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi addLajikoodi(
        fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.addLajikoodi(lajikoodi);
    }

    /**
    * Creates a new lajikoodi with the primary key. Does not add the lajikoodi to the database.
    *
    * @param lajikoodi_id the primary key for the new lajikoodi
    * @return the new lajikoodi
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi createLajikoodi(
        int lajikoodi_id) {
        return _lajikoodiLocalService.createLajikoodi(lajikoodi_id);
    }

    /**
    * Deletes the lajikoodi with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi that was removed
    * @throws PortalException if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi deleteLajikoodi(
        int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.deleteLajikoodi(lajikoodi_id);
    }

    /**
    * Deletes the lajikoodi from the database. Also notifies the appropriate model listeners.
    *
    * @param lajikoodi the lajikoodi
    * @return the lajikoodi that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi deleteLajikoodi(
        fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.deleteLajikoodi(lajikoodi);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _lajikoodiLocalService.dynamicQuery();
    }

    /**
    * Performs a dynamic query on the database and returns the matching rows.
    *
    * @param dynamicQuery the dynamic query
    * @return the matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.LajikoodiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @return the range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.LajikoodiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param dynamicQuery the dynamic query
    * @param start the lower bound of the range of model instances
    * @param end the upper bound of the range of model instances (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of matching rows
    * @throws SystemException if a system exception occurred
    */
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.dynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.dynamicQueryCount(dynamicQuery);
    }

    /**
    * Returns the number of rows that match the dynamic query.
    *
    * @param dynamicQuery the dynamic query
    * @param projection the projection to apply to the query
    * @return the number of rows that match the dynamic query
    * @throws SystemException if a system exception occurred
    */
    @Override
    public long dynamicQueryCount(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
        com.liferay.portal.kernel.dao.orm.Projection projection)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi fetchLajikoodi(int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.fetchLajikoodi(lajikoodi_id);
    }

    /**
    * Returns the lajikoodi with the primary key.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi
    * @throws PortalException if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi getLajikoodi(int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.getLajikoodi(lajikoodi_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the lajikoodis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.LajikoodiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of lajikoodis
    * @param end the upper bound of the range of lajikoodis (not inclusive)
    * @return the range of lajikoodis
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> getLajikoodis(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.getLajikoodis(start, end);
    }

    /**
    * Returns the number of lajikoodis.
    *
    * @return the number of lajikoodis
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getLajikoodisCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.getLajikoodisCount();
    }

    /**
    * Updates the lajikoodi in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param lajikoodi the lajikoodi
    * @return the lajikoodi that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi updateLajikoodi(
        fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _lajikoodiLocalService.updateLajikoodi(lajikoodi);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lajikoodiLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lajikoodiLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lajikoodiLocalService.invokeMethod(name, parameterTypes,
            arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LajikoodiLocalService getWrappedLajikoodiLocalService() {
        return _lajikoodiLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLajikoodiLocalService(
        LajikoodiLocalService lajikoodiLocalService) {
        _lajikoodiLocalService = lajikoodiLocalService;
    }

    @Override
    public LajikoodiLocalService getWrappedService() {
        return _lajikoodiLocalService;
    }

    @Override
    public void setWrappedService(LajikoodiLocalService lajikoodiLocalService) {
        _lajikoodiLocalService = lajikoodiLocalService;
    }
}
