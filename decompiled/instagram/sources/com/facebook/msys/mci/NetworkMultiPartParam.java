package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass0Y1;

public class NetworkMultiPartParam {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(String str, String str2, byte[] bArr);

    private native boolean nativeEquals(Object obj);

    public native byte[] getData();

    public native String getFileName();

    public native String getMimeType();

    public native int hashCode();

    public native String toString();

    static {
        AnonymousClass0Y1.A08("msysjniinfranosqlite");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NetworkMultiPartParam)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public NetworkMultiPartParam(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
