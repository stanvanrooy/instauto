package com.facebook.jni;

import p000X.AnonymousClass0YD;

public class Countable {
    public long mInstance = 0;

    public native void dispose();

    static {
        AnonymousClass0YD.A01("fb");
    }

    public void finalize() {
        dispose();
        super.finalize();
    }
}
