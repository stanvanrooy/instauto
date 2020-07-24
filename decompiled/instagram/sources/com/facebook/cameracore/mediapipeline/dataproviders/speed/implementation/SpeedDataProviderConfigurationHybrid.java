package com.facebook.cameracore.mediapipeline.dataproviders.speed.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import p000X.C64172qk;

public class SpeedDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C64172qk mConfiguration;
    public final SpeedDataSourceWrapper mSpeedDataSourceWrapper;

    public static native HybridData initHybrid(SpeedDataSourceWrapper speedDataSourceWrapper);

    public SpeedDataProviderConfigurationHybrid(C64172qk r3) {
        SpeedDataSourceWrapper speedDataSourceWrapper = new SpeedDataSourceWrapper(r3.A00);
        this.mSpeedDataSourceWrapper = speedDataSourceWrapper;
        this.mHybridData = initHybrid(speedDataSourceWrapper);
        this.mConfiguration = r3;
    }
}
