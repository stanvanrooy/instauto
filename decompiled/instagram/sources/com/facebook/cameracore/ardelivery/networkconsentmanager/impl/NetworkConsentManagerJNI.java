package com.facebook.cameracore.ardelivery.networkconsentmanager.impl;

import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass8JA;
import p000X.C72003Db;

public class NetworkConsentManagerJNI implements C72003Db {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger);

    private native void setUserConsent(String str, boolean z, int i);

    public native TriState hasUserAllowedNetworking(String str);

    static {
        AnonymousClass0Y1.A08("ard-android-network-consent-manager-impl");
    }

    public NetworkConsentManagerJNI(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger) {
        this.mHybridData = initHybrid(networkConsentStorage, analyticsLogger);
    }

    public void setUserConsent(String str, boolean z, AnonymousClass8JA r4) {
        setUserConsent(str, z, r4.A00);
    }
}
