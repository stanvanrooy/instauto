package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import p000X.C25080AzM;

public class IABCopyLinkEvent extends IABEvent {
    public final String A00;

    public IABCopyLinkEvent(String str, long j, long j2, String str2) {
        super(C25080AzM.IAB_COPY_LINK, str, j, j2);
        this.A00 = str2;
    }

    public final String toString() {
        return "IABCopyLinkEvent{" + "targetUrl='" + this.A00 + '\'' + ", type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
