package com.facebook.profilo.provider.perfevents;

import p000X.AnonymousClass0HQ;

public class PerfEventsSession {
    public long mNativeHandle;
    public final Runnable mSessionRunnable = new AnonymousClass0HQ(this);
    public Thread mThread;

    public static native long nativeAttach(boolean z, int i, int i2, float f);

    public static native void nativeDetach(long j);

    public static native void nativeRun(long j);

    public static native void nativeStop(long j);

    public synchronized void stop() {
        long j = this.mNativeHandle;
        if (j != 0) {
            nativeStop(j);
            try {
                this.mThread.join();
                this.mThread = null;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        } else if (this.mThread != null) {
            throw new IllegalStateException("Inconsistent state: have thread but no handle");
        }
    }

    public void finalize() {
        stop();
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j != 0) {
                nativeDetach(j);
            }
        }
        super.finalize();
    }
}
