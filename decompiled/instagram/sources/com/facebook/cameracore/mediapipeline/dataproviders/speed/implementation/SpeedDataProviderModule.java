package com.facebook.cameracore.mediapipeline.dataproviders.speed.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C64172qk;
import p000X.C65502tD;

public class SpeedDataProviderModule extends ServiceModule {
    public static native HybridData initHybrid();

    public ServiceConfiguration createConfiguration(C65502tD r3) {
        C64172qk r1;
        if (r3 == null || (r1 = r3.A0D) == null) {
            return null;
        }
        return new SpeedDataProviderConfigurationHybrid(r1);
    }

    static {
        AnonymousClass0Y1.A08("speeddataprovider");
    }

    public SpeedDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
