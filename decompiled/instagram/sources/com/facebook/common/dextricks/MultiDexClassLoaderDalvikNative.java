package com.facebook.common.dextricks;

import android.content.Context;
import android.util.Log;
import com.facebook.common.dextricks.MultiDexClassLoader;
import com.facebook.common.dextricks.stats.ClassLoadingStats;
import com.facebook.common.dextricks.stats.ClassLoadingStatsNative;
import dalvik.system.DexFile;
import java.util.ArrayList;
import p000X.AnonymousClass000;
import p000X.AnonymousClass08G;
import p000X.AnonymousClass0Y1;

public final class MultiDexClassLoaderDalvikNative extends MultiDexClassLoader {
    public static final int AVG_DEX_SIZE = 7340032;
    public static final int DEFAULT_LOCK_DEX_NUM = -1;
    public static final int MAX_COLDSTART_OAT_SIZE = 31457280;

    /* renamed from: MB */
    public static final int f146MB = 1048576;
    public static final int OAT_HEADER_SIZE = 1048576;
    public static final boolean USE_LOW_LEVEL_DALVIK_HOOKS = true;
    public static final boolean USE_O1_DALVIK_LOCATOR_HACK = true;
    public static final int WANT_PROC_EXEC = 1;
    public static boolean sIsIntialized;
    public final DexFile[] mAuxDexes;
    public boolean mDirectLookupsEnabled = false;
    public boolean mHacksAttempted = false;
    public boolean mO1HackEnabled = false;
    public final DexFile[] mPrimaryDexes;
    public DexFile[] mSecondaryDexes;

    public static native void nativeConfigure(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4, int i5);

    private native void nativeEnableDirectLookupHooks();

    public static native void nativeEnableO1Hack();

    private native void nativeInitialize(Object obj, ClassLoadingStatsNative classLoadingStatsNative, Object[] objArr);

    public static native void setReplacementDvmDescriptorToName();

    public static native void unlockAllMemory();

    public synchronized void configure(MultiDexClassLoader.Configuration configuration) {
        int i;
        ArrayList arrayList = configuration.mDexFiles;
        DexFile[] dexFileArr = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
        AnonymousClass08G r1 = (AnonymousClass08G) configuration.mFbColdStartExperiment;
        if (r1 == null || !r1.A03) {
            i = -1;
        } else {
            i = r1.A00;
        }
        nativeConfigure(this.mPrimaryDexes, dexFileArr, configuration.configFlags, 1000, 1000, i, 1);
        this.mSecondaryDexes = dexFileArr;
        if (!this.mHacksAttempted) {
            this.mHacksAttempted = true;
            try {
                enableDirectLookupHooks();
                this.mDirectLookupsEnabled = true;
            } catch (Exception e) {
                Log.w(MultiDexClassLoader.TAG, "unable to install direct Dalvik class-lookup hooks; continuing with classloader API", e);
            }
            try {
                enableO1Hack();
                this.mO1HackEnabled = true;
            } catch (Exception e2) {
                Log.w(MultiDexClassLoader.TAG, "unable to enable O1 Dalvik hack", e2);
            }
        }
        return;
    }

    public native Class findClass(String str);

    public native Class loadClass(String str, boolean z);

    public String toString() {
        return String.format("MultiDexClassLoaderDalvikNative(lookups=%s,o1=%s)", new Object[]{Boolean.valueOf(this.mDirectLookupsEnabled), Boolean.valueOf(this.mO1HackEnabled)});
    }

    static {
        AnonymousClass0Y1.A08("dextricks");
    }

    public DexFile[] doGetConfiguredDexFiles() {
        return this.mSecondaryDexes;
    }

    public void enableDirectLookupHooks() {
        DexFile[] dexFileArr = this.mPrimaryDexes;
        if (dexFileArr == null || this.mAuxDexes == null) {
            throw new UnsupportedOperationException("cannot enable direct hooks: we could not locate primary and aux dexes");
        } else if (dexFileArr.length == 1) {
            nativeEnableDirectLookupHooks();
        } else {
            throw new UnsupportedOperationException("cannot enable direct hooks: must have found exactly one primary dex");
        }
    }

    public void enableO1Hack() {
        int length;
        DexFile[] dexFileArr = this.mPrimaryDexes;
        if (dexFileArr == null) {
            length = 0;
        } else {
            length = dexFileArr.length;
        }
        if (length == 1) {
            nativeEnableO1Hack();
            return;
        }
        throw new UnsupportedOperationException(AnonymousClass000.A05("To use the O(1) class lookup hack, must have exactly one primary dex: have ", length));
    }

    public MultiDexClassLoaderDalvikNative(Context context, ArrayList arrayList, ArrayList arrayList2) {
        boolean z = false;
        if ((!arrayList.isEmpty() || !arrayList2.isEmpty()) ? true : z) {
            this.mPrimaryDexes = (DexFile[]) arrayList.toArray(new DexFile[arrayList.size()]);
            this.mAuxDexes = (DexFile[]) arrayList2.toArray(new DexFile[arrayList2.size()]);
        } else {
            Log.w(MultiDexClassLoader.TAG, "cannot enable dex hooks: failure to locate primary/aux dexes");
            this.mPrimaryDexes = null;
            this.mAuxDexes = null;
        }
        ClassLoadingStatsNative classLoadingStatsNative = new ClassLoadingStatsNative();
        ClassLoadingStats.A00.getAndSet(classLoadingStatsNative);
        nativeInitialize(this.mPutativeLoader, classLoadingStatsNative, this.mAuxDexes);
        setReplacementDvmDescriptorToName();
        sIsIntialized = true;
    }

    public void onColdstartDone() {
        unlockAllMemory();
    }
}
