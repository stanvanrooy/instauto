package com.facebook.quicklog.xplat;

import com.facebook.jni.HybridData;
import com.facebook.xanalytics.XAnalyticsHolder;
import p000X.AnonymousClass0Y1;

public class QPLXplatInitializerImpl {
    public final HybridData mHybridData = initHybrid();

    public static native HybridData initHybrid();

    public static native void setupNativeQPLWithXAnalyticsHolder(XAnalyticsHolder xAnalyticsHolder);

    static {
        AnonymousClass0Y1.A08("perfloggerxplat_init");
    }
}
