package com.facebook.cameracore.mediapipeline.dataproviders.speed.implementation;

import com.facebook.jni.HybridData;
import p000X.C64192qm;

public class SpeedDataSourceWrapper {
    public final C64192qm mDataSource;
    public final HybridData mHybridData = initHybrid();

    private native HybridData initHybrid();

    private native void setSpeedInKph(float f);

    public void destroy() {
        this.mHybridData.resetNative();
    }

    public void start() {
        this.mDataSource.start();
    }

    public SpeedDataSourceWrapper(C64192qm r2) {
        this.mDataSource = r2;
        this.mDataSource.BiV(this);
    }

    public void onNewDataAvailable(float f) {
        setSpeedInKph(f);
    }
}
