package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24880Avd;

public class FacebookVideoContent {
    public static AnonymousClass921 CONVERTER = new C24880Avd();
    public final String contentId;
    public final boolean isLiveStreaming;
    public final boolean isReportable;
    public final String subtitle;
    public final SizedUrl thumbnail;
    public final String title;
    public final Video video;

    public static native FacebookVideoContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof FacebookVideoContent)) {
            return false;
        }
        FacebookVideoContent facebookVideoContent = (FacebookVideoContent) obj;
        if (!this.contentId.equals(facebookVideoContent.contentId) || !this.video.equals(facebookVideoContent.video)) {
            return false;
        }
        SizedUrl sizedUrl = this.thumbnail;
        if ((sizedUrl != null || facebookVideoContent.thumbnail != null) && (sizedUrl == null || !sizedUrl.equals(facebookVideoContent.thumbnail))) {
            return false;
        }
        String str = this.title;
        if ((str != null || facebookVideoContent.title != null) && (str == null || !str.equals(facebookVideoContent.title))) {
            return false;
        }
        String str2 = this.subtitle;
        if (((str2 == null && facebookVideoContent.subtitle == null) || (str2 != null && str2.equals(facebookVideoContent.subtitle))) && this.isLiveStreaming == facebookVideoContent.isLiveStreaming && this.isReportable == facebookVideoContent.isReportable) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((527 + this.contentId.hashCode()) * 31) + this.video.hashCode()) * 31;
        SizedUrl sizedUrl = this.thumbnail;
        int i = 0;
        if (sizedUrl == null) {
            hashCode = 0;
        } else {
            hashCode = sizedUrl.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str = this.title;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.subtitle;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((i3 + i) * 31) + (this.isLiveStreaming ? 1 : 0)) * 31) + (this.isReportable ? 1 : 0);
    }

    public String toString() {
        return "FacebookVideoContent{contentId=" + this.contentId + "," + "video=" + this.video + "," + "thumbnail=" + this.thumbnail + "," + "title=" + this.title + "," + "subtitle=" + this.subtitle + "," + "isLiveStreaming=" + this.isLiveStreaming + "," + "isReportable=" + this.isReportable + "}";
    }

    public FacebookVideoContent(String str, Video video2, SizedUrl sizedUrl, String str2, String str3, boolean z, boolean z2) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(video2);
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Boolean.valueOf(z2));
        this.contentId = str;
        this.video = video2;
        this.thumbnail = sizedUrl;
        this.title = str2;
        this.subtitle = str3;
        this.isLiveStreaming = z;
        this.isReportable = z2;
    }
}
