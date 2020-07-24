package com.facebook.iabeventlogging.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C25080AzM;

public abstract class IABEvent implements Parcelable {
    public static final IABEmptyEvent A04 = new IABEmptyEvent();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(73);
    public final long A00;
    public final long A01;
    public final C25080AzM A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02.A00);
        parcel.writeString(this.A03);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public IABEvent(C25080AzM azM, String str, long j, long j2) {
        this.A02 = azM;
        this.A03 = str;
        this.A01 = j;
        this.A00 = j2;
    }
}
