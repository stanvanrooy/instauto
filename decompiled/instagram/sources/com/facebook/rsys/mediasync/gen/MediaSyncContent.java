package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass921;
import p000X.C24875AvY;

public class MediaSyncContent {
    public static AnonymousClass921 CONVERTER = new C24875AvY();
    public final FacebookVideoContent facebookVideoContent;
    public final Fallback fallback;
    public final InstagramContent instagramContent;
    public final Placeholder placeholder;

    public static native MediaSyncContent createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof MediaSyncContent)) {
            return false;
        }
        MediaSyncContent mediaSyncContent = (MediaSyncContent) obj;
        InstagramContent instagramContent2 = this.instagramContent;
        if ((instagramContent2 != null || mediaSyncContent.instagramContent != null) && (instagramContent2 == null || !instagramContent2.equals(mediaSyncContent.instagramContent))) {
            return false;
        }
        FacebookVideoContent facebookVideoContent2 = this.facebookVideoContent;
        if ((facebookVideoContent2 != null || mediaSyncContent.facebookVideoContent != null) && (facebookVideoContent2 == null || !facebookVideoContent2.equals(mediaSyncContent.facebookVideoContent))) {
            return false;
        }
        Placeholder placeholder2 = this.placeholder;
        if ((placeholder2 != null || mediaSyncContent.placeholder != null) && (placeholder2 == null || !placeholder2.equals(mediaSyncContent.placeholder))) {
            return false;
        }
        Fallback fallback2 = this.fallback;
        if ((fallback2 != null || mediaSyncContent.fallback != null) && (fallback2 == null || !fallback2.equals(mediaSyncContent.fallback))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        InstagramContent instagramContent2 = this.instagramContent;
        int i = 0;
        if (instagramContent2 == null) {
            hashCode = 0;
        } else {
            hashCode = instagramContent2.hashCode();
        }
        int i2 = (527 + hashCode) * 31;
        FacebookVideoContent facebookVideoContent2 = this.facebookVideoContent;
        if (facebookVideoContent2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = facebookVideoContent2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Placeholder placeholder2 = this.placeholder;
        if (placeholder2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = placeholder2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Fallback fallback2 = this.fallback;
        if (fallback2 != null) {
            i = fallback2.hashCode();
        }
        return i4 + i;
    }

    public String toString() {
        return "MediaSyncContent{instagramContent=" + this.instagramContent + "," + "facebookVideoContent=" + this.facebookVideoContent + "," + "placeholder=" + this.placeholder + "," + "fallback=" + this.fallback + "}";
    }

    public MediaSyncContent(InstagramContent instagramContent2, FacebookVideoContent facebookVideoContent2, Placeholder placeholder2, Fallback fallback2) {
        this.instagramContent = instagramContent2;
        this.facebookVideoContent = facebookVideoContent2;
        this.placeholder = placeholder2;
        this.fallback = fallback2;
    }
}
