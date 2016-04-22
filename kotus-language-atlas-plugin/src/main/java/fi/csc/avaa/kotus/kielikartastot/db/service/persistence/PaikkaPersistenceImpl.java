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

import fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException;
import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaImpl;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaModelImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.PaikkaPersistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the paikka service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author CSC
 * @see PaikkaPersistence
 * @see PaikkaUtil
 * @generated
 */
public class PaikkaPersistenceImpl extends BasePersistenceImpl<Paikka>
    implements PaikkaPersistence {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never modify or reference this class directly. Always use {@link PaikkaUtil} to access the paikka persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
     */
    public static final String FINDER_CLASS_NAME_ENTITY = PaikkaImpl.class.getName();
    public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List1";
    public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
        ".List2";
    public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
            PaikkaModelImpl.FINDER_CACHE_ENABLED, PaikkaImpl.class,
            FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
            PaikkaModelImpl.FINDER_CACHE_ENABLED, PaikkaImpl.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
    public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
            PaikkaModelImpl.FINDER_CACHE_ENABLED, Long.class,
            FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
    private static final String _SQL_SELECT_PAIKKA = "SELECT paikka FROM Paikka paikka";
    private static final String _SQL_COUNT_PAIKKA = "SELECT COUNT(paikka) FROM Paikka paikka";
    private static final String _ORDER_BY_ENTITY_ALIAS = "paikka.";
    private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Paikka exists with the primary key ";
    private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
                PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
    private static Log _log = LogFactoryUtil.getLog(PaikkaPersistenceImpl.class);
    private static Paikka _nullPaikka = new PaikkaImpl() {
            @Override
            public Object clone() {
                return this;
            }

            @Override
            public CacheModel<Paikka> toCacheModel() {
                return _nullPaikkaCacheModel;
            }
        };

    private static CacheModel<Paikka> _nullPaikkaCacheModel = new CacheModel<Paikka>() {
            @Override
            public Paikka toEntityModel() {
                return _nullPaikka;
            }
        };

    public PaikkaPersistenceImpl() {
        setModelClass(Paikka.class);
    }

    /**
     * Caches the paikka in the entity cache if it is enabled.
     *
     * @param paikka the paikka
     */
    @Override
    public void cacheResult(Paikka paikka) {
        EntityCacheUtil.putResult(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
            PaikkaImpl.class, paikka.getPrimaryKey(), paikka);

        paikka.resetOriginalValues();
    }

    /**
     * Caches the paikkas in the entity cache if it is enabled.
     *
     * @param paikkas the paikkas
     */
    @Override
    public void cacheResult(List<Paikka> paikkas) {
        for (Paikka paikka : paikkas) {
            if (EntityCacheUtil.getResult(
                        PaikkaModelImpl.ENTITY_CACHE_ENABLED, PaikkaImpl.class,
                        paikka.getPrimaryKey()) == null) {
                cacheResult(paikka);
            } else {
                paikka.resetOriginalValues();
            }
        }
    }

    /**
     * Clears the cache for all paikkas.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache() {
        if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
            CacheRegistryUtil.clear(PaikkaImpl.class.getName());
        }

        EntityCacheUtil.clearCache(PaikkaImpl.class.getName());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    /**
     * Clears the cache for the paikka.
     *
     * <p>
     * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
     * </p>
     */
    @Override
    public void clearCache(Paikka paikka) {
        EntityCacheUtil.removeResult(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
            PaikkaImpl.class, paikka.getPrimaryKey());

        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }

    @Override
    public void clearCache(List<Paikka> paikkas) {
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

        for (Paikka paikka : paikkas) {
            EntityCacheUtil.removeResult(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
                PaikkaImpl.class, paikka.getPrimaryKey());
        }
    }

    /**
     * Creates a new paikka with the primary key. Does not add the paikka to the database.
     *
     * @param paikka_id the primary key for the new paikka
     * @return the new paikka
     */
    @Override
    public Paikka create(int paikka_id) {
        Paikka paikka = new PaikkaImpl();

        paikka.setNew(true);
        paikka.setPrimaryKey(paikka_id);

        return paikka;
    }

    /**
     * Removes the paikka with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param paikka_id the primary key of the paikka
     * @return the paikka that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Paikka remove(int paikka_id)
        throws NoSuchPaikkaException, SystemException {
        return remove((Serializable) paikka_id);
    }

    /**
     * Removes the paikka with the primary key from the database. Also notifies the appropriate model listeners.
     *
     * @param primaryKey the primary key of the paikka
     * @return the paikka that was removed
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Paikka remove(Serializable primaryKey)
        throws NoSuchPaikkaException, SystemException {
        Session session = null;

        try {
            session = openSession();

            Paikka paikka = (Paikka) session.get(PaikkaImpl.class, primaryKey);

            if (paikka == null) {
                if (_log.isWarnEnabled()) {
                    _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
                }

                throw new NoSuchPaikkaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                    primaryKey);
            }

            return remove(paikka);
        } catch (NoSuchPaikkaException nsee) {
            throw nsee;
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }
    }

    @Override
    protected Paikka removeImpl(Paikka paikka) throws SystemException {
        paikka = toUnwrappedModel(paikka);

        Session session = null;

        try {
            session = openSession();

            if (!session.contains(paikka)) {
                paikka = (Paikka) session.get(PaikkaImpl.class,
                        paikka.getPrimaryKeyObj());
            }

            if (paikka != null) {
                session.delete(paikka);
            }
        } catch (Exception e) {
            throw processException(e);
        } finally {
            closeSession(session);
        }

        if (paikka != null) {
            clearCache(paikka);
        }

        return paikka;
    }

    @Override
    public Paikka updateImpl(fi.csc.avaa.kotus.kielikartastot.db.model.Paikka paikka)
        throws SystemException {
        paikka = toUnwrappedModel(paikka);

        boolean isNew = paikka.isNew();

        Session session = null;

        try {
            session = openSession();

            if (paikka.isNew()) {
                session.save(paikka);

                paikka.setNew(false);
            } else {
                session.merge(paikka);
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

        EntityCacheUtil.putResult(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
            PaikkaImpl.class, paikka.getPrimaryKey(), paikka);

        return paikka;
    }

    protected Paikka toUnwrappedModel(Paikka paikka) {
        if (paikka instanceof PaikkaImpl) {
            return paikka;
        }

        PaikkaImpl paikkaImpl = new PaikkaImpl();

        paikkaImpl.setNew(paikka.isNew());
        paikkaImpl.setPrimaryKey(paikka.getPrimaryKey());

        paikkaImpl.setPaikka_id(paikka.getPaikka_id());
        paikkaImpl.setAineistot(paikka.getAineistot());
        paikkaImpl.setTunniste(paikka.getTunniste());
        paikkaImpl.setNimi_fin(paikka.getNimi_fin());
        paikkaImpl.setNimi_kieli(paikka.getNimi_kieli());
        paikkaImpl.setTyyppi(paikka.getTyyppi());
        paikkaImpl.setAlue(paikka.getAlue());
        paikkaImpl.setMaa_ISO3166_1(paikka.getMaa_ISO3166_1());
        paikkaImpl.setAjankohta(paikka.getAjankohta());
        paikkaImpl.setSelite(paikka.getSelite());
        paikkaImpl.setKielet(paikka.getKielet());
        paikkaImpl.setMurre(paikka.getMurre());
        paikkaImpl.setSapo_linkki(paikka.getSapo_linkki());
        paikkaImpl.setMml_paikkaID(paikka.getMml_paikkaID());
        paikkaImpl.setTuotu_kantaan(paikka.getTuotu_kantaan());
        paikkaImpl.setMuutettu(paikka.getMuutettu());
        paikkaImpl.setMuuttaja(paikka.getMuuttaja());
        paikkaImpl.setPoistettu(paikka.getPoistettu());

        return paikkaImpl;
    }

    /**
     * Returns the paikka with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
     *
     * @param primaryKey the primary key of the paikka
     * @return the paikka
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Paikka findByPrimaryKey(Serializable primaryKey)
        throws NoSuchPaikkaException, SystemException {
        Paikka paikka = fetchByPrimaryKey(primaryKey);

        if (paikka == null) {
            if (_log.isWarnEnabled()) {
                _log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
            }

            throw new NoSuchPaikkaException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
                primaryKey);
        }

        return paikka;
    }

    /**
     * Returns the paikka with the primary key or throws a {@link fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException} if it could not be found.
     *
     * @param paikka_id the primary key of the paikka
     * @return the paikka
     * @throws fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException if a paikka with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Paikka findByPrimaryKey(int paikka_id)
        throws NoSuchPaikkaException, SystemException {
        return findByPrimaryKey((Serializable) paikka_id);
    }

    /**
     * Returns the paikka with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param primaryKey the primary key of the paikka
     * @return the paikka, or <code>null</code> if a paikka with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Paikka fetchByPrimaryKey(Serializable primaryKey)
        throws SystemException {
        Paikka paikka = (Paikka) EntityCacheUtil.getResult(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
                PaikkaImpl.class, primaryKey);

        if (paikka == _nullPaikka) {
            return null;
        }

        if (paikka == null) {
            Session session = null;

            try {
                session = openSession();

                paikka = (Paikka) session.get(PaikkaImpl.class, primaryKey);

                if (paikka != null) {
                    cacheResult(paikka);
                } else {
                    EntityCacheUtil.putResult(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
                        PaikkaImpl.class, primaryKey, _nullPaikka);
                }
            } catch (Exception e) {
                EntityCacheUtil.removeResult(PaikkaModelImpl.ENTITY_CACHE_ENABLED,
                    PaikkaImpl.class, primaryKey);

                throw processException(e);
            } finally {
                closeSession(session);
            }
        }

        return paikka;
    }

    /**
     * Returns the paikka with the primary key or returns <code>null</code> if it could not be found.
     *
     * @param paikka_id the primary key of the paikka
     * @return the paikka, or <code>null</code> if a paikka with the primary key could not be found
     * @throws SystemException if a system exception occurred
     */
    @Override
    public Paikka fetchByPrimaryKey(int paikka_id) throws SystemException {
        return fetchByPrimaryKey((Serializable) paikka_id);
    }

    /**
     * Returns all the paikkas.
     *
     * @return the paikkas
     * @throws SystemException if a system exception occurred
     */
    @Override
    public List<Paikka> findAll() throws SystemException {
        return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
    }

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
    @Override
    public List<Paikka> findAll(int start, int end) throws SystemException {
        return findAll(start, end, null);
    }

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
    @Override
    public List<Paikka> findAll(int start, int end,
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

        List<Paikka> list = (List<Paikka>) FinderCacheUtil.getResult(finderPath,
                finderArgs, this);

        if (list == null) {
            StringBundler query = null;
            String sql = null;

            if (orderByComparator != null) {
                query = new StringBundler(2 +
                        (orderByComparator.getOrderByFields().length * 3));

                query.append(_SQL_SELECT_PAIKKA);

                appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
                    orderByComparator);

                sql = query.toString();
            } else {
                sql = _SQL_SELECT_PAIKKA;

                if (pagination) {
                    sql = sql.concat(PaikkaModelImpl.ORDER_BY_JPQL);
                }
            }

            Session session = null;

            try {
                session = openSession();

                Query q = session.createQuery(sql);

                if (!pagination) {
                    list = (List<Paikka>) QueryUtil.list(q, getDialect(),
                            start, end, false);

                    Collections.sort(list);

                    list = new UnmodifiableList<Paikka>(list);
                } else {
                    list = (List<Paikka>) QueryUtil.list(q, getDialect(),
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
     * Removes all the paikkas from the database.
     *
     * @throws SystemException if a system exception occurred
     */
    @Override
    public void removeAll() throws SystemException {
        for (Paikka paikka : findAll()) {
            remove(paikka);
        }
    }

    /**
     * Returns the number of paikkas.
     *
     * @return the number of paikkas
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

                Query q = session.createQuery(_SQL_COUNT_PAIKKA);

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
     * Initializes the paikka persistence.
     */
    public void afterPropertiesSet() {
        String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
                    com.liferay.util.service.ServiceProps.get(
                        "value.object.listener.fi.csc.avaa.kotus.kielikartastot.db.model.Paikka")));

        if (listenerClassNames.length > 0) {
            try {
                List<ModelListener<Paikka>> listenersList = new ArrayList<ModelListener<Paikka>>();

                for (String listenerClassName : listenerClassNames) {
                    listenersList.add((ModelListener<Paikka>) InstanceFactory.newInstance(
                            getClassLoader(), listenerClassName));
                }

                listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
            } catch (Exception e) {
                _log.error(e);
            }
        }
    }

    public void destroy() {
        EntityCacheUtil.removeCache(PaikkaImpl.class.getName());
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
        FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
    }
}
