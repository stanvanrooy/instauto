package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass000;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24874AvX;

public class Placeholder {
    public static AnonymousClass921 CONVERTER = new C24874AvX();
    public final String contentId;
    public final String message;
    public final String title;

    public static native Placeholder createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof Placeholder)) {
            return false;
        }
        Placeholder placeholder = (Placeholder) obj;
        if (!this.contentId.equals(placeholder.contentId) || !this.title.equals(placeholder.title) || !this.message.equals(placeholder.message)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((527 + this.contentId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode();
    }

    public String toString() {
        return AnonymousClass000.A0R("Placeholder{contentId=", this.contentId, ",", "title=", this.title, ",", "message=", this.message, "}");
    }

    public Placeholder(String str, String str2, String str3) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(str3);
        this.contentId = str;
        this.title = str2;
        this.message = str3;
    }
}
