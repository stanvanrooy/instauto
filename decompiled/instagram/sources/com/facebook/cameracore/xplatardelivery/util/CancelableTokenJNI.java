package com.facebook.cameracore.xplatardelivery.util;

import com.facebook.cameracore.ardelivery.fetch.interfaces.CancelableToken;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C54942Zo;

public class CancelableTokenJNI implements C54942Zo, CancelableToken {
    public static final String TAG = "CancelableTokenJNI";
    public final HybridData mHybridData;

    private native void nativeCancel();

    public void setPrefetch(boolean z) {
    }

    static {
        AnonymousClass0Y1.A08("ard-android-util");
    }

    public CancelableTokenJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    public boolean cancel() {
        nativeCancel();
        return true;
    }
}
