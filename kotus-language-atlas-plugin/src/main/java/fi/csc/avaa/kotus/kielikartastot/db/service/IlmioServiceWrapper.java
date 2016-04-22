package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link IlmioService}.
 *
 * @author CSC
 * @see IlmioService
 * @generated
 */
public class IlmioServiceWrapper implements IlmioService,
    ServiceWrapper<IlmioService> {
    private IlmioService _ilmioService;

    public IlmioServiceWrapper(IlmioService ilmioService) {
        _ilmioService = ilmioService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ilmioService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ilmioService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ilmioService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public IlmioService getWrappedIlmioService() {
        return _ilmioService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedIlmioService(IlmioService ilmioService) {
        _ilmioService = ilmioService;
    }

    @Override
    public IlmioService getWrappedService() {
        return _ilmioService;
    }

    @Override
    public void setWrappedService(IlmioService ilmioService) {
        _ilmioService = ilmioService;
    }
}
