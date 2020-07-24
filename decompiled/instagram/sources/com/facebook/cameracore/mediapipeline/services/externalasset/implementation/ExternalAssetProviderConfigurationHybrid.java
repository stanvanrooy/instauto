package com.facebook.cameracore.mediapipeline.services.externalasset.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.externalasset.interfaces.ExternalAssetLocalDataSource;
import com.facebook.jni.HybridData;
import p000X.C65542tI;

public class ExternalAssetProviderConfigurationHybrid extends ServiceConfiguration {
    public final C65542tI mConfiguration;

    public static native HybridData initHybrid(ExternalAssetLocalDataSource externalAssetLocalDataSource);

    public ExternalAssetProviderConfigurationHybrid(C65542tI r2) {
        this.mConfiguration = r2;
        this.mHybridData = initHybrid(r2.A00);
    }
}
