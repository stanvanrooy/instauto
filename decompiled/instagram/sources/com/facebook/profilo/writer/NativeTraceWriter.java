package com.facebook.profilo.writer;

import com.facebook.jni.HybridData;
import p000X.AnonymousClass0Y1;

public final class NativeTraceWriter {
    public HybridData mHybridData;

    public static native HybridData initHybrid(String str, String str2, NativeTraceWriterCallbacks nativeTraceWriterCallbacks);

    public native String getTraceFolder(long j);

    public native void loop();

    static {
        AnonymousClass0Y1.A08("profilo");
    }

    public NativeTraceWriter(String str, String str2, NativeTraceWriterCallbacks nativeTraceWriterCallbacks) {
        this.mHybridData = initHybrid(str, str2, nativeTraceWriterCallbacks);
    }
}
