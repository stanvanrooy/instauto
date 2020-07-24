package com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces;

import com.facebook.jni.HybridData;

public abstract class ARExperimentConfig {
    public HybridData mHybridData;

    public abstract boolean getBool(int i, boolean z);

    public abstract double getDouble(int i, double d);

    public abstract long getLong(int i, long j);

    public abstract String getString(int i, String str);

    public abstract void release();
}
