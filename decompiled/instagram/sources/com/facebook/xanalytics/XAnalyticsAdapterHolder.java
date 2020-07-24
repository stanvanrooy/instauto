package com.facebook.xanalytics;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0YD;

public class XAnalyticsAdapterHolder extends XAnalyticsHolder {
    public final XAnalyticsAdapter mAdapter;

    public static native HybridData initHybrid(XAnalyticsAdapter xAnalyticsAdapter);

    public void cleanup() {
        this.mAdapter.cleanup();
    }

    public void flush() {
        this.mAdapter.flush();
    }

    public String getStructureSamplingConfig(String str) {
        return this.mAdapter.getStructureSamplingConfig(str);
    }

    public void logCounter(String str, long j) {
        this.mAdapter.logCounter(str, (double) j);
    }

    static {
        AnonymousClass0YD.A01("xanalyticsadapter-jni");
    }

    public XAnalyticsAdapterHolder(XAnalyticsAdapter xAnalyticsAdapter) {
        super(initHybrid(xAnalyticsAdapter));
        this.mAdapter = xAnalyticsAdapter;
    }

    public void logEvent(String str, String str2) {
        logEvent(str, str2, (String) null);
    }

    public void logEvent(String str, String str2, String str3) {
        this.mAdapter.logEvent(str, str2, str3, false, -1.0d);
    }

    public void logRealtimeEvent(String str, String str2) {
        this.mAdapter.logEvent(str, str2, (String) null, true, -1.0d);
    }

    public void logRealtimeEvent(String str, String str2, String str3) {
        this.mAdapter.logEvent(str, str2, str3, true, -1.0d);
    }
}
