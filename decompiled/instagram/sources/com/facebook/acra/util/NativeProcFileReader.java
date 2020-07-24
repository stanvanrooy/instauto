package com.facebook.acra.util;

import java.util.concurrent.atomic.AtomicBoolean;
import p000X.AnonymousClass02z;
import p000X.AnonymousClass030;

public class NativeProcFileReader extends AnonymousClass030 {
    public static NativeProcFileReader sInstance;
    public static final AtomicBoolean sReadyToUse = new AtomicBoolean(false);

    private native int[] getOpenFDLimitsNative();

    public native int getOpenFDCount();

    public native String getOpenFileDescriptors();

    public NativeProcFileReader() {
        if (!sReadyToUse.get()) {
            throw new IllegalStateException("Class is not ready");
        }
    }

    public AnonymousClass02z getOpenFDLimits() {
        int[] openFDLimitsNative = getOpenFDLimitsNative();
        return new AnonymousClass02z(openFDLimitsNative[0], openFDLimitsNative[1]);
    }
}
