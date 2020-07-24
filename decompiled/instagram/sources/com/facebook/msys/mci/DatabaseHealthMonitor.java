package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.C30187DUl;

public class DatabaseHealthMonitor {
    public final NativeHolder mNativeHolder;

    private native void fixAllNative();

    public static native NativeHolder initNativeHolder(String str, String str2);

    static {
        C30187DUl.A00();
    }

    public DatabaseHealthMonitor(String str, String str2) {
        this.mNativeHolder = initNativeHolder(str, str2);
    }
}
