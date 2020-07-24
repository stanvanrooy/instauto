package com.facebook.cameracore.mediapipeline.services.targeteffect.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.targeteffect.interfaces.TargetEffectServiceDelegate;
import com.facebook.jni.HybridData;
import p000X.C193378Pj;

public class TargetEffectServiceConfigurationHybrid extends ServiceConfiguration {
    public final C193378Pj mServiceConfiguration;

    public static native HybridData initHybrid(TargetEffectServiceDelegate targetEffectServiceDelegate);

    public TargetEffectServiceConfigurationHybrid(C193378Pj r2) {
        super(initHybrid(r2.A00));
        this.mServiceConfiguration = r2;
    }
}
