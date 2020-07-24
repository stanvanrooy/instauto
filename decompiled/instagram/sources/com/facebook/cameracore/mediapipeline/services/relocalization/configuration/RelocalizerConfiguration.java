package com.facebook.cameracore.mediapipeline.services.relocalization.configuration;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class RelocalizerConfiguration {
    public HybridData mHybridData = initHybrid();

    private native int getRelocalizationStrategyNative();

    private native HybridData initHybrid();

    private native void setRelocalizationStrategyNative(int i);

    public native boolean getLogVisualizationDataToScubaAndHive();

    public native int getMinServerSideRelocInliers();

    public native int getNumFramesForScaleAlignment();

    public native double getRelocalizationInterval();

    public native boolean getServerDebugLogging();

    public native boolean getUseAnchorService();

    public native boolean getUsePriorForConsistentEstimation();

    public native boolean getUseScaleAlignment();

    public native void setLogVisualizationDataToScubaAndHive(boolean z);

    public native void setMinServerSideRelocInliers(int i);

    public native void setNumFramesForScaleAlignment(int i);

    public native void setRelocalizationInterval(double d);

    public native void setServerDebugLogging(boolean z);

    public native void setUseAnchorService(boolean z);

    public native void setUsePriorForConsistentEstimation(boolean z);

    public native void setUseScaleAlignment(boolean z);

    static {
        AnonymousClass0Y1.A08("relocalizer_configuration_native");
    }
}
