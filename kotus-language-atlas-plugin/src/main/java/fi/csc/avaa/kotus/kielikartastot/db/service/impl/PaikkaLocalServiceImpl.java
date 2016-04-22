package fi.csc.avaa.kotus.kielikartastot.db.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Paikka;
import fi.csc.avaa.kotus.kielikartastot.db.service.base.PaikkaLocalServiceBaseImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.PaikkaFinderUtil;

/**
 * The implementation of the paikka local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.base.PaikkaLocalServiceBaseImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalServiceUtil
 */
public class PaikkaLocalServiceImpl extends PaikkaLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalServiceUtil} to access the paikka local service.
     */
	
	public List<Object> findByIlmioId(int ilmioId) throws SystemException {
		    return PaikkaFinderUtil.findByIlmioId(ilmioId);
		}
}
