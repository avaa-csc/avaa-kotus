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

import fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaImpl;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaModelImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaPersistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the ryhma service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see RyhmaPersistence
 * @see RyhmaUtil
 * @generated
 */
public class RyhmaPersistenceImpl extends BasePersistenceImpl<Ryhma>
    implements RyhmaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link RyhmaUtil} to access the ryhma persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = RyhmaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
            RyhmaModelImpl.FINDER_CACHE_ENABLED, RyhmaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
            RyhmaModelImpl.FINDER_CACHE_ENABLED, RyhmaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
            RyhmaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_RYHMA = "SELECT ryhma FROM Ryhma ryhma";
    private static final String _SQL_COUNT_RYHMA = "SELECT COUNT(ryhma) FROM Ryhma ryhma";
    private static final String _ORDER_BY_ENTITY_ALIAS = "ryhma.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Ryhma exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(RyhmaPersistenceImpl.class);
    private static Ryhma _nullRyhma = new RyhmaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Ryhma> toCacheModel() {
                return _nullRyhmaCacheModel;
            }
        };

    private static CacheModel<Ryhma> _nullRyhmaCacheModel = new CacheModel<Ryhma>() {
            @Override
            public Ryhma toEntityModel() {
                return _nullRyhma;
            }
        };

    public RyhmaPersistenceImpl() {
        setModelClass(Ryhma.class);
    }

    /**
     * Caches the ryhma in the entity cache if it is enabled.
     *
     * @param ryhma the ryhma
     */
    @Override
    public void cacheResult(Ryhma ryhma) {
        EntityCacheUtil.putResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
            RyhmaImpl.class, ryhma.getPrimaryKey(), ryhma);

        ryhma.resetOriginalValues();
    }

    /**
     * Caches the ryhmas in the entity cache if it is enabled.
     *
     * @param ryhmas the ryhmas
     */
    @Override
    public void cacheResult(List<Ryhma> ryhmas) {
        for (Ryhma ryhma : ryhmas) {
            if (EntityCacheUtil.getResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
                        RyhmaImpl.class, ryhma.getPrimaryKey()) == null) {
                cacheResult(ryhma);
            } else {
                ryhma.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all ryhmas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(RyhmaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(RyhmaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the ryhma.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Ryhma ryhma) {
        EntityCacheUtil.removeResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
            RyhmaImpl.class, ryhma.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Ryhma> ryhmas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Ryhma ryhma : ryhmas) {
            EntityCacheUtil.removeResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
                RyhmaImpl.class, ryhma.getPrimaryKey());
        }
    }

    /**
     * Creates a new ryhma with the primary key. Does not add the ryhma to the database.
     *
     * @param ryhma_id the primary key for the new ryhma
     * @return the new ryhma
     */
    @Override
    public Ryhma create(int ryhma_id) {
        Ryhma ryhma = new RyhmaImpl();

        ryhma.setNew(true);
        ryhma.setPrimaryKey(ryhma_id);

        return ryhma;
    }

    /**
     * Removes the ryhma with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param ryhma_id the primary key of the ryhma
     * @return the ryhma that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException if a ryhma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ryhma remove(int ryhma_id)
        throws NoSuchRyhmaException, SystemException {
        return remove((Serializable) ryhma_id);
    }

    /**
     * Removes the ryhma with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the ryhma
     * @return the ryhma that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException if a ryhma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ryhma remove(Serializable primaryKey)
        throws NoSuchRyhmaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Ryhma ryhma = (Ryhma) session.get(RyhmaImpl.class, primaryKey);

            if (ryhma == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchRyhmaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(ryhma);
        } catch (NoSuchRyhmaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Ryhma removeImpl(Ryhma ryhma) throws SystemException {
        ryhma = toUnwrappedModel(ryhma);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(ryhma)) {
                ryhma = (Ryhma) session.get(RyhmaImpl.class,
                        ryhma.getPrimaryKeyObj());
            }

            if (ryhma != null) {
                session.delete(ryhma);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (ryhma != null) {
            clearCache(ryhma);
        }

        return ryhma;
    }

    @Override
    public Ryhma updateImpl(fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma ryhma)
        throws SystemException {
        ryhma = toUnwrappedModel(ryhma);

        boolean isNew = ryhma.isNew();

        Session session = null;

        try {
            session = openSession();

            if (ryhma.isNew()) {
                session.save(ryhma);

                ryhma.setNew(false);
            } else {
                session.merge(ryhma);
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

        EntityCacheUtil.putResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
            RyhmaImpl.class, ryhma.getPrimaryKey(), ryhma);

        return ryhma;
    }

    protected Ryhma toUnwrappedModel(Ryhma ryhma) {
        if (ryhma instanceof RyhmaImpl) {
            return ryhma;
        }

        RyhmaImpl ryhmaImpl = new RyhmaImpl();

        ryhmaImpl.setNew(ryhma.isNew());
        ryhmaImpl.setPrimaryKey(ryhma.getPrimaryKey());

        ryhmaImpl.setRyhma_id(ryhma.getRyhma_id());
        ryhmaImpl.setAineisto_id(ryhma.getAineisto_id());
        ryhmaImpl.setNimi(ryhma.getNimi());
        ryhmaImpl.setTyyppi(ryhma.getTyyppi());
        ryhmaImpl.setYlaryhma(ryhma.getYlaryhma());
        ryhmaImpl.setSelite(ryhma.getSelite());
        ryhmaImpl.setKartta_kuva_linkki(ryhma.getKartta_kuva_linkki());
        ryhmaImpl.setTuotu_kantaan(ryhma.getTuotu_kantaan());
        ryhmaImpl.setMuutettu(ryhma.getMuutettu());
        ryhmaImpl.setMuuttaja(ryhma.getMuuttaja());
        ryhmaImpl.setPoistettu(ryhma.getPoistettu());
        ryhmaImpl.setTmp(ryhma.getTmp());
        ryhmaImpl.setTunnus(ryhma.getTunnus());

        return ryhmaImpl;
    }

    /**
     * Returns the ryhma with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the ryhma
     * @return the ryhma
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException if a ryhma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ryhma findByPrimaryKey(Serializable primaryKey)
        throws NoSuchRyhmaException, SystemException {
        Ryhma ryhma = fetchByPrimaryKey(primaryKey);

        if (ryhma == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchRyhmaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return ryhma;
    }

    /**
     * Returns the ryhma with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException} if it could not be found.
     *
     * @param ryhma_id the primary key of the ryhma
     * @return the ryhma
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException if a ryhma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ryhma findByPrimaryKey(int ryhma_id)
        throws NoSuchRyhmaException, SystemException {
        return findByPrimaryKey((Serializable) ryhma_id);
    }

    /**
     * Returns the ryhma with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the ryhma
     * @return the ryhma, or <code>null</code> if a ryhma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ryhma fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Ryhma ryhma = (Ryhma) EntityCacheUtil.getResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
                RyhmaImpl.class, primaryKey);

        if (ryhma == _nullRyhma) {
            return null;
        }

        if (ryhma == null) {
            Session session = null;

            try {
                session = openSession();

                ryhma = (Ryhma) session.get(RyhmaImpl.class, primaryKey);

                if (ryhma != null) {
                    cacheResult(ryhma);
                } else {
                    EntityCacheUtil.putResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
                        RyhmaImpl.class, primaryKey, _nullRyhma);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(RyhmaModelImpl.ENTITY_CACHE_ENABLED,
                    RyhmaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return ryhma;
    }

    /**
     * Returns the ryhma with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param ryhma_id the primary key of the ryhma
     * @return the ryhma, or <code>null</code> if a ryhma with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Ryhma fetchByPrimaryKey(int ryhma_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) ryhma_id);
    }

    /**
     * Returns all the ryhmas.
     *
     * @return the ryhmas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Ryhma> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

    /**
     * Returns a range of all the ryhmas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of ryhmas
     * @param end the upper bound of the range of ryhmas (not inclusive)
     * @return the range of ryhmas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Ryhma> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

    /**
     * Returns an ordered range of all the ryhmas.
     *
     * <p>
     * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
     * </p>
     *
     * @param start the lower bound of the range of ryhmas
     * @param end the upper bound of the range of ryhmas (not inclusive)
     * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
     * @return the ordered range of ryhmas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Ryhma> findAll(int start, int end,
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

        List<Ryhma> list = (List<Ryhma>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_RYHMA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_RYHMA;

                if (pagination) {
                    sql = sql.concat(RyhmaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Ryhma>) QueryUtil.list(q, getDialect(), start,
                            end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Ryhma>(list);
                } else {
                    list = (List<Ryhma>) QueryUtil.list(q, getDialect(), start,
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
     * Removes all the ryhmas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Ryhma ryhma : findAll()) {
            remove(ryhma);
        }
    }

    /**
     * Returns the number of ryhmas.
     *
     * @return the number of ryhmas
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

                Query q = session.createQuery(_SQL_COUNT_RYHMA);

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
     * Initializes the ryhma persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Ryhma>> listenersList = new ArrayList<ModelListener<Ryhma>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Ryhma>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(RyhmaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
