package com.facebook.cameracore.mediapipeline.services.music.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.music.interfaces.MusicServiceDataSource;
import com.facebook.jni.HybridData;
import p000X.C65562tK;

public class MusicServiceConfigurationHybrid extends ServiceConfiguration {
    public final C65562tK mConfiguration;

    public static native HybridData initHybrid(MusicServiceDataSource musicServiceDataSource);
}
