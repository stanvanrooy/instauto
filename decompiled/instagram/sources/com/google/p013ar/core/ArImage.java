package com.google.p013ar.core;

import java.nio.ByteBuffer;
import p000X.AnonymousClass8UV;

/* renamed from: com.google.ar.core.ArImage */
public class ArImage extends AnonymousClass8UV {
    private native void nativeClose(long j, long j2);

    private native ByteBuffer nativeGetBuffer(long j, long j2, int i);

    private native int nativeGetFormat(long j, long j2);

    private native int nativeGetHeight(long j, long j2);

    private native int nativeGetNumberOfPlanes(long j, long j2);

    private native int nativeGetPixelStride(long j, long j2, int i);

    private native int nativeGetRowStride(long j, long j2, int i);

    private native long nativeGetTimestamp(long j, long j2);

    private native int nativeGetWidth(long j, long j2);

    public static native void nativeLoadSymbols();
}
