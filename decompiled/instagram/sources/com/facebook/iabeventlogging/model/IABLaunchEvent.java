package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import p000X.C25080AzM;

public class IABLaunchEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final String A02;
    public final String A03;

    public IABLaunchEvent(String str, long j, long j2, String str2, long j3, String str3, long j4) {
        super(C25080AzM.IAB_LAUNCH, str, j, j2);
        this.A03 = str2;
        this.A01 = j3;
        this.A02 = str3;
        this.A00 = j4;
    }

    public final String toString() {
        return "IABLaunchEvent{" + "initialUrl='" + this.A03 + '\'' + ", userClickTs=" + this.A01 + ", clickSource='" + this.A02 + '\'' + ", flags=" + this.A00 + ", type=" + this.A02 + ", iabSessionId='" + this.A03 + '\'' + ", eventTs=" + this.A01 + ", createdAtTs=" + this.A00 + '}';
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A02);
        parcel.writeLong(this.A00);
    }
}
