package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import java.util.ArrayList;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24877Ava;

public class InstagramContent {
    public static AnonymousClass921 CONVERTER = new C24877Ava();
    public final ArrayList carousel;
    public final String contentId;
    public final ArrayList images;
    public final int mediaType;
    public final InstagramContentOwner owner;
    public final String thumbnailUrl;
    public final Video video;

    public static native InstagramContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof InstagramContent)) {
            return false;
        }
        InstagramContent instagramContent = (InstagramContent) obj;
        if (!this.contentId.equals(instagramContent.contentId) || !this.owner.equals(instagramContent.owner) || this.mediaType != instagramContent.mediaType || !this.thumbnailUrl.equals(instagramContent.thumbnailUrl)) {
            return false;
        }
        ArrayList arrayList = this.images;
        if ((arrayList != null || instagramContent.images != null) && (arrayList == null || !arrayList.equals(instagramContent.images))) {
            return false;
        }
        Video video2 = this.video;
        if ((video2 != null || instagramContent.video != null) && (video2 == null || !video2.equals(instagramContent.video))) {
            return false;
        }
        ArrayList arrayList2 = this.carousel;
        if ((arrayList2 != null || instagramContent.carousel != null) && (arrayList2 == null || !arrayList2.equals(instagramContent.carousel))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (((((((527 + this.contentId.hashCode()) * 31) + this.owner.hashCode()) * 31) + this.mediaType) * 31) + this.thumbnailUrl.hashCode()) * 31;
        ArrayList arrayList = this.images;
        int i = 0;
        if (arrayList == null) {
            hashCode = 0;
        } else {
            hashCode = arrayList.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        Video video2 = this.video;
        if (video2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = video2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        ArrayList arrayList2 = this.carousel;
        if (arrayList2 != null) {
            i = arrayList2.hashCode();
        }
        return i3 + i;
    }

    public String toString() {
        return "InstagramContent{contentId=" + this.contentId + "," + "owner=" + this.owner + "," + "mediaType=" + this.mediaType + "," + "thumbnailUrl=" + this.thumbnailUrl + "," + "images=" + this.images + "," + "video=" + this.video + "," + "carousel=" + this.carousel + "}";
    }

    public InstagramContent(String str, InstagramContentOwner instagramContentOwner, int i, String str2, ArrayList arrayList, Video video2, ArrayList arrayList2) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(instagramContentOwner);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(str2);
        this.contentId = str;
        this.owner = instagramContentOwner;
        this.mediaType = i;
        this.thumbnailUrl = str2;
        this.images = arrayList;
        this.video = video2;
        this.carousel = arrayList2;
    }
}
