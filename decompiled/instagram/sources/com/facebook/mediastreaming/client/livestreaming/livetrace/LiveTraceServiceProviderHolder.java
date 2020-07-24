package com.facebook.mediastreaming.client.livestreaming.livetrace;

import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import p000X.AnonymousClass0Y1;

public class LiveTraceServiceProviderHolder extends ServiceProviderHolder {
    private native void initHybrid();

    static {
        AnonymousClass0Y1.A08("mediastreaming-livetrace");
    }

    public LiveTraceServiceProviderHolder() {
        initHybrid();
    }
}
