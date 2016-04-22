package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma;

import java.util.List;

/**
 * The persistence utility for the ryhma service. This utility wraps {@link RyhmaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see RyhmaPersistence
 * @see RyhmaPersistenceImpl
 * @generated
 */
public class RyhmaUtil {
    private static RyhmaPersistence _persistence;

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
     */
    public static void clearCache() {
        getPersistence().clearCache();
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
     */
    public static void clearCache(Ryhma ryhma) {
        getPersistence().clearCache(ryhma);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
     */
    public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().countWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
     */
    public static List<Ryhma> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Ryhma> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Ryhma> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Ryhma update(Ryhma ryhma) throws SystemException {
        return getPersistence().update(ryhma);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Ryhma update(Ryhma ryhma, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(ryhma, serviceContext);
    }

    /**
    * Caches the ryhma in the entity cache if it is enabled.
    *
    * @param ryhma the ryhma
    */
    public static void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma ryhma) {
        getPersistence().cacheResult(ryhma);
    }

    /**
    * Caches the ryhmas in the entity cache if it is enabled.
    *
    * @param ryhmas the ryhmas
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma> ryhmas) {
        getPersistence().cacheResult(ryhmas);
    }

    /**
    * Creates a new ryhma with the primary key. Does not add the ryhma to the database.
    *
    * @param ryhma_id the primary key for the new ryhma
    * @return the new ryhma
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma create(int ryhma_id) {
        return getPersistence().create(ryhma_id);
    }

    /**
    * Removes the ryhma with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ryhma_id the primary key of the ryhma
    * @return the ryhma that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException if a ryhma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma remove(int ryhma_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException {
        return getPersistence().remove(ryhma_id);
    }

    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma ryhma)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ryhma);
    }

    /**
    * Returns the ryhma with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException} if it could not be found.
    *
    * @param ryhma_id the primary key of the ryhma
    * @return the ryhma
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException if a ryhma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma findByPrimaryKey(
        int ryhma_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException {
        return getPersistence().findByPrimaryKey(ryhma_id);
    }

    /**
    * Returns the ryhma with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param ryhma_id the primary key of the ryhma
    * @return the ryhma, or <code>null</code> if a ryhma with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma fetchByPrimaryKey(
        int ryhma_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(ryhma_id);
    }

    /**
    * Returns all the ryhmas.
    *
    * @return the ryhmas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the ryhmas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of ryhmas
    * @param end the upper bound of the range of ryhmas (not inclusive)
    * @return the range of ryhmas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the ryhmas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of ryhmas
    * @param end the upper bound of the range of ryhmas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of ryhmas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the ryhmas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of ryhmas.
    *
    * @return the number of ryhmas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static RyhmaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (RyhmaPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    RyhmaPersistence.class.getName());

            ReferenceRegistry.registerReference(RyhmaUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(RyhmaPersistence persistence) {
    }
}
