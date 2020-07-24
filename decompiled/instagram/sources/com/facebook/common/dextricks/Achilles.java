package com.facebook.common.dextricks;

import java.lang.Thread;
import p000X.AnonymousClass0Y1;

public class Achilles implements Runnable {
    public final Object ctx;
    public final long func;

    public static native long derp();

    public static native long ferp();

    public static native long srclc();

    public native void run();

    static {
        AnonymousClass0Y1.A08("achilles-jni");
    }

    public static void attack(Object obj, long j) {
        Thread thread = new Thread(new Achilles(obj, j));
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable th) {
                DexTricksErrorReporter.reportSampledSoftError("Achilles", "Exception in Achilles thread", th);
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            Mlog.safeFmt("Failed to join on achilles thread: %s", e);
        }
    }

    public Achilles(Object obj, long j) {
        this.ctx = obj;
        this.func = j;
    }
}
