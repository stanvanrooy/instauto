package com.facebook.cameracore.mediapipeline.dataproviders.volume.interfaces;

import com.facebook.jni.HybridData;

public abstract class VolumeDataProvider {
    public HybridData mHybridData;

    public abstract void destroy();
}
