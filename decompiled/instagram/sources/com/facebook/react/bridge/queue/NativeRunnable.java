package com.facebook.react.bridge.queue;

import com.facebook.jni.HybridData;

public class NativeRunnable implements Runnable {
    public final HybridData mHybridData;

    public native void run();

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
