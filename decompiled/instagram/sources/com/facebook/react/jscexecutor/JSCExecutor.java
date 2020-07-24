package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import p000X.AnonymousClass0Y1;

public class JSCExecutor extends JavaScriptExecutor {
    public static native HybridData initHybrid(ReadableNativeMap readableNativeMap);

    public final String getName() {
        return "JSCExecutor";
    }

    static {
        AnonymousClass0Y1.A08("jscexecutor");
    }

    public JSCExecutor(ReadableNativeMap readableNativeMap) {
        super(initHybrid(readableNativeMap));
    }
}
