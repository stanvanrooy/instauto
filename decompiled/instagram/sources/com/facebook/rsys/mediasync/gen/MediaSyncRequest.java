package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.BV0;

public class MediaSyncRequest {
    public static AnonymousClass921 A00 = new BV0();
    public final NativeHolder mNativeHolder;

    public static native MediaSyncRequest createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(long j, InstagramUser instagramUser, String str, InstagramMedia instagramMedia);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native long getActionCursorId();

    public native String getActorId();

    public native InstagramMedia getMedia();

    public native InstagramUser getMediaOwner();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaSyncRequest)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MediaSyncRequest(long j, InstagramUser instagramUser, String str, InstagramMedia instagramMedia) {
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(instagramUser);
        AnonymousClass920.A00(str);
        this.mNativeHolder = initNativeHolder(j, instagramUser, str, instagramMedia);
    }

    public MediaSyncRequest(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
