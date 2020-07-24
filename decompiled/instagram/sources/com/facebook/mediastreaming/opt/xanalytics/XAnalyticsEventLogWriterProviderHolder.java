package com.facebook.mediastreaming.opt.xanalytics;

import com.facebook.mediastreaming.client.livestreaming.interfaces.ServiceProviderHolder;
import com.facebook.xanalytics.XAnalyticsHolder;
import p000X.AnonymousClass0Y1;

public class XAnalyticsEventLogWriterProviderHolder extends ServiceProviderHolder {
    private native void initHybrid(XAnalyticsHolder xAnalyticsHolder);

    static {
        AnonymousClass0Y1.A08("mediastreaming-xanalytics");
    }

    public XAnalyticsEventLogWriterProviderHolder(XAnalyticsHolder xAnalyticsHolder) {
        initHybrid(xAnalyticsHolder);
    }
}
