package com.facebook.common.dextricks;

import android.app.ActivityThread;
import android.app.Application;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass08G;
import p000X.AnonymousClass091;
import p000X.AnonymousClass092;
import p000X.AnonymousClass0Bq;
import p000X.AnonymousClass0Y1;

public class DalvikInternals {
    public static final String APK_BASE_NAME = "base.apk";
    public static final int ART_HACK_DISABLE_COLLISION_CHECK = 32;
    public static final int ART_HACK_DISABLE_FORK = 2;
    public static final int ART_HACK_DISABLE_ISUPTODATE_CHECK = 64;
    public static final int ART_HACK_DISABLE_MONITOR_VISITLOCKS = 128;
    public static final int ART_HACK_DISABLE_VERIFIER = 4;
    public static final int FADV_DONTNEED = 4;
    public static final int FADV_NOREUSE = 5;
    public static final int FADV_NORMAL = 0;
    public static final int FADV_RANDOM = 1;
    public static final int FADV_SEQUENTIAL = 2;
    public static final int FADV_WILLNEED = 3;
    public static final boolean INITED = true;
    public static final int IOPRIO_BACKGROUND = 24576;
    public static final int IOPRIO_CLASS_BE = 2;
    public static final int IOPRIO_CLASS_IDLE = 3;
    public static final int IOPRIO_CLASS_NONE = 0;
    public static final int IOPRIO_CLASS_RT = 1;
    public static final byte IOPRIO_CLASS_SHIFT = 13;
    public static final int IOPRIO_WHO_PGRP = 2;
    public static final int IOPRIO_WHO_PROCESS = 1;
    public static final int IOPRIO_WHO_USER = 3;
    public static final String LIBCOLDSTART_BASE_NAME = "libcoldstart.so";
    public static final int LINK_ATOMIC_OVERWRITE = 2;
    public static final int LINK_SYMLINK = 1;
    public static final int SCROLLSET_DEX_INDEX = 2;
    public static final String SYSTEM_BOOT_BASE_NAME = "system@framework@boot";
    public static final String SYSTEM_LIB_BASE_NAME = "system/lib";
    public static List sDexBaseNames = new ArrayList();

    public abstract class ClassInitFailureHook {
        public abstract void onClassInitFailure(Class cls, Throwable th);
    }

    public class CrashLogParameters {
        public final int mInstacrashIntervalMs;

        public int getInstacrashInterval() {
            return this.mInstacrashIntervalMs;
        }

        public CrashLogParameters(int i) {
            this.mInstacrashIntervalMs = i;
        }
    }

    public class Stat {
        public long device;
        public long inode;
        public int ownerUid;
    }

    public static native synchronized void allocateNativeMemory(int i);

    public static native boolean attemptAllocate(int i, long j, int i2);

    public static native void closeUnixFd(int i);

    public static native void deleteRecursive(String str);

    public static native boolean detectSamsungOatFormat();

    public static native void dexOptCreateEmptyHeader(int i);

    public static native synchronized void ensureNativeMemoryHooksInitialized();

    public static native void fadvise(int i, long j, long j2, int i2);

    public static native void fdatasync(int i, int i2);

    public static native void fixArtMirandaBug();

    public static native synchronized void fixDvmForCrossDexHack();

    public static native synchronized void fixLinearAllocBuffer(int i);

    public static native synchronized void freeAllPreviouslyAllocatedNativeMemory();

    public static native void fsync(int i, int i2);

    public static native void fsyncNamed(String str, int i);

    public static native String getArtImageLocation();

    public static native int getEnabledThreadArtHacks();

    public static native int getMlockLimit();

    public static native String getOatFormatVersion();

    public static native int getOdexSize(boolean z);

    public static native long getOpenFileInode(int i);

    public static native int getOpenFileLinkCount(int i);

    public static native int getOwnerUid(String str);

    public static native void hookMmap(String str);

    public static native synchronized void ignoreSIGPIPE();

    public static native int increaseAndGetMLockLimit(boolean z, int i);

    public static native synchronized int installArtHacks(int i, int i2);

    public static native synchronized void integrateWithCrashLog(String str, String str2, CrashLogParameters crashLogParameters);

    public static native synchronized void integrateWithLibSigChain(int i, boolean z);

    public static native int ioprio_get(int i, int i2);

    public static native void ioprio_set(int i, int i2, int i3);

    public static native void link(String str, String str2, int i);

    public static native void mLockMappedFile(String str, int i, boolean z);

    public static native void mLockMappedFileSize(String str, int i, boolean z);

    public static native void mUnlockMappedFile(String str, int i, boolean z);

    public static native void mUnlockMappedFileSize(String str, int i, boolean z);

    public static native void madviseFile(String str);

    public static void mlockColdstartSet() {
    }

