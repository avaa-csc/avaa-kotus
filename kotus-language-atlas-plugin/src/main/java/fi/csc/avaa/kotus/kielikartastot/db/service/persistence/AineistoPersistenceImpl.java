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

import fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException;
import fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.AineistoImpl;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.AineistoModelImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.AineistoPersistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the aineisto service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see AineistoPersistence
 * @see AineistoUtil
 * @generated
 */
public class AineistoPersistenceImpl extends BasePersistenceImpl<Aineisto>
    implements AineistoPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link AineistoUtil} to access the aineisto persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = AineistoImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(AineistoModelImpl.ENTITY_CACHE_ENABLED,
            AineistoModelImpl.FINDER_CACHE_ENABLED, AineistoImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(AineistoModelImpl.ENTITY_CACHE_ENABLED,
            AineistoModelImpl.FINDER_CACHE_ENABLED, AineistoImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(AineistoModelImpl.ENTITY_CACHE_ENABLED,
            AineistoModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_AINEISTO = "SELECT aineisto FROM Aineisto aineisto";
    private static final String _SQL_COUNT_AINEISTO = "SELECT COUNT(aineisto) FROM Aineisto aineisto";
    private static final String _ORDER_BY_ENTITY_ALIAS = "aineisto.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Aineisto exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(AineistoPersistenceImpl.class);
    private static Aineisto _nullAineisto = new AineistoImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Aineisto> toCacheModel() {
                return _nullAineistoCacheModel;
            }
        };

    private static CacheModel<Aineisto> _nullAineistoCacheModel = new CacheModel<Aineisto>() {
            @Override
            public Aineisto toEntityModel() {
                return _nullAineisto;
            }
        };

    public AineistoPersistenceImpl() {
        setModelClass(Aineisto.class);
    }

    /**
     * Caches the aineisto in the entity cache if it is enabled.
     *
     * @param aineisto the aineisto
     */
    @Override
    public void cacheResult(Aineisto aineisto) {
        EntityCacheUtil.putResult(AineistoModelImpl.ENTITY_CACHE_ENABLED,
            AineistoImpl.class, aineisto.getPrimaryKey(), aineisto);

        aineisto.resetOriginalValues();
    }

    /**
     * Caches the aineistos in the entity cache if it is enabled.
     *
     * @param aineistos the aineistos
     */
    @Override
    public void cacheResult(List<Aineisto> aineistos) {
        for (Aineisto aineisto : aineistos) {
            if (EntityCacheUtil.getResult(
                        AineistoModelImpl.ENTITY_CACHE_ENABLED,
                        AineistoImpl.class, aineisto.getPrimaryKey()) == null) {
                cacheResult(aineisto);
            } else {
                aineisto.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all aineistos.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(AineistoImpl.class.getName());
        }

        EntityCacheUtil.clearCache(AineistoImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the aineisto.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Aineisto aineisto) {
        EntityCacheUtil.removeResult(AineistoModelImpl.ENTITY_CACHE_ENABLED,
            AineistoImpl.class, aineisto.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Aineisto> aineistos) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Aineisto aineisto : aineistos) {
            EntityCacheUtil.removeResult(AineistoModelImpl.ENTITY_CACHE_ENABLED,
                AineistoImpl.class, aineisto.getPrimaryKey());
        }
    }

    /**
     * Creates a new aineisto with the primary key. Does not add the aineisto to the database.
     *
     * @param aineisto_id the primary key for the new aineisto
     * @return the new aineisto
     */
    @Override
    public Aineisto create(int aineisto_id) {
        Aineisto aineisto = new AineistoImpl();

        aineisto.setNew(true);
        aineisto.setPrimaryKey(aineisto_id);

        return aineisto;
    }

    /**
     * Removes the aineisto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param aineisto_id the primary key of the aineisto
     * @return the aineisto that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Aineisto remove(int aineisto_id)
        throws NoSuchAineistoException, SystemException {
        return remove((Serializable) aineisto_id);
    }

    /**
     * Removes the aineisto with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the aineisto
     * @return the aineisto that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Aineisto remove(Serializable primaryKey)
        throws NoSuchAineistoException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Aineisto aineisto = (Aineisto) session.get(AineistoImpl.class,
                    primaryKey);

            if (aineisto == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchAineistoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(aineisto);
        } catch (NoSuchAineistoException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Aineisto removeImpl(Aineisto aineisto) throws SystemException {
        aineisto = toUnwrappedModel(aineisto);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(aineisto)) {
                aineisto = (Aineisto) session.get(AineistoImpl.class,
                        aineisto.getPrimaryKeyObj());
            }

            if (aineisto != null) {
                session.delete(aineisto);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (aineisto != null) {
            clearCache(aineisto);
        }

        return aineisto;
    }

    @Override
    public Aineisto updateImpl(fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto aineisto)
        throws SystemException {
        aineisto = toUnwrappedModel(aineisto);

        boolean isNew = aineisto.isNew();

        Session session = null;

        try {
            session = openSession();

            if (aineisto.isNew()) {
                session.save(aineisto);

                aineisto.setNew(false);
            } else {
                session.merge(aineisto);
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

        EntityCacheUtil.putResult(AineistoModelImpl.ENTITY_CACHE_ENABLED,
            AineistoImpl.class, aineisto.getPrimaryKey(), aineisto);

        return aineisto;
    }

    protected Aineisto toUnwrappedModel(Aineisto aineisto) {
        if (aineisto instanceof AineistoImpl) {
            return aineisto;
        }

        AineistoImpl aineistoImpl = new AineistoImpl();

        aineistoImpl.setNew(aineisto.isNew());
        aineistoImpl.setPrimaryKey(aineisto.getPrimaryKey());

        aineistoImpl.setAineisto_id(aineisto.getAineisto_id());
        aineistoImpl.setNimi(aineisto.getNimi());
        aineistoImpl.setTunnus(aineisto.getTunnus());
        aineistoImpl.setKuvaus(aineisto.getKuvaus());
        aineistoImpl.setPaikkatietosysteemi(aineisto.getPaikkatietosysteemi());
        aineistoImpl.setInfolinkki(aineisto.getInfolinkki());
        aineistoImpl.setKayttolupa(aineisto.getKayttolupa());
        aineistoImpl.setTuotu_kantaan(aineisto.getTuotu_kantaan());
        aineistoImpl.setMuutettu(aineisto.getMuutettu());
        aineistoImpl.setMuuttaja(aineisto.getMuuttaja());
        aineistoImpl.setPoistettu(aineisto.getPoistettu());

        return aineistoImpl;
    }

    /**
     * Returns the aineisto with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the aineisto
     * @return the aineisto
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Aineisto findByPrimaryKey(Serializable primaryKey)
        throws NoSuchAineistoException, SystemException {
        Aineisto aineisto = fetchByPrimaryKey(primaryKey);

        if (aineisto == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchAineistoException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return aineisto;
    }

    /**
     * Returns the aineisto with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException} if it could not be found.
     *
     * @param aineisto_id the primary key of the aineisto
     * @return the aineisto
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException if a aineisto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Aineisto findByPrimaryKey(int aineisto_id)
        throws NoSuchAineistoException, SystemException {
        return findByPrimaryKey((Serializable) aineisto_id);
    }

    /**
     * Returns the aineisto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the aineisto
     * @return the aineisto, or <code>null</code> if a aineisto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Aineisto fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Aineisto aineisto = (Aineisto) EntityCacheUtil.getResult(AineistoModelImpl.ENTITY_CACHE_ENABLED,
                AineistoImpl.class, primaryKey);

        if (aineisto == _nullAineisto) {
            return null;
        }

        if (aineisto == null) {
            Session session = null;

            try {
                session = openSession();

                aineisto = (Aineisto) session.get(AineistoImpl.class, primaryKey);

                if (aineisto != null) {
                    cacheResult(aineisto);
                } else {
                    EntityCacheUtil.putResult(AineistoModelImpl.ENTITY_CACHE_ENABLED,
                        AineistoImpl.class, primaryKey, _nullAineisto);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(AineistoModelImpl.ENTITY_CACHE_ENABLED,
                    AineistoImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return aineisto;
    }

    /**
     * Returns the aineisto with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param aineisto_id the primary key of the aineisto
     * @return the aineisto, or <code>null</code> if a aineisto with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Aineisto fetchByPrimaryKey(int aineisto_id)
        throws SystemException {
        return fetchByPrimaryKey((Serializable) aineisto_id);
    }

    /**
     * Returns all the aineistos.
     *
     * @return the aineistos
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Aineisto> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Aineisto> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Aineisto> findAll(int start, int end,
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

        List<Aineisto> list = (List<Aineisto>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_AINEISTO);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_AINEISTO;

                if (pagination) {
                    sql = sql.concat(AineistoModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Aineisto>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Aineisto>(list);
                } else {
                    list = (List<Aineisto>) QueryUtil.list(q, getDialect(),
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
     * Removes all the aineistos from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Aineisto aineisto : findAll()) {
            remove(aineisto);
        }
    }

    /**
     * Returns the number of aineistos.
     *
     * @return the number of aineistos
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

                Query q = session.createQuery(_SQL_COUNT_AINEISTO);

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
     * Initializes the aineisto persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.kotus.kielikartastot.db.model.Aineisto")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Aineisto>> listenersList = new ArrayList<ModelListener<Aineisto>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Aineisto>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(AineistoImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
