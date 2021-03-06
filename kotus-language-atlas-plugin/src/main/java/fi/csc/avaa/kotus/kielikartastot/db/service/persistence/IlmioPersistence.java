package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;

/**
 * The persistence interface for the ilmio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see IlmioPersistenceImpl
 * @see IlmioUtil
 * @generated
 */
public interface IlmioPersistence extends BasePersistence<Ilmio> {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this interface directly. Always use {@link IlmioUtil} to access the ilmio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
     */

    /**
    * Caches the ilmio in the entity cache if it is enabled.
    *
    * @param ilmio the ilmio
    */
    public void cacheResult(fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio);

    /**
    * Caches the ilmios in the entity cache if it is enabled.
    *
    * @param ilmios the ilmios
    */
    public void cacheResult(
        java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> ilmios);

    /**
    * Creates a new ilmio with the primary key. Does not add the ilmio to the database.
    *
    * @param ilmio_id the primary key for the new ilmio
    * @return the new ilmio
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio create(int ilmio_id);

    /**
    * Removes the ilmio with the primary key from the database. Also notifies the appropriate model listeners.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio that was removed
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio remove(int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException;

    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio updateImpl(
        fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the ilmio with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException} if it could not be found.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio
    * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio findByPrimaryKey(int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException,
            fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException;

    /**
    * Returns the ilmio with the primary key or returns <code>null</code> if it could not be found.
    *
    * @param ilmio_id the primary key of the ilmio
    * @return the ilmio, or <code>null</code> if a ilmio with the primary key could not be found
    * @throws SystemException if a system exception occurred
    */
    public fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio fetchByPrimaryKey(int ilmio_id)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns all the ilmios.
    *
    * @return the ilmios
    * @throws SystemException if a system exception occurred
    */
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findAll()
        throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findAll(int start,
        int end) throws com.liferay.portal.kernel.exception.SystemException;

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
    public java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findAll(int start,
        int end,
        com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Removes all the ilmios from the database.
    *
    * @throws SystemException if a system exception occurred
    */
    public void removeAll()
        throws com.liferay.portal.kernel.exception.SystemException;

    /**
    * Returns the number of ilmios.
    *
    * @return the number of ilmios
    * @throws SystemException if a system exception occurred
    */
    public int countAll()
        throws com.liferay.portal.kernel.exception.SystemException;
}
