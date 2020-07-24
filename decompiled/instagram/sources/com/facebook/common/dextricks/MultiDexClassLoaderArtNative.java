package com.facebook.common.dextricks;

import android.content.Context;
import android.os.Build;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.dextricks.stats.ClassLoadingStatsNative;
import dalvik.system.DexFile;
import java.io.File;
import java.util.ArrayList;
import p000X.AnonymousClass0FU;
import p000X.AnonymousClass0Y1;

public final class MultiDexClassLoaderArtNative extends MultiDexClassLoader {
    public static final int CRASH_CORRELATION_BAIL_THRESHOLD = 3;
    public static final String FAILEDSTART_FILE = "multidexclassloader_artnative_failedstart";
    public final ArrayList mAuxDexes;
    public final ArrayList mPrimaryDexes;

    private native void cleanupFailedInit();

    private native Class init(ClassLoader classLoader, ClassLoader classLoader2, DexFile[] dexFileArr, ClassLoadingStatsNative classLoadingStatsNative, String str, boolean z);

    public static native boolean isFastHooked();

    public static native void nativeConfigure(DexFile[] dexFileArr, int i);

    public native DexFile[] doGetConfiguredDexFiles();

    public native Class findClass(String str);

    public native String[] getRecentFailedClasses();

    public native Class loadClass(String str, boolean z);

    public void onColdstartDone() {
    }

    public String toString() {
        return "MultiDexClassLoaderArtNative";
    }

    static {
        AnonymousClass0Y1.A08("dextricks");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    public static void maybeBail(Context context) {
        String str;
        File fileStreamPath = context.getFileStreamPath(FAILEDSTART_FILE);
        if (!fileStreamPath.exists()) {
            fileStreamPath.createNewFile();
            if (Build.VERSION.SDK_INT >= 21) {
                String[] strArr = Build.SUPPORTED_32_BIT_ABIS;
                if (strArr.length != 0) {
                    str = strArr[0];
                    if (!"x86".equals(str)) {
                        throw new Exception("Bailing: x86 unsupported");
                    } else if (AnonymousClass0FU.A08(context, Experiments.MDCLAN_BLACKLIST_GK_ENABLED_FILENAME)) {
                        throw new Exception("Bailing: Blacklisted device model");
                    } else {
                        return;
                    }
                }
            }
            str = Build.CPU_ABI;
            if (!"x86".equals(str)) {
            }
        } else {
            fileStreamPath.delete();
            throw new Exception("MDCLAN bailing: Failed to start last time");
        }
    }

    public MultiDexClassLoaderArtNative(Context context, ClassLoader classLoader, ArrayList arrayList, ArrayList arrayList2, boolean z, boolean z2) {
        if (!z2) {
            maybeBail(context);
        }
        this.mPrimaryDexes = arrayList;
        this.mAuxDexes = arrayList2;
        if (arrayList == null || arrayList.isEmpty()) {
            throw new Exception("Bailing: No primary dexes");
        }
        ClassLoadingStatsNative classLoadingStatsNative = new ClassLoadingStatsNative();
        ClassLoadingStats.A00.getAndSet(classLoadingStatsNative);
        try {
            ClassLoader classLoader2 = this.mPutativeLoader;
            ArrayList arrayList3 = this.mPrimaryDexes;
            ClassLoader classLoader3 = classLoader;
            init(classLoader3, classLoader2, (DexFile[]) arrayList3.toArray(new DexFile[arrayList3.size()]), classLoadingStatsNative, context.getDir("mdclan", 0).getAbsolutePath(), z);
        } catch (Exception e) {
            cleanupFailedInit();
            throw e;
        }
    }

    public void configure(MultiDexClassLoader.Configuration configuration) {
        super.configure(configuration);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.mPrimaryDexes);
        arrayList.addAll(configuration.mDexFiles);
        arrayList.addAll(this.mAuxDexes);
        nativeConfigure((DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]), configuration.configFlags);
        configureArtHacks(configuration);
    }
}
