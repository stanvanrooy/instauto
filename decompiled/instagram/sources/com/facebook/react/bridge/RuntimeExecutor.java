package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public class RuntimeExecutor {
    public HybridData mHybridData;

    public RuntimeExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
