package com.facebook.cameracore.mediapipeline.services.assistant.interfaces;

import com.facebook.jni.HybridData;

public class AssistantServiceCallbackHybrid {
    public final HybridData mHybridData;

    public native void onCommandTriggered(String str);

    public native void onIntentTriggered(String str, String str2, String[] strArr, String[] strArr2);

    public AssistantServiceCallbackHybrid(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
