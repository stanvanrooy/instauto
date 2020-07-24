package com.facebook.cameracore.mediapipeline.effectasyncassetfetcher;

import com.facebook.jni.HybridData;

public class OnAsyncAssetFetchCompletedListener {
    public HybridData mHybridData;

    public native void OnAsyncAssetFetchCompleted(String str, String str2);

    public OnAsyncAssetFetchCompletedListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
