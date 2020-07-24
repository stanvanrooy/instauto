package com.facebook.common.dextricks;

import dalvik.system.DexFile;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class DexFileLoad {
    public static void init() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002a  */
    public static DexFile loadDex(String str, String str2, ClassLoader classLoader) {
        boolean z;
        DexFile dexFile = null;
        if (classLoader != null) {
            try {
                Method loadMethodWithClassLoader = getLoadMethodWithClassLoader();
                z = true;
                if (loadMethodWithClassLoader != null) {
                    dexFile = (DexFile) loadMethodWithClassLoader.invoke((Object) null, new Object[]{str, str2, 0, classLoader, null});
                    if (z) {
                        return DexFile.loadDex(str, str2, 0);
                    }
                    return dexFile;
                }
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
        z = false;
        if (z) {
        }
    }

    public static Method getLoadMethodWithClassLoader() {
        Method[] declaredMethods = DexFile.class.getDeclaredMethods();
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            if (!method.getName().equals("loadDex") || method.getParameterTypes().length < 5) {
                i++;
            } else {
                method.setAccessible(true);
                return method;
            }
        }
        return null;
    }
}
