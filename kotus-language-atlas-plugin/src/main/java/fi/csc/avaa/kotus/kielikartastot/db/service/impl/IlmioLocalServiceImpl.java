package fi.csc.avaa.kotus.kielikartastot.db.service.impl;

import java.util.List;

import com.liferay.portal.kernel.exception.SystemException;

import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.service.base.IlmioLocalServiceBaseImpl;
import fi.csc.avaa.kotus.kielikartastot.db.service.persistence.IlmioFinderUtil;

/**
 * The implementation of the ilmio local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author CSC
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.base.IlmioLocalServiceBaseImpl
 * @see fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil
 */
public class IlmioLocalServiceImpl extends IlmioLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil} to access the ilmio local service.
     */
	
	public List<Ilmio> findByAineistoIlmioTyyppiKuvausPaikka(int aineistoIdVal, String ilmioVal, String tyyppiVal, String kuvausVal, String paikkaVal)
			throws SystemException {
			
			    return IlmioFinderUtil.findByAineistoIlmioTyyppiKuvausPaikka(
			    		aineistoIdVal, ilmioVal, tyyppiVal, kuvausVal, paikkaVal);
			}
	
	public List<Object> findIlmioPaikkaByRyhmaId(int[] groupIds) throws SystemException {
        return IlmioFinderUtil.findIlmioPaikkaByRyhmaId(groupIds);
    }
	
	public List<Object> findByRyhmaId(int[] groupIds) throws SystemException {
        return IlmioFinderUtil.findByRyhmaId(groupIds);
    }
}
