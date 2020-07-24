package com.facebook.cameracore.mediapipeline.standalonetracking;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass8P7;

public class ManifestBuilder {
    public final HybridData mHybridData = initHybrid();

    private native void enableBodyTracking();

    private native void enableCapability(String str);

    private native void enableFaceExpressions();

    private native void enableFaceTracking(int i);

    private native void enableFaceTracking3D(int i);

    private native void enableHairSegmentation();

    private native void enableHandTracking(int i, boolean z);

    private native void enableLocation();

    private native void enablePersonSegmentation();

    private native void enableWorldTracking();

    public static native HybridData initHybrid();

    public ManifestBuilder withFaceTracking(int i) {
        enableFaceTracking(1);
        return this;
    }

    public ManifestBuilder() {
        AnonymousClass8P7.A00();
    }
}
