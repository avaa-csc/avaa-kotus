package fi.csc.avaa.kotus.kielikartastot.db.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.model.PersistedModel;
import com.liferay.portal.service.BaseLocalServiceImpl;
import com.liferay.portal.service.PersistedModelLocalServiceRegistryUtil;
import com.liferay.portal.service.persistence.UserPersistence;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalService;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.AineistoPersistence;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioFinder;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioPersistence;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.LajikoodiPersistence;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.LevikkiPersistence;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.PaikkaFinder;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.PaikkaPersistence;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaFinder;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaPersistence;

import java.io.Serializable;
import java.util.List;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the ilmio local service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link fi.csc.avaa.kotus.kielikartastot.db.service.impl.IlmioLocalServiceImpl}.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.impl.IlmioLocalServiceImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil
 * @generated
 */
public abstract class IlmioLocalServiceBaseImpl extends BaseLocalServiceImpl
    implements IlmioLocalService, IdentifiableBean {
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalService aineistoLocalService;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.AineistoService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.AineistoService aineistoService;
    @BeanReference(type = AineistoPersistence.class)
    protected AineistoPersistence aineistoPersistence;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalService ilmioLocalService;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.IlmioService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.IlmioService ilmioService;
    @BeanReference(type = IlmioPersistence.class)
    protected IlmioPersistence ilmioPersistence;
    @BeanReference(type = IlmioFinder.class)
    protected IlmioFinder ilmioFinder;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiLocalService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiLocalService lajikoodiLocalService;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiService lajikoodiService;
    @BeanReference(type = LajikoodiPersistence.class)
    protected LajikoodiPersistence lajikoodiPersistence;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalService levikkiLocalService;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiService levikkiService;
    @BeanReference(type = LevikkiPersistence.class)
    protected LevikkiPersistence levikkiPersistence;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalService paikkaLocalService;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaService paikkaService;
    @BeanReference(type = PaikkaPersistence.class)
    protected PaikkaPersistence paikkaPersistence;
    @BeanReference(type = PaikkaFinder.class)
    protected PaikkaFinder paikkaFinder;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalService ryhmaLocalService;
    @BeanReference(type = fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaService.class)
    protected fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaService ryhmaService;
    @BeanReference(type = RyhmaPersistence.class)
    protected RyhmaPersistence ryhmaPersistence;
    @BeanReference(type = RyhmaFinder.class)
    protected RyhmaFinder ryhmaFinder;
    @BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
    protected com.liferay.counter.service.CounterLocalService counterLocalService;
    @BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
    protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
    @BeanReference(type = com.liferay.portal.service.UserLocalService.class)
    protected com.liferay.portal.service.UserLocalService userLocalService;
    @BeanReference(type = com.liferay.portal.service.UserService.class)
    protected com.liferay.portal.service.UserService userService;
    @BeanReference(type = UserPersistence.class)
    protected UserPersistence userPersistence;
    private String _beanIdentifier;
    private ClassLoader _classLoader;
    private IlmioLocalServiceClpInvoker _clpInvoker = new IlmioLocalServiceClpInvoker();

    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil} to access the ilmio local service.
     */

    /**
     * Adds the ilmio to the database. Also notifies the appropriate model listeners.
     *
     * @param ilmio the ilmio
     * @return the ilmio that was added
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Ilmio addIlmio(Ilmio ilmio) throws SystemException {
        ilmio.setNew(true);

        return ilmioPersistence.update(ilmio);
    }

    /**
     * Creates a new ilmio with the primary key. Does not add the ilmio to the database.
     *
     * @param ilmio_id the primary key for the new ilmio
     * @return the new ilmio
     */
    @Override
    public Ilmio createIlmio(int ilmio_id) {
        return ilmioPersistence.create(ilmio_id);
    }

    /**
     * Deletes the ilmio with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param ilmio_id the primary key of the ilmio
     * @return the ilmio that was removed
     * @throws PortalException if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Ilmio deleteIlmio(int ilmio_id)
        throws PortalException, SystemException {
        return ilmioPersistence.remove(ilmio_id);
    }

    /**
     * Deletes the ilmio from the database. Also notifies the appropriate model listeners.
     *
     * @param ilmio the ilmio
     * @return the ilmio that was removed
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.DELETE)
    @Override
    public Ilmio deleteIlmio(Ilmio ilmio) throws SystemException {
        return ilmioPersistence.remove(ilmio);
    }

    @Override
    public DynamicQuery dynamicQuery() {
        Class<?> clazz = getClass();

        return DynamicQueryFactoryUtil.forClass(Ilmio.class,
            clazz.getClassLoader());
    }

    /**
     * Performs a dynamic query on the database and returns the matching rows.
     *
     * @param dynamicQuery the dynamic query
     * @return the matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery)
        throws SystemException {
        return ilmioPersistence.findWithDynamicQuery(dynamicQuery);
    }

    /**
     * Performs a dynamic query on the database and returns a range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @return the range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end)
        throws SystemException {
        return ilmioPersistence.findWithDynamicQuery(dynamicQuery, start, end);
    }

    /**
     * Performs a dynamic query on the database and returns an ordered range of the matching rows.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param dynamicQuery the dynamic query
     * @param start the lower bound of the range of model instances
     * @param end the upper bound of the range of model instances (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of matching rows
     * @throws SystemException if a system exception occurred
     */
    @Override
    @SuppressWarnings("rawtypes")
    public List dynamicQuery(DynamicQuery dynamicQuery, int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        return ilmioPersistence.findWithDynamicQuery(dynamicQuery, start, end,
            orderByComparator);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery)
        throws SystemException {
        return ilmioPersistence.countWithDynamicQuery(dynamicQuery);
    }

    /**
     * Returns the number of rows that match the dynamic query.
     *
     * @param dynamicQuery the dynamic query
     * @param projection the projection to apply to the query
     * @return the number of rows that match the dynamic query
     * @throws SystemException if a system exception occurred
     */
    @Override
    public long dynamicQueryCount(DynamicQuery dynamicQuery,
        Projection projection) throws SystemException {
        return ilmioPersistence.countWithDynamicQuery(dynamicQuery, projection);
    }

    @Override
    public Ilmio fetchIlmio(int ilmio_id) throws SystemException {
        return ilmioPersistence.fetchByPrimaryKey(ilmio_id);
    }

    /**
     * Returns the ilmio with the primary key.
     *
     * @param ilmio_id the primary key of the ilmio
     * @return the ilmio
     * @throws PortalException if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ilmio getIlmio(int ilmio_id) throws PortalException, SystemException {
        return ilmioPersistence.findByPrimaryKey(ilmio_id);
    }

    @Override
    public PersistedModel getPersistedModel(Serializable primaryKeyObj)
        throws PortalException, SystemException {
        return ilmioPersistence.findByPrimaryKey(primaryKeyObj);
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
    @Override
    public List<Ilmio> getIlmios(int start, int end) throws SystemException {
        return ilmioPersistence.findAll(start, end);
    }

    /**
     * Returns the number of ilmios.
     *
     * @return the number of ilmios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int getIlmiosCount() throws SystemException {
        return ilmioPersistence.countAll();
    }

    /**
     * Updates the ilmio in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
     *
     * @param ilmio the ilmio
     * @return the ilmio that was updated
     * @throws SystemException if a system exception occurred
     */
    @Indexable(type = IndexableType.REINDEX)
    @Override
    public Ilmio updateIlmio(Ilmio ilmio) throws SystemException {
        return ilmioPersistence.update(ilmio);
    }

    /**
     * Returns the aineisto local service.
     *
     * @return the aineisto local service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalService getAineistoLocalService() {
        return aineistoLocalService;
    }

    /**
     * Sets the aineisto local service.
     *
     * @param aineistoLocalService the aineisto local service
     */
    public void setAineistoLocalService(
        fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalService aineistoLocalService) {
        this.aineistoLocalService = aineistoLocalService;
    }

    /**
     * Returns the aineisto remote service.
     *
     * @return the aineisto remote service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.AineistoService getAineistoService() {
        return aineistoService;
    }

    /**
     * Sets the aineisto remote service.
     *
     * @param aineistoService the aineisto remote service
     */
    public void setAineistoService(
        fi.csc.avaa.kotus.kielikartastot.db.service.AineistoService aineistoService) {
        this.aineistoService = aineistoService;
    }

    /**
     * Returns the aineisto persistence.
     *
     * @return the aineisto persistence
     */
    public AineistoPersistence getAineistoPersistence() {
        return aineistoPersistence;
    }

    /**
     * Sets the aineisto persistence.
     *
     * @param aineistoPersistence the aineisto persistence
     */
    public void setAineistoPersistence(AineistoPersistence aineistoPersistence) {
        this.aineistoPersistence = aineistoPersistence;
    }

    /**
     * Returns the ilmio local service.
     *
     * @return the ilmio local service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalService getIlmioLocalService() {
        return ilmioLocalService;
    }

    /**
     * Sets the ilmio local service.
     *
     * @param ilmioLocalService the ilmio local service
     */
    public void setIlmioLocalService(
        fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalService ilmioLocalService) {
        this.ilmioLocalService = ilmioLocalService;
    }

    /**
     * Returns the ilmio remote service.
     *
     * @return the ilmio remote service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.IlmioService getIlmioService() {
        return ilmioService;
    }

    /**
     * Sets the ilmio remote service.
     *
     * @param ilmioService the ilmio remote service
     */
    public void setIlmioService(
        fi.csc.avaa.kotus.kielikartastot.db.service.IlmioService ilmioService) {
        this.ilmioService = ilmioService;
    }

    /**
     * Returns the ilmio persistence.
     *
     * @return the ilmio persistence
     */
    public IlmioPersistence getIlmioPersistence() {
        return ilmioPersistence;
    }

    /**
     * Sets the ilmio persistence.
     *
     * @param ilmioPersistence the ilmio persistence
     */
    public void setIlmioPersistence(IlmioPersistence ilmioPersistence) {
        this.ilmioPersistence = ilmioPersistence;
    }

    /**
     * Returns the ilmio finder.
     *
     * @return the ilmio finder
     */
    public IlmioFinder getIlmioFinder() {
        return ilmioFinder;
    }

    /**
     * Sets the ilmio finder.
     *
     * @param ilmioFinder the ilmio finder
     */
    public void setIlmioFinder(IlmioFinder ilmioFinder) {
        this.ilmioFinder = ilmioFinder;
    }

    /**
     * Returns the lajikoodi local service.
     *
     * @return the lajikoodi local service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiLocalService getLajikoodiLocalService() {
        return lajikoodiLocalService;
    }

    /**
     * Sets the lajikoodi local service.
     *
     * @param lajikoodiLocalService the lajikoodi local service
     */
    public void setLajikoodiLocalService(
        fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiLocalService lajikoodiLocalService) {
        this.lajikoodiLocalService = lajikoodiLocalService;
    }

    /**
     * Returns the lajikoodi remote service.
     *
     * @return the lajikoodi remote service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiService getLajikoodiService() {
        return lajikoodiService;
    }

    /**
     * Sets the lajikoodi remote service.
     *
     * @param lajikoodiService the lajikoodi remote service
     */
    public void setLajikoodiService(
        fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiService lajikoodiService) {
        this.lajikoodiService = lajikoodiService;
    }

    /**
     * Returns the lajikoodi persistence.
     *
     * @return the lajikoodi persistence
     */
    public LajikoodiPersistence getLajikoodiPersistence() {
        return lajikoodiPersistence;
    }

    /**
     * Sets the lajikoodi persistence.
     *
     * @param lajikoodiPersistence the lajikoodi persistence
     */
    public void setLajikoodiPersistence(
        LajikoodiPersistence lajikoodiPersistence) {
        this.lajikoodiPersistence = lajikoodiPersistence;
    }

    /**
     * Returns the levikki local service.
     *
     * @return the levikki local service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalService getLevikkiLocalService() {
        return levikkiLocalService;
    }

    /**
     * Sets the levikki local service.
     *
     * @param levikkiLocalService the levikki local service
     */
    public void setLevikkiLocalService(
        fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalService levikkiLocalService) {
        this.levikkiLocalService = levikkiLocalService;
    }

    /**
     * Returns the levikki remote service.
     *
     * @return the levikki remote service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiService getLevikkiService() {
        return levikkiService;
    }

    /**
     * Sets the levikki remote service.
     *
     * @param levikkiService the levikki remote service
     */
    public void setLevikkiService(
        fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiService levikkiService) {
        this.levikkiService = levikkiService;
    }

    /**
     * Returns the levikki persistence.
     *
     * @return the levikki persistence
     */
    public LevikkiPersistence getLevikkiPersistence() {
        return levikkiPersistence;
    }

    /**
     * Sets the levikki persistence.
     *
     * @param levikkiPersistence the levikki persistence
     */
    public void setLevikkiPersistence(LevikkiPersistence levikkiPersistence) {
        this.levikkiPersistence = levikkiPersistence;
    }

    /**
     * Returns the paikka local service.
     *
     * @return the paikka local service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalService getPaikkaLocalService() {
        return paikkaLocalService;
    }

    /**
     * Sets the paikka local service.
     *
     * @param paikkaLocalService the paikka local service
     */
    public void setPaikkaLocalService(
        fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalService paikkaLocalService) {
        this.paikkaLocalService = paikkaLocalService;
    }

    /**
     * Returns the paikka remote service.
     *
     * @return the paikka remote service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaService getPaikkaService() {
        return paikkaService;
    }

    /**
     * Sets the paikka remote service.
     *
     * @param paikkaService the paikka remote service
     */
    public void setPaikkaService(
        fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaService paikkaService) {
        this.paikkaService = paikkaService;
    }

    /**
     * Returns the paikka persistence.
     *
     * @return the paikka persistence
     */
    public PaikkaPersistence getPaikkaPersistence() {
        return paikkaPersistence;
    }

    /**
     * Sets the paikka persistence.
     *
     * @param paikkaPersistence the paikka persistence
     */
    public void setPaikkaPersistence(PaikkaPersistence paikkaPersistence) {
        this.paikkaPersistence = paikkaPersistence;
    }

    /**
     * Returns the paikka finder.
     *
     * @return the paikka finder
     */
    public PaikkaFinder getPaikkaFinder() {
        return paikkaFinder;
    }

    /**
     * Sets the paikka finder.
     *
     * @param paikkaFinder the paikka finder
     */
    public void setPaikkaFinder(PaikkaFinder paikkaFinder) {
        this.paikkaFinder = paikkaFinder;
    }

    /**
     * Returns the ryhma local service.
     *
     * @return the ryhma local service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalService getRyhmaLocalService() {
        return ryhmaLocalService;
    }

    /**
     * Sets the ryhma local service.
     *
     * @param ryhmaLocalService the ryhma local service
     */
    public void setRyhmaLocalService(
        fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalService ryhmaLocalService) {
        this.ryhmaLocalService = ryhmaLocalService;
    }

    /**
     * Returns the ryhma remote service.
     *
     * @return the ryhma remote service
     */
    public fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaService getRyhmaService() {
        return ryhmaService;
    }

    /**
     * Sets the ryhma remote service.
     *
     * @param ryhmaService the ryhma remote service
     */
    public void setRyhmaService(
        fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaService ryhmaService) {
        this.ryhmaService = ryhmaService;
    }

    /**
     * Returns the ryhma persistence.
     *
     * @return the ryhma persistence
     */
    public RyhmaPersistence getRyhmaPersistence() {
        return ryhmaPersistence;
    }

    /**
     * Sets the ryhma persistence.
     *
     * @param ryhmaPersistence the ryhma persistence
     */
    public void setRyhmaPersistence(RyhmaPersistence ryhmaPersistence) {
        this.ryhmaPersistence = ryhmaPersistence;
    }

    /**
     * Returns the ryhma finder.
     *
     * @return the ryhma finder
     */
    public RyhmaFinder getRyhmaFinder() {
        return ryhmaFinder;
    }

    /**
     * Sets the ryhma finder.
     *
     * @param ryhmaFinder the ryhma finder
     */
    public void setRyhmaFinder(RyhmaFinder ryhmaFinder) {
        this.ryhmaFinder = ryhmaFinder;
    }

    /**
     * Returns the counter local service.
     *
     * @return the counter local service
     */
    public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
        return counterLocalService;
    }

    /**
     * Sets the counter local service.
     *
     * @param counterLocalService the counter local service
     */
    public void setCounterLocalService(
        com.liferay.counter.service.CounterLocalService counterLocalService) {
        this.counterLocalService = counterLocalService;
    }

    /**
     * Returns the resource local service.
     *
     * @return the resource local service
     */
    public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
        return resourceLocalService;
    }

    /**
     * Sets the resource local service.
     *
     * @param resourceLocalService the resource local service
     */
    public void setResourceLocalService(
        com.liferay.portal.service.ResourceLocalService resourceLocalService) {
        this.resourceLocalService = resourceLocalService;
    }

    /**
     * Returns the user local service.
     *
     * @return the user local service
     */
    public com.liferay.portal.service.UserLocalService getUserLocalService() {
        return userLocalService;
    }

    /**
     * Sets the user local service.
     *
     * @param userLocalService the user local service
     */
    public void setUserLocalService(
        com.liferay.portal.service.UserLocalService userLocalService) {
        this.userLocalService = userLocalService;
    }

    /**
     * Returns the user remote service.
     *
     * @return the user remote service
     */
    public com.liferay.portal.service.UserService getUserService() {
        return userService;
    }

    /**
     * Sets the user remote service.
     *
     * @param userService the user remote service
     */
    public void setUserService(
        com.liferay.portal.service.UserService userService) {
        this.userService = userService;
    }

    /**
     * Returns the user persistence.
     *
     * @return the user persistence
     */
    public UserPersistence getUserPersistence() {
        return userPersistence;
    }

    /**
     * Sets the user persistence.
     *
     * @param userPersistence the user persistence
     */
    public void setUserPersistence(UserPersistence userPersistence) {
        this.userPersistence = userPersistence;
    }

    public void afterPropertiesSet() {
        Class<?> clazz = getClass();

        _classLoader = clazz.getClassLoader();

        PersistedModelLocalServiceRegistryUtil.register("fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio",
            ilmioLocalService);
    }

    public void destroy() {
        PersistedModelLocalServiceRegistryUtil.unregister(
            "fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio");
    }

    /**
     * Returns the Spring bean ID for this bean.
     *
     * @return the Spring bean ID for this bean
     */
    @Override
    public String getBeanIdentifier() {
        return _beanIdentifier;
    }

    /**
     * Sets the Spring bean ID for this bean.
     *
     * @param beanIdentifier the Spring bean ID for this bean
     */
    @Override
    public void setBeanIdentifier(String beanIdentifier) {
        _beanIdentifier = beanIdentifier;
    }

    @Override
    public Object invokeMethod(String name, String[] parameterTypes,
        Object[] arguments) throws Throwable {
        Thread currentThread = Thread.currentThread();

        ClassLoader contextClassLoader = currentThread.getContextClassLoader();

        if (contextClassLoader != _classLoader) {
            currentThread.setContextClassLoader(_classLoader);
        }

        try {
            return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
        } finally {
            if (contextClassLoader != _classLoader) {
                currentThread.setContextClassLoader(contextClassLoader);
            }
        }
    }

    protected Class<?> getModelClass() {
        return Ilmio.class;
    }

    protected String getModelClassName() {
        return Ilmio.class.getName();
    }

    /**
     * Performs an SQL query.
     *
     * @param sql the sql query
     */
    protected void runSQL(String sql) throws SystemException {
        try {
            DataSource dataSource = ilmioPersistence.getDataSource();

            SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
                    sql, new int[0]);

            sqlUpdate.update();
        } catch (Exception e) {
            throw new SystemException(e);
        }
    }
}
