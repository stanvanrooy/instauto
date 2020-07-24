package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.A3K;

public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
    public static native HybridData initHybrid(JavaJSExecutor javaJSExecutor);

    public String getName() {
        return "ProxyJavaScriptExecutor";
    }

    static {
        A3K.A00();
    }
}
