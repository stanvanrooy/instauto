package com.facebook.common.dextricks;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import dalvik.system.BaseDexClassLoader;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.util.zip.ZipFile;
import p000X.AnonymousClass000;

public final class MemoryReductionHack {
    public static final String TAG = "MemoryReductionHack";

    public static void freeApkZip(Context context) {
        String str;
        if (Build.VERSION.SDK_INT < 26) {
            try {
                ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                ClassLoader classLoader = context.getClassLoader();
                if (classLoader instanceof PathClassLoader) {
                    removeZipFromPathClassLoader(applicationInfo.sourceDir, (PathClassLoader) classLoader);
                } else {
                    Log.w(TAG, "system classloader of unexpected type");
                }
            } catch (PackageManager.NameNotFoundException unused) {
                str = "Couldn't retrieve the application info";
                Log.w(TAG, str);
            } catch (IllegalAccessException unused2) {
                str = "Couldn't update the Loader (IllegalAccessException)";
                Log.w(TAG, str);
            } catch (NoSuchFieldException unused3) {
                str = "Couldn't update the Loader (NoSuchFieldException)";
                Log.w(TAG, str);
            } catch (RuntimeException e) {
                String message = e.getMessage();
                if (message == null || !message.contains("Package manager has died")) {
                    throw e;
                }
                Log.w(TAG, "Couldn't retrieve the applicaiton info because PackageManager died", e.getCause());
            }
        }
    }

    public static Object getDexPathList(BaseDexClassLoader baseDexClassLoader) {
        return getField(baseDexClassLoader, BaseDexClassLoader.class, "pathList");
    }

    public static File getFileOrZip(Object obj, int i) {
        if (i <= 22) {
            try {
                return (File) getField(obj, obj.getClass(), "file");
            } catch (NoSuchFieldException unused) {
            }
        }
        return (File) getField(obj, obj.getClass(), "zip");
    }

    public static Object getDexElementsArray(Object obj) {
        return getField(obj, obj.getClass(), "dexElements");
    }

    public static Object getField(Object obj, Class cls, String str) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053 A[LOOP:0: B:1:0x000f->B:16:0x0053, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[SYNTHETIC] */
    public static void removeZipFromPathClassLoader(String str, PathClassLoader pathClassLoader) {
        ZipFile zipFile;
        Object dexElementsArray = getDexElementsArray(getDexPathList(pathClassLoader));
        int length = Array.getLength(dexElementsArray);
        int i = Build.VERSION.SDK_INT;
        int i2 = 0;
        while (i2 < length) {
            Object obj = Array.get(dexElementsArray, i2);
            File fileOrZip = getFileOrZip(obj, i);
            if (i < 24) {
                try {
                    zipFile = (ZipFile) getField(obj, obj.getClass(), "zipFile");
                } catch (NoSuchFieldException unused) {
                }
                if (fileOrZip == null || !str.equals(fileOrZip.getPath())) {
                    i2++;
                } else {
                    if (zipFile != null) {
                        setField(obj, obj.getClass(), "zipFile", (Object) null);
                    }
                    setField(obj, obj.getClass(), "initialized", true);
                    return;
                }
            }
            zipFile = null;
            if (fileOrZip == null || !str.equals(fileOrZip.getPath())) {
            }
        }
        Log.w(TAG, AnonymousClass000.A0E("Could not find zipFile entry corresponding to path ", str));
    }

    public static void setField(Object obj, Class cls, String str, Object obj2) {
        Field declaredField = cls.getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }
}
