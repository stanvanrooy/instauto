package com.facebook.tigon.iface;

import com.facebook.jni.HybridData;

public abstract class TigonServiceHolder {
    public final HybridData mHybridData;

    public TigonServiceHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
