package com.facebook.hermes.instrumentation;

import p000X.AnonymousClass0Y1;

public class HermesSamplingProfiler {
    public static native void disable();

    public static native void dumpSampledTraceToFile(String str);

    public static native void enable();

    static {
        AnonymousClass0Y1.A08("jsijniprofiler");
    }
}
