package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import p000X.C64132qg;

public class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C64132qg mConfiguration;
    public final PlatformEventsServiceObjectsWrapper mObjectsWrapper;

    public static native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);

    public PlatformEventsDataProviderConfigurationHybrid(C64132qg r4) {
        this.mConfiguration = r4;
        PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper = new PlatformEventsServiceObjectsWrapper(r4.A01, r4.A00);
        this.mObjectsWrapper = platformEventsServiceObjectsWrapper;
        this.mHybridData = initHybrid(platformEventsServiceObjectsWrapper);
    }
}
