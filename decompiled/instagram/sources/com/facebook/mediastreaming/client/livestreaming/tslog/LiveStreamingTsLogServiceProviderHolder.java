package com.facebook.mediastreaming.client.livestreaming.tslog;

import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import p000X.AnonymousClass0Y1;

public class LiveStreamingTsLogServiceProviderHolder extends ServiceProviderHolder {
    private native void initHybrid();

    static {
        AnonymousClass0Y1.A08("mediastreaming-tslog");
    }

    public LiveStreamingTsLogServiceProviderHolder() {
        initHybrid();
    }
}
