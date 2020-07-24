package com.facebook.cameracore.mediapipeline.services.targeteffect.interfaces;

import com.facebook.jni.HybridData;

public class TargetEffectStateChangeListenerWrapper {
    public final HybridData mHybridData;

    public native void onDownloadFailed(String str, String str2);

    public native void onDownloadSucceeded(String str, String str2);

    public native void onProgress(String str, double d);

    public TargetEffectStateChangeListenerWrapper(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
