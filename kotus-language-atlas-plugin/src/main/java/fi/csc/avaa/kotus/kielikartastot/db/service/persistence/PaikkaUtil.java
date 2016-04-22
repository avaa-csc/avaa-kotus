package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;

import java.util.List;

/**
 * The persistence utility for the paikka service. This utility wraps {@link PaikkaPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see PaikkaPersistence
 * @see PaikkaPersistenceImpl
 * @generated
 */
public class PaikkaUtil {
    private static PaikkaPersistence _persistence;

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
    public static void clearCache(Paikka paikka) {
        getPersistence().clearCache(paikka);
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
    public static List<Paikka> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Paikka> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Paikka> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Paikka update(Paikka paikka) throws SystemException {
        return getPersistence().update(paikka);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Paikka update(Paikka paikka, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(paikka, serviceContext);
    }

    /**
    * Caches the paikka in the entity cache if it is enabled.
    *
    * @param paikka the paikka
    */
    public static void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka) {
        getPersistence().cacheResult(paikka);
    }

    /**
    * Caches the paikkas in the entity cache if it is enabled.
    *
    * @param paikkas the paikkas
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> paikkas) {
        getPersistence().cacheResult(paikkas);
    }

    /**
    * Creates a new paikka with the primary key. Does not add the paikka to the database.
    *
    * @param paikka_id the primary key for the new paikka
    * @return the new paikka
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Paikka create(int paikka_id) {
        return getPersistence().create(paikka_id);
    }

    /**
    * Removes the paikka with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Paikka remove(int paikka_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException {
        return getPersistence().remove(paikka_id);
    }

    public static fi.csc.avaa.kotus.kielikartastot.db.model.Paikka updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(paikka);
    }

    /**
    * Returns the paikka with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException} if it could not be found.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Paikka findByPrimaryKey(
        int paikka_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException {
        return getPersistence().findByPrimaryKey(paikka_id);
    }

    /**
    * Returns the paikka with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka, or <code>null</code> if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Paikka fetchByPrimaryKey(
        int paikka_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(paikka_id);
    }

    /**
    * Returns all the paikkas.
    *
    * @return the paikkas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the paikkas.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of paikkas
    * @param end the upper bound of the range of paikkas (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of paikkas
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the paikkas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of paikkas.
    *
    * @return the number of paikkas
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static PaikkaPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (PaikkaPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    PaikkaPersistence.class.getName());

            ReferenceRegistry.registerReference(PaikkaUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(PaikkaPersistence persistence) {
    }
}
