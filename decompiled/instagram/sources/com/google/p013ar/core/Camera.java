package com.google.p013ar.core;

import p000X.Constants;
import p000X.B84;
import p000X.B88;

/* renamed from: com.google.ar.core.Camera */
public class Camera {
    public long A00;
    public final long A01;
    public final Session A02;

    public static native long nativeAcquireCamera(long j, long j2);

    private native long nativeCreateCameraIntrinsics(long j);

    private native Pose nativeDisplayOrientedPose(long j, long j2);

    private native void nativeGetImageIntrinsics(long j, long j2, long j3);

    private native Pose nativeGetPose(long j, long j2);

    private native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);

    private native void nativeGetTextureIntrinsics(long j, long j2, long j3);

    private native int nativeGetTrackingFailureReason(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    public static native void nativeReleaseCamera(long j, long j2);

    public final CameraIntrinsics A00() {
        long nativeCreateCameraIntrinsics = nativeCreateCameraIntrinsics(this.A02.nativeWrapperHandle);
        Session session = this.A02;
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics, session);
        nativeGetImageIntrinsics(session.nativeWrapperHandle, this.A00, cameraIntrinsics.A00);
        return cameraIntrinsics;
    }

    public final Pose A01() {
        return nativeGetPose(this.A02.nativeWrapperHandle, this.A00);
    }

    public final Integer A02() {
        int i;
        int nativeGetTrackingFailureReason = nativeGetTrackingFailureReason(this.A02.nativeWrapperHandle, this.A00);
        for (Integer num : Constants.ZERO(6)) {
            switch (num.intValue()) {
                case 1:
                    i = 1;
                    break;
                case 2:
                    i = 2;
                    break;
                case 3:
                    i = 3;
                    break;
                case 4:
                    i = 4;
                    break;
                case 5:
                    i = 5;
                    break;
                default:
                    i = 0;
                    break;
            }
            if (i == nativeGetTrackingFailureReason) {
                return num;
            }
        }
        StringBuilder sb = new StringBuilder(68);
        sb.append("Unexpected value for native TrackingFailureReason, value=");
        sb.append(nativeGetTrackingFailureReason);
        throw new B84(sb.toString());
    }

    public final Integer A03() {
        return B88.A00(nativeGetTrackingState(this.A02.nativeWrapperHandle, this.A00));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Camera) || ((Camera) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeReleaseCamera(this.A01, j);
        }
        super.finalize();
    }

    public final int hashCode() {
        return Long.valueOf(this.A00).hashCode();
    }

    public Camera() {
        this.A02 = null;
        this.A00 = 0;
        this.A01 = 0;
    }

    public Camera(Session session, Frame frame) {
        this.A02 = session;
        this.A00 = nativeAcquireCamera(session.nativeWrapperHandle, frame.A00);
        this.A01 = session.nativeSymbolTableHandle;
    }
}
