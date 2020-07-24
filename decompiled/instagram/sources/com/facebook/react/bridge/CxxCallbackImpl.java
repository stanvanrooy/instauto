package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import p000X.C23041A0r;

public class CxxCallbackImpl implements Callback {
    public final HybridData mHybridData;

    private native void nativeInvoke(NativeArray nativeArray);

    public CxxCallbackImpl(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public void invoke(Object... objArr) {
        nativeInvoke(C23041A0r.A06(objArr));
    }
}
