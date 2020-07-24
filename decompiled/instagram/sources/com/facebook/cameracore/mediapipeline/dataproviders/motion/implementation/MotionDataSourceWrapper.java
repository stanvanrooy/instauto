package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import com.facebook.jni.HybridData;
import p000X.C64052qW;
import p000X.C935542z;

public class MotionDataSourceWrapper {
    public final C64052qW mDataSource;
    public final HybridData mHybridData = initHybrid();
    public boolean mIsAlive = true;

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j);

    private native void setRawSensorResult(int i, float[] fArr, long j);

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public int getExecutionMode() {
        if (1 - this.mDataSource.ALO().intValue() != 0) {
            return 0;
        }
        return 1;
    }

    public boolean hasRawData() {
        return this.mDataSource.Ac5();
    }

    public boolean isSensorAvailable(int i) {
        return this.mDataSource.Ahe(i);
    }

    public void onDataChanged(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j) {
        if (this.mIsAlive) {
            setData(fArr, fArr2, fArr3, fArr4, j);
        }
    }

    public void onRawSensorMeasurementChanged(C935542z r2, float[] fArr, long j) {
        if (this.mIsAlive) {
            setRawSensorResult(r2.A00, fArr, j);
        }
    }

    public void start() {
        this.mDataSource.start();
    }

    public void stop() {
        this.mDataSource.stop();
    }

    public MotionDataSourceWrapper(C64052qW r2) {
        this.mDataSource = r2;
        this.mDataSource.BiU(this);
    }
}
