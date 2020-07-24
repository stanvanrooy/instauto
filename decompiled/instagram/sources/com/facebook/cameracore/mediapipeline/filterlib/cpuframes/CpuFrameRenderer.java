package com.facebook.cameracore.mediapipeline.filterlib.cpuframes;

import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import p000X.AnonymousClass0Y1;

public class CpuFrameRenderer {
    public final HybridData mHybridData;

    public static native HybridData initHybrid();

    private native void uploadTexturesFromI420(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, int i5, int i6, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i7, int i8);

    private native void uploadTexturesFromNV21(int i, int i2, int i3, int i4, byte[] bArr);

    static {
        AnonymousClass0Y1.A08("mediapipeline-filterlib");
    }
}
