package com.facebook.rsys.dominantspeaker.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass000;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C2097192b;

public class DominantSpeakerModel {
    public static AnonymousClass921 CONVERTER = new C2097192b();
    public final String dominantSpeakerUserId;

    public static native DominantSpeakerModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof DominantSpeakerModel)) {
            return false;
        }
        return this.dominantSpeakerUserId.equals(((DominantSpeakerModel) obj).dominantSpeakerUserId);
    }

    public int hashCode() {
        return 527 + this.dominantSpeakerUserId.hashCode();
    }

    public String toString() {
        return AnonymousClass000.A0J("DominantSpeakerModel{dominantSpeakerUserId=", this.dominantSpeakerUserId, "}");
    }

    public DominantSpeakerModel(String str) {
        AnonymousClass920.A00(str);
        this.dominantSpeakerUserId = str;
    }
}
