package com.facebook.cameracore.mediapipeline.services.haptic.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class HapticServiceConfigurationHybrid extends ServiceConfiguration {
    public static native HybridData initHybrid(HapticServiceDelegateWrapper hapticServiceDelegateWrapper);
}
