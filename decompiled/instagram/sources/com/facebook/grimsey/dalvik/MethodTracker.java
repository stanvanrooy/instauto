package com.facebook.grimsey.dalvik;

import com.facebook.dalvikdistract.DalvikDistract;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.Set;

public class MethodTracker {
    public static final Set sHookedMethods = new HashSet();

    public class HookedMethodHandler implements DalvikDistract.GenericCallHandler {
        public final byte[] mSignatureHint;

        public native void handleCall(Object obj, int i);

        public HookedMethodHandler(boolean z, Method method) {
            if (z) {
                boolean isStatic = Modifier.isStatic(method.getModifiers());
                Class[] parameterTypes = method.getParameterTypes();
                Class<?> returnType = method.getReturnType();
                int length = parameterTypes.length;
                int i = 2;
                byte[] bArr = new byte[((isStatic ? 1 : 2) + length)];
                byte typeHint = MethodTracker.getTypeHint(returnType);
                int i2 = 0;
                bArr[0] = typeHint;
                if (!isStatic) {
                    bArr[1] = MethodTracker.getTypeHint(method.getDeclaringClass());
                } else {
                    i = 1;
                }
                while (i2 < length) {
                    bArr[i] = MethodTracker.getTypeHint(parameterTypes[i2]);
                    i2++;
                    i++;
                }
                this.mSignatureHint = bArr;
                return;
            }
            this.mSignatureHint = null;
        }
    }

    public static byte getTypeHint(Class cls) {
        if (cls == Void.TYPE) {
            return 0;
        }
        if (cls == Boolean.TYPE) {
            return 1;
        }
        if (cls == Byte.TYPE) {
            return 2;
        }
        if (cls == Character.TYPE) {
            return 3;
        }
        if (cls == Short.TYPE) {
            return 4;
        }
        if (cls == Integer.TYPE) {
            return 5;
        }
        if (cls == Long.TYPE) {
            return 6;
        }
        if (cls == Float.TYPE) {
            return 7;
        }
        if (cls == Double.TYPE) {
            return 8;
        }
        return 9;
    }

    public static synchronized void trackMethod(Method method, boolean z) {
        synchronized (MethodTracker.class) {
            if (method == null) {
                throw new NullPointerException();
            } else if (sHookedMethods.add(method)) {
                DalvikDistract dalvikDistract = new DalvikDistract();
                dalvikDistract.hook(method, new HookedMethodHandler(z, method));
                dalvikDistract.commit();
            } else {
                throw new IllegalArgumentException("Method already hooked.");
            }
        }
    }

    public static synchronized void untrackMethod(Method method) {
        synchronized (MethodTracker.class) {
            if (sHookedMethods.remove(method)) {
                DalvikDistract dalvikDistract = new DalvikDistract();
                dalvikDistract.unhook(method);
                dalvikDistract.commit();
            } else {
                throw new IllegalArgumentException("Method not hooked.");
            }
        }
    }
}
