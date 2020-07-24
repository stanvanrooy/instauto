package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24992Axd;

public class MediaSyncClientState {
    public static AnonymousClass921 A00 = new C24992Axd();
    public final NativeHolder mNativeHolder;

    public static native MediaSyncClientState createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, ActionMetadata actionMetadata, User user, String str, int i2, MediaSyncContent mediaSyncContent, long j);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getAction();

    public native ActionMetadata getActionMetadata();

    public native User getActor();

    public native MediaSyncContent getContent();

    public native String getContentId();

    public native int getContentSource();

    public native long getLocalClockOffsetMs();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaSyncClientState)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MediaSyncClientState(int i, ActionMetadata actionMetadata, User user, String str, int i2, MediaSyncContent mediaSyncContent, long j) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(actionMetadata);
        AnonymousClass920.A00(user);
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i2));
        long j2 = j;
        AnonymousClass920.A00(Long.valueOf(j2));
        this.mNativeHolder = initNativeHolder(i, actionMetadata, user, str, i2, mediaSyncContent, j2);
    }

    public MediaSyncClientState(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
