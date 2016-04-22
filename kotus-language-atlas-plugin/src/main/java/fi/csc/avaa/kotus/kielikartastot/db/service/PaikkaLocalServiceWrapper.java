package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaikkaLocalService}.
 *
 * @author CSC
 * @see PaikkaLocalService
 * @generated
 */
public class PaikkaLocalServiceWrapper implements PaikkaLocalService,
    ServiceWrapper<PaikkaLocalService> {
    private PaikkaLocalService _paikkaLocalService;

    public PaikkaLocalServiceWrapper(PaikkaLocalService paikkaLocalService) {
        _paikkaLocalService = paikkaLocalService;
    }

    /**
    * Adds the paikka to the database. Also notifies the appropriate model listeners.
    *
    * @param paikka the paikka
    * @return the paikka that was added
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka addPaikka(
        fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.addPaikka(paikka);
    }

    /**
    * Creates a new paikka with the primary key. Does not add the paikka to the database.
    *
    * @param paikka_id the primary key for the new paikka
    * @return the new paikka
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka createPaikka(int paikka_id) {
        return _paikkaLocalService.createPaikka(paikka_id);
    }

    /**
    * Deletes the paikka with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka that was removed
    * @throws PortalException if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka deletePaikka(int paikka_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.deletePaikka(paikka_id);
    }

    /**
    * Deletes the paikka from the database. Also notifies the appropriate model listeners.
    *
    * @param paikka the paikka
    * @return the paikka that was removed
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka deletePaikka(
        fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.deletePaikka(paikka);
    }

    @Override
    public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
        return _paikkaLocalService.dynamicQuery();
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
        return _paikkaLocalService.dynamicQuery(dynamicQuery);
    }

    /**
    * Performs a dynamic query on the database and returns a range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paikkaLocalService.dynamicQuery(dynamicQuery, start, end);
    }

    /**
    * Performs a dynamic query on the database and returns an ordered range of the matching rows.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
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
        return _paikkaLocalService.dynamicQuery(dynamicQuery, start, end,
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
        return _paikkaLocalService.dynamicQueryCount(dynamicQuery);
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
        return _paikkaLocalService.dynamicQueryCount(dynamicQuery, projection);
    }

    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka fetchPaikka(int paikka_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.fetchPaikka(paikka_id);
    }

    /**
    * Returns the paikka with the primary key.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka
    * @throws PortalException if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka getPaikka(int paikka_id)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.getPaikka(paikka_id);
    }

    @Override
    public com.liferay.portal.model.PersistedModel getPersistedModel(
        java.io.Serializable primaryKeyObj)
        throws com.liferay.portal.kernel.exception.PortalException,
            com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.getPersistedModel(primaryKeyObj);
    }

    /**
    * Returns a range of all the paikkas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of paikkas
    * @param end the upper bound of the range of paikkas (not inclusive)
    * @return the range of paikkas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> getPaikkas(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.getPaikkas(start, end);
    }

    /**
    * Returns the number of paikkas.
    *
    * @return the number of paikkas
    * @throws SystemException if a system exception occurred
    */
    @Override
    public int getPaikkasCount()
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.getPaikkasCount();
    }

    /**
    * Updates the paikka in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
    *
    * @param paikka the paikka
    * @return the paikka that was updated
    * @throws SystemException if a system exception occurred
    */
    @Override
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka updatePaikka(
        fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.updatePaikka(paikka);
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paikkaLocalService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paikkaLocalService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paikkaLocalService.invokeMethod(name, parameterTypes, arguments);
    }

    @Override
    public java.util.List<java.lang.Object> findByIlmioId(int ilmioId)
        throws com.liferay.portal.kernel.exception.SystemException {
        return _paikkaLocalService.findByIlmioId(ilmioId);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaikkaLocalService getWrappedPaikkaLocalService() {
        return _paikkaLocalService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaikkaLocalService(
        PaikkaLocalService paikkaLocalService) {
        _paikkaLocalService = paikkaLocalService;
    }

    @Override
    public PaikkaLocalService getWrappedService() {
        return _paikkaLocalService;
    }

    @Override
    public void setWrappedService(PaikkaLocalService paikkaLocalService) {
        _paikkaLocalService = paikkaLocalService;
    }
}
