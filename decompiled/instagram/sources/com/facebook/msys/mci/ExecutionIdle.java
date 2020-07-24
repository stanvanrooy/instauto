package com.facebook.msys.mci;

import p000X.C208928zC;

public class ExecutionIdle {
    public static volatile boolean sInitialized;

    public static native void nativeInitialize();

    public static native void nativeMaybeDelayIdleQueueAdvanceCallback();

    public static native void nativeStartIdleExecutor();

    static {
        C208928zC.A00();
    }
}
