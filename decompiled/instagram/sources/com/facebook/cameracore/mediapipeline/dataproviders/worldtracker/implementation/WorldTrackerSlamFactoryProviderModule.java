package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.WorldTrackerSlamFactoryProvider;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class WorldTrackerSlamFactoryProviderModule extends WorldTrackerSlamFactoryProvider {
    public static native HybridData initHybrid();

    static {
        AnonymousClass0Y1.A08("slamfactoryprovider");
    }

    public WorldTrackerSlamFactoryProviderModule() {
        this.mHybridData = initHybrid();
    }
}
