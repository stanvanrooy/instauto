package com.facebook.common.dextricks.classid;

import android.os.Build;
import com.android.dex.Dex;
import com.facebook.common.dextricks.OdexSchemeArtXdex;
import com.facebook.react.modules.camera.CameraRollManager;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentHashMap;
import p000X.AnonymousClass0Y1;

public class ClassId {
    public static Field comAndroidDexDex_data;
    public static Field javaLangClass_dexCache;
    public static Field javaLangClass_dexClassDefIndex;
    public static Method javaLangClass_getDex;
    public static Method javaLangClass_getDexClassDefIndex;
    public static Field javaLangDexCache_dexFile;
    public static Method javaLangDexCache_getDex;
    public static final ConcurrentHashMap sDexKeyToDexSignature = new ConcurrentHashMap(0, 0.9f);
    public static final boolean sInitialized;

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|28|(4:30|31|32|(2:34|35))|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r2 = r5.getDeclaredMethod("getDexClassDefIndex", new java.lang.Class[0]);
        r0 = r5.getDeclaredMethod("getDex", new java.lang.Class[0]);
        r2.setAccessible(true);
        r0.setAccessible(true);
        javaLangClass_getDexClassDefIndex = r2;
        javaLangClass_getDex = r0;
        getClassDef(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        if (getDexSignature(r8) == 0) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a6, code lost:
        throw new java.lang.UnsupportedOperationException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x007a */
    static {
        boolean z;
        boolean z2 = false;
        try {
            AnonymousClass0Y1.A08("classid");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        if (z) {
            Class<ClassId> cls = ClassId.class;
            synchronized (cls) {
                Class<Class> cls2 = Class.class;
                if (Build.VERSION.SDK_INT < 26) {
                    try {
                        Field declaredField = Class.forName("com.android.dex.Dex").getDeclaredField("data");
                        declaredField.setAccessible(true);
                        comAndroidDexDex_data = declaredField;
                    } catch (Exception unused2) {
                    }
                }
                Field declaredField2 = cls2.getDeclaredField("dexClassDefIndex");
                Field declaredField3 = cls2.getDeclaredField("dexCache");
                Class<?> cls3 = Class.forName("java.lang.DexCache");
                declaredField2.setAccessible(true);
                declaredField3.setAccessible(true);
                javaLangClass_dexClassDefIndex = declaredField2;
                javaLangClass_dexCache = declaredField3;
                if (Build.VERSION.SDK_INT < 26) {
                    Method declaredMethod = cls3.getDeclaredMethod("getDex", new Class[0]);
                    declaredMethod.setAccessible(true);
                    javaLangDexCache_getDex = declaredMethod;
                } else {
                    Field declaredField4 = cls3.getDeclaredField("dexFile");
                    declaredField4.setAccessible(true);
                    javaLangDexCache_dexFile = declaredField4;
                }
                getClassDef(cls);
                if (getDexSignature(cls) == 0) {
                    throw new UnsupportedOperationException();
                }
                z2 = true;
            }
            sInitialized = z2;
        }
    }

    public static native int getSignatureFromDexFile_8_0_0(long j);

    public static native int getSignatureFromDexFile_8_1_0(long j);

    public static native int getSignatureFromDexFile_9_0_0(long j);

    public static int calculateViaDexCacheDexFileSignature(Class cls) {
        int signatureFromDexFile_8_0_0;
        Object obj = javaLangClass_dexCache.get(cls);
        if (obj == null) {
            return 0;
        }
        Integer num = (Integer) sDexKeyToDexSignature.get(obj);
        if (num == null) {
            long j = javaLangDexCache_dexFile.getLong(obj);
            switch (Build.VERSION.SDK_INT) {
                case OdexSchemeArtXdex.OREO_SDK_INT /*26*/:
                    signatureFromDexFile_8_0_0 = getSignatureFromDexFile_8_0_0(j);
                    break;
                case 27:
                    signatureFromDexFile_8_0_0 = getSignatureFromDexFile_8_1_0(j);
                    break;
                case 28:
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                case 30:
                    signatureFromDexFile_8_0_0 = getSignatureFromDexFile_9_0_0(j);
                    break;
                default:
                    signatureFromDexFile_8_0_0 = 0;
                    break;
            }
            num = Integer.valueOf(signatureFromDexFile_8_0_0);
            sDexKeyToDexSignature.put(obj, num);
        }
        return num.intValue();
    }

    public static int getClassDef(Class cls) {
        try {
            Field field = javaLangClass_dexClassDefIndex;
            if (field != null) {
                return ((Integer) field.get(cls)).intValue();
            }
            Method method = javaLangClass_getDexClassDefIndex;
            if (method != null) {
                return ((Integer) method.invoke(cls, new Object[0])).intValue();
            }
            throw new IllegalStateException();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static long getClassId(Class cls) {
        if (!sInitialized) {
            return -1;
        }
        return (((long) getDexSignature(cls)) & 4294967295L) | (((long) getClassDef(cls)) << 32);
    }

    public static int getDexSignature(Class cls) {
        IllegalStateException illegalStateException;
        try {
            if (Build.VERSION.SDK_INT < 26) {
                if (javaLangDexCache_dexFile != null) {
                    return calculateViaDexCacheDexFileSignature(cls);
                }
                Field field = javaLangClass_dexCache;
                if (field != null) {
                    Object obj = field.get(cls);
                    if (obj == null) {
                        return 0;
                    }
                    Integer num = (Integer) sDexKeyToDexSignature.get(obj);
                    if (num == null) {
                        num = Integer.valueOf(getSignatureForDex((Dex) javaLangDexCache_getDex.invoke(obj, new Object[0])));
                        sDexKeyToDexSignature.put(obj, num);
                    }
                    return num.intValue();
                }
                Method method = javaLangClass_getDex;
                if (method != null) {
                    Dex dex = (Dex) method.invoke(cls, new Object[0]);
                    if (dex == null) {
                        return 0;
                    }
                    Integer num2 = (Integer) sDexKeyToDexSignature.get(dex);
                    if (num2 == null) {
                        num2 = Integer.valueOf(getSignatureForDex(dex));
                        sDexKeyToDexSignature.put(dex, num2);
                    }
                    return num2.intValue();
                }
                illegalStateException = new IllegalStateException();
            } else if (javaLangDexCache_dexFile != null) {
                return calculateViaDexCacheDexFileSignature(cls);
            } else {
                illegalStateException = new IllegalStateException();
            }
            throw illegalStateException;
        } catch (IOException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public static int getSignatureForDex(Dex dex) {
        ByteBuffer byteBuffer;
        Field field = comAndroidDexDex_data;
        if (!(field == null || (byteBuffer = (ByteBuffer) field.get(dex)) == null)) {
            ByteBuffer duplicate = byteBuffer.duplicate();
            if (duplicate.limit() >= 16) {
                duplicate.order(ByteOrder.LITTLE_ENDIAN);
                duplicate.position(12);
                int i = duplicate.getInt();
                if (i != 0) {
                    return i;
                }
            }
        }
        return dex.open(12).readInt();
    }
}
