package com.facebook.iabeventlogging.model;

import p000X.C25080AzM;

public class IABEmptyEvent extends IABEvent {
    public IABEmptyEvent() {
        super(C25080AzM.EMPTY, "", -1, -1);
    }

    public final String toString() {
        return "IABEmptyEvent{" + "type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }
}
