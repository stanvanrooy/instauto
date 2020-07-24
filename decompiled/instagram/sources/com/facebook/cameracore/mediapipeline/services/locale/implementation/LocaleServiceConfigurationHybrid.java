package com.facebook.cameracore.mediapipeline.services.locale.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.services.locale.interfaces.LocaleDataSource;
import com.facebook.jni.HybridData;
import p000X.C65552tJ;

public class LocaleServiceConfigurationHybrid extends ServiceConfiguration {
    public final C65552tJ mConfiguration;

    public static native HybridData initHybrid(LocaleDataSource localeDataSource);

    public LocaleServiceConfigurationHybrid(C65552tJ r2) {
        super(initHybrid(r2.A00));
        this.mConfiguration = r2;
    }
}
