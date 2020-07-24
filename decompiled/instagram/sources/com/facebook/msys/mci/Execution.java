package com.facebook.msys.mci;

import android.os.Looper;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0ZL;
import p000X.AnonymousClass920;
import p000X.C136375rt;
import p000X.C136385ru;
import p000X.C208918zB;
import p000X.C208928zC;
import p000X.C27256C5n;
import p000X.C5o;

public class Execution {
    public static volatile boolean sInitialized;
    public static final ThreadLocal sThreadLocalExecutionContext = new C27256C5n();

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (getExecutionContext() != 1) goto L_0x000e;
     */
    public static void executePossiblySync(C208918zB r3, int i) {
        boolean z;
        assertInitialized();
        AnonymousClass920.A00(r3);
        try {
            z = true;
        } catch (RuntimeException unused) {
        }
        z = false;
        if (z) {
            r3.run();
        } else {
            executeAsync(r3, 1);
        }
    }

    public static native int nativeGetExecutionContext();

    public static native int nativeGetExecutionPriority();

    public static native void nativeInitialize();

    public static native void nativeInitializeExecutors(int[] iArr);

    public static native boolean nativeScheduleTask(Runnable runnable, int i, int i2, double d, String str);

    public static native void nativeStartExecutor(int i);

    public static void assertInitialized() {
        if (!sInitialized) {
            throw new RuntimeException("This class has to be initialized before it can be used");
        }
    }

    public static int getExecutionContext() {
        return ((Integer) sThreadLocalExecutionContext.get()).intValue();
    }

    public static synchronized boolean initialize() {
        synchronized (Execution.class) {
            AnonymousClass0ZL.A01("Execution.initialize", -1594632575);
            if (sInitialized) {
                AnonymousClass0ZL.A00(-1258613224);
                return false;
            }
            int[] iArr = {1, 2, 3, 4, 5};
            String[] strArr = {"Main", "Disk", "Network", "Decoding", "Crypto"};
            nativeInitializeExecutors(iArr);
            for (int i = 0; i < 5; i++) {
                new Thread(new C5o(iArr[i]), AnonymousClass000.A0E(strArr[i], "Context")).start();
            }
            nativeInitialize();
            synchronized (ExecutionIdle.class) {
                try {
                    if (!ExecutionIdle.sInitialized) {
                        AnonymousClass0ZL.A01("ExecutionIdle.initialize", 449804265);
                        Looper.getMainLooper().getQueue().addIdleHandler(new C136375rt());
                        ExecutionIdle.nativeInitialize();
                        new Thread(new C136385ru()).start();
                        ExecutionIdle.sInitialized = true;
                        AnonymousClass0ZL.A00(-150083087);
                    }
                    try {
                    } catch (Throwable th) {
                        AnonymousClass0ZL.A00(-1667425732);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
            synchronized (TaskTracker.class) {
                if (!TaskTracker.sInitialized) {
                    TaskTracker[] taskTrackerArr = {TaskTracker.TRACKER_MAIN, TaskTracker.TRACKER_DISK_IO, TaskTracker.TRACKER_NETWORK, TaskTracker.TRACKER_DECODING, TaskTracker.TRACKER_CRYPTO};
                    for (int i2 = 0; i2 < 5; i2++) {
                        TaskTracker taskTracker = taskTrackerArr[i2];
                        taskTracker.mNativeHolder = TaskTracker.initNativeHolder(taskTracker.mExecutionContext, taskTracker.mQueueName);
                    }
                    TaskTracker.sInitialized = true;
                }
            }
            sInitialized = true;
            AnonymousClass0ZL.A00(-1439653056);
            return true;
        }
    }

    static {
        C208928zC.A00();
    }

    public static void executeAsync(C208918zB r7, int i) {
        assertInitialized();
        AnonymousClass920.A00(r7);
        assertInitialized();
        AnonymousClass920.A00(r7);
        if (!nativeScheduleTask(r7, i, 0, ((double) 0) / 1000.0d, r7.toString())) {
            throw new RuntimeException(AnonymousClass000.A05("UNKNOWN execution context ", i));
        }
    }

    public static int getExecutionPriority() {
        return nativeGetExecutionPriority();
    }
}
