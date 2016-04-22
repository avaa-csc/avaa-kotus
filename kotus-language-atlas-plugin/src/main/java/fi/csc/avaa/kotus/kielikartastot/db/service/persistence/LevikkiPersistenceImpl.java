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

import fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException;
import fi.csc.avaa.kotus.kielikartastot.db.model.Levikki;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.LevikkiImpl;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.LevikkiModelImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.LevikkiPersistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the levikki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see LevikkiPersistence
 * @see LevikkiUtil
 * @generated
 */
public class LevikkiPersistenceImpl extends BasePersistenceImpl<Levikki>
    implements LevikkiPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link LevikkiUtil} to access the levikki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = LevikkiImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
            LevikkiModelImpl.FINDER_CACHE_ENABLED, LevikkiImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
            LevikkiModelImpl.FINDER_CACHE_ENABLED, LevikkiImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
            LevikkiModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_LEVIKKI = "SELECT levikki FROM Levikki levikki";
    private static final String _SQL_COUNT_LEVIKKI = "SELECT COUNT(levikki) FROM Levikki levikki";
    private static final String _ORDER_BY_ENTITY_ALIAS = "levikki.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Levikki exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(LevikkiPersistenceImpl.class);
    private static Levikki _nullLevikki = new LevikkiImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Levikki> toCacheModel() {
                return _nullLevikkiCacheModel;
            }
        };

    private static CacheModel<Levikki> _nullLevikkiCacheModel = new CacheModel<Levikki>() {
            @Override
            public Levikki toEntityModel() {
                return _nullLevikki;
            }
        };

    public LevikkiPersistenceImpl() {
        setModelClass(Levikki.class);
    }

    /**
     * Caches the levikki in the entity cache if it is enabled.
     *
     * @param levikki the levikki
     */
    @Override
    public void cacheResult(Levikki levikki) {
        EntityCacheUtil.putResult(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
            LevikkiImpl.class, levikki.getPrimaryKey(), levikki);

        levikki.resetOriginalValues();
    }

    /**
     * Caches the levikkis in the entity cache if it is enabled.
     *
     * @param levikkis the levikkis
     */
    @Override
    public void cacheResult(List<Levikki> levikkis) {
        for (Levikki levikki : levikkis) {
            if (EntityCacheUtil.getResult(
                        LevikkiModelImpl.ENTITY_CACHE_ENABLED,
                        LevikkiImpl.class, levikki.getPrimaryKey()) == null) {
                cacheResult(levikki);
            } else {
                levikki.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all levikkis.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(LevikkiImpl.class.getName());
        }

        EntityCacheUtil.clearCache(LevikkiImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the levikki.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Levikki levikki) {
        EntityCacheUtil.removeResult(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
            LevikkiImpl.class, levikki.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Levikki> levikkis) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Levikki levikki : levikkis) {
            EntityCacheUtil.removeResult(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
                LevikkiImpl.class, levikki.getPrimaryKey());
        }
    }

    /**
     * Creates a new levikki with the primary key. Does not add the levikki to the database.
     *
     * @param levikki_id the primary key for the new levikki
     * @return the new levikki
     */
    @Override
    public Levikki create(int levikki_id) {
        Levikki levikki = new LevikkiImpl();

        levikki.setNew(true);
        levikki.setPrimaryKey(levikki_id);

        return levikki;
    }

    /**
     * Removes the levikki with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param levikki_id the primary key of the levikki
     * @return the levikki that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Levikki remove(int levikki_id)
        throws NoSuchLevikkiException, SystemException {
        return remove((Serializable) levikki_id);
    }

    /**
     * Removes the levikki with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the levikki
     * @return the levikki that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Levikki remove(Serializable primaryKey)
        throws NoSuchLevikkiException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Levikki levikki = (Levikki) session.get(LevikkiImpl.class,
                    primaryKey);

            if (levikki == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchLevikkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(levikki);
        } catch (NoSuchLevikkiException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Levikki removeImpl(Levikki levikki) throws SystemException {
        levikki = toUnwrappedModel(levikki);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(levikki)) {
                levikki = (Levikki) session.get(LevikkiImpl.class,
                        levikki.getPrimaryKeyObj());
            }

            if (levikki != null) {
                session.delete(levikki);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (levikki != null) {
            clearCache(levikki);
        }

        return levikki;
    }

    @Override
    public Levikki updateImpl(fi.csc.avaa.kotus.kielikartastot.db.model.Levikki levikki)
        throws SystemException {
        levikki = toUnwrappedModel(levikki);

        boolean isNew = levikki.isNew();

        Session session = null;

        try {
            session = openSession();

            if (levikki.isNew()) {
                session.save(levikki);

                levikki.setNew(false);
            } else {
                session.merge(levikki);
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

        EntityCacheUtil.putResult(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
            LevikkiImpl.class, levikki.getPrimaryKey(), levikki);

        return levikki;
    }

    protected Levikki toUnwrappedModel(Levikki levikki) {
        if (levikki instanceof LevikkiImpl) {
            return levikki;
        }

        LevikkiImpl levikkiImpl = new LevikkiImpl();

        levikkiImpl.setNew(levikki.isNew());
        levikkiImpl.setPrimaryKey(levikki.getPrimaryKey());

        levikkiImpl.setLevikki_id(levikki.getLevikki_id());
        levikkiImpl.setIlmio_id(levikki.getIlmio_id());
        levikkiImpl.setPaikka_id(levikki.getPaikka_id());
        levikkiImpl.setPaikka_tunniste(levikki.getPaikka_tunniste());
        levikkiImpl.setIlmio_tunnus(levikki.getIlmio_tunnus());
        levikkiImpl.setUusi(levikki.getUusi());

        return levikkiImpl;
    }

    /**
     * Returns the levikki with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the levikki
     * @return the levikki
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Levikki findByPrimaryKey(Serializable primaryKey)
        throws NoSuchLevikkiException, SystemException {
        Levikki levikki = fetchByPrimaryKey(primaryKey);

        if (levikki == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchLevikkiException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return levikki;
    }

    /**
     * Returns the levikki with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException} if it could not be found.
     *
     * @param levikki_id the primary key of the levikki
     * @return the levikki
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException if a levikki with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Levikki findByPrimaryKey(int levikki_id)
        throws NoSuchLevikkiException, SystemException {
        return findByPrimaryKey((Serializable) levikki_id);
    }

    /**
     * Returns the levikki with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the levikki
     * @return the levikki, or <code>null</code> if a levikki with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Levikki fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Levikki levikki = (Levikki) EntityCacheUtil.getResult(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
                LevikkiImpl.class, primaryKey);

        if (levikki == _nullLevikki) {
            return null;
        }

        if (levikki == null) {
            Session session = null;

            try {
                session = openSession();

                levikki = (Levikki) session.get(LevikkiImpl.class, primaryKey);

                if (levikki != null) {
                    cacheResult(levikki);
                } else {
                    EntityCacheUtil.putResult(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
                        LevikkiImpl.class, primaryKey, _nullLevikki);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(LevikkiModelImpl.ENTITY_CACHE_ENABLED,
                    LevikkiImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return levikki;
    }

    /**
     * Returns the levikki with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param levikki_id the primary key of the levikki
     * @return the levikki, or <code>null</code> if a levikki with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Levikki fetchByPrimaryKey(int levikki_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) levikki_id);
    }

    /**
     * Returns all the levikkis.
     *
     * @return the levikkis
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Levikki> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Levikki> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Levikki> findAll(int start, int end,
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

        List<Levikki> list = (List<Levikki>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_LEVIKKI);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_LEVIKKI;

                if (pagination) {
                    sql = sql.concat(LevikkiModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Levikki>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Levikki>(list);
                } else {
                    list = (List<Levikki>) QueryUtil.list(q, getDialect(),
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
     * Removes all the levikkis from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Levikki levikki : findAll()) {
            remove(levikki);
        }
    }

    /**
     * Returns the number of levikkis.
     *
     * @return the number of levikkis
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

                Query q = session.createQuery(_SQL_COUNT_LEVIKKI);

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
     * Initializes the levikki persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.kotus.kielikartastot.db.model.Levikki")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Levikki>> listenersList = new ArrayList<ModelListener<Levikki>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Levikki>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(LevikkiImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
