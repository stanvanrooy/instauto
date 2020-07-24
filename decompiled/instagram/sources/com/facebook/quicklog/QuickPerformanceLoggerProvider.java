package com.facebook.quicklog;

public class QuickPerformanceLoggerProvider {
    public static QuickPerformanceLogger mQuickPerformanceLogger;

    public static QuickPerformanceLogger getQPLInstance() {
        QuickPerformanceLogger quickPerformanceLogger = mQuickPerformanceLogger;
        if (quickPerformanceLogger != null) {
            return quickPerformanceLogger;
        }
        return null;
    }
}
