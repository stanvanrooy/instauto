package com.facebook.p012xr.remotemaps;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

/* renamed from: com.facebook.xr.remotemaps.RemoteMapsClient */
public abstract class RemoteMapsClient {
    public HybridData mHybridData;

    static {
        AnonymousClass0Y1.A08("xr_remotemaps_remotemapsclient_native");
    }

    public RemoteMapsClient(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
