package com.instagram.model.place;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.user.model.MicroUser;

public class SimplePlace implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(365);
    public MicroUser A00;
    public Double A01;
    public Double A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeDouble(this.A01.doubleValue());
        parcel.writeDouble(this.A02.doubleValue());
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public SimplePlace() {
    }

    public SimplePlace(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A01 = Double.valueOf(parcel.readDouble());
        this.A02 = Double.valueOf(parcel.readDouble());
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = (MicroUser) parcel.readParcelable(MicroUser.class.getClassLoader());
    }
}
