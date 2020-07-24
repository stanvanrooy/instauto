package com.facebook.cameracore.mediapipeline.arclass.common;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class ARClassSource {
    public HybridData mHybridData;

    public static native HybridData initHybrid(ARClassRemoteSource aRClassRemoteSource, ARClassPersistentStore aRClassPersistentStore, ARClassConfigSource aRClassConfigSource);

    public native ARClass getARClass();

    static {
        AnonymousClass0Y1.A08("arclass");
    }

    public ARClassSource(ARClassRemoteSource aRClassRemoteSource, ARClassPersistentStore aRClassPersistentStore, ARClassConfigSource aRClassConfigSource) {
        this.mHybridData = initHybrid(aRClassRemoteSource, aRClassPersistentStore, (ARClassConfigSource) null);
    }

    public ARClassSource(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
