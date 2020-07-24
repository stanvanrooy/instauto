package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import p000X.C25080AzM;

public class IABLandingPageInteractiveEvent extends IABEvent {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public IABLandingPageInteractiveEvent(String str, long j, long j2, String str2, String str3, int i, int i2) {
        super(C25080AzM.IAB_LANDING_PAGE_INTERACTIVE, str, j, j2);
        this.A03 = str2;
        this.A02 = str3;
        this.A01 = i;
        this.A00 = i2;
    }

    public final String toString() {
        return "IABLandingPageInteractiveEvent{" + "initialUrl='" + this.A03 + '\'' + ", initialLandUrl='" + this.A02 + '\'' + ", screenWidth=" + this.A01 + ", pageContentWidth=" + this.A00 + ", type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }
}
