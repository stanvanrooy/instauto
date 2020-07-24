package com.facebook.cameracore.mediapipeline.dataproviders.portalpose.interfaces;

import com.facebook.jni.HybridData;

public class WorldModelSnapshot {
    public HybridData mHybridData;

    private native HybridData initHybrid(float[] fArr, WorldModelSnapshotPerson[] worldModelSnapshotPersonArr);
}
