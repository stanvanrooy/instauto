package com.facebook.cameracore.mediapipeline.services.camerashare.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import p000X.C30771Djc;

public class CameraShareServiceConfigurationHybrid extends ServiceConfiguration {
    public final C30771Djc mConfiguration;

    public static native HybridData initHybrid(String str);

    public CameraShareServiceConfigurationHybrid(C30771Djc djc) {
        super(initHybrid(djc.A00));
        this.mConfiguration = djc;
    }
}
