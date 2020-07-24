package com.facebook.rsys.call.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.rsys.callinfo.gen.UserProfile;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.C24855Auw;

public class CallParticipant {
    public static AnonymousClass921 CONVERTER = new C24855Auw();
    public final boolean isCaller;
    public final ParticipantMediaState mediaState;
    public final int state;
    public final String userId;
    public final UserProfile userProfile;

    public static native CallParticipant createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof CallParticipant)) {
            return false;
        }
        CallParticipant callParticipant = (CallParticipant) obj;
        if (!this.userId.equals(callParticipant.userId) || !this.userProfile.equals(callParticipant.userProfile) || this.isCaller != callParticipant.isCaller || !this.mediaState.equals(callParticipant.mediaState) || this.state != callParticipant.state) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((((527 + this.userId.hashCode()) * 31) + this.userProfile.hashCode()) * 31) + (this.isCaller ? 1 : 0)) * 31) + this.mediaState.hashCode()) * 31) + this.state;
    }

    public String toString() {
        return "CallParticipant{userId=" + this.userId + "," + "userProfile=" + this.userProfile + "," + "isCaller=" + this.isCaller + "," + "mediaState=" + this.mediaState + "," + "state=" + this.state + "}";
    }

    public CallParticipant(String str, UserProfile userProfile2, boolean z, ParticipantMediaState participantMediaState, int i) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(userProfile2);
        AnonymousClass920.A00(Boolean.valueOf(z));
        AnonymousClass920.A00(participantMediaState);
        AnonymousClass920.A00(Integer.valueOf(i));
        this.userId = str;
        this.userProfile = userProfile2;
        this.isCaller = z;
        this.mediaState = participantMediaState;
        this.state = i;
    }
}
