package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.WorldTrackingDataProviderDelegateWrapper;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C65622tS;

public class WorldTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C65622tS mConfiguration;

    public static native HybridData initHybrid(int i, int i2, boolean z, boolean z2, int i3, DeviceConfig deviceConfig, WorldTrackingDataProviderDelegateWrapper worldTrackingDataProviderDelegateWrapper, String str, String str2, String str3, boolean z3, boolean z4);

    /* JADX WARNING: Illegal instructions before constructor call */
    public WorldTrackerDataProviderConfigurationHybrid(C65622tS r14) {
        super(initHybrid(r1, r2, r3, r4, r5, r14.A04, r14.A05, r14.A00, (String) null, (String) null, false, r14.A01));
        int i;
        int i2 = r14.A02;
        int i3 = r14.A03;
        boolean z = r14.A08;
        boolean z2 = r14.A07;
        if (1 - r14.A06.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        this.mConfiguration = r14;
    }

    static {
        AnonymousClass0Y1.A08("worldtrackerdataprovider");
    }
}
