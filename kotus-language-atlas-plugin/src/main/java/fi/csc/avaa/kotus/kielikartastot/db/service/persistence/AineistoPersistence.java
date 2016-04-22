package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto;

/**
 * The persistence interface for the aineisto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see AineistoPersistenceImpl
 * @see AineistoUtil
 * @generated
 */
public interface AineistoPersistence extends BasePersistence<Aineisto> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link AineistoUtil} to access the aineisto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the aineisto in the entity cache if it is enabled.
    *
    * @param aineisto the aineisto
    */
    public void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto aineisto);

    /**
    * Caches the aineistos in the entity cache if it is enabled.
    *
    * @param aineistos the aineistos
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> aineistos);

    /**
    * Creates a new aineisto with the primary key. Does not add the aineisto to the database.
    *
    * @param aineisto_id the primary key for the new aineisto
    * @return the new aineisto
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto create(int aineisto_id);

    /**
    * Removes the aineisto with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param aineisto_id the primary key of the aineisto
    * @return the aineisto that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto remove(int aineisto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException;

    public fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto aineisto)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the aineisto with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException} if it could not be found.
    *
    * @param aineisto_id the primary key of the aineisto
    * @return the aineisto
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto findByPrimaryKey(int aineisto_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException;

    /**
    * Returns the aineisto with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param aineisto_id the primary key of the aineisto
    * @return the aineisto, or <code>null</code> if a aineisto with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto fetchByPrimaryKey(
        int aineisto_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the aineistos.
    *
    * @return the aineistos
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the aineistos from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of aineistos.
    *
    * @return the number of aineistos
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
