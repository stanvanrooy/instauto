package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import p000X.C25080AzM;

public class IABReportStartEvent extends IABEvent {
    public final String A00;
    public final String A01;
    public final String A02;

    public IABReportStartEvent(String str, long j, long j2, String str2, String str3, String str4) {
        super(C25080AzM.IAB_REPORT_START, str, j, j2);
        this.A00 = str2;
        this.A01 = str3;
        this.A02 = str4;
    }

    public final String toString() {
        return "IABReportStartEvent{" + "initialUrl='" + this.A01 + '\'' + ", targetUrl='" + this.A02 + '\'' + ", clickSource='" + this.A00 + '\'' + ", type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
