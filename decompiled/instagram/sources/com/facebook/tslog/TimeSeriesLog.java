package com.facebook.tslog;

import p000X.AnonymousClass0Y1;

public class TimeSeriesLog {
    public long A00 = nativeInit("igvc", 60, 0);

    public static native void nativeDispose(long j);

    public static native void nativeFlushBucket(long j);

    public static native long nativeInit(String str, int i, long j);

    public static native void nativeStart(long j);

    public static native void nativeStop(long j);

    public static native String nativeToString(long j);

    static {
        AnonymousClass0Y1.A08("tslog-jni");
    }
}
