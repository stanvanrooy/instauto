package com.facebook.jni;

import p000X.AnonymousClass0YD;

public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    static {
        AnonymousClass0YD.A01("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
