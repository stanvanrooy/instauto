package com.facebook.cameracore.mediapipeline.services.live.interfaces;

import com.facebook.jni.HybridData;

public class LiveCommentAggregationCallback {
    public HybridData mHybridData;

    private native void callCallbackNative(String[] strArr, int[] iArr);

    public LiveCommentAggregationCallback(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
