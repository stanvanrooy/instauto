package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A3K;

public abstract class NativeMap {
    public HybridData mHybridData;

    public native String toString();

    static {
        A3K.A00();
    }

    public NativeMap(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
