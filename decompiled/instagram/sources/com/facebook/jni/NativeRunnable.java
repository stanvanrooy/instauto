package com.facebook.jni;

public class NativeRunnable implements Runnable {
    public final HybridData mHybridData;

    public native void run();

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
