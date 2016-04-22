package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class RyhmaFinderUtil {
    private static RyhmaFinder _finder;

    public static java.lang.Object findAllByRyhmaId(int ryhmaId) {
        return getFinder().findAllByRyhmaId(ryhmaId);
    }

    public static java.util.List<java.lang.Object> findByYlaryhma(
        int[] ylaRyhmaIds) {
        return getFinder().findByYlaryhma(ylaRyhmaIds);
    }

    public static RyhmaFinder getFinder() {
        if (_finder == null) {
            _finder = (RyhmaFinder) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    RyhmaFinder.class.getName());

            ReferenceRegistry.registerReference(RyhmaFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(RyhmaFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(RyhmaFinderUtil.class, "_finder");
    }
}
