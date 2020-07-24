package com.facebook.common.networkreachability;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;
import p000X.BV4;
import p000X.BV7;

public class AndroidReachabilityListener {
    public static final Class TAG = AndroidReachabilityListener.class;
    public final HybridData mHybridData;
    public final NetworkStateInfo mNetworkStateInfo;
    public final BV4 mNetworkTypeProvider;

    private native HybridData initHybrid(NetworkStateInfo networkStateInfo);

    public native void networkStateChanged(int i, int i2);

    static {
        AnonymousClass0Y1.A08("android-reachability-announcer");
    }

    public AndroidReachabilityListener(BV4 bv4) {
        BV7 bv7 = new BV7(this);
        this.mNetworkStateInfo = bv7;
        this.mHybridData = initHybrid(bv7);
        this.mNetworkTypeProvider = bv4;
    }
}
