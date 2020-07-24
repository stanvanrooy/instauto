package com.facebook.common.classmarkers;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p000X.AnonymousClass000;

public final class DynamicClassMarkerCreation {
    public static final ConcurrentHashMap CLASS_NAME_TO_NUM = new ConcurrentHashMap();
    public static final Class[] DYANMIC_CLASS_INTERFACES = {ClassLoadMarker.class};
    public static final Class[][] EMPTY_EXCEPTIONS_ARRAY = new Class[0][];
    public static final Object[] EMPTY_METHOD_ARRAY;
    public static final String END_MARKER = "LoadMarkerEnd";
    public static final boolean IS_SUPPORTED;
    public static final int MAX_CLASS_NUM = 5;
    public static final int NO_NUM = -1;
    public static Method Proxy_generateProxyNew = null;
    public static Method Proxy_generateProxyOld = null;
    public static final String START_MARKER = "LoadMarkerStart";
    public static final Class TAG = DynamicClassMarkerCreation.class;

    public interface ClassLoadMarker {
    }

    public static Class generateProxy(String str, Class[] clsArr, ClassLoader classLoader, Object[] objArr, Class[][] clsArr2) {
        try {
            Method method = Proxy_generateProxyNew;
            if (method != null) {
                return (Class) method.invoke((Object) null, new Object[]{str, clsArr, classLoader, objArr, clsArr2});
            }
            Method method2 = Proxy_generateProxyOld;
            if (method2 != null) {
                return (Class) method2.invoke((Object) null, new Object[]{str, clsArr, classLoader});
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    static {
        Object[] objArr;
        boolean z;
        boolean z2 = true;
        try {
            objArr = (Object[]) Array.newInstance(Class.forName("java.lang.reflect.ArtMethod"), 0);
        } catch (ClassNotFoundException unused) {
            objArr = new Method[0];
        }
        EMPTY_METHOD_ARRAY = objArr;
        try {
            Method declaredMethod = Proxy.class.getDeclaredMethod("generateProxy", new Class[]{String.class, Class[].class, ClassLoader.class, objArr.getClass(), Class[][].class});
            Proxy_generateProxyNew = declaredMethod;
            declaredMethod.setAccessible(true);
            z = true;
        } catch (NoSuchMethodException unused2) {
            Proxy_generateProxyNew = null;
            z = false;
        }
        if (Proxy_generateProxyNew == null) {
            try {
                Method declaredMethod2 = Proxy.class.getDeclaredMethod("generateProxy", new Class[]{String.class, Class[].class, ClassLoader.class});
                Proxy_generateProxyOld = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
                Proxy_generateProxyOld = null;
            }
            IS_SUPPORTED = z2;
        }
        z2 = z;
        IS_SUPPORTED = z2;
    }

    public static void generateClassLoadMarker(String str) {
        generateProxy(str, DYANMIC_CLASS_INTERFACES, DynamicClassMarkerCreation.class.getClassLoader(), EMPTY_METHOD_ARRAY, EMPTY_EXCEPTIONS_ARRAY);
    }

    public static void generateClassLoadMarkerStart(String str) {
        if (IS_SUPPORTED) {
            commonGenerateClassLoadMarker(str, START_MARKER, (String) null);
        }
    }

    public static String getClassName(String str, String str2, int i) {
        StringBuilder sb = new StringBuilder(str);
        if (str2 != null) {
            sb.append('-');
            sb.append(str2);
            sb.append('-');
        }
        sb.append(i);
        return sb.toString();
    }

    public static int getCurrentNumForClass(String str) {
        AtomicInteger atomicInteger = (AtomicInteger) CLASS_NAME_TO_NUM.get(str);
        if (atomicInteger != null) {
            return atomicInteger.get();
        }
        return -1;
    }

    public static int getNextNumForClass(String str) {
        int incrementAndGet;
        AtomicInteger atomicInteger = (AtomicInteger) CLASS_NAME_TO_NUM.get(str);
        if (atomicInteger == null) {
            atomicInteger = new AtomicInteger(0);
            AtomicInteger atomicInteger2 = (AtomicInteger) CLASS_NAME_TO_NUM.putIfAbsent(str, atomicInteger);
            if (atomicInteger2 != null) {
                atomicInteger = atomicInteger2;
            }
        }
        if (5 < atomicInteger.get() || (incrementAndGet = atomicInteger.incrementAndGet()) > 5) {
            return -1;
        }
        return incrementAndGet;
    }

    public static void commonGenerateClassLoadMarker(String str, String str2, String str3) {
        String A0E = AnonymousClass000.A0E(str, str2);
        int nextNumForClass = getNextNumForClass(A0E);
        if (nextNumForClass != -1) {
            generateClassLoadMarker(getClassName(A0E, str3, nextNumForClass));
        }
    }

    public static String getClassNameWithoutNum(String str, String str2) {
        return AnonymousClass000.A0E(str, str2);
    }

    public static void generateClassLoadMarkerEnd(String str) {
        generateClassLoadMarkerEnd(str, (String) null);
    }

    public static void generateClassLoadMarkerEnd(String str, String str2) {
        int currentNumForClass;
        if (IS_SUPPORTED && (currentNumForClass = getCurrentNumForClass(AnonymousClass000.A0E(str, START_MARKER))) != -1) {
            int currentNumForClass2 = getCurrentNumForClass(AnonymousClass000.A0E(str, END_MARKER));
            if (currentNumForClass2 == -1 || currentNumForClass - 1 == currentNumForClass2) {
                commonGenerateClassLoadMarker(str, END_MARKER, str2);
            }
        }
    }
}
