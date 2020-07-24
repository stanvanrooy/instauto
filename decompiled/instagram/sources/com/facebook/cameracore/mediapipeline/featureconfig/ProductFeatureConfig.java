package com.facebook.cameracore.mediapipeline.featureconfig;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.C193348Pe;

public final class ProductFeatureConfig {
    public final HybridData mHybridData;

    public static native HybridData initHybrid(boolean z, boolean z2, int i);

    static {
        AnonymousClass0Y1.A08("featureconfig");
    }

    public ProductFeatureConfig() {
        this(new C193348Pe());
    }

    public ProductFeatureConfig(C193348Pe r4) {
        this.mHybridData = initHybrid(true, r4.A01, r4.A00);
    }

    public ProductFeatureConfig(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
