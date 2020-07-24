package com.facebook.cameracore.xplatardelivery.models;

import p000X.C54902Zk;

public class EffectLoggingInfoAdapter {
    public static final String UNKNOWN = "unknown";
    public final String effectInstanceID;
    public final String effectSessionID;
    public final boolean isPrefetch;
    public final String operationUniqueID;
    public final String productName;
    public final String productSessionID;
    public final String requestSource;
    public final boolean shouldLogEffectDetails;

    public EffectLoggingInfoAdapter(String str, String str2, String str3, boolean z, boolean z2, C54902Zk r8) {
        String str4 = "unknown";
        r8 = r8 == null ? new C54902Zk(str4, str4, str4, str4) : r8;
        this.operationUniqueID = str;
        this.effectSessionID = str2;
        this.effectInstanceID = str3 == null ? str4 : str3;
        this.shouldLogEffectDetails = z;
        this.isPrefetch = z2;
        this.productSessionID = r8.A04;
        this.productName = r8.A03;
        String str5 = r8.A00;
        this.requestSource = str5 != null ? str5 : str4;
    }
}
