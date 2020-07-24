package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24889Avn;

public class MediaSyncStateSyncState {
    public static AnonymousClass921 A00 = new C24889Avn();
    public final NativeHolder mNativeHolder;

    public static native MediaSyncStateSyncState createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(int i, ActionMetadata actionMetadata, MediaSyncContent mediaSyncContent, int i2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native int getAction();

    public native ActionMetadata getActionMetadata();

    public native MediaSyncContent getContent();

    public native int getContentSource();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MediaSyncStateSyncState)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public MediaSyncStateSyncState(int i, ActionMetadata actionMetadata, MediaSyncContent mediaSyncContent, int i2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(actionMetadata);
        AnonymousClass920.A00(mediaSyncContent);
        AnonymousClass920.A00(Integer.valueOf(i2));
        this.mNativeHolder = initNativeHolder(i, actionMetadata, mediaSyncContent, i2);
    }

    public MediaSyncStateSyncState(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
