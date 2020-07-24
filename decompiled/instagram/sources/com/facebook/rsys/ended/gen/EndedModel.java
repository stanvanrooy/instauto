package com.facebook.rsys.ended.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass95T;

public class EndedModel {
    public static AnonymousClass921 CONVERTER = new AnonymousClass95T();
    public final String appSubReason;
    public final boolean canTryAgain;
    public final int reason;
    public final boolean remoteEnded;
    public final boolean showStarRating;
    public final int subReason;
    public final boolean wasConnected;

    public static native EndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof EndedModel)) {
            return false;
        }
        EndedModel endedModel = (EndedModel) obj;
        if (this.reason != endedModel.reason || this.subReason != endedModel.subReason) {
            return false;
        }
        String str = this.appSubReason;
        if (((str == null && endedModel.appSubReason == null) || (str != null && str.equals(endedModel.appSubReason))) && this.wasConnected == endedModel.wasConnected && this.showStarRating == endedModel.showStarRating && this.canTryAgain == endedModel.canTryAgain && this.remoteEnded == endedModel.remoteEnded) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int i = (((527 + this.reason) * 31) + this.subReason) * 31;
        String str = this.appSubReason;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((((((i + hashCode) * 31) + (this.wasConnected ? 1 : 0)) * 31) + (this.showStarRating ? 1 : 0)) * 31) + (this.canTryAgain ? 1 : 0)) * 31) + (this.remoteEnded ? 1 : 0);
    }

    public String toString() {
        return "EndedModel{reason=" + this.reason + "," + "subReason=" + this.subReason + "," + "appSubReason=" + this.appSubReason + "," + "wasConnected=" + this.wasConnected + "," + "showStarRating=" + this.showStarRating + "," + "canTryAgain=" + this.canTryAgain + "," + "remoteEnded=" + this.remoteEnded + "}";
    }

    public EndedModel(int i, int i2, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Integer.valueOf(i2));
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Boolean.valueOf(z2));
        AnonymousClass920.A00(Boolean.valueOf(z3));
        AnonymousClass920.A00(Boolean.valueOf(z4));
        this.reason = i;
        this.subReason = i2;
        this.appSubReason = str;
        this.wasConnected = z;
        this.showStarRating = z2;
        this.canTryAgain = z3;
        this.remoteEnded = z4;
    }
}
