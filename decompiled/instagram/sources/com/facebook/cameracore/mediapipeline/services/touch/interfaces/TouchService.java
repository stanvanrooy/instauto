package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

import com.facebook.jni.HybridData;
import p000X.C30502DdS;
import p000X.C30511Ddi;

public abstract class TouchService {
    public HybridData mHybridData;

    public abstract C30502DdS getGestureProcessor();

    public abstract void setTouchConfig(C30511Ddi ddi);

    public TouchService(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
