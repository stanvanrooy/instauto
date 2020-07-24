package com.facebook.common.smartgc.dalvik;

import android.content.Context;
import p000X.AnonymousClass0Bq;
import p000X.AnonymousClass0Y1;
import p000X.C04070Ch;
import p000X.C04080Ci;
import p000X.C04090Cj;
import p000X.C05360Ka;

public class DalvikSmartGc implements C04070Ch {
    public static final boolean CAN_RUN_ON_THIS_PLATFORM;
    public static final boolean HAD_ERROR_INITING = (!nativeInitialize());

    public static native void nativeBadTimeToDoGc(boolean z, int i, boolean z2, boolean z3, boolean z4);

    public static native void nativeConcurrentGc(boolean z, int i);

    public static native String nativeGetErrorMessage();

    public static native boolean nativeInitialize();

    public static native void nativeManualGcComplete();

    public static native void nativeManualGcConcurrent();

    public static native void nativeManualGcForAlloc();

    public static native void nativeNotAsBadTimeToDoGc();

    public void setUpHook(Context context, C04080Ci r2) {
    }

    static {
        boolean z = !AnonymousClass0Bq.A00;
        CAN_RUN_ON_THIS_PLATFORM = z;
        if (z) {
            AnonymousClass0Y1.A08("dalviksmartgc");
        }
    }

    public /* bridge */ /* synthetic */ void badTimeToDoGc(C04090Cj r4) {
        C05360Ka r42 = (C05360Ka) r4;
        if (CAN_RUN_ON_THIS_PLATFORM) {
            nativeBadTimeToDoGc(false, 0, r42.A00, r42.A01, false);
            return;
        }
        throw new IllegalStateException("This platform is not supported");
    }

    public void notAsBadTimeToDoGc() {
        if (CAN_RUN_ON_THIS_PLATFORM) {
            nativeNotAsBadTimeToDoGc();
            return;
        }
        throw new IllegalStateException("This platform is not supported");
    }
}
