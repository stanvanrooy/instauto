package com.facebook.hybridlogsink;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public class HybridLogSink {
    public final HybridData mHybridData = initHybrid(1000);

    public static native HybridData initHybrid(int i);

    public native String[] getLogMessages();

    static {
        AnonymousClass0Y1.A08("hybridlogsinkjni");
    }
}
