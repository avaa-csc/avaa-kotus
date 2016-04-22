package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.kotus.kielikartastot.db.model.Levikki;

/**
 * The persistence interface for the levikki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see LevikkiPersistenceImpl
 * @see LevikkiUtil
 * @generated
 */
public interface LevikkiPersistence extends BasePersistence<Levikki> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link LevikkiUtil} to access the levikki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the levikki in the entity cache if it is enabled.
    *
    * @param levikki the levikki
    */
    public void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Levikki levikki);

    /**
    * Caches the levikkis in the entity cache if it is enabled.
    *
    * @param levikkis the levikkis
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> levikkis);

    /**
    * Creates a new levikki with the primary key. Does not add the levikki to the database.
    *
    * @param levikki_id the primary key for the new levikki
    * @return the new levikki
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Levikki create(int levikki_id);

    /**
    * Removes the levikki with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param levikki_id the primary key of the levikki
    * @return the levikki that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Levikki remove(int levikki_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException;

    public fi.csc.avaa.kotus.kielikartastot.db.model.Levikki updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Levikki levikki)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the levikki with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException} if it could not be found.
    *
    * @param levikki_id the primary key of the levikki
    * @return the levikki
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Levikki findByPrimaryKey(int levikki_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException;

    /**
    * Returns the levikki with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param levikki_id the primary key of the levikki
    * @return the levikki, or <code>null</code> if a levikki with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Levikki fetchByPrimaryKey(int levikki_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the levikkis.
    *
    * @return the levikkis
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Levikki> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the levikkis from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of levikkis.
    *
    * @return the number of levikkis
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
