package com.facebook.native_bridge;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class NativeDataPromise {
    public final HybridData mHybridData;

    public native void setException(String str);

    public native void setValue(Object obj);

    static {
        AnonymousClass0Y1.A08("native_bridge");
    }

    public NativeDataPromise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
