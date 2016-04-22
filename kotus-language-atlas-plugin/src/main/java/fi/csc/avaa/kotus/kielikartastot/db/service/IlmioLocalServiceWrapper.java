package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link IlmioLocalService}.
 *
 * @author CSC
 * @see IlmioLocalService
 * @generated
 */
public class IlmioLocalServiceWrapper implements IlmioLocalService,
    ServiceWrapper<IlmioLocalService> {
    private IlmioLocalService _ilmioLocalService;

    public IlmioLocalServiceWrapper(IlmioLocalService ilmioLocalService) {
        _ilmioLocalService = ilmioLocalService;
    }

    /**
    * Adds the ilmio to the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio the ilmio
    * @return the ilmio that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio addIlmio(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.addIlmio(ilmio);
    }

    /**
    * Creates a new ilmio with the primary key. Does not add the ilmio to the database.
    *
    * @param ilmio_id the primary key for the new ilmio
    * @return the new ilmio
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio createIlmio(int ilmio_id) {
        return _ilmioLocalService.createIlmio(ilmio_id);
    }

    /**
    * Deletes the ilmio with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio that was removed
    * @throws PortalException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio deleteIlmio(int ilmio_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.deleteIlmio(ilmio_id);
    }

    /**
    * Deletes the ilmio from the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio the ilmio
    * @return the ilmio that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio deleteIlmio(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.deleteIlmio(ilmio);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _ilmioLocalService.dynamicQuery();
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
        return _ilmioLocalService.dynamicQuery(dynamicQuery);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.dynamicQuery(dynamicQuery, start, end);
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
    @Override
    @SuppressWarnings("rawtypes")
    public java.util.List dynamicQuery(
        com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _ilmioLocalService.dynamicQueryCount(dynamicQuery);
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
        return _ilmioLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio fetchIlmio(int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.fetchIlmio(ilmio_id);
    }

    /**
    * Returns the ilmio with the primary key.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio
    * @throws PortalException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio getIlmio(int ilmio_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.getIlmio(ilmio_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.getPersistedModel(primaryKeyObj);
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
    @Override
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> getIlmios(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.getIlmios(start, end);
    }

    /**
    * Returns the number of ilmios.
    *
    * @return the number of ilmios
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getIlmiosCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.getIlmiosCount();
    }

    /**
    * Updates the ilmio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param ilmio the ilmio
    * @return the ilmio that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio updateIlmio(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.updateIlmio(ilmio);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ilmioLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ilmioLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ilmioLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findByAineistoIlmioTyyppiKuvausPaikka(
        int aineistoIdVal, java.lang.String ilmioVal,
        java.lang.String tyyppiVal, java.lang.String kuvausVal,
        java.lang.String paikkaVal)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.findByAineistoIlmioTyyppiKuvausPaikka(aineistoIdVal,
            ilmioVal, tyyppiVal, kuvausVal, paikkaVal);
    }

    @Override
    public java.util.List<java.lang.Object> findIlmioPaikkaByRyhmaId(
        int[] groupIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.findIlmioPaikkaByRyhmaId(groupIds);
    }

    @Override
    public java.util.List<java.lang.Object> findByRyhmaId(int[] groupIds)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _ilmioLocalService.findByRyhmaId(groupIds);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public IlmioLocalService getWrappedIlmioLocalService() {
        return _ilmioLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedIlmioLocalService(IlmioLocalService ilmioLocalService) {
        _ilmioLocalService = ilmioLocalService;
    }

    @Override
    public IlmioLocalService getWrappedService() {
        return _ilmioLocalService;
    }

    @Override
    public void setWrappedService(IlmioLocalService ilmioLocalService) {
        _ilmioLocalService = ilmioLocalService;
    }
}
