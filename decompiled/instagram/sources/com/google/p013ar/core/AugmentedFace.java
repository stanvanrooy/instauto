package com.google.p013ar.core;

import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* renamed from: com.google.ar.core.AugmentedFace */
public class AugmentedFace extends TrackableBase {
    public FloatBuffer A00;
    public FloatBuffer A01;
    public FloatBuffer A02;
    public ShortBuffer A03;

    private native Pose nativeGetCenterPose(long j, long j2);

    private native ByteBuffer nativeGetMeshNormalsByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTextureCoordinatesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshTriangleIndicesByteBuffer(long j, long j2);

    private native ByteBuffer nativeGetMeshVerticesByteBuffer(long j, long j2);

    private native Pose nativeGetRegionPose(long j, long j2, int i);

    public AugmentedFace() {
        super(0, (Session) null);
    }

    public AugmentedFace(long j, Session session) {
        super(j, session);
        this.A02 = Session.directByteBufferOrDefault(nativeGetMeshVerticesByteBuffer(this.A01.nativeWrapperHandle, this.A00)).asFloatBuffer();
        this.A00 = Session.directByteBufferOrDefault(nativeGetMeshNormalsByteBuffer(this.A01.nativeWrapperHandle, this.A00)).asFloatBuffer();
        this.A01 = Session.directByteBufferOrDefault(nativeGetMeshTextureCoordinatesByteBuffer(this.A01.nativeWrapperHandle, this.A00)).asFloatBuffer();
        this.A03 = Session.directByteBufferOrDefault(nativeGetMeshTriangleIndicesByteBuffer(this.A01.nativeWrapperHandle, this.A00)).asShortBuffer();
    }
}
