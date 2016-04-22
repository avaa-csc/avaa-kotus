package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.kotus.kielikartastot.db.model.Levikki;

import java.util.List;

/**
 * The persistence utility for the levikki service. This utility wraps {@link LevikkiPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see LevikkiPersistence
 * @see LevikkiPersistenceImpl
 * @generated
 */
public class LevikkiUtil {
    private static LevikkiPersistence _persistence;

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
    public static void clearCache(Levikki levikki) {
        getPersistence().clearCache(levikki);
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
    public static List<Levikki> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Levikki> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Levikki> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Levikki update(Levikki levikki) throws SystemException {
        return getPersistence().update(levikki);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Levikki update(Levikki levikki, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(levikki, serviceContext);
    }

    /**
    * Caches the levikki in the entity cache if it is enabled.
    *
    * @param levikki the levikki
    */
    public static void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Levikki levikki) {
        getPersistence().cacheResult(levikki);
    }

    /**
    * Caches the levikkis in the entity cache if it is enabled.
    *
    * @param levikkis the levikkis
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> levikkis) {
        getPersistence().cacheResult(levikkis);
    }

    /**
    * Creates a new levikki with the primary key. Does not add the levikki to the database.
    *
    * @param levikki_id the primary key for the new levikki
    * @return the new levikki
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Levikki create(int levikki_id) {
        return getPersistence().create(levikki_id);
    }

    /**
    * Removes the levikki with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param levikki_id the primary key of the levikki
    * @return the levikki that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Levikki remove(int levikki_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException {
        return getPersistence().remove(levikki_id);
    }

    public static fi.csc.avaa.kotus.kielikartastot.db.model.Levikki updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Levikki levikki)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(levikki);
    }

    /**
    * Returns the levikki with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException} if it could not be found.
    *
    * @param levikki_id the primary key of the levikki
    * @return the levikki
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Levikki findByPrimaryKey(
        int levikki_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException {
        return getPersistence().findByPrimaryKey(levikki_id);
    }

    /**
    * Returns the levikki with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param levikki_id the primary key of the levikki
    * @return the levikki, or <code>null</code> if a levikki with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Levikki fetchByPrimaryKey(
        int levikki_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(levikki_id);
    }

    /**
    * Returns all the levikkis.
    *
    * @return the levikkis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the levikkis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.LevikkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of levikkis
    * @param end the upper bound of the range of levikkis (not inclusive)
    * @return the range of levikkis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the levikkis.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.LevikkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of levikkis
    * @param end the upper bound of the range of levikkis (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of levikkis
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the levikkis from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of levikkis.
    *
    * @return the number of levikkis
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static LevikkiPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (LevikkiPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    LevikkiPersistence.class.getName());

            ReferenceRegistry.registerReference(LevikkiUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(LevikkiPersistence persistence) {
    }
}
