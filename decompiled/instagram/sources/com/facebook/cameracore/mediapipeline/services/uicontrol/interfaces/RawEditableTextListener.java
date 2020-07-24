package com.facebook.cameracore.mediapipeline.services.uicontrol.interfaces;

import com.facebook.jni.HybridData;

public class RawEditableTextListener {
    public HybridData mHybridData;

    public native void onExit();

    public native void onTextChanged(String str);

    public RawEditableTextListener(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
