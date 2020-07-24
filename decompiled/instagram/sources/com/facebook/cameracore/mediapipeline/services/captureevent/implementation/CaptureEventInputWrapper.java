package com.facebook.cameracore.mediapipeline.services.captureevent.implementation;

import com.facebook.jni.HybridData;
import p000X.C708237v;

public class CaptureEventInputWrapper {
    public final C708237v mCaptureEventInput;
    public final HybridData mHybridData;

    public static native HybridData initHybrid(int i, int i2, int i3, int i4, float f);

    public native void capturePhoto();

    public native void finishCapturePhoto();

    public native void setCaptureContext(int i);

    public native void setCaptureDevicePosition(int i);

    public native void setCaptureDeviceSize(int i, int i2);

    public native void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    public native void setPreviewViewInfo(int i, int i2, float f);

    public native void setRotation(int i);

    public native void setZoomFactor(float f);

    public native void startRecording();

    public native void stopRecording();

    public CaptureEventInputWrapper(C708237v r6) {
        this.mCaptureEventInput = r6;
        this.mHybridData = initHybrid(r6.AUw(), r6.AUu(), r6.AUt(), r6.AUv(), r6.Ab2());
        r6.BiW(this);
    }
}
