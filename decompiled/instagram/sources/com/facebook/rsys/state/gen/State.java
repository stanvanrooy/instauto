package com.facebook.rsys.state.gen;

import com.facebook.djinni.msys.infra.McfReference;
import p000X.AnonymousClass920;
import p000X.AnonymousClass921;
import p000X.AnonymousClass92G;

public class State {
    public static AnonymousClass921 CONVERTER = new AnonymousClass92G();
    public final int callState;
    public final boolean isActive;
    public final String localCallId;
    public final String loggedInUserId;

    public static native State createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        if (!this.loggedInUserId.equals(state.loggedInUserId)) {
            return false;
        }
        String str = this.localCallId;
        if (((str == null && state.localCallId == null) || (str != null && str.equals(state.localCallId))) && this.callState == state.callState && this.isActive == state.isActive) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (527 + this.loggedInUserId.hashCode()) * 31;
        String str = this.localCallId;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.callState) * 31) + (this.isActive ? 1 : 0);
    }

    public String toString() {
        return "State{loggedInUserId=" + this.loggedInUserId + "," + "localCallId=" + this.localCallId + "," + "callState=" + this.callState + "," + "isActive=" + this.isActive + "}";
    }

    public State(String str, String str2, int i, boolean z) {
        AnonymousClass920.A00(str);
        AnonymousClass920.A00(Integer.valueOf(i));
        AnonymousClass920.A00(Boolean.valueOf(z));
        this.loggedInUserId = str;
        this.localCallId = str2;
        this.callState = i;
        this.isActive = z;
    }
}
