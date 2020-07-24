package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24990Axb;

public class MediaSyncWireState {
    public static AnonymousClass921 A00 = new C24990Axb();
    public final NativeHolder mNativeHolder;

    public static native MediaSyncWireState createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, ActionMetadata actionMetadata, String str, int i2, int i3);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getAction();

    public native ActionMetadata getActionMetadata();

    public native int getAdminMessageType();

    public native String getContentId();

    public native int getContentSource();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaSyncWireState)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MediaSyncWireState(int i, ActionMetadata actionMetadata, String str, int i2, int i3) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(actionMetadata);
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(Integer.valueOf(i3));
        this.mNativeHolder = initNativeHolder(i, actionMetadata, str, i2, i3);
    }

    public MediaSyncWireState(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
