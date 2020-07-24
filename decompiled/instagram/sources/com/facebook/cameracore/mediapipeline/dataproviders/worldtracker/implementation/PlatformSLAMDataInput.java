package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ExternalSLAMDataInput;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class PlatformSLAMDataInput extends ExternalSLAMDataInput {
    public static native HybridData initHybrid();

    private native void nativeConsumeSLAMData(float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int[] iArr2, int i, int i2);

    static {
        AnonymousClass0Y1.A08("platformslamdatainput");
    }

    public PlatformSLAMDataInput() {
        this.mHybridData = initHybrid();
    }

    public void consumeWorldTrackingData(float[] fArr, float[] fArr2, float[] fArr3, int[] iArr, int[] iArr2, int i, int i2) {
        nativeConsumeSLAMData(fArr, fArr2, fArr3, iArr, iArr2, i, i2);
    }
}
