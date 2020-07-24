package com.facebook.rsys.mediasync.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24858Av5;

public class ActionMetadata {
    public static AnonymousClass921 CONVERTER = new C24858Av5();
    public final long actionTimeMs;
    public final long mediaPositionMs;

    public static native ActionMetadata createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof ActionMetadata)) {
            return false;
        }
        ActionMetadata actionMetadata = (ActionMetadata) obj;
        if (this.actionTimeMs == actionMetadata.actionTimeMs && this.mediaPositionMs == actionMetadata.mediaPositionMs) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.actionTimeMs;
        long j2 = this.mediaPositionMs;
        return ((527 + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    public String toString() {
        return "ActionMetadata{actionTimeMs=" + this.actionTimeMs + "," + "mediaPositionMs=" + this.mediaPositionMs + "}";
    }

    public ActionMetadata(long j, long j2) {
        AnonymousClass920.A00(Long.valueOf(j));
        AnonymousClass920.A00(Long.valueOf(j2));
        this.actionTimeMs = j;
        this.mediaPositionMs = j2;
    }
}
