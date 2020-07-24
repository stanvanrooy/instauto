package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.jni.HybridData;

public abstract class ServiceConfiguration {
    public HybridData mHybridData;

    public void destroy() {
        this.mHybridData.resetNative();
    }

    public ServiceConfiguration() {
    }

    public ServiceConfiguration(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
