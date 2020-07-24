package com.facebook.cameracore.instagram.ardelivery.networkconsentmanager;

import com.facebook.cameracore.ardelivery.networkconsentmanager.impl.NetworkConsentManagerJNI;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Y1;
import p000X.AnonymousClass89H;
import p000X.AnonymousClass8JA;
import p000X.C06570Po;
import p000X.C17610qW;
import p000X.C72003Db;
import p000X.C72203Ee;

public class IgNetworkConsentManager implements C72003Db, C06570Po {
    public static boolean sStaticLoaded = true;
    public final AnalyticsLogger mAnalyticsLogger;
    public final NetworkConsentManagerJNI mCameraCoreNetworkConsentManager;

    public void onUserSessionWillEnd(boolean z) {
    }

    static {
        AnonymousClass0Y1.A08("ard-android-network-consent-manager-impl");
    }

    public static IgNetworkConsentManager getInstance(AnonymousClass0C1 r2) {
        return (IgNetworkConsentManager) r2.AVA(IgNetworkConsentManager.class, new AnonymousClass89H(r2));
    }

    public TriState hasUserAllowedNetworking(String str) {
        this.mAnalyticsLogger.setInfo("camera_core", "", str, false);
        return this.mCameraCoreNetworkConsentManager.hasUserAllowedNetworking(str);
    }

    public void setUserConsent(String str, boolean z, AnonymousClass8JA r7) {
        this.mAnalyticsLogger.setInfo("camera_core", "", str, false);
        this.mCameraCoreNetworkConsentManager.setUserConsent(str, z, r7);
    }

    public static boolean isAnalyticsLoggerAvailable() {
        return sStaticLoaded;
    }

    public AnalyticsLogger getAnalyticsLogger() {
        return this.mAnalyticsLogger;
    }

    public NetworkConsentManagerJNI getNetworkConsentManagerJNI() {
        return this.mCameraCoreNetworkConsentManager;
    }

    public IgNetworkConsentManager(AnonymousClass0C1 r4) {
        this.mAnalyticsLogger = new AnalyticsLoggerImpl(new C72203Ee(r4), (C17610qW) null);
        this.mCameraCoreNetworkConsentManager = new NetworkConsentManagerJNI(IgNetworkConsentStorage.getInstance(r4), this.mAnalyticsLogger);
    }

    public /* synthetic */ IgNetworkConsentManager(AnonymousClass0C1 r1, AnonymousClass89H r2) {
        this(r1);
    }
}
