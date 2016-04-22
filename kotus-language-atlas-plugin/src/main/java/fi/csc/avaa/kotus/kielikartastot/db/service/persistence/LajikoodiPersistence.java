package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi;

/**
 * The persistence interface for the lajikoodi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see LajikoodiPersistenceImpl
 * @see LajikoodiUtil
 * @generated
 */
public interface LajikoodiPersistence extends BasePersistence<Lajikoodi> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LajikoodiUtil} to access the lajikoodi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the lajikoodi in the entity cache if it is enabled.
    *
    * @param lajikoodi the lajikoodi
    */
    public void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi);

    /**
    * Caches the lajikoodis in the entity cache if it is enabled.
    *
    * @param lajikoodis the lajikoodis
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> lajikoodis);

    /**
    * Creates a new lajikoodi with the primary key. Does not add the lajikoodi to the database.
    *
    * @param lajikoodi_id the primary key for the new lajikoodi
    * @return the new lajikoodi
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi create(int lajikoodi_id);

    /**
    * Removes the lajikoodi with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi remove(int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException;

    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the lajikoodi with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException} if it could not be found.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi findByPrimaryKey(
        int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException;

    /**
    * Returns the lajikoodi with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param lajikoodi_id the primary key of the lajikoodi
    * @return the lajikoodi, or <code>null</code> if a lajikoodi with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi fetchByPrimaryKey(
        int lajikoodi_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the lajikoodis.
    *
    * @return the lajikoodis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the lajikoodis from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of lajikoodis.
    *
    * @return the number of lajikoodis
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
