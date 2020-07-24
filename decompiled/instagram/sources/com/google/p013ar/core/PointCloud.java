package com.google.p013ar.core;

import java.io.Closeable;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import p000X.B9T;

/* renamed from: com.google.ar.core.PointCloud */
public class PointCloud implements Closeable {
    public long A00;
    public final long A01;
    public final Session A02;

    private native ByteBuffer nativeGetData(long j, long j2);

    private native ByteBuffer nativeGetIds(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    private native void nativeReleasePointCloud(long j, long j2);

    public final FloatBuffer A00() {
        long j = this.A00;
        if (j != 0) {
            return Session.directByteBufferOrDefault(nativeGetData(this.A02.nativeWrapperHandle, j)).asFloatBuffer();
        }
        throw new B9T();
    }

    public final IntBuffer A01() {
        long j = this.A00;
        if (j != 0) {
            return Session.directByteBufferOrDefault(nativeGetIds(this.A02.nativeWrapperHandle, j)).asIntBuffer();
        }
        throw new B9T();
    }

    public final void close() {
        nativeReleasePointCloud(this.A01, this.A00);
        this.A00 = 0;
    }

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeReleasePointCloud(this.A01, j);
        }
        super.finalize();
    }

    public PointCloud() {
        this.A00 = 0;
        this.A02 = null;
        this.A00 = 0;
        this.A01 = 0;
    }

    public PointCloud(Session session, long j) {
        this.A00 = 0;
        this.A02 = session;
        this.A00 = j;
        this.A01 = session.nativeSymbolTableHandle;
    }
}
