package fi.csc.avaa.kotus.kielikartastot.db.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.service.base.RyhmaLocalServiceBaseImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.RyhmaFinderUtil;

/**
 * The implementation of the ryhma local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.base.RyhmaLocalServiceBaseImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil
 */
public class RyhmaLocalServiceImpl extends RyhmaLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil} to access the ryhma local service.
     */
	
	public Object findAllByRyhmaId(int ryhmaId) throws SystemException {
	    return RyhmaFinderUtil.findAllByRyhmaId(ryhmaId);
	}
	
	public List<Object> findByYlaryhma(int[] ylaRyhmaIds) throws SystemException {
	    return RyhmaFinderUtil.findByYlaryhma(ylaRyhmaIds);
	}
}
