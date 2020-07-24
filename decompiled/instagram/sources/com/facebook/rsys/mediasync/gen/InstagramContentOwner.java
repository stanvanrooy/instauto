package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass000;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24876AvZ;

public class InstagramContentOwner {
    public static AnonymousClass921 CONVERTER = new C24876AvZ();
    public final String avatarUrl;
    public final String userId;
    public final String username;

    public static native InstagramContentOwner createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof InstagramContentOwner)) {
            return false;
        }
        InstagramContentOwner instagramContentOwner = (InstagramContentOwner) obj;
        if (!this.userId.equals(instagramContentOwner.userId) || !this.username.equals(instagramContentOwner.username) || !this.avatarUrl.equals(instagramContentOwner.avatarUrl)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.userId.hashCode()) * 31) + this.username.hashCode()) * 31) + this.avatarUrl.hashCode();
    }

    public String toString() {
        return AnonymousClass000.A0R("InstagramContentOwner{userId=", this.userId, ",", "username=", this.username, ",", "avatarUrl=", this.avatarUrl, "}");
    }

    public InstagramContentOwner(String str, String str2, String str3) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(str3);
        this.userId = str;
        this.username = str2;
        this.avatarUrl = str3;
    }
}
