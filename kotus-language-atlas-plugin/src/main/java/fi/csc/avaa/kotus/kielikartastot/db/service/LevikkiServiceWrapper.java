package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link LevikkiService}.
 *
 * @author CSC
 * @see LevikkiService
 * @generated
 */
public class LevikkiServiceWrapper implements LevikkiService,
    ServiceWrapper<LevikkiService> {
    private LevikkiService _levikkiService;

    public LevikkiServiceWrapper(LevikkiService levikkiService) {
        _levikkiService = levikkiService;
    }

    /**
    * Returns the Spring bean ID for this bean.
    *
    * @return the Spring bean ID for this bean
    */
    @Override
    public java.lang.String getBeanIdentifier() {
        return _levikkiService.getBeanIdentifier();
    }

    /**
    * Sets the Spring bean ID for this bean.
    *
    * @param beanIdentifier the Spring bean ID for this bean
    */
    @Override
    public void setBeanIdentifier(java.lang.String beanIdentifier) {
        _levikkiService.setBeanIdentifier(beanIdentifier);
    }

    @Override
    public java.lang.Object invokeMethod(java.lang.String name,
        java.lang.String[] parameterTypes, java.lang.Object[] arguments)
        throws java.lang.Throwable {
        return _levikkiService.invokeMethod(name, parameterTypes, arguments);
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
     */
    public LevikkiService getWrappedLevikkiService() {
        return _levikkiService;
    }

    /**
     * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
     */
    public void setWrappedLevikkiService(LevikkiService levikkiService) {
        _levikkiService = levikkiService;
    }

    @Override
    public LevikkiService getWrappedService() {
        return _levikkiService;
    }

    @Override
    public void setWrappedService(LevikkiService levikkiService) {
        _levikkiService = levikkiService;
    }
}
