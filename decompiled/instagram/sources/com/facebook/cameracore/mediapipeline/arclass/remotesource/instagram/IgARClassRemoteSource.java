package com.facebook.cameracore.mediapipeline.arclass.remotesource.instagram;

import com.facebook.cameracore.mediapipeline.arclass.common.ARClassRemoteSource;
import com.facebook.jni.HybridData;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass0Y1;

public class IgARClassRemoteSource extends ARClassRemoteSource {
    public static native HybridData initHybrid(IgARClassRemoteSourceFetcher igARClassRemoteSourceFetcher);

    static {
        AnonymousClass0Y1.A08("arclass-ig");
    }

    public IgARClassRemoteSource(AnonymousClass0C1 r2) {
        super(initHybrid(new IgARClassRemoteSourceFetcher(r2)));
    }
}
