package com.facebook.cameracore.mediapipeline.services.uicontrol.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces.UIControlServiceDelegateWrapper;
import com.facebook.jni.HybridData;
import com.facebook.react.uimanager.BaseViewManager;
import p000X.C65582tM;

public class UIControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C65582tM mConfiguration;

    public static native HybridData initHybrid(UIControlServiceDelegateWrapper uIControlServiceDelegateWrapper, float f);

    public UIControlServiceConfigurationHybrid(C65582tM r3) {
        super(initHybrid(r3.A00, BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER));
        this.mConfiguration = r3;
    }
}
