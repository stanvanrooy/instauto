package com.google.p013ar.core;

import java.util.EnumSet;
import java.util.Iterator;
import p000X.C25755BYa;

/* renamed from: com.google.ar.core.CameraConfigFilter */
public class CameraConfigFilter {
    public long A00;
    public final long A01;
    public final Session A02;

    public static native long nativeCreateCameraConfigFilter(long j);

    public static native void nativeDestroyCameraConfigFilter(long j, long j2);

    private native void nativeSetDepthSensorUsage(long j, long j2, int i);

    private native void nativeSetTargetFps(long j, long j2, int i);

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeDestroyCameraConfigFilter(this.A01, j);
            this.A00 = 0;
        }
        super.finalize();
    }

    public final void A00(EnumSet enumSet) {
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((C25755BYa) it.next()).A00;
        }
        nativeSetTargetFps(this.A02.nativeWrapperHandle, this.A00, i);
    }

    public CameraConfigFilter() {
        this.A02 = null;
        this.A00 = 0;
        this.A01 = 0;
    }

    public CameraConfigFilter(Session session) {
        this.A02 = session;
        this.A00 = nativeCreateCameraConfigFilter(session.nativeWrapperHandle);
        this.A01 = session.nativeSymbolTableHandle;
    }
}
