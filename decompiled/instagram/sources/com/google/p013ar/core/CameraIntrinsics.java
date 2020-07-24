package com.google.p013ar.core;

/* renamed from: com.google.ar.core.CameraIntrinsics */
public class CameraIntrinsics {
    public long A00;
    public final long A01;
    public final Session A02;

    private native long nativeCreateIntrinsics(long j, float f, float f2, float f3, float f4, int i, int i2);

    private native void nativeDestroyCameraIntrinsics(long j, long j2);

    private native void nativeGetFocalLength(long j, long j2, float[] fArr, int i);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr, int i);

    private native void nativeGetPrincipalPoint(long j, long j2, float[] fArr, int i);

    public final void A00(float[] fArr) {
        nativeGetFocalLength(this.A02.nativeWrapperHandle, this.A00, fArr, 0);
    }

    public final void A01(float[] fArr) {
        nativeGetPrincipalPoint(this.A02.nativeWrapperHandle, this.A00, fArr, 2);
    }

    public final void A02(int[] iArr) {
        nativeGetImageDimensions(this.A02.nativeWrapperHandle, this.A00, iArr, 0);
    }

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeDestroyCameraIntrinsics(this.A01, j);
        }
        super.finalize();
    }

    public CameraIntrinsics() {
        this.A00 = 0;
        this.A02 = null;
        this.A00 = 0;
        this.A01 = 0;
    }

    public CameraIntrinsics(long j, Session session) {
        this.A00 = 0;
        this.A00 = j;
        this.A02 = session;
        this.A01 = session.nativeSymbolTableHandle;
    }
}
