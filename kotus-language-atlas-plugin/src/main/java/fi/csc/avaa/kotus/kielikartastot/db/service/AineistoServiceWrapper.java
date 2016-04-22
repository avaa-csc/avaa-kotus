package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link AineistoService}.
 *
 * @author CSC
 * @see AineistoService
 * @generated
 */
public class AineistoServiceWrapper implements AineistoService,
    ServiceWrapper<AineistoService> {
    private AineistoService _aineistoService;

    public AineistoServiceWrapper(AineistoService aineistoService) {
        _aineistoService = aineistoService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _aineistoService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _aineistoService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _aineistoService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public AineistoService getWrappedAineistoService() {
        return _aineistoService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedAineistoService(AineistoService aineistoService) {
        _aineistoService = aineistoService;
    }

    @Override
    public AineistoService getWrappedService() {
        return _aineistoService;
    }

    @Override
    public void setWrappedService(AineistoService aineistoService) {
        _aineistoService = aineistoService;
    }
}
