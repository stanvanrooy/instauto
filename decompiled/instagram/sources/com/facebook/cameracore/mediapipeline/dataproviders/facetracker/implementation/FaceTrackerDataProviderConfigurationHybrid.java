package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import com.facebook.jni.HybridData;
import p000X.C193368Ph;
import p000X.C65602tQ;

public class FaceTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C65602tQ mConfiguration;

    public FaceTrackerDataProviderConfigurationHybrid(C65602tQ r12) {
        super(initHybrid(0, C193368Ph.A00(r12.A01), r12.A02, r12.A03, r12.A05, r12.A04, r12.A00, r12.A06, (Integer) null, (Integer) null));
        this.mConfiguration = r12;
    }

    public static native HybridData initHybrid(int i, int i2, boolean z, boolean z2, String[] strArr, String[] strArr2, FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler faceTrackerDataProviderConfiguration$FaceTrackerErrorHandler, boolean z3, Integer num, Integer num2);
}
