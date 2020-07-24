package com.facebook.cameracore.mediapipeline.dataproviders.instantgames.interfaces;

import p000X.C30767DjW;

public class InstantGameDataProviderConfiguration {
    public final C30767DjW mDataSource;

    public String getInputData() {
        return this.mDataSource.getInitialDataForEffect();
    }

    public InstantGameDataProviderConfiguration(C30767DjW djW) {
        this.mDataSource = djW;
    }

    public InstantGameServiceDelegate getServiceDelegate() {
        return this.mDataSource;
    }
}
