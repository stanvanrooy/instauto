package com.facebook.xanalytics;

import com.facebook.jni.HybridData;

public abstract class XAnalyticsHolder {
    public final HybridData mHybridData;

    public abstract void cleanup();

    public abstract void flush();

    public abstract void logCounter(String str, long j);

    public abstract void logEvent(String str, String str2);

    public abstract void logEvent(String str, String str2, String str3);

    public abstract void logRealtimeEvent(String str, String str2);

    public abstract void logRealtimeEvent(String str, String str2, String str3);

    public XAnalyticsHolder(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
