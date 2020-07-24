package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24878Avb;

public class Fallback {
    public static AnonymousClass921 CONVERTER = new C24878Avb();
    public final String attribution;
    public final String attributionImageUrl;
    public final String contentId;
    public final String coverImageUrl;
    public final String message;
    public final Video video;

    public static native Fallback createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof Fallback)) {
            return false;
        }
        Fallback fallback = (Fallback) obj;
        if (!this.contentId.equals(fallback.contentId) || !this.coverImageUrl.equals(fallback.coverImageUrl)) {
            return false;
        }
        String str = this.message;
        if ((str != null || fallback.message != null) && (str == null || !str.equals(fallback.message))) {
            return false;
        }
        Video video2 = this.video;
        if ((video2 != null || fallback.video != null) && (video2 == null || !video2.equals(fallback.video))) {
            return false;
        }
        String str2 = this.attributionImageUrl;
        if ((str2 != null || fallback.attributionImageUrl != null) && (str2 == null || !str2.equals(fallback.attributionImageUrl))) {
            return false;
        }
        String str3 = this.attribution;
        if ((str3 != null || fallback.attribution != null) && (str3 == null || !str3.equals(fallback.attribution))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((527 + this.contentId.hashCode()) * 31) + this.coverImageUrl.hashCode()) * 31;
        String str = this.message;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode4 + hashCode) * 31;
        Video video2 = this.video;
        if (video2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = video2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.attributionImageUrl;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.attribution;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "Fallback{contentId=" + this.contentId + "," + "coverImageUrl=" + this.coverImageUrl + "," + "message=" + this.message + "," + "video=" + this.video + "," + "attributionImageUrl=" + this.attributionImageUrl + "," + "attribution=" + this.attribution + "}";
    }

    public Fallback(String str, String str2, String str3, Video video2, String str4, String str5) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        this.contentId = str;
        this.coverImageUrl = str2;
        this.message = str3;
        this.video = video2;
        this.attributionImageUrl = str4;
        this.attribution = str5;
    }
}
