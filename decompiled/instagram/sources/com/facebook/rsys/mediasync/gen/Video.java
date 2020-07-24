package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24872AvV;

public class Video {
    public static AnonymousClass921 CONVERTER = new C24872AvV();
    public final float aspectRatio;
    public final String dashManifest;
    public final long durationMs;
    public final SizedUrl url;

    public static native Video createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof Video)) {
            return false;
        }
        Video video = (Video) obj;
        SizedUrl sizedUrl = this.url;
        if ((sizedUrl != null || video.url != null) && (sizedUrl == null || !sizedUrl.equals(video.url))) {
            return false;
        }
        String str = this.dashManifest;
        if (((str == null && video.dashManifest == null) || (str != null && str.equals(video.dashManifest))) && this.durationMs == video.durationMs && this.aspectRatio == video.aspectRatio) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        SizedUrl sizedUrl = this.url;
        int i = 0;
        if (sizedUrl == null) {
            hashCode = 0;
        } else {
            hashCode = sizedUrl.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        String str = this.dashManifest;
        if (str != null) {
            i = str.hashCode();
        }
        long j = this.durationMs;
        return ((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Float.floatToIntBits(this.aspectRatio);
    }

    public String toString() {
        return "Video{url=" + this.url + "," + "dashManifest=" + this.dashManifest + "," + "durationMs=" + this.durationMs + "," + "aspectRatio=" + this.aspectRatio + "}";
    }

    public Video(SizedUrl sizedUrl, String str, long j, float f) {
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Float.valueOf(f));
        this.url = sizedUrl;
        this.dashManifest = str;
        this.durationMs = j;
        this.aspectRatio = f;
    }
}
