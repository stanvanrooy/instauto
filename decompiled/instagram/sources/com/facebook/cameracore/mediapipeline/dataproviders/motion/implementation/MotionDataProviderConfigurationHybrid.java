package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import p000X.C64032qU;

public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C64032qU mConfiguration;
    public final MotionDataSourceWrapper mMotionDataSourceWrapper;

    public static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataSourceWrapper getDataSource() {
        return this.mMotionDataSourceWrapper;
    }

    public MotionDataProviderConfigurationHybrid(C64032qU r3) {
        this.mConfiguration = r3;
        MotionDataSourceWrapper motionDataSourceWrapper = new MotionDataSourceWrapper(r3.A00);
        this.mMotionDataSourceWrapper = motionDataSourceWrapper;
        this.mHybridData = initHybrid(motionDataSourceWrapper);
    }
}
