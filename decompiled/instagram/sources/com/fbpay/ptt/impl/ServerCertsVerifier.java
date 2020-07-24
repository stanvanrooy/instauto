package com.fbpay.ptt.impl;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class ServerCertsVerifier {
    public HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    private native String verifyCerts(byte[] bArr);

    static {
        AnonymousClass0Y1.A08("fbpayptt-android");
    }
}
