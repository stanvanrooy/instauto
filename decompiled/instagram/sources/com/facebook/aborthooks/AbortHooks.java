package com.facebook.aborthooks;

import p000X.AnonymousClass0Y1;

public abstract class AbortHooks {
    public static native void hookAbort();

    public static native void hookAndroidLogAssert();

    public static native void hookAndroidSetAbortMessage();

    public static native void install();

    public static native void setGlogFatalHandler();

    static {
        AnonymousClass0Y1.A08("aborthooks");
    }
}
