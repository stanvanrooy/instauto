package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.C208928zC;

public class RedactedString {
    public NativeHolder mNativeHolder;

    private native boolean equalsNative(Object obj);

    public static native NativeHolder initNativeHolder(String str);

    public static native NativeHolder initNativeHolder(String str, int i);

    public native String getOriginalString();

    public native int hashCode();

    public native int leakAllowance();

    public native String toString();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof RedactedString)) {
            return false;
        }
        return equalsNative(obj);
    }

    static {
        C208928zC.A00();
    }

    public RedactedString(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public RedactedString(String str) {
        AnonymousClass920.A00(str);
        this.mNativeHolder = initNativeHolder(str);
    }
}
