package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import com.facebook.jni.HybridData;

public class AudioServiceController {
    public final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    public native int readCaptureSamples(short[] sArr, int i, int i2);

    public native int readPreviewSamples(short[] sArr, int i, int i2);

    public native void setCaptureEnabled(boolean z);

    public native void setPreviewEnabled(boolean z);
}
