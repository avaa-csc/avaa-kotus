package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PaikkaService}.
 *
 * @author CSC
 * @see PaikkaService
 * @generated
 */
public class PaikkaServiceWrapper implements PaikkaService,
    ServiceWrapper<PaikkaService> {
    private PaikkaService _paikkaService;

    public PaikkaServiceWrapper(PaikkaService paikkaService) {
        _paikkaService = paikkaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _paikkaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _paikkaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _paikkaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public PaikkaService getWrappedPaikkaService() {
        return _paikkaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedPaikkaService(PaikkaService paikkaService) {
        _paikkaService = paikkaService;
    }

    @Override
    public PaikkaService getWrappedService() {
        return _paikkaService;
    }

    @Override
    public void setWrappedService(PaikkaService paikkaService) {
        _paikkaService = paikkaService;
    }
}
