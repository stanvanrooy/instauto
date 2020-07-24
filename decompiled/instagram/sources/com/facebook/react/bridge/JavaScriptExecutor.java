package com.facebook.react.bridge;

import com.facebook.jni.HybridData;

public abstract class JavaScriptExecutor {
    public final HybridData mHybridData;

    public abstract String getName();

    public JavaScriptExecutor(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
