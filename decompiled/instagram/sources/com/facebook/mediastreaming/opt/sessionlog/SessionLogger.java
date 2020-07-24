package com.facebook.mediastreaming.opt.sessionlog;

import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import p000X.AnonymousClass0Y1;

public class SessionLogger extends ServiceProviderHolder {
    private native void initHybrid(String str);

    private native void logMetadata(int i, String str);

    static {
        AnonymousClass0Y1.A08("mediastreaming-sessionlog");
    }

    public SessionLogger(String str) {
        initHybrid(str);
    }
}
