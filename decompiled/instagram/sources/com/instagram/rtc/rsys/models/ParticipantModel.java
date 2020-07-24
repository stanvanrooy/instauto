package com.instagram.rtc.rsys.models;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C2096991y;

public class ParticipantModel {
    public static AnonymousClass921 CONVERTER = new C2096991y();
    public final boolean audioEnabled;
    public final String rendererId;
    public final int state;
    public final String userId;
    public final boolean videoEnabled;
    public final boolean videoStalled;

    public static native ParticipantModel createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof ParticipantModel)) {
            return false;
        }
        ParticipantModel participantModel = (ParticipantModel) obj;
        if (this.userId.equals(participantModel.userId) && this.rendererId.equals(participantModel.rendererId) && this.state == participantModel.state && this.audioEnabled == participantModel.audioEnabled && this.videoEnabled == participantModel.videoEnabled && this.videoStalled == participantModel.videoStalled) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((527 + this.userId.hashCode()) * 31) + this.rendererId.hashCode()) * 31) + this.state) * 31) + (this.audioEnabled ? 1 : 0)) * 31) + (this.videoEnabled ? 1 : 0)) * 31) + (this.videoStalled ? 1 : 0);
    }

    public String toString() {
        return "ParticipantModel{userId=" + this.userId + "," + "rendererId=" + this.rendererId + "," + "state=" + this.state + "," + "audioEnabled=" + this.audioEnabled + "," + "videoEnabled=" + this.videoEnabled + "," + "videoStalled=" + this.videoStalled + "}";
    }

    public ParticipantModel(String str, String str2, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(str2);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(Boolean.valueOf(z2));
        AnonymousClass920.A00(Boolean.valueOf(z3));
        this.userId = str;
        this.rendererId = str2;
        this.state = i;
        this.audioEnabled = z;
        this.videoEnabled = z2;
        this.videoStalled = z3;
    }
}
