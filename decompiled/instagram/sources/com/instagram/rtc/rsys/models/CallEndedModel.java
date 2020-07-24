package com.instagram.rtc.rsys.models;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C193418Ps;
import p000X.C24848Auh;

public class CallEndedModel {
    public static AnonymousClass921 CONVERTER = new C24848Auh();
    public final boolean endedRemotely;
    public final int reason;
    public final boolean wasConnected;

    public static native CallEndedModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallEndedModel)) {
            return false;
        }
        CallEndedModel callEndedModel = (CallEndedModel) obj;
        if (this.reason == callEndedModel.reason && this.endedRemotely == callEndedModel.endedRemotely && this.wasConnected == callEndedModel.wasConnected) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.reason) * 31) + (this.endedRemotely ? 1 : 0)) * 31) + (this.wasConnected ? 1 : 0);
    }

    public String toString() {
        return "CallEndedModel{reason=" + this.reason + "," + "endedRemotely=" + this.endedRemotely + "," + C193418Ps.$const$string(172) + this.wasConnected + "}";
    }

    public CallEndedModel(int i, boolean z, boolean z2) {
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Boolean.valueOf(z2));
        this.reason = i;
        this.endedRemotely = z;
        this.wasConnected = z2;
    }
}
