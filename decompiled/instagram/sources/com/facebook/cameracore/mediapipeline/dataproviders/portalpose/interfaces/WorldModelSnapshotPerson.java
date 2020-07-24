package com.facebook.cameracore.mediapipeline.dataproviders.portalpose.interfaces;

import com.facebook.jni.HybridData;

public class WorldModelSnapshotPerson {
    public HybridData mHybridData;

    public static native HybridData initHybrid(int i, float[] fArr, float[] fArr2);
}
