package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C25682BUx;

public class InstagramMedia {
    public static AnonymousClass921 A00 = new C25682BUx();
    public final NativeHolder mNativeHolder;

    public static native InstagramMedia createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, int i, Long l, String str2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getMediaId();

    public native int getMediaType();

    public native String getMediaUrl();

    public native Long getVideoStartTimeMs();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InstagramMedia)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public InstagramMedia(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public InstagramMedia(String str, int i, Long l, String str2) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(str2);
        this.mNativeHolder = initNativeHolder(str, i, l, str2);
    }
}
