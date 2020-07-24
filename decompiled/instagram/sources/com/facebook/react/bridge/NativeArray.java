package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A3K;
import p000X.C23046A1d;

public abstract class NativeArray implements C23046A1d {
    public HybridData mHybridData;

    public native String toString();

    static {
        A3K.A00();
    }

    public NativeArray(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
