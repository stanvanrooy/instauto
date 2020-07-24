package com.facebook.cameracore.mediapipeline.services.captureevent.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import p000X.C64012qR;

public class CaptureEventServiceConfigurationHybrid extends ServiceConfiguration {
    public final CaptureEventInputWrapper mCaptureEventInputWrapper;
    public final C64012qR mConfiguration;

    public static native HybridData initHybrid(CaptureEventInputWrapper captureEventInputWrapper);

    public CaptureEventServiceConfigurationHybrid(C64012qR r3) {
        this.mConfiguration = r3;
        CaptureEventInputWrapper captureEventInputWrapper = new CaptureEventInputWrapper(r3.A00);
        this.mCaptureEventInputWrapper = captureEventInputWrapper;
        this.mHybridData = initHybrid(captureEventInputWrapper);
    }
}
