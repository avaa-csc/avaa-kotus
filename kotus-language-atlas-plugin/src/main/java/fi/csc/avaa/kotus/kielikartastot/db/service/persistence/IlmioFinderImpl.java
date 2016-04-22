package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import fi.csc.avaa.kotus.kielikartastot.KartastoConst;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioImpl;

public class IlmioFinderImpl extends BasePersistenceImpl<Ilmio> implements IlmioFinder {

	public static final String FIND_BY_AINEISTO_ILMIO_TYYPPI_KUVAUS_PAIKKA =
			IlmioFinder.class.getName() +
		        ".findByAineistoIlmioTyyppiKuvausPaikka";
	public static final String FIND_ILMIO_PAIKKA_BY_RYHMA_ID = IlmioFinder.class.getName() + ".findIlmioPaikkaByRyhmaId";
	public static final String FIND_BY_RYHMA_ID = IlmioFinder.class.getName() + ".findByRyhmaId";
	
	@SuppressWarnings("unchecked")
	public List<Ilmio> findByAineistoIlmioTyyppiKuvausPaikka(
			int aineistoIdVal, String ilmioVal, String tyyppiVal, String kuvausVal, String paikkaVal) {
		
		if(ilmioVal == null) {
			ilmioVal = KartastoConst.EMPTY_STRING;
		}
		if(tyyppiVal == null) {
			tyyppiVal = KartastoConst.EMPTY_STRING;
		}
		if(kuvausVal == null) {
			kuvausVal = KartastoConst.EMPTY_STRING;
		}
		if(paikkaVal == null) {
			paikkaVal = KartastoConst.EMPTY_STRING;
		}
	    Session session = null;
	    try {
	        session = openSession();
	        String sql = CustomSQLUtil.get(
	        		FIND_BY_AINEISTO_ILMIO_TYYPPI_KUVAUS_PAIKKA);
	        
	        if(aineistoIdVal == -1) {
//	        	sql = sql.replaceFirst("\\?", "SELECT aineisto_id FROM aineisto");
	        	sql = sql.replaceFirst("\\?", "1,2,3");
			} else {
				sql = sql.replaceFirst("\\?", String.valueOf(aineistoIdVal));
			}

	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(true);
	        q.addEntity("Ilmio", IlmioImpl.class);
	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add("%" + ilmioVal + "%");
	        qPos.add("%" + tyyppiVal + "%");
	        qPos.add("%" + kuvausVal + "%");
	        qPos.add("%" + paikkaVal + "%");
	        return (List<Ilmio>) q.list();
	    } catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }
	    return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> findIlmioPaikkaByRyhmaId(int[] groupIds) {
		if(groupIds == null || groupIds.length < 1) {
        	return null;
		}
		Session session = null;
	    try {
	        session = openSession();
	        String sql = CustomSQLUtil.get(
	        		FIND_ILMIO_PAIKKA_BY_RYHMA_ID);
	        
	        StringBuilder ryhmaIdsAsString = new StringBuilder();
	        ryhmaIdsAsString.append(groupIds[0]);
	        for(int i=1; i < groupIds.length; i++) {
	        	ryhmaIdsAsString.append(",");
	        	ryhmaIdsAsString.append(groupIds[i]);
	        }
	        sql = sql.replaceFirst("\\?", ryhmaIdsAsString.toString());
	        
	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(true);
	        q.addScalar("ilmio.ilmio_id", Type.INTEGER);
	        q.addScalar("ilmio.ilmio", Type.STRING);
	        q.addScalar("ilmio.ryhma_id", Type.INTEGER);
	        q.addScalar("ilmio.aineisto_id", Type.INTEGER);
	        q.addScalar("ilmio.tyyppi", Type.STRING);
	        q.addScalar("ilmio.kuvaus", Type.STRING);
	        q.addScalar("paikka.paikka_id", Type.INTEGER);
	        q.addScalar("paikka.nimi_fin", Type.STRING);
	        q.addScalar("paikka.tyyppi", Type.STRING);
	        q.addScalar("paikka.alue", Type.STRING);
	        q.addScalar("paikka.sapo_linkki", Type.STRING);
	        q.addScalar("x", Type.DOUBLE);
	        q.addScalar("y", Type.DOUBLE);
	        
	        return (List<Object>) q.list();
	    } catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }
	    return null;
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> findByRyhmaId(int[] groupIds) {
		if(groupIds == null || groupIds.length < 1) {
        	return null;
		}
		Session session = null;
	    try {
	        session = openSession();
	        String sql = CustomSQLUtil.get(
	        		FIND_BY_RYHMA_ID);
	        
	        StringBuilder ryhmaIdsAsString = new StringBuilder();
	        ryhmaIdsAsString.append(groupIds[0]);
	        for(int i=1; i < groupIds.length; i++) {
	        	ryhmaIdsAsString.append(",");
	        	ryhmaIdsAsString.append(groupIds[i]);
	        }
	        sql = sql.replaceFirst("\\?", ryhmaIdsAsString.toString());
	        
	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(true);
	        q.addScalar("ilmio_id", Type.INTEGER);
	        q.addScalar("aineisto_id", Type.INTEGER);
	        q.addScalar("ryhma_id", Type.INTEGER);
	        q.addScalar("ilmio", Type.STRING);
	        
	        return (List<Object>) q.list();
	    } catch (Exception e) {
	        try {
	            throw new SystemException(e);
	        } catch (SystemException se) {
	            se.printStackTrace();
	        }
	    } finally {
	        closeSession(session);
	    }
	    return null;
	}
}
