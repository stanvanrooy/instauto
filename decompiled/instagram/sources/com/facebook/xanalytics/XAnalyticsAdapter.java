package com.facebook.xanalytics;

public interface XAnalyticsAdapter {
    void cleanup();

    void flush();

    String getStructureSamplingConfig(String str);

    void logCounter(String str, double d);

    void logEvent(String str, String str2, String str3, boolean z, double d);

    void logEventBypassSampling(String str, String str2);

    boolean shouldLog(String str);
}
