package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.Av1;

public class SelectMediaActionModel {
    public static AnonymousClass921 A00 = new Av1();
    public final NativeHolder mNativeHolder;

    public static native SelectMediaActionModel createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, int i, Long l);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getAction();

    public native String getMediaId();

    public native Long getVideoPositionMs();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SelectMediaActionModel)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public SelectMediaActionModel(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public SelectMediaActionModel(String str, int i, Long l) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i));
        this.mNativeHolder = initNativeHolder(str, i, l);
    }
}
