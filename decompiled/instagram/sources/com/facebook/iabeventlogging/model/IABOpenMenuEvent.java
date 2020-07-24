package com.facebook.iabeventlogging.model;

import p000X.C25080AzM;

public class IABOpenMenuEvent extends IABEvent {
    public IABOpenMenuEvent(String str, long j, long j2) {
        super(C25080AzM.IAB_OPEN_MENU, str, j, j2);
    }

    public final String toString() {
        return "IABOpenMenuEvent{" + "type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }
}
