package fi.csc.avaa.kotus.kielikartastot.db.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayInputStream;
import com.liferay.portal.kernel.io.unsync.UnsyncByteArrayOutputStream;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ClassLoaderObjectInputStream;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.BaseModel;

import fi.csc.avaa.kotus.kielikartastot.db.model.AineistoClp;
import fi.csc.avaa.kotus.kielikartastot.db.model.IlmioClp;
import fi.csc.avaa.kotus.kielikartastot.db.model.LajikoodiClp;
import fi.csc.avaa.kotus.kielikartastot.db.model.LevikkiClp;
import fi.csc.avaa.kotus.kielikartastot.db.model.PaikkaClp;
import fi.csc.avaa.kotus.kielikartastot.db.model.RyhmaClp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class ClpSerializer {
    private static Log _log = LogFactoryUtil.getLog(ClpSerializer.class);
    private static String _servletContextName;
    private static boolean _useReflectionToTranslateThrowable = true;

    public static String getServletContextName() {
        if (Validator.isNotNull(_servletContextName)) {
            return _servletContextName;
        }

        synchronized (ClpSerializer.class) {
            if (Validator.isNotNull(_servletContextName)) {
                return _servletContextName;
            }

            try {
                ClassLoader classLoader = ClpSerializer.class.getClassLoader();

                Class<?> portletPropsClass = classLoader.loadClass(
                        "com.liferay.util.portlet.PortletProps");

                Method getMethod = portletPropsClass.getMethod("get",
                        new Class<?>[] { String.class });

                String portletPropsServletContextName = (String) getMethod.invoke(null,
                        "kotus-kielikartastot-portlet-deployment-context");

                if (Validator.isNotNull(portletPropsServletContextName)) {
                    _servletContextName = portletPropsServletContextName;
                }
            } catch (Throwable t) {
                if (_log.isInfoEnabled()) {
                    _log.info(
                        "Unable to locate deployment context from portlet properties");
                }
            }

            if (Validator.isNull(_servletContextName)) {
                try {
                    String propsUtilServletContextName = PropsUtil.get(
                            "kotus-kielikartastot-portlet-deployment-context");

                    if (Validator.isNotNull(propsUtilServletContextName)) {
                        _servletContextName = propsUtilServletContextName;
                    }
                } catch (Throwable t) {
                    if (_log.isInfoEnabled()) {
                        _log.info(
                            "Unable to locate deployment context from portal properties");
                    }
                }
            }

            if (Validator.isNull(_servletContextName)) {
                _servletContextName = "kotus-kielikartastot-portlet";
            }

            return _servletContextName;
        }
    }

    public static Object translateInput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(AineistoClp.class.getName())) {
            return translateInputAineisto(oldModel);
        }

        if (oldModelClassName.equals(IlmioClp.class.getName())) {
            return translateInputIlmio(oldModel);
        }

        if (oldModelClassName.equals(LajikoodiClp.class.getName())) {
            return translateInputLajikoodi(oldModel);
        }

        if (oldModelClassName.equals(LevikkiClp.class.getName())) {
            return translateInputLevikki(oldModel);
        }

        if (oldModelClassName.equals(PaikkaClp.class.getName())) {
            return translateInputPaikka(oldModel);
        }

        if (oldModelClassName.equals(RyhmaClp.class.getName())) {
            return translateInputRyhma(oldModel);
        }

        return oldModel;
    }

    public static Object translateInput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateInput(curObj));
        }

        return newList;
    }

    public static Object translateInputAineisto(BaseModel<?> oldModel) {
        AineistoClp oldClpModel = (AineistoClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getAineistoRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputIlmio(BaseModel<?> oldModel) {
        IlmioClp oldClpModel = (IlmioClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getIlmioRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputLajikoodi(BaseModel<?> oldModel) {
        LajikoodiClp oldClpModel = (LajikoodiClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getLajikoodiRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputLevikki(BaseModel<?> oldModel) {
        LevikkiClp oldClpModel = (LevikkiClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getLevikkiRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputPaikka(BaseModel<?> oldModel) {
        PaikkaClp oldClpModel = (PaikkaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getPaikkaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInputRyhma(BaseModel<?> oldModel) {
        RyhmaClp oldClpModel = (RyhmaClp) oldModel;

        BaseModel<?> newModel = oldClpModel.getRyhmaRemoteModel();

        newModel.setModelAttributes(oldClpModel.getModelAttributes());

        return newModel;
    }

    public static Object translateInput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateInput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateInput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Object translateOutput(BaseModel<?> oldModel) {
        Class<?> oldModelClass = oldModel.getClass();

        String oldModelClassName = oldModelClass.getName();

        if (oldModelClassName.equals(
                    "fi.csc.avaa.kotus.kielikartastot.db.model.impl.AineistoImpl")) {
            return translateOutputAineisto(oldModel);
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.kotus.kielikartastot.db.model.impl.IlmioImpl")) {
            return translateOutputIlmio(oldModel);
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.kotus.kielikartastot.db.model.impl.LajikoodiImpl")) {
            return translateOutputLajikoodi(oldModel);
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.kotus.kielikartastot.db.model.impl.LevikkiImpl")) {
            return translateOutputLevikki(oldModel);
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.kotus.kielikartastot.db.model.impl.PaikkaImpl")) {
            return translateOutputPaikka(oldModel);
        }

        if (oldModelClassName.equals(
                    "fi.csc.avaa.kotus.kielikartastot.db.model.impl.RyhmaImpl")) {
            return translateOutputRyhma(oldModel);
        }

        return oldModel;
    }

    public static Object translateOutput(List<Object> oldList) {
        List<Object> newList = new ArrayList<Object>(oldList.size());

        for (int i = 0; i < oldList.size(); i++) {
            Object curObj = oldList.get(i);

            newList.add(translateOutput(curObj));
        }

        return newList;
    }

    public static Object translateOutput(Object obj) {
        if (obj instanceof BaseModel<?>) {
            return translateOutput((BaseModel<?>) obj);
        } else if (obj instanceof List<?>) {
            return translateOutput((List<Object>) obj);
        } else {
            return obj;
        }
    }

    public static Throwable translateThrowable(Throwable throwable) {
        if (_useReflectionToTranslateThrowable) {
            try {
                UnsyncByteArrayOutputStream unsyncByteArrayOutputStream = new UnsyncByteArrayOutputStream();
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(unsyncByteArrayOutputStream);

                objectOutputStream.writeObject(throwable);

                objectOutputStream.flush();
                objectOutputStream.close();

                UnsyncByteArrayInputStream unsyncByteArrayInputStream = new UnsyncByteArrayInputStream(unsyncByteArrayOutputStream.unsafeGetByteArray(),
                        0, unsyncByteArrayOutputStream.size());

                Thread currentThread = Thread.currentThread();

                ClassLoader contextClassLoader = currentThread.getContextClassLoader();

                ObjectInputStream objectInputStream = new ClassLoaderObjectInputStream(unsyncByteArrayInputStream,
                        contextClassLoader);

                throwable = (Throwable) objectInputStream.readObject();

                objectInputStream.close();

                return throwable;
            } catch (SecurityException se) {
                if (_log.isInfoEnabled()) {
                    _log.info("Do not use reflection to translate throwable");
                }

                _useReflectionToTranslateThrowable = false;
            } catch (Throwable throwable2) {
                _log.error(throwable2, throwable2);

                return throwable2;
            }
        }

        Class<?> clazz = throwable.getClass();

        String className = clazz.getName();

        if (className.equals(PortalException.class.getName())) {
            return new PortalException();
        }

        if (className.equals(SystemException.class.getName())) {
            return new SystemException();
        }

        if (className.equals("fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException")) {
            return new fi.csc.avaa.kotus.kielikartastot.db.NoSuchAineistoException();
        }

        if (className.equals("fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException")) {
            return new fi.csc.avaa.kotus.kielikartastot.db.NoSuchIlmioException();
        }

        if (className.equals("fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException")) {
            return new fi.csc.avaa.kotus.kielikartastot.db.NoSuchLajikoodiException();
        }

        if (className.equals("fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException")) {
            return new fi.csc.avaa.kotus.kielikartastot.db.NoSuchLevikkiException();
        }

        if (className.equals("fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException")) {
            return new fi.csc.avaa.kotus.kielikartastot.db.NoSuchPaikkaException();
        }

        if (className.equals("fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException")) {
            return new fi.csc.avaa.kotus.kielikartastot.db.NoSuchRyhmaException();
        }

        return throwable;
    }

    public static Object translateOutputAineisto(BaseModel<?> oldModel) {
        AineistoClp newModel = new AineistoClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setAineistoRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputIlmio(BaseModel<?> oldModel) {
        IlmioClp newModel = new IlmioClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setIlmioRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputLajikoodi(BaseModel<?> oldModel) {
        LajikoodiClp newModel = new LajikoodiClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setLajikoodiRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputLevikki(BaseModel<?> oldModel) {
        LevikkiClp newModel = new LevikkiClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setLevikkiRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputPaikka(BaseModel<?> oldModel) {
        PaikkaClp newModel = new PaikkaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setPaikkaRemoteModel(oldModel);

        return newModel;
    }

    public static Object translateOutputRyhma(BaseModel<?> oldModel) {
        RyhmaClp newModel = new RyhmaClp();

        newModel.setModelAttributes(oldModel.getModelAttributes());

        newModel.setRyhmaRemoteModel(oldModel);

        return newModel;
    }
}
