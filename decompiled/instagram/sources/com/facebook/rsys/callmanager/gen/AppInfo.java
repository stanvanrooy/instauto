package com.facebook.rsys.callmanager.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C30523De5;

public class AppInfo {
    public static AnonymousClass921 CONVERTER = new C30523De5();
    public final NativeHolder mNativeHolder;

    public static native AppInfo createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, String str2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getAppId();

    public native String getDeviceId();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AppInfo)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public AppInfo(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AppInfo(String str, String str2) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        this.mNativeHolder = initNativeHolder(str, str2);
    }
}
