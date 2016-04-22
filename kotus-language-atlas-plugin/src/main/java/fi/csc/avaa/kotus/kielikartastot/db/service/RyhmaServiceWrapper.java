package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link RyhmaService}.
 *
 * @author CSC
 * @see RyhmaService
 * @generated
 */
public class RyhmaServiceWrapper implements RyhmaService,
    ServiceWrapper<RyhmaService> {
    private RyhmaService _ryhmaService;

    public RyhmaServiceWrapper(RyhmaService ryhmaService) {
        _ryhmaService = ryhmaService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _ryhmaService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _ryhmaService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _ryhmaService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public RyhmaService getWrappedRyhmaService() {
        return _ryhmaService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedRyhmaService(RyhmaService ryhmaService) {
        _ryhmaService = ryhmaService;
    }

    @Override
    public RyhmaService getWrappedService() {
        return _ryhmaService;
    }

    @Override
    public void setWrappedService(RyhmaService ryhmaService) {
        _ryhmaService = ryhmaService;
    }
}
