package com.facebook.cameracore.mediapipeline.arengineservices.interfaces;

import com.facebook.jni.HybridData;

public abstract class ExternalSLAMDataInput {
    public HybridData mHybridData;

    public abstract void consumeWorldTrackingData(float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int[] iArr2, int i, int i2);
}
