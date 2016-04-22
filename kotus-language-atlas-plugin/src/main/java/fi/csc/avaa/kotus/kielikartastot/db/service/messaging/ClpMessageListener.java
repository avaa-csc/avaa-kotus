package fi.csc.avaa.kotus.kielikartastot.db.service.messaging;

import com.liferay.portal.kernel.messaging.BaseMessageListener;
import com.liferay.portal.kernel.messaging.Message;

import fi.csc.avaa.kotus.kielikartastot.db.service.AineistoLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.AineistoServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.ClpSerializer;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.IlmioServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.LajikoodiServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.LevikkiServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.PaikkaServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaLocalServiceUtil;
import fi.csc.avaa.kotus.kielikartastot.db.service.RyhmaServiceUtil;


public class ClpMessageListener extends BaseMessageListener {
    public static String getServletContextName() {
        return ClpSerializer.getServletContextName();
    }

    @Override
    protected void doReceive(Message message) throws Exception {
        String command = message.getString("command");
        String servletContextName = message.getString("servletContextName");

        if (command.equals("undeploy") &&
                servletContextName.equals(getServletContextName())) {
            AineistoLocalServiceUtil.clearService();

            AineistoServiceUtil.clearService();
            IlmioLocalServiceUtil.clearService();

            IlmioServiceUtil.clearService();
            LajikoodiLocalServiceUtil.clearService();

            LajikoodiServiceUtil.clearService();
            LevikkiLocalServiceUtil.clearService();

            LevikkiServiceUtil.clearService();
            PaikkaLocalServiceUtil.clearService();

            PaikkaServiceUtil.clearService();
            RyhmaLocalServiceUtil.clearService();

            RyhmaServiceUtil.clearService();
        }
    }
}
