package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.BV1;

public class InstagramUser {
    public static AnonymousClass921 A00 = new BV1();
    public final NativeHolder mNativeHolder;

    public static native InstagramUser createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2, String str3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getProfilePicUrl();

    public native String getUserId();

    public native String getUsername();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof InstagramUser)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public InstagramUser(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public InstagramUser(String str, String str2, String str3) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(str3);
        this.mNativeHolder = initNativeHolder(str, str2, str3);
    }
}
