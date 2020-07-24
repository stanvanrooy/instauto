package com.instagram.model.comments;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ParcelableCommenterDetails implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(354);
    public final Double A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00.doubleValue());
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public ParcelableCommenterDetails(Parcel parcel) {
        this.A00 = Double.valueOf(parcel.readDouble());
        boolean z = false;
        this.A06 = parcel.readInt() == 1;
        this.A05 = parcel.readInt() == 1 ? true : z;
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public ParcelableCommenterDetails(Double d, boolean z, boolean z2, String str, String str2, String str3, String str4) {
        this.A00 = d;
        this.A06 = z;
        this.A05 = z2;
        this.A04 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A02 = str4;
    }
}
