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

import fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException;
import fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.LajikoodiImpl;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.LajikoodiModelImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.LajikoodiPersistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the lajikoodi service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see LajikoodiPersistence
 * @see LajikoodiUtil
 * @generated
 */
public class LajikoodiPersistenceImpl extends BasePersistenceImpl<Lajikoodi>
    implements LajikoodiPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LajikoodiUtil} to access the lajikoodi persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LajikoodiImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
            LajikoodiModelImpl.FINDER_CACHE_ENABLED, LajikoodiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
            LajikoodiModelImpl.FINDER_CACHE_ENABLED, LajikoodiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
            LajikoodiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LAJIKOODI = "SELECT lajikoodi FROM Lajikoodi lajikoodi";
    private static final String _SQL_COUNT_LAJIKOODI = "SELECT COUNT(lajikoodi) FROM Lajikoodi lajikoodi";
    private static final String _ORDER_BY_ENTITY_ALIAS = "lajikoodi.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Lajikoodi exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LajikoodiPersistenceImpl.class);
    private static Lajikoodi _nullLajikoodi = new LajikoodiImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Lajikoodi> toCacheModel() {
                return _nullLajikoodiCacheModel;
            }
        };

    private static CacheModel<Lajikoodi> _nullLajikoodiCacheModel = new CacheModel<Lajikoodi>() {
            @Override
            public Lajikoodi toEntityModel() {
                return _nullLajikoodi;
            }
        };

    public LajikoodiPersistenceImpl() {
        setModelClass(Lajikoodi.class);
    }

    /**
     * Caches the lajikoodi in the entity cache if it is enabled.
     *
     * @param lajikoodi the lajikoodi
     */
    @Override
    public void cacheResult(Lajikoodi lajikoodi) {
        EntityCacheUtil.putResult(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
            LajikoodiImpl.class, lajikoodi.getPrimaryKey(), lajikoodi);

        lajikoodi.resetOriginalValues();
    }

    /**
     * Caches the lajikoodis in the entity cache if it is enabled.
     *
     * @param lajikoodis the lajikoodis
     */
    @Override
    public void cacheResult(List<Lajikoodi> lajikoodis) {
        for (Lajikoodi lajikoodi : lajikoodis) {
            if (EntityCacheUtil.getResult(
                        LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
                        LajikoodiImpl.class, lajikoodi.getPrimaryKey()) == null) {
                cacheResult(lajikoodi);
            } else {
                lajikoodi.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all lajikoodis.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LajikoodiImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LajikoodiImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the lajikoodi.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Lajikoodi lajikoodi) {
        EntityCacheUtil.removeResult(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
            LajikoodiImpl.class, lajikoodi.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Lajikoodi> lajikoodis) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Lajikoodi lajikoodi : lajikoodis) {
            EntityCacheUtil.removeResult(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
                LajikoodiImpl.class, lajikoodi.getPrimaryKey());
        }
    }

    /**
     * Creates a new lajikoodi with the primary key. Does not add the lajikoodi to the database.
     *
     * @param lajikoodi_id the primary key for the new lajikoodi
     * @return the new lajikoodi
     */
    @Override
    public Lajikoodi create(int lajikoodi_id) {
        Lajikoodi lajikoodi = new LajikoodiImpl();

        lajikoodi.setNew(true);
        lajikoodi.setPrimaryKey(lajikoodi_id);

        return lajikoodi;
    }

    /**
     * Removes the lajikoodi with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param lajikoodi_id the primary key of the lajikoodi
     * @return the lajikoodi that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Lajikoodi remove(int lajikoodi_id)
        throws NoSuchLajikoodiException, SystemException {
        return remove((Serializable) lajikoodi_id);
    }

    /**
     * Removes the lajikoodi with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the lajikoodi
     * @return the lajikoodi that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Lajikoodi remove(Serializable primaryKey)
        throws NoSuchLajikoodiException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Lajikoodi lajikoodi = (Lajikoodi) session.get(LajikoodiImpl.class,
                    primaryKey);

            if (lajikoodi == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLajikoodiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(lajikoodi);
        } catch (NoSuchLajikoodiException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Lajikoodi removeImpl(Lajikoodi lajikoodi)
        throws SystemException {
        lajikoodi = toUnwrappedModel(lajikoodi);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(lajikoodi)) {
                lajikoodi = (Lajikoodi) session.get(LajikoodiImpl.class,
                        lajikoodi.getPrimaryKeyObj());
            }

            if (lajikoodi != null) {
                session.delete(lajikoodi);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (lajikoodi != null) {
            clearCache(lajikoodi);
        }

        return lajikoodi;
    }

    @Override
    public Lajikoodi updateImpl(fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi lajikoodi)
        throws SystemException {
        lajikoodi = toUnwrappedModel(lajikoodi);

        boolean isNew = lajikoodi.isNew();

        Session session = null;

        try {
            session = openSession();

            if (lajikoodi.isNew()) {
                session.save(lajikoodi);

                lajikoodi.setNew(false);
            } else {
                session.merge(lajikoodi);
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

        EntityCacheUtil.putResult(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
            LajikoodiImpl.class, lajikoodi.getPrimaryKey(), lajikoodi);

        return lajikoodi;
    }

    protected Lajikoodi toUnwrappedModel(Lajikoodi lajikoodi) {
        if (lajikoodi instanceof LajikoodiImpl) {
            return lajikoodi;
        }

        LajikoodiImpl lajikoodiImpl = new LajikoodiImpl();

        lajikoodiImpl.setNew(lajikoodi.isNew());
        lajikoodiImpl.setPrimaryKey(lajikoodi.getPrimaryKey());

        lajikoodiImpl.setLajikoodi_id(lajikoodi.getLajikoodi_id());
        lajikoodiImpl.setLajikoodi(lajikoodi.getLajikoodi());
        lajikoodiImpl.setLaji(lajikoodi.getLaji());
        lajikoodiImpl.setAineistot(lajikoodi.getAineistot());
        lajikoodiImpl.setViite(lajikoodi.getViite());
        lajikoodiImpl.setTuotu_kantaan(lajikoodi.getTuotu_kantaan());
        lajikoodiImpl.setMuutettu(lajikoodi.getMuutettu());
        lajikoodiImpl.setMuuttaja(lajikoodi.getMuuttaja());
        lajikoodiImpl.setPoistettu(lajikoodi.getPoistettu());

        return lajikoodiImpl;
    }

    /**
     * Returns the lajikoodi with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the lajikoodi
     * @return the lajikoodi
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Lajikoodi findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLajikoodiException, SystemException {
        Lajikoodi lajikoodi = fetchByPrimaryKey(primaryKey);

        if (lajikoodi == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLajikoodiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return lajikoodi;
    }

    /**
     * Returns the lajikoodi with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException} if it could not be found.
     *
     * @param lajikoodi_id the primary key of the lajikoodi
     * @return the lajikoodi
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException if a lajikoodi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Lajikoodi findByPrimaryKey(int lajikoodi_id)
        throws NoSuchLajikoodiException, SystemException {
        return findByPrimaryKey((Serializable) lajikoodi_id);
    }

    /**
     * Returns the lajikoodi with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the lajikoodi
     * @return the lajikoodi, or <code>null</code> if a lajikoodi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Lajikoodi fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Lajikoodi lajikoodi = (Lajikoodi) EntityCacheUtil.getResult(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
                LajikoodiImpl.class, primaryKey);

        if (lajikoodi == _nullLajikoodi) {
            return null;
        }

        if (lajikoodi == null) {
            Session session = null;

            try {
                session = openSession();

                lajikoodi = (Lajikoodi) session.get(LajikoodiImpl.class,
                        primaryKey);

                if (lajikoodi != null) {
                    cacheResult(lajikoodi);
                } else {
                    EntityCacheUtil.putResult(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
                        LajikoodiImpl.class, primaryKey, _nullLajikoodi);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LajikoodiModelImpl.ENTITY_CACHE_ENABLED,
                    LajikoodiImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return lajikoodi;
    }

    /**
     * Returns the lajikoodi with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param lajikoodi_id the primary key of the lajikoodi
     * @return the lajikoodi, or <code>null</code> if a lajikoodi with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Lajikoodi fetchByPrimaryKey(int lajikoodi_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) lajikoodi_id);
    }

    /**
     * Returns all the lajikoodis.
     *
     * @return the lajikoodis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Lajikoodi> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Lajikoodi> findAll(int start, int end)
        throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Lajikoodi> findAll(int start, int end,
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

        List<Lajikoodi> list = (List<Lajikoodi>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LAJIKOODI);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LAJIKOODI;

                if (pagination) {
                    sql = sql.concat(LajikoodiModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Lajikoodi>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Lajikoodi>(list);
                } else {
                    list = (List<Lajikoodi>) QueryUtil.list(q, getDialect(),
                            start, end);
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
     * Removes all the lajikoodis from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Lajikoodi lajikoodi : findAll()) {
            remove(lajikoodi);
        }
    }

    /**
     * Returns the number of lajikoodis.
     *
     * @return the number of lajikoodis
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

                Query q = session.createQuery(_SQL_COUNT_LAJIKOODI);

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
     * Initializes the lajikoodi persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.kotus.kielikartastot.db.model.Lajikoodi")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Lajikoodi>> listenersList = new ArrayList<ModelListener<Lajikoodi>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Lajikoodi>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LajikoodiImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
