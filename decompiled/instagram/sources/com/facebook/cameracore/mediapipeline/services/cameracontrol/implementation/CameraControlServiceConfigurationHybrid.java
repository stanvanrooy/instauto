package com.facebook.cameracore.mediapipeline.services.cameracontrol.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.cameracontrol.interfaces.CameraControlServiceDelegateWrapper;
import com.facebook.jni.HybridData;
import p000X.C65492tB;

public class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C65492tB mConfiguration;

    public static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);

    public CameraControlServiceConfigurationHybrid(C65492tB r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
