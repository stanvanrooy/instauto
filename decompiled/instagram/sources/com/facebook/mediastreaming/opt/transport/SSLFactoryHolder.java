package com.facebook.mediastreaming.opt.transport;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class SSLFactoryHolder {
    public HybridData mHybridData;

    private native HybridData initHybrid(String str, boolean z, Object obj);

    public HybridData initHybridData(String str, boolean z, Object obj) {
        return initHybrid(str, false, obj);
    }

    static {
        AnonymousClass0Y1.A08("mediastreaming-transport");
    }
}
