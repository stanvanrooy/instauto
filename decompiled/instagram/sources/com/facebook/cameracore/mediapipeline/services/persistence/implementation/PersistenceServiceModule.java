package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C64142qh;
import p000X.C65502tD;

public class PersistenceServiceModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        AnonymousClass0Y1.A08("arpersistenceservice");
    }

    public ServiceConfiguration createConfiguration(C65502tD r3) {
        C64142qh r1;
        if (r3 == null || (r1 = r3.A0S) == null) {
            return null;
        }
        return new PersistenceServiceConfigurationHybrid(r1);
    }

    public PersistenceServiceModule() {
        this.mHybridData = initHybrid();
    }
}
