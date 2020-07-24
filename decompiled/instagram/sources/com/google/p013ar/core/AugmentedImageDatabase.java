package com.google.p013ar.core;

import java.nio.ByteBuffer;

/* renamed from: com.google.ar.core.AugmentedImageDatabase */
public class AugmentedImageDatabase {
    private native int nativeAddImage(long j, long j2, String str, ByteBuffer byteBuffer, int i, int i2, int i3);

    private native int nativeAddImageWithPhysicalSize(long j, long j2, String str, ByteBuffer byteBuffer, int i, int i2, int i3, float f);

    public static native long nativeCreate(long j);

    public static native long nativeDeserialize(long j, ByteBuffer byteBuffer);

    private native int nativeGetNumImages(long j, long j2);

    private native void nativeReleaseDatabase(long j, long j2);

    private native ByteBuffer nativeSerialize(long j, long j2);
}
