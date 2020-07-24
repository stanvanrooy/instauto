package com.facebook.cameracore.xplatardelivery.modelmanager;

import com.facebook.cameracore.ardelivery.model.VersionedCapability;
import p000X.AnonymousClass0CW;
import p000X.AnonymousClass3CM;
import p000X.AnonymousClass3G5;

public class ModelManagerConfig {
    public final AnonymousClass3CM mCameraCoreExperimentUtil;
    public final AnonymousClass3G5 mModelVersionFetcher;

    public int getLatestSupportedVersionForCapability(int i) {
        AnonymousClass3G5 r4 = this.mModelVersionFetcher;
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        AnonymousClass0CW.A03(fromXplatValue, "Unrecognized versioned capability passed from xplat stack : %d", Integer.valueOf(i));
        return r4.AST(fromXplatValue);
    }

    public boolean isBrotliModelCompressionSupported() {
        return this.mCameraCoreExperimentUtil.BX4();
    }

    public ModelManagerConfig(AnonymousClass3G5 r1, AnonymousClass3CM r2) {
        this.mModelVersionFetcher = r1;
        this.mCameraCoreExperimentUtil = r2;
    }
}
