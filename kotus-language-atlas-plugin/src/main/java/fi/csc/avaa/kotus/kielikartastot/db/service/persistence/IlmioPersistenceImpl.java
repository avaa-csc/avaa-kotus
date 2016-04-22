package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioImpl;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioModelImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioPersistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the ilmio service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see IlmioPersistence
 * @see IlmioUtil
 * @generated
 */
public class IlmioPersistenceImpl extends BasePersistenceImpl<Ilmio>
    implements IlmioPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link IlmioUtil} to access the ilmio persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = IlmioImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(IlmioModelImpl.ENTITY_CACHE_ENABLED,
            IlmioModelImpl.FINDER_CACHE_ENABLED, IlmioImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(IlmioModelImpl.ENTITY_CACHE_ENABLED,
            IlmioModelImpl.FINDER_CACHE_ENABLED, IlmioImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(IlmioModelImpl.ENTITY_CACHE_ENABLED,
            IlmioModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_ILMIO = "SELECT ilmio FROM Ilmio ilmio";
    private static final String _SQL_COUNT_ILMIO = "SELECT COUNT(ilmio) FROM Ilmio ilmio";
    private static final String _ORDER_BY_ENTITY_ALIAS = "ilmio.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Ilmio exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(IlmioPersistenceImpl.class);
    private static Ilmio _nullIlmio = new IlmioImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Ilmio> toCacheModel() {
                return _nullIlmioCacheModel;
            }
        };

    private static CacheModel<Ilmio> _nullIlmioCacheModel = new CacheModel<Ilmio>() {
            @Override
            public Ilmio toEntityModel() {
                return _nullIlmio;
            }
        };

    public IlmioPersistenceImpl() {
        setModelClass(Ilmio.class);
    }

    /**
     * Caches the ilmio in the entity cache if it is enabled.
     *
     * @param ilmio the ilmio
     */
    @Override
    public void cacheResult(Ilmio ilmio) {
        EntityCacheUtil.putResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
            IlmioImpl.class, ilmio.getPrimaryKey(), ilmio);

        ilmio.resetOriginalValues();
    }

    /**
     * Caches the ilmios in the entity cache if it is enabled.
     *
     * @param ilmios the ilmios
     */
    @Override
    public void cacheResult(List<Ilmio> ilmios) {
        for (Ilmio ilmio : ilmios) {
            if (EntityCacheUtil.getResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
                        IlmioImpl.class, ilmio.getPrimaryKey()) == null) {
                cacheResult(ilmio);
            } else {
                ilmio.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all ilmios.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(IlmioImpl.class.getName());
        }

        EntityCacheUtil.clearCache(IlmioImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the ilmio.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Ilmio ilmio) {
        EntityCacheUtil.removeResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
            IlmioImpl.class, ilmio.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Ilmio> ilmios) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Ilmio ilmio : ilmios) {
            EntityCacheUtil.removeResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
                IlmioImpl.class, ilmio.getPrimaryKey());
        }
    }

    /**
     * Creates a new ilmio with the primary key. Does not add the ilmio to the database.
     *
     * @param ilmio_id the primary key for the new ilmio
     * @return the new ilmio
     */
    @Override
    public Ilmio create(int ilmio_id) {
        Ilmio ilmio = new IlmioImpl();

        ilmio.setNew(true);
        ilmio.setPrimaryKey(ilmio_id);

        return ilmio;
    }

    /**
     * Removes the ilmio with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param ilmio_id the primary key of the ilmio
     * @return the ilmio that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ilmio remove(int ilmio_id)
        throws NoSuchIlmioException, SystemException {
        return remove((Serializable) ilmio_id);
    }

    /**
     * Removes the ilmio with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the ilmio
     * @return the ilmio that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ilmio remove(Serializable primaryKey)
        throws NoSuchIlmioException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Ilmio ilmio = (Ilmio) session.get(IlmioImpl.class, primaryKey);

            if (ilmio == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchIlmioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(ilmio);
        } catch (NoSuchIlmioException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Ilmio removeImpl(Ilmio ilmio) throws SystemException {
        ilmio = toUnwrappedModel(ilmio);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(ilmio)) {
                ilmio = (Ilmio) session.get(IlmioImpl.class,
                        ilmio.getPrimaryKeyObj());
            }

            if (ilmio != null) {
                session.delete(ilmio);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (ilmio != null) {
            clearCache(ilmio);
        }

        return ilmio;
    }

    @Override
    public Ilmio updateImpl(fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio ilmio)
        throws SystemException {
        ilmio = toUnwrappedModel(ilmio);

        boolean isNew = ilmio.isNew();

        Session session = null;

        try {
            session = openSession();

            if (ilmio.isNew()) {
                session.save(ilmio);

                ilmio.setNew(false);
            } else {
                session.merge(ilmio);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

        if (isNew) {
            FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
        }

        EntityCacheUtil.putResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
            IlmioImpl.class, ilmio.getPrimaryKey(), ilmio);

        return ilmio;
    }

    protected Ilmio toUnwrappedModel(Ilmio ilmio) {
        if (ilmio instanceof IlmioImpl) {
            return ilmio;
        }

        IlmioImpl ilmioImpl = new IlmioImpl();

        ilmioImpl.setNew(ilmio.isNew());
        ilmioImpl.setPrimaryKey(ilmio.getPrimaryKey());

        ilmioImpl.setIlmio_id(ilmio.getIlmio_id());
        ilmioImpl.setAineisto_id(ilmio.getAineisto_id());
        ilmioImpl.setRyhma_id(ilmio.getRyhma_id());
        ilmioImpl.setLajikoodi_id(ilmio.getLajikoodi_id());
        ilmioImpl.setIlmio(ilmio.getIlmio());
        ilmioImpl.setTyyppi(ilmio.getTyyppi());
        ilmioImpl.setKieli_ISO639_3(ilmio.getKieli_ISO639_3());
        ilmioImpl.setMurre(ilmio.getMurre());
        ilmioImpl.setHavaintoaika(ilmio.getHavaintoaika());
        ilmioImpl.setKuvaus(ilmio.getKuvaus());
        ilmioImpl.setLisatieto(ilmio.getLisatieto());
        ilmioImpl.setTuotu_kantaan(ilmio.getTuotu_kantaan());
        ilmioImpl.setMuutettu(ilmio.getMuutettu());
        ilmioImpl.setMuuttaja(ilmio.getMuuttaja());
        ilmioImpl.setPoistettu(ilmio.getPoistettu());
        ilmioImpl.setTunnus(ilmio.getTunnus());
        ilmioImpl.setRyhma_tunnus(ilmio.getRyhma_tunnus());

        return ilmioImpl;
    }

    /**
     * Returns the ilmio with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the ilmio
     * @return the ilmio
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ilmio findByPrimaryKey(Serializable primaryKey)
        throws NoSuchIlmioException, SystemException {
        Ilmio ilmio = fetchByPrimaryKey(primaryKey);

        if (ilmio == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchIlmioException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return ilmio;
    }

    /**
     * Returns the ilmio with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException} if it could not be found.
     *
     * @param ilmio_id the primary key of the ilmio
     * @return the ilmio
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ilmio findByPrimaryKey(int ilmio_id)
        throws NoSuchIlmioException, SystemException {
        return findByPrimaryKey((Serializable) ilmio_id);
    }

    /**
     * Returns the ilmio with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the ilmio
     * @return the ilmio, or <code>null</code> if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ilmio fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Ilmio ilmio = (Ilmio) EntityCacheUtil.getResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
                IlmioImpl.class, primaryKey);

        if (ilmio == _nullIlmio) {
            return null;
        }

        if (ilmio == null) {
            Session session = null;

            try {
                session = openSession();

                ilmio = (Ilmio) session.get(IlmioImpl.class, primaryKey);

                if (ilmio != null) {
                    cacheResult(ilmio);
                } else {
                    EntityCacheUtil.putResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
                        IlmioImpl.class, primaryKey, _nullIlmio);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(IlmioModelImpl.ENTITY_CACHE_ENABLED,
                    IlmioImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return ilmio;
    }

    /**
     * Returns the ilmio with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param ilmio_id the primary key of the ilmio
     * @return the ilmio, or <code>null</code> if a ilmio with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ilmio fetchByPrimaryKey(int ilmio_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) ilmio_id);
    }

    /**
     * Returns all the ilmios.
     *
     * @return the ilmios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Ilmio> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
    public List<Ilmio> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
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
    @Override
    public List<Ilmio> findAll(int start, int end,
        OrderByComparator orderByComparator) throws SystemException {
        boolean pagination = true;
        FinderPath finderPath = null;
        Object[] finderArgs = null;

        if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
                (orderByComparator == null)) {
            pagination = false;
            finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
            finderArgs = FINDER_ARGS_EMPTY;
        } else {
            finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
            finderArgs = new Object[] { start, end, orderByComparator };
        }

        List<Ilmio> list = (List<Ilmio>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_ILMIO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_ILMIO;

                if (pagination) {
                    sql = sql.concat(IlmioModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Ilmio>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Ilmio>(list);
                } else {
                    list = (List<Ilmio>) QueryUtil.list(q, getDialect(), start,
                            end);
                }

                cacheResult(list);

                FinderCacheUtil.putResult(finderPath, finderArgs, list);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(finderPath, finderArgs);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return list;
    }

    /**
     * Removes all the ilmios from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Ilmio ilmio : findAll()) {
            remove(ilmio);
        }
    }

    /**
     * Returns the number of ilmios.
     *
     * @return the number of ilmios
     * @throws SystemException if a system exception occurred
     */
    @Override
    public int countAll() throws SystemException {
        Long count = (Long) FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
                FINDER_ARGS_EMPTY, this);

        if (count == null) {
            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(_SQL_COUNT_ILMIO);

                count = (Long) q.uniqueResult();

                FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY, count);
            } catch (Exception e) {
                FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
                    FINDER_ARGS_EMPTY);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return count.intValue();
    }

    /**
     * Initializes the ilmio persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Ilmio>> listenersList = new ArrayList<ModelListener<Ilmio>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Ilmio>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(IlmioImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
