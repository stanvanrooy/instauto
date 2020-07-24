package com.facebook.cameracore.mediapipeline.dataproviders.linebasedplanetracking.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C65502tD;

public class LineBasedPlaneTrackingDataProviderModule extends ServiceModule {
    public static native HybridData initHybrid();

    public ServiceConfiguration createConfiguration(C65502tD r2) {
        return null;
    }

    static {
        AnonymousClass0Y1.A08("linebasedplanetrackingdataprovider");
    }

    public LineBasedPlaneTrackingDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
