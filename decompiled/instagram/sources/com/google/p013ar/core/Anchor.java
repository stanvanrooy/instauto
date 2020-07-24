package com.google.p013ar.core;

/* renamed from: com.google.ar.core.Anchor */
public class Anchor {
    private native void nativeDetach(long j, long j2);

    private native String nativeGetCloudAnchorId(long j, long j2);

    private native int nativeGetCloudAnchorState(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native void nativeReleaseAnchor(long j, long j2);

    public final boolean equals(Object obj) {
        if (!(obj instanceof Anchor)) {
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
