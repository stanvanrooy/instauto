package com.facebook.rsys.videosubscriptions.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C25003Axq;

public class MaxVideoSubscriptionsChangedAction {
    public static AnonymousClass921 CONVERTER = new C25003Axq();
    public final NativeHolder mNativeHolder;

    public static native MaxVideoSubscriptionsChangedAction createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, int i2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getEffectiveMax();

    public native int getHardMax();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MaxVideoSubscriptionsChangedAction)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MaxVideoSubscriptionsChangedAction(int i, int i2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        this.mNativeHolder = initNativeHolder(i, i2);
    }

    public MaxVideoSubscriptionsChangedAction(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
