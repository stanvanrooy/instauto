package com.facebook.msys.mcd;

import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass0Y1;

public class MediaUploadContentSource {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(byte[] bArr, String str, String str2);

    private native boolean nativeEquals(Object obj);

    public native String getDiskCacheKey();

    public native String getFilePath();

    public native byte[] getUploadData();

    public native int hashCode();

    public native String toString();

    static {
        AnonymousClass0Y1.A08("msysjni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaUploadContentSource)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MediaUploadContentSource(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
