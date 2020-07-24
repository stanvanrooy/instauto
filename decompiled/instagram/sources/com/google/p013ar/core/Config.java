package com.google.p013ar.core;

/* renamed from: com.google.ar.core.Config */
public class Config {
    public long A00;
    public final long A01;
    public final Session A02;

    public static native long nativeCreate(long j);

    public static native void nativeDestroy(long j, long j2);

    private native int nativeGetAugmentedFaceMode(long j, long j2);

    private native long nativeGetAugmentedImageDatabase(long j, long j2);

    private native int nativeGetCloudAnchorMode(long j, long j2);

    private native int nativeGetFocusMode(long j, long j2);

    private native int nativeGetInstantPlacementMode(long j, long j2);

    private native int nativeGetLightEstimationMode(long j, long j2);

    private native int nativeGetPlaneFindingMode(long j, long j2);

    private native int nativeGetUpdateMode(long j, long j2);

    private native void nativeSetAugmentedFaceMode(long j, long j2, int i);

    private native void nativeSetAugmentedImageDatabase(long j, long j2, long j3);

    private native void nativeSetCloudAnchorMode(long j, long j2, int i);

    private native void nativeSetFocusMode(long j, long j2, int i);

    private native void nativeSetInstantPlacementMode(long j, long j2, int i);

    private native void nativeSetLightEstimationMode(long j, long j2, int i);

    private native void nativeSetPlaneFindingMode(long j, long j2, int i);

    private native void nativeSetUpdateMode(long j, long j2, int i);

    private native void nativeUnsetAugmentedImageDatabase(long j, long j2);

    public final void A00(Integer num) {
        int i;
        long j = this.A02.nativeWrapperHandle;
        long j2 = this.A00;
        if (1 - num.intValue() != 0) {
            i = 0;
        } else {
            i = 2;
        }
        nativeSetAugmentedFaceMode(j, j2, i);
    }

    public final void A01(Integer num) {
        int i;
        long j = this.A02.nativeWrapperHandle;
        long j2 = this.A00;
        if (1 - num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        nativeSetCloudAnchorMode(j, j2, i);
    }

    public final void A02(Integer num) {
        int i;
        long j = this.A02.nativeWrapperHandle;
        long j2 = this.A00;
        if (1 - num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        nativeSetFocusMode(j, j2, i);
    }

    public final void A03(Integer num) {
        int i;
        long j = this.A02.nativeWrapperHandle;
        long j2 = this.A00;
        switch (num.intValue()) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 0;
                break;
        }
        nativeSetLightEstimationMode(j, j2, i);
    }

    public final void A04(Integer num) {
        int i;
        long j = this.A02.nativeWrapperHandle;
        long j2 = this.A00;
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
            default:
                i = 0;
                break;
        }
        nativeSetPlaneFindingMode(j, j2, i);
    }

    public final void A05(Integer num) {
        int i;
        long j = this.A02.nativeWrapperHandle;
        long j2 = this.A00;
        if (1 - num.intValue() != 0) {
            i = 0;
        } else {
            i = 1;
        }
        nativeSetUpdateMode(j, j2, i);
    }

    public final void finalize() {
        long j = this.A00;
        if (j != 0) {
            nativeDestroy(this.A01, j);
        }
        super.finalize();
    }

    public Config() {
        this.A02 = null;
        this.A00 = 0;
        this.A01 = 0;
    }

    public Config(Session session) {
        this.A02 = session;
        this.A00 = nativeCreate(session.nativeWrapperHandle);
        this.A01 = session.nativeSymbolTableHandle;
    }
}
