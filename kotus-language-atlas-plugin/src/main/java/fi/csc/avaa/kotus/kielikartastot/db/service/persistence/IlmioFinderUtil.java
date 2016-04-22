package fi.csc.avaa.kotus.kielikartastot.db.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;


public class IlmioFinderUtil {
    private static IlmioFinder _finder;

    public static java.util.List<fi.csc.avaa.kotus.kielikartastot.db.model.Ilmio> findByAineistoIlmioTyyppiKuvausPaikka(
        int aineistoIdVal, java.lang.String ilmioVal,
        java.lang.String tyyppiVal, java.lang.String kuvausVal,
        java.lang.String paikkaVal) {
        return getFinder()
                   .findByAineistoIlmioTyyppiKuvausPaikka(aineistoIdVal,
            ilmioVal, tyyppiVal, kuvausVal, paikkaVal);
    }

    public static java.util.List<java.lang.Object> findIlmioPaikkaByRyhmaId(
        int[] groupIds) {
        return getFinder().findIlmioPaikkaByRyhmaId(groupIds);
    }

    public static java.util.List<java.lang.Object> findByRyhmaId(int[] groupIds) {
        return getFinder().findByRyhmaId(groupIds);
    }

    public static IlmioFinder getFinder() {
        if (_finder == null) {
            _finder = (IlmioFinder) PortletBeanLocatorUtil.locate(fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer.getServletContextName(),
                    IlmioFinder.class.getName());

            ReferenceRegistry.registerReference(IlmioFinderUtil.class, "_finder");
        }

        return _finder;
    }

    public void setFinder(IlmioFinder finder) {
        _finder = finder;

        ReferenceRegistry.registerReference(IlmioFinderUtil.class, "_finder");
    }
}
