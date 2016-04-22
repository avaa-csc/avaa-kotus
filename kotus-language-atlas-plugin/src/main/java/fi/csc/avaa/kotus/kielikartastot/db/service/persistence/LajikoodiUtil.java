package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi;

import java.util.List;

/**
 * The persistence utility for the lajikoodi service. This utility wraps {@link LajikoodiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see LajikoodiPersistence
 * @see LajikoodiPersistenceImpl
 * @generated
 */
public class LajikoodiUtil {
    private static LajikoodiPersistence _persistence;

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
    public static void clearCache(Lajikoodi lajikoodi) {
        getPersistence().clearCache(lajikoodi);
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
    public static List<Lajikoodi> findWithDynamicQuery(
        DynamicQuery dynamicQuery) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Lajikoodi> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Lajikoodi> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Lajikoodi update(Lajikoodi lajikoodi)
        throws SystemException {
        return getPersistence().update(lajikoodi);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Lajikoodi update(Lajikoodi lajikoodi,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(lajikoodi, serviceContext);
    }

    /**
    * Caches the lajikoodi in the entity cache if it is enabled.
    *
    * @param lajikoodi the lajikoodi
    */
    public static void cacheResult(
        fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi) {
        getPersistence().cacheResult(lajikoodi);
    }

    /**
    * Caches the lajikoodis in the entity cache if it is enabled.
    *
    * @param lajikoodis the lajikoodis
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> lajikoodis) {
        getPersistence().cacheResult(lajikoodis);
    }

    /**
    * Creates a new lajikoodi with the primary key. Does not add the lajikoodi to the database.
    *
    * @param lajikoodi_id the primary key for the new lajikoodi
    * @return the new lajikoodi
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi create(int lajikoodi_id) {
        return getPersistence().create(lajikoodi_id);
    }

    /**
    * Removes the lajikoodi with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi remove(int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException {
        return getPersistence().remove(lajikoodi_id);
    }

    public static fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(lajikoodi);
    }

    /**
    * Returns the lajikoodi with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException} if it could not be found.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi findByPrimaryKey(
        int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException {
        return getPersistence().findByPrimaryKey(lajikoodi_id);
    }

    /**
    * Returns the lajikoodi with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi, or <code>null</code> if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi fetchByPrimaryKey(
        int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(lajikoodi_id);
    }

    /**
    * Returns all the lajikoodis.
    *
    * @return the lajikoodis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the lajikoodis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.LajikoodiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of lajikoodis
    * @param end the upper bound of the range of lajikoodis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of lajikoodis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the lajikoodis from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of lajikoodis.
    *
    * @return the number of lajikoodis
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LajikoodiPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LajikoodiPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    LajikoodiPersistence.class.getName());

            ReferenceRegistry.registerReference(LajikoodiUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LajikoodiPersistence persistence) {
    }
}
