package com.facebook.common.perfcounter;

public class PerfCounter {
    public static volatile int A00 = -1;
    public static int A01;
    public static final Object A02 = new Object();
    public static volatile boolean A03;

    public static native boolean nativeBegin();

    public static native void nativeEnd();

    public static native void nativeReport(Object obj);
}
