package com.facebook.dalvikdistract;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import p000X.AnonymousClass0Y1;

public final class DalvikDistract {
    public final ArrayList mTransaction = new ArrayList();

    public final class GenericCall {
        public static Object[] gcSave;

        public static native boolean getBoolean(int i, int i2);

        public static native byte getByte(int i, int i2);

        public static native char getChar(int i, int i2);

        public static native double getDouble(int i, int i2);

        public static native float getFloat(int i, int i2);

        public static native int getInt(int i, int i2);

        public static native long getLong(int i, int i2);

        public static native Object getObject(int i, int i2);

        public static native short getShort(int i, int i2);

        public static native void invokeOriginal(int i);

        public static void saveReturnValue(int i, Object obj) {
            setObject(i, -1, obj);
        }

        public static native void setBoolean(int i, int i2, boolean z);

        public static native void setByte(int i, int i2, byte b);

        public static native void setChar(int i, int i2, char c);

        public static native void setDouble(int i, int i2, double d);

        public static native void setFloat(int i, int i2, float f);

        public static native void setInt(int i, int i2, int i3);

        public static native void setLong(int i, int i2, long j);

        public static native void setObject(int i, int i2, Object obj);

        public static native void setShort(int i, int i2, short s);

        public static void enlargeGcSave() {
            Object[] objArr = gcSave;
            if (objArr != null) {
                gcSave = Arrays.copyOf(objArr, objArr.length << 1);
            } else {
                gcSave = new Object[16];
            }
        }
    }

    public interface GenericCallHandler {
        void handleCall(Object obj, int i);
    }

    public static native void nativeCleanupMm(int i);

    public static native synchronized void nativeCommit(Object[] objArr);

    public final class Unsafe {
        public final Object wrapped;

        public Unsafe(Object obj) {
            this.wrapped = obj;
        }
    }

    static {
        AnonymousClass0Y1.A08("c++_shared");
        AnonymousClass0Y1.A08("sigmux");
        AnonymousClass0Y1.A08("distract");
        AnonymousClass0Y1.A08("dalvikdistract");
    }

    public static Class[] extractSignature(Object obj) {
        Class<?> cls;
        Class<?> declaringClass;
        Class[] parameterTypes;
        if (obj instanceof Method) {
            Method method = (Method) obj;
            cls = method.getReturnType();
            if (Modifier.isStatic(method.getModifiers())) {
                declaringClass = null;
            } else {
                declaringClass = method.getDeclaringClass();
            }
            parameterTypes = method.getParameterTypes();
        } else {
            Constructor constructor = (Constructor) obj;
            cls = Void.TYPE;
            declaringClass = constructor.getDeclaringClass();
            parameterTypes = constructor.getParameterTypes();
        }
        int i = 0;
        int i2 = 1;
        if (declaringClass == null) {
            i2 = 0;
        }
        int length = parameterTypes.length;
        Class[] clsArr = new Class[(i2 + 1 + length)];
        clsArr[0] = cls;
        int i3 = 1;
        if (declaringClass != null) {
            i3 = 2;
            clsArr[1] = declaringClass;
        }
        while (i < length) {
            clsArr[i3] = parameterTypes[i];
            i++;
            i3++;
        }
        return clsArr;
    }

    public static Unsafe unsafe(Object obj) {
        return new Unsafe(obj);
    }

    public void commit() {
        String property = System.getProperty("java.vm.version");
        if (property == null || property.startsWith("0.") || property.startsWith("1.")) {
            nativeCommit(this.mTransaction.toArray());
            this.mTransaction.clear();
            return;
        }
        throw new UnsupportedOperationException("DalvikDistract does not yet support ART");
    }

    public class IncompatibleSignatureError extends RuntimeException {
        public IncompatibleSignatureError(String str) {
            super(str);
        }
    }

    public static void checkSignatureCompatibility(Object obj, Object obj2, boolean z) {
        Class<Object>[] extractSignature = extractSignature(obj);
        Class<Object>[] extractSignature2 = extractSignature(obj2);
        Class<Object> cls = extractSignature[0];
        extractSignature[0] = extractSignature2[0];
        extractSignature2[0] = cls;
        int length = extractSignature2.length;
        int length2 = extractSignature.length;
        if (length <= length2) {
            int i = 0;
            while (i < length) {
                if (extractSignature2[i].isAssignableFrom(extractSignature[i]) || (z && extractSignature[i] == Object.class && !extractSignature2[i].isPrimitive())) {
                    i++;
                } else {
                    throw new IncompatibleSignatureError(String.format("%s cannot substitute for %s", new Object[]{extractSignature[i], extractSignature2[i]}));
                }
            }
            return;
        }
        throw new IncompatibleSignatureError(String.format("Argument length mismatch: hook may not accept more arguments than the original method.  Hook (%s) accepts %s arguments; original (%s) accepts %s", new Object[]{obj2, Integer.valueOf(length - 1), obj, Integer.valueOf(length2 - 1)}));
    }

    public static Object cleanupMm(int i, Object obj) {
        nativeCleanupMm(i);
        return obj;
    }

    public DalvikDistract hook(Object obj, Object obj2) {
        boolean z;
        if (obj instanceof Unsafe) {
            obj = ((Unsafe) obj).wrapped;
            z = true;
        } else {
            z = false;
        }
        if (obj2 instanceof Unsafe) {
            obj2 = ((Unsafe) obj2).wrapped;
            z = true;
        }
        if (!(obj2 instanceof GenericCallHandler)) {
            checkSignatureCompatibility(obj, obj2, z);
        } else if (obj == null || (!(obj instanceof Constructor) && !(obj instanceof Method))) {
            throw new IllegalArgumentException("can hook only methods or constructors");
        }
        this.mTransaction.add(obj);
        this.mTransaction.add(obj2);
        return this;
    }

    public DalvikDistract hook(Object obj, Object obj2, Object obj3) {
        hook(obj, obj2);
        hook(obj3, obj);
        return this;
    }

    public DalvikDistract unhook(Constructor constructor) {
        this.mTransaction.add(constructor);
        this.mTransaction.add((Object) null);
        return this;
    }

    public DalvikDistract unhook(Method method) {
        this.mTransaction.add(method);
        this.mTransaction.add((Object) null);
        return this;
    }
}
