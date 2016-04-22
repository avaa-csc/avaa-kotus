package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;

import java.util.List;

/**
 * The persistence utility for the ilmio service. This utility wraps {@link IlmioPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see IlmioPersistence
 * @see IlmioPersistenceImpl
 * @generated
 */
public class IlmioUtil {
    private static IlmioPersistence _persistence;

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
    public static void clearCache(Ilmio ilmio) {
        getPersistence().clearCache(ilmio);
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
    public static List<Ilmio> findWithDynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
     */
    public static List<Ilmio> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end) throws SystemException {
        return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
     */
    public static List<Ilmio> findWithDynamicQuery(DynamicQuery dynamicQuery,
        int start, int end, OrderByComparator orderByComparator)
        throws SystemException {
        return getPersistence()
                   .findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
     */
    public static Ilmio update(Ilmio ilmio) throws SystemException {
        return getPersistence().update(ilmio);
    }

    /**
     * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
     */
    public static Ilmio update(Ilmio ilmio, ServiceContext serviceContext)
        throws SystemException {
        return getPersistence().update(ilmio, serviceContext);
    }

    /**
    * Caches the ilmio in the entity cache if it is enabled.
    *
    * @param ilmio the ilmio
    */
    public static void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio) {
        getPersistence().cacheResult(ilmio);
    }

    /**
    * Caches the ilmios in the entity cache if it is enabled.
    *
    * @param ilmios the ilmios
    */
    public static void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> ilmios) {
        getPersistence().cacheResult(ilmios);
    }

    /**
    * Creates a new ilmio with the primary key. Does not add the ilmio to the database.
    *
    * @param ilmio_id the primary key for the new ilmio
    * @return the new ilmio
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio create(int ilmio_id) {
        return getPersistence().create(ilmio_id);
    }

    /**
    * Removes the ilmio with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio remove(int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException {
        return getPersistence().remove(ilmio_id);
    }

    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().updateImpl(ilmio);
    }

    /**
    * Returns the ilmio with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException} if it could not be found.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio findByPrimaryKey(
        int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException {
        return getPersistence().findByPrimaryKey(ilmio_id);
    }

    /**
    * Returns the ilmio with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio, or <code>null</code> if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public static fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio fetchByPrimaryKey(
        int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().fetchByPrimaryKey(ilmio_id);
    }

    /**
    * Returns all the ilmios.
    *
    * @return the ilmios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll();
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
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end);
    }

    /**
    * Returns an ordered range of all the ilmios.
    *
    * <p>
    * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
    * </p>
    *
    * @param start the lower bound of the range of ilmios
    * @param end the upper bound of the range of ilmios (not inclusive)
    * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
    * @return the ordered range of ilmios
    * @throws SystemException if a system exception occurred
    */
    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().findAll(start, end, orderByComparator);
    }

    /**
    * Removes all the ilmios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public static void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        getPersistence().removeAll();
    }

    /**
    * Returns the number of ilmios.
    *
    * @return the number of ilmios
    * @throws SystemException if a system exception occurred
    */
    public static int countAll()
        throws com.liferay.portal.kernel.exception.SystemException {
        return getPersistence().countAll();
    }

    public static IlmioPersistence getPersistence() {
        if (_persistence == null) {
            _persistence = (IlmioPersistence) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    IlmioPersistence.class.getName());

            ReferenceRegistry.registerReference(IlmioUtil.class, "_persistence");
        }

        return _persistence;
    }

    /**
     * @deprecated As of 6.2.0
     */
    public void setPersistence(IlmioPersistence persistence) {
    }
}
