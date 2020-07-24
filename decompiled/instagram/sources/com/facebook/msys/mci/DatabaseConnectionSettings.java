package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.C30187DUl;

public class DatabaseConnectionSettings {
    public final NativeHolder mNativeHolder;

    public native void config(int i, boolean z, int i2, boolean z2, boolean z3, int i3, boolean z4, boolean z5, boolean z6, int i4);

    static {
        C30187DUl.A00();
    }

    public DatabaseConnectionSettings(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
