package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ryhma;

public class RyhmaFinderImpl extends BasePersistenceImpl<Ryhma> implements RyhmaFinder {

	public static final String FIND_ALL_BY_RYHMA_ID =
			RyhmaFinder.class.getName() +
		        ".findAllByRyhmaId";
	public static final String FIND_BY_YLARYHMA =
			RyhmaFinder.class.getName() +
		        ".findByYlaryhma";
	
	@SuppressWarnings("unchecked")
	public Object findAllByRyhmaId(int ryhmaId) {
		if(ryhmaId < 1) {
        	return null;
		}
		Session session = null;
	    try {
	        session = openSession();
	        String sql = CustomSQLUtil.get(FIND_ALL_BY_RYHMA_ID);
	        
	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(true);
	        q.addScalar("ryhma_nimi", Type.STRING);
	        q.addScalar("ryhma_id", Type.INTEGER);
	        q.addScalar("ryhma_tyyppi", Type.STRING);
	        q.addScalar("ylaryhma_nimi", Type.STRING);
	        q.addScalar("ylaryhma_id", Type.INTEGER);
	        q.addScalar("ylaryhma_tyyppi", Type.STRING);
	        q.addScalar("ylaylaryhma_nimi", Type.STRING);
	        q.addScalar("ylaylaryhma_id", Type.INTEGER);
	        q.addScalar("ylaylaryhma_tyyppi", Type.STRING);
	        
	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(ryhmaId);
	        List<Object> retData = q.list();
	        if(retData != null) {
	        	return retData.get(0);	
	        }
	        
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
	public List<Object> findByYlaryhma(int[] ylaRyhmaIds) {
		if(ylaRyhmaIds == null || ylaRyhmaIds.length < 1) {
        	return null;
		}
		Session session = null;
	    try {
	        session = openSession();
	        String sql = CustomSQLUtil.get(FIND_BY_YLARYHMA);
	        
	        StringBuilder ylaRyhmasAsString = new StringBuilder();
	        ylaRyhmasAsString.append(ylaRyhmaIds[0]);
	        for(int i=1; i < ylaRyhmaIds.length; i++) {
	        	ylaRyhmasAsString.append(",");
	        	ylaRyhmasAsString.append(ylaRyhmaIds[i]);
	        }
	        sql = sql.replaceFirst("\\?", ylaRyhmasAsString.toString());
	        
	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(true);
	        q.addScalar("ryhma_id", Type.INTEGER);
	        q.addScalar("aineisto_id", Type.INTEGER);
	        q.addScalar("nimi", Type.STRING);
	        q.addScalar("tyyppi", Type.STRING);
	        q.addScalar("ylaryhma", Type.INTEGER);
	        
	        List<Object> retData = q.list();
	        return retData;	
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
