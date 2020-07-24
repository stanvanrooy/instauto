package com.google.p013ar.core;

/* renamed from: com.google.ar.core.HitResult */
public class HitResult {
    private native long nativeCreateAnchor(long j, long j2);

    public static native void nativeDestroyHitResult(long j, long j2);

    private native float nativeGetDistance(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    public native long nativeAcquireTrackable(long j, long j2);

    public final boolean equals(Object obj) {
        if (!(obj instanceof HitResult)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Long l = 0L;
        return l.hashCode();
    }

    public final void finalize() {
        super.finalize();
    }
}