    public static native void mprotectExecCode();

    public static void munlockColdstartSet() {
    }

    public static native void nopDvmVerifyClass();

    public static native void onColdStartEnd();

    public static native int openUnixReadFd(String str);

    public static native int openUnixSyncReadWriteFd(String str);

    public static native synchronized void printTopDalvikAllocationCounts();

    public static native byte[] readOdexDepBlock(String str);

    public static native String realpath(String str);

    public static native void replaceOdexDepBlock(int i, byte[] bArr);

    public static native void restoreMprotectExecCode();

    public static native synchronized void setClassInitFailureHook(ClassInitFailureHook classInitFailureHook);

    public static native int setEnabledThreadArtHacks(int i);

    public static native synchronized void setIsArt(boolean z);

    public static native synchronized void startDalvikAllocationTracking();

    public static native synchronized void startNativeAllocationTracking(int i);

    public static native void statNamedFile(String str, Stat stat);

    public static native void statOpenFile(int i, Stat stat);

    public static native synchronized void stopDalvikAllocationTracking();

    public static native synchronized void stopNativeAllocationTracking();

    public static native synchronized boolean toggleBlockDex2Oat(boolean z);

    public static native void unhookMmap();

    public static native synchronized void writeNativeAllocationDataToLogcat(int i);

    public static native synchronized void writeNativeAllocationStacktracesToLogcat(int i);

    public static void addDexBaseNames(String str) {
        sDexBaseNames.add(str);
    }

    public static boolean isInited() {
        return true;
    }

    public static void mlockDex(int i) {
        mLockMappedFile("classes.dex", i, false);
    }

    public static void mlockOdex(int i, boolean z) {
        mLockMappedFile("base.odex", i, z);
    }

    public static void mlockOdexSize(int i, boolean z) {
        mLockMappedFileSize("base.odex", i, z);
    }

    public static void mlockScrollSet(int i) {
        if (!sDexBaseNames.isEmpty() && sDexBaseNames.size() > 2) {
            mLockMappedFile((String) sDexBaseNames.get(2), i, false);
        }
    }

    public static void munlockDex(int i) {
        mUnlockMappedFile("classes.dex", i, false);
    }

    public static void munlockOdex(int i, boolean z) {
        mUnlockMappedFile("base.odex", i, z);
    }

    public static void munlockOdexSize(int i, boolean z) {
        mUnlockMappedFileSize("base.odex", i, z);
    }

    public static void munlockScrollSet(int i) {
        if (!sDexBaseNames.isEmpty() && sDexBaseNames.size() > 2) {
            mUnlockMappedFile((String) sDexBaseNames.get(2), i, false);
        }
    }

    static {
        Application application;
        boolean z;
        AnonymousClass08G r0;
        ActivityThread currentActivityThread = ActivityThread.currentActivityThread();
        if (currentActivityThread != null) {
            application = currentActivityThread.getApplication();
        } else {
            application = null;
        }
        AnonymousClass0Y1.A08("dextricks");
        ignoreSIGPIPE();
        setIsArt(AnonymousClass0Bq.A00);
        Mlog.safeFmt("IsArt = " + AnonymousClass0Bq.A00 + " context = " + application, new Object[0]);
        if (!AnonymousClass0Bq.A00) {
            if (application != null) {
                r0 = AnonymousClass091.A00(application);
            } else {
                try {
                    r0 = AnonymousClass091.A01;
                    if (r0 == null) {
                        r0 = AnonymousClass092.A00();
                    }
                } catch (RuntimeException e) {
                    Mlog.m35w("Failed to nop dvmVerifyClass", e);
                }
            }
            if (r0.A02) {
                nopDvmVerifyClass();
                Mlog.safeFmt("Hooked nop dvmVerifyClass", new Object[0]);
            } else {
                Mlog.safeFmt("Skipped nop dvmVerifyClass", new Object[0]);
            }
        }
        if (AnonymousClass0Bq.A00 && Build.VERSION.SDK_INT >= 21) {
            AnonymousClass08G r02 = AnonymousClass091.A01;
            if (r02 != null) {
                z = r02.A05;
            } else {
                z = false;
            }
            int i = Build.VERSION.SDK_INT;
            integrateWithLibSigChain(i, z);
            if (i == 21) {
                try {
                    fixArtMirandaBug();
                    Mlog.safeFmt("patched ART 5.0.x miranda bug", new Object[0]);
                } catch (Exception e2) {
                    Mlog.m36w(e2, "could not patch ART 5.0.x miranda bug", new Object[0]);
                }
            }
        }
    }

    public static synchronized void integrateWithCrashLog(String str, String str2) {
        synchronized (DalvikInternals.class) {
            integrateWithCrashLog(str, str2, new CrashLogParameters(0));
        }
    }
}
