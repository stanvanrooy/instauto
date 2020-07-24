package com.facebook.cameracore.mediapipeline.dataproviders.location.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.location.interfaces.LocationDataProvider;
import com.facebook.jni.HybridData;
import p000X.C64222qp;

public class LocationDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C64222qp mConfiguration;

    private native HybridData initHybrid();

    private LocationDataProvider createLocationDataProvider() {
        LocationDataProviderImpl locationDataProviderImpl = new LocationDataProviderImpl();
        this.mConfiguration.A00 = locationDataProviderImpl;
        return locationDataProviderImpl;
    }

    public LocationDataProviderConfigurationHybrid(C64222qp r2) {
        this.mHybridData = initHybrid();
        this.mConfiguration = r2;
    }
}
