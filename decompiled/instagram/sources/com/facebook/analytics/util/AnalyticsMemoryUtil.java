package com.facebook.analytics.util;

import p000X.AnonymousClass0Y1;

public final class AnalyticsMemoryUtil {
    public static native String[] getLoadedLibraries();

    public static native long getPeakRss();

    static {
        AnonymousClass0Y1.A08("analyticsutil-jni");
    }
}
