package com.facebook.rsys.video.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.video.VideoSource;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24856Auz;

public class VideoStream {
    public static AnonymousClass921 CONVERTER = new C24856Auz();
    public final boolean isFrozen;
    public final int type;
    public final VideoSource videoSource;

    public static native VideoStream createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof VideoStream)) {
            return false;
        }
        VideoStream videoStream = (VideoStream) obj;
        if (this.videoSource.equals(videoStream.videoSource) && this.type == videoStream.type && this.isFrozen == videoStream.isFrozen) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.videoSource.hashCode()) * 31) + this.type) * 31) + (this.isFrozen ? 1 : 0);
    }

    public String toString() {
        return "VideoStream{videoSource=" + this.videoSource + "," + "type=" + this.type + "," + "isFrozen=" + this.isFrozen + "}";
    }

    public VideoStream(VideoSource videoSource2, int i, boolean z) {
        AnonymousClass920.A00(videoSource2);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z));
        this.videoSource = videoSource2;
        this.type = i;
        this.isFrozen = z;
    }
}
