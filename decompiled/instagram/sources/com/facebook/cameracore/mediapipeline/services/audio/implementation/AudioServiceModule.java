package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C65502tD;
import p000X.C65522tF;

public class AudioServiceModule extends ServiceModule {
    public static native HybridData initHybrid();

    static {
        AnonymousClass0Y1.A08("audiographservice");
    }

    public ServiceConfiguration createConfiguration(C65502tD r3) {
        C65522tF r1;
        if (r3 == null || (r1 = r3.A0H) == null) {
            return null;
        }
        return new AudioServiceConfigurationHybrid(r1);
    }

    public AudioServiceModule() {
        this.mHybridData = initHybrid();
    }
}
