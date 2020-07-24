package com.instagram.common.lifecycleannotations;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0DB;

public class LifecycleUtil {
    public static final Map REFERENCE_CLEANERS = new HashMap();
    public static final Class TAG = LifecycleUtil.class;

    public static void cleanupReferences(Object obj) {
        try {
            Class<?> cls = obj.getClass();
            Method findReferenceCleanerForClass = findReferenceCleanerForClass(cls);
            if (findReferenceCleanerForClass != null) {
                findReferenceCleanerForClass.invoke((Object) null, new Object[]{obj});
                return;
            }
            cls.getCanonicalName();
        } catch (IllegalAccessException e) {
            AnonymousClass0DB.A0B(TAG, e, "unable to access cleanup for: %s", obj.getClass().getCanonicalName());
        } catch (InvocationTargetException e2) {
            AnonymousClass0DB.A0B(TAG, e2, "unable to invoke cleanup for: %s", obj.getClass().getCanonicalName());
        }
    }

    public static Method findReferenceCleanerForClass(Class cls) {
        Method method = (Method) REFERENCE_CLEANERS.get(cls);
        if (method != null) {
            return method;
        }
        String name = cls.getName();
        if (name.startsWith("android.") || name.startsWith("java.")) {
            return null;
        }
        try {
            Method declaredMethod = Class.forName(AnonymousClass000.A0E(name, "LifecycleUtil")).getDeclaredMethod("cleanupReferences", new Class[]{cls});
            REFERENCE_CLEANERS.put(cls, declaredMethod);
            return declaredMethod;
        } catch (ClassNotFoundException unused) {
            return findReferenceCleanerForClass(cls.getSuperclass());
        } catch (NoSuchMethodException e) {
            AnonymousClass0DB.A0B(TAG, e, "referenceCleanerClass generated incorrectly: %s", cls.getCanonicalName());
            return null;
        }
    }
}
