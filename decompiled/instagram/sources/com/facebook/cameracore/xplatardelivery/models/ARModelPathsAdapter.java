package com.facebook.cameracore.xplatardelivery.models;

import com.facebook.cameracore.ardelivery.model.ModelPathsHolder;
import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import p000X.AnonymousClass3G3;

public class ARModelPathsAdapter {
    public final AnonymousClass3G3 mARModelPaths = new AnonymousClass3G3();

    public AnonymousClass3G3 getARModelPaths() {
        return this.mARModelPaths;
    }

    public void setModelPaths(int i, ModelPathsHolder modelPathsHolder) {
        this.mARModelPaths.A01(VersionedCapability.fromXplatValue(i), modelPathsHolder);
    }
}
