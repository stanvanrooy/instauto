package com.facebook.cameracore.mediapipeline.arclass.common;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class ARClass {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(int i, boolean z, long j);

    public native long getRefreshTimeSeconds();

    public native int getValue();

    public native boolean isValid();

    static {
        AnonymousClass0Y1.A08("arclass");
    }

    public ARClass(int i, boolean z, long j) {
        this.mHybridData = initHybrid(i, z, j);
    }

    public ARClass(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
