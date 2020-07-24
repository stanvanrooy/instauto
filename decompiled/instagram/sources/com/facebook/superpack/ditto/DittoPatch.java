package com.facebook.superpack.ditto;

import java.io.Closeable;
import java.io.InputStream;
import p000X.AnonymousClass0Y1;

public final class DittoPatch implements Closeable {
    public static native long applyNative(long j, long j2);

    public static native void closeNative(long j);

    public static native long readNative(InputStream inputStream);

    public final synchronized void close() {
        throw new IllegalStateException();
    }

    static {
        AnonymousClass0Y1.A08("ditto-jni");
    }
}
