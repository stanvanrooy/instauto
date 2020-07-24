package com.facebook.profilo.provider.threadmetadata;

import com.facebook.profilo.ipc.TraceContext;
import p000X.C09630bj;
import p000X.C09640bk;

public final class ThreadMetadataProvider extends C09630bj {
    public static native void nativeLogThreadMetadata();

    public ThreadMetadataProvider() {
        super("profilo_threadmetadata");
    }

    public void logOnTraceEnd(TraceContext traceContext, C09640bk r2) {
        nativeLogThreadMetadata();
    }
}
