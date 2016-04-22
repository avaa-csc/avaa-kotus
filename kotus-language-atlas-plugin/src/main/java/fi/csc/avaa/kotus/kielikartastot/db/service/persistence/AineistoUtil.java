package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto;

import java.util.List;

/**
 * The persistence utility for the aineisto service. This utility wraps {@link AineistoPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see AineistoPersistence
 * @see AineistoPersistenceImpl
 * @generated
 */
public class AineistoUtil {
    private static AineistoPersistence _persistence;

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
    public static void clearCache(Aineisto aineisto) {
        getPersistence().clearCache(aineisto);
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
    public static List<Aineisto> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Aineisto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Aineisto> findWithDynamicQuery(
        DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Aineisto update(Aineisto aineisto) throws SystemException {
        return getPersistence().update(aineisto);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Aineisto update(Aineisto aineisto,
        ServiceContext serviceContext) throws SystemException {
        return getPersistence().update(aineisto, serviceContext);
    }

    /**
    * Caches the aineisto in the entity cache if it is enabled.
    *
    * @param aineisto the aineisto
    */
    public static void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto aineisto) {
        getPersistence().cacheResult(aineisto);
    }

    /**
    * Caches the aineistos in the entity cache if it is enabled.
    *
    * @param aineistos the aineistos
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> aineistos) {
        getPersistence().cacheResult(aineistos);
    }

    /**
    * Creates a new aineisto with the primary key. Does not add the aineisto to the database.
    *
    * @param aineisto_id the primary key for the new aineisto
    * @return the new aineisto
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto create(int aineisto_id) {
        return getPersistence().create(aineisto_id);
    }

    /**
    * Removes the aineisto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param aineisto_id the primary key of the aineisto
    * @return the aineisto that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto remove(int aineisto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException {
        return getPersistence().remove(aineisto_id);
    }

    public static fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto aineisto)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(aineisto);
    }

    /**
    * Returns the aineisto with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException} if it could not be found.
    *
    * @param aineisto_id the primary key of the aineisto
    * @return the aineisto
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto findByPrimaryKey(
        int aineisto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException {
        return getPersistence().findByPrimaryKey(aineisto_id);
    }

    /**
    * Returns the aineisto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param aineisto_id the primary key of the aineisto
    * @return the aineisto, or <code>null</code> if a aineisto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto fetchByPrimaryKey(
        int aineisto_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(aineisto_id);
    }

    /**
    * Returns all the aineistos.
    *
    * @return the aineistos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
    }

    /**
    * Returns a range of all the aineistos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.AineistoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of aineistos
    * @param end the upper bound of the range of aineistos (not inclusive)
    * @return the range of aineistos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the aineistos.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.AineistoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of aineistos
    * @param end the upper bound of the range of aineistos (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of aineistos
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the aineistos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of aineistos.
    *
    * @return the number of aineistos
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static AineistoPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (AineistoPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    AineistoPersistence.class.getName());

            ReferenceRegistry.registerReference(AineistoUtil.class,
                "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(AineistoPersistence persistence) {
    }
}
