package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;

/**
 * The persistence interface for the paikka service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see PaikkaPersistenceImpl
 * @see PaikkaUtil
 * @generated
 */
public interface PaikkaPersistence extends BasePersistence<Paikka> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link PaikkaUtil} to access the paikka persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the paikka in the entity cache if it is enabled.
    *
    * @param paikka the paikka
    */
    public void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka);

    /**
    * Caches the paikkas in the entity cache if it is enabled.
    *
    * @param paikkas the paikkas
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> paikkas);

    /**
    * Creates a new paikka with the primary key. Does not add the paikka to the database.
    *
    * @param paikka_id the primary key for the new paikka
    * @return the new paikka
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka create(int paikka_id);

    /**
    * Removes the paikka with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka remove(int paikka_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException;

    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the paikka with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException} if it could not be found.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka findByPrimaryKey(int paikka_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException;

    /**
    * Returns the paikka with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param paikka_id the primary key of the paikka
    * @return the paikka, or <code>null</code> if a paikka with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Paikka fetchByPrimaryKey(int paikka_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the paikkas.
    *
    * @return the paikkas
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> findAll(
        int start, int end)
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Paikka> findAll(
        int start, int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the paikkas from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of paikkas.
    *
    * @return the number of paikkas
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
