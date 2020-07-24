package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24879Avc;

public class FacebookWatchContent {
    public static AnonymousClass921 A00 = new C24879Avc();
    public final NativeHolder mNativeHolder;

    public static native FacebookWatchContent createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(String str, Video video, SizedUrl sizedUrl, String str2, String str3, boolean z, boolean z2);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public native String getContentId();

    public native boolean getIsLiveStreaming();

    public native boolean getIsReportable();

    public native String getSubtitle();

    public native SizedUrl getThumbnail();

    public native String getTitle();

    public native Video getVideo();

    public native int hashCode();

    public native String toString();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof FacebookWatchContent)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public FacebookWatchContent(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public FacebookWatchContent(String str, Video video, SizedUrl sizedUrl, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(video);
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Boolean.valueOf(z2));
        this.mNativeHolder = initNativeHolder(str, video, sizedUrl, str2, str3, z, z2);
    }
}
