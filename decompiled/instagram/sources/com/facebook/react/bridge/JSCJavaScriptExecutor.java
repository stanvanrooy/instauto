package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A3K;

public class JSCJavaScriptExecutor extends JavaScriptExecutor {
    public static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public final String getName() {
        return "JSCJavaScriptExecutor";
    }

    static {
        A3K.A00();
    }
}
