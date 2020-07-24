package com.facebook.reliability.ulimit;

import p000X.AnonymousClass0Y1;

public class Ulimit {
    public static final boolean sNativeLibLoaded;

    public static native void setNativeMaxUlimit();

    static {
        boolean z;
        try {
            AnonymousClass0Y1.A08("reliability");
            z = true;
        } catch (UnsatisfiedLinkError unused) {
            z = false;
        }
        sNativeLibLoaded = z;
    }
}
