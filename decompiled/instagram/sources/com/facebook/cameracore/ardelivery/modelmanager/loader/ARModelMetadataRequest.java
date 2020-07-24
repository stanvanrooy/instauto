package com.facebook.cameracore.ardelivery.modelmanager.loader;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;

public class ARModelMetadataRequest {
    public VersionedCapability mCapability;
    public int mMinVersion;
    public int mPreferredVersion;
    public int mRequestId;

    public String toString() {
        return this.mCapability + "-" + this.mMinVersion + "-" + this.mPreferredVersion;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int getPreferredVersion() {
        return this.mPreferredVersion;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public ARModelMetadataRequest(int i, int i2, int i3) {
        this(VersionedCapability.fromXplatValue(i), i2, i2);
        this.mRequestId = i3;
    }

    public ARModelMetadataRequest(VersionedCapability versionedCapability, int i, int i2) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
        this.mPreferredVersion = i2;
    }
}
