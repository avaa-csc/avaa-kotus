package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LajikoodiService}.
 *
 * @author CSC
 * @see LajikoodiService
 * @generated
 */
public class LajikoodiServiceWrapper implements LajikoodiService,
    ServiceWrapper<LajikoodiService> {
    private LajikoodiService _lajikoodiService;

    public LajikoodiServiceWrapper(LajikoodiService lajikoodiService) {
        _lajikoodiService = lajikoodiService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _lajikoodiService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _lajikoodiService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _lajikoodiService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LajikoodiService getWrappedLajikoodiService() {
        return _lajikoodiService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLajikoodiService(LajikoodiService lajikoodiService) {
        _lajikoodiService = lajikoodiService;
    }

    @Override
    public LajikoodiService getWrappedService() {
        return _lajikoodiService;
    }

    @Override
    public void setWrappedService(LajikoodiService lajikoodiService) {
        _lajikoodiService = lajikoodiService;
    }
}
