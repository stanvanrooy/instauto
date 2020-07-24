package com.google.p013ar.core;

import p000X.B88;

/* renamed from: com.google.ar.core.TrackableBase */
public class TrackableBase {
    public long A00;
    public final Session A01;
    public final long A02;

    private native long nativeCreateAnchor(long j, long j2, Pose pose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    public static native int nativeGetType(long j, long j2);

    public static native void nativeReleaseTrackable(long j, long j2);

    public Integer A00() {
        return B88.A00(nativeGetTrackingState(this.A01.nativeWrapperHandle, this.A00));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TrackableBase) || ((TrackableBase) obj).A00 != this.A00) {
            return false;
        }
        return true;
    }

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeReleaseTrackable(this.A02, j);
            this.A00 = 0;
        }
        super.finalize();
    }

    public int hashCode() {
        return Long.valueOf(this.A00).hashCode();
    }

    public TrackableBase(long j, Session session) {
        long j2;
        this.A01 = session;
        this.A00 = j;
        if (session == null) {
            j2 = 0;
        } else {
            j2 = session.nativeSymbolTableHandle;
        }
        this.A02 = j2;
    }
}
