package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ExternalSLAMDataInput;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C65502tD;
import p000X.C65622tS;

public class WorldTrackerDataProviderModule extends ServiceModule {
    public PlatformSLAMDataInput mSlamDataInput;

    private native HybridData initHybrid();

    public ServiceConfiguration createConfiguration(C65502tD r3) {
        C65622tS r1;
        if (r3 == null || (r1 = r3.A0E) == null) {
            return null;
        }
        return new WorldTrackerDataProviderConfigurationHybrid(r1);
    }

    public ExternalSLAMDataInput createSLAMDataInput() {
        if (this.mSlamDataInput == null) {
            this.mSlamDataInput = new PlatformSLAMDataInput();
        }
        return this.mSlamDataInput;
    }

    static {
        AnonymousClass0Y1.A08("worldtrackerdataprovider");
    }

    public WorldTrackerDataProviderModule() {
        this.mHybridData = initHybrid();
    }
}
