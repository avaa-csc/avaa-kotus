package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import java.util.List;

import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.SQLQuery;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.Type;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;
import com.liferay.util.dao.orm.CustomSQLUtil;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;
import fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaImpl;

public class PaikkaFinderImpl extends BasePersistenceImpl<Paikka> implements PaikkaFinder {

	private static final Log LOG = LogFactoryUtil.getLog(PaikkaFinderImpl.class);
	public static final String FIND_BY_ILMIO_ID =
			PaikkaFinder.class.getName() +
		        ".findByIlmioId";
	
	@SuppressWarnings("unchecked")
	public List<Object> findByIlmioId(int ilmioId) {
		if(ilmioId < 1) {
        	return null;
		}
		Session session = null;
	    try {
	        session = openSession();
	        String sql = CustomSQLUtil.get(
	        		FIND_BY_ILMIO_ID);
	        
	        SQLQuery q = session.createSQLQuery(sql);
	        q.setCacheable(true);
	        q.addScalar("paikka_id", Type.INTEGER);
	        q.addScalar("nimi_fin", Type.STRING);
	        q.addScalar("tyyppi", Type.STRING);
	        q.addScalar("alue", Type.STRING);
	        q.addScalar("sapo_linkki", Type.STRING);
	        q.addScalar("x", Type.DOUBLE);
	        q.addScalar("y", Type.DOUBLE);
	        
	        QueryPos qPos = QueryPos.getInstance(q);
	        qPos.add(ilmioId);
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
