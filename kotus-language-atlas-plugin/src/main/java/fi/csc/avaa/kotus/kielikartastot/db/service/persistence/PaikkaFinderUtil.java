package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class PaikkaFinderUtil {
    private static PaikkaFinder _finder;

    public static java.util.List<java.lang.Object> findByIlmioId(int ilmioId) {
        return getFinder().findByIlmioId(ilmioId);
    }

    public static PaikkaFinder getFinder() {
        if (_finder == null) {
            _finder = (PaikkaFinder) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    PaikkaFinder.class.getName());

            ReferenceRegistry.registerReference(PaikkaFinderUtil.class,
                "_finder");
        }

        return _finder;
    }

    public void setFinder(PaikkaFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(PaikkaFinderUtil.class, "_finder");
    }
}
