package com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces;

import com.facebook.jni.HybridData;

public class LocationData {
    public HybridData mHybridData;

    private native HybridData initHybrid(boolean z, double d, double d2, double d3);

    public LocationData(boolean z, double d, double d2, double d3) {
        this.mHybridData = initHybrid(z, d, d2, d3);
    }
}
