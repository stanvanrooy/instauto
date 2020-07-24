package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24873AvW;

public class SizedUrl {
    public static AnonymousClass921 CONVERTER = new C24873AvW();
    public final int height;
    public final String type;
    public final String url;
    public final int width;

    public static native SizedUrl createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof SizedUrl)) {
            return false;
        }
        SizedUrl sizedUrl = (SizedUrl) obj;
        if (!this.url.equals(sizedUrl.url) || this.height != sizedUrl.height || this.width != sizedUrl.width) {
            return false;
        }
        String str = this.type;
        if ((str != null || sizedUrl.type != null) && (str == null || !str.equals(sizedUrl.type))) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (((((527 + this.url.hashCode()) * 31) + this.height) * 31) + this.width) * 31;
        String str = this.type;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public String toString() {
        return "SizedUrl{url=" + this.url + "," + "height=" + this.height + "," + "width=" + this.width + "," + "type=" + this.type + "}";
    }

    public SizedUrl(String str, int i, int i2, String str2) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        this.url = str;
        this.height = i;
        this.width = i2;
        this.type = str2;
    }
}
