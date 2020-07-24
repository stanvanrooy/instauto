package com.facebook.cameracore.xplatardelivery.modelmanager;

import com.facebook.jni.HybridData;
import java.util.List;
import p000X.AnonymousClass0Y1;

public class ModelMetadataDownloaderCompletionCallbackJNI {
    public final HybridData mHybridData;

    public native void onFailure(String str);

    public native void onSuccess(List list);

    static {
        AnonymousClass0Y1.A08("ard-android-model-manager");
    }

    public ModelMetadataDownloaderCompletionCallbackJNI(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
