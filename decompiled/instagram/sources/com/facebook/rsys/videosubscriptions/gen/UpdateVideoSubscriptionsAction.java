package com.facebook.rsys.videosubscriptions.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C25006Axw;

public class UpdateVideoSubscriptionsAction {
    public static AnonymousClass921 CONVERTER = new C25006Axw();
    public final NativeHolder mNativeHolder;

    public static native UpdateVideoSubscriptionsAction createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(VideoSubscriptions videoSubscriptions);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native VideoSubscriptions getVideoSubscriptions();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof UpdateVideoSubscriptionsAction)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public UpdateVideoSubscriptionsAction(VideoSubscriptions videoSubscriptions) {
        AnonymousClass920.A00(videoSubscriptions);
        this.mNativeHolder = initNativeHolder(videoSubscriptions);
    }

    public UpdateVideoSubscriptionsAction(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
