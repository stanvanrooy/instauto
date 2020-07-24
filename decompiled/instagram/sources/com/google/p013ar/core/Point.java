package com.google.p013ar.core;

/* renamed from: com.google.ar.core.Point */
public class Point extends TrackableBase {
    private native int nativeGetOrientationMode(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native Pose nativeGetPoseFromDistanceGuess(long j, long j2);

    private native Pose nativeGetPoseFromRealDepth(long j, long j2);

    private native int nativeGetTrackingMethod(long j, long j2);

    public Point() {
        super(0, (Session) null);
    }

    public Point(long j, Session session) {
        super(j, session);
    }
}
