package com.facebook.cameracore.mediapipeline.services.componentsynclistener.interfaces;

import com.facebook.jni.HybridData;

public abstract class ComponentSyncListener {
    public HybridData mHybridData;

    public native void flushLogs();
}
