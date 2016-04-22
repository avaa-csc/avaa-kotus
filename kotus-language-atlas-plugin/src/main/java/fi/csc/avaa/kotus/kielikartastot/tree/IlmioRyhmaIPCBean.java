package fi.csc.avaa.kotus.kielikartastot.tree;

import java.io.Serializable;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import fi.csc.avaa.kotus.kielikartastot.KotusDbUtils;
import fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio;
import fi.csc.avaa.kotus.kielikartastot.db.model.custom.RelatedRyhmas;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil;

/**
 * @author jmlehtin
 *
 */
public class IlmioRyhmaIPCBean implements Serializable {

	private static final Log LOG = LogFactoryUtil.getLog(IlmioRyhmaIPCBean.class);
	private static final long serialVersionUID = -5985911463826826150L;
	private Ilmio selectedIlmio;
	private RelatedRyhmas relatedRyhmas;
	
	public IlmioRyhmaIPCBean(int selectedIlmioId) {
		populateFields(selectedIlmioId);
	}
	
	private void populateFields(int ilmioId) {
		// Fetch the Ilmio referred by ilmioId
		try {
			selectedIlmio = IlmioLocalServiceUtil.getIlmio(ilmioId);
		} catch (PortalException | SystemException e) {
			LOG.error("Unable to fetch ilmio ID " + ilmioId + " from database");
		}
		if(selectedIlmio != null) {
			this.relatedRyhmas = KotusDbUtils.getRelatedRyhmasByRyhmaId(selectedIlmio.getRyhma_id());
		}
	}
	
	public int getYlinRyhmaId() {
		if(relatedRyhmas.hasYlaRyhma()) {
			if(relatedRyhmas.hasYlaYlaRyhma()) {
				return relatedRyhmas.getYlaylaryhmaId();
			} else {
				return relatedRyhmas.getYlaryhmaId();
			}
		} else {
			return relatedRyhmas.getRyhmaId();
		}
	}

	public Ilmio getSelectedIlmio() {
		return selectedIlmio;
	}

	public RelatedRyhmas getRelatedRyhmas() {
		return relatedRyhmas;
	}
}
