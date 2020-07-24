package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C64222qp;
import p000X.C65502tD;

public class LocationDataProviderModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        AnonymousClass0Y1.A08("locationdataprovider");
    }

    public ServiceConfiguration createConfiguration(C65502tD r3) {
        C64222qp r1;
        if (r3 == null || (r1 = r3.A05) == null) {
            return null;
        }
        return new LocationDataProviderConfigurationHybrid(r1);
    }

    public LocationDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
