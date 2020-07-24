package com.instagram.location.surface.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class LocationPageInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(348);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public LocationPageInfo(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public LocationPageInfo(String str, String str2, String str3, String str4, String str5, String str6) {
        this.A03 = str;
        this.A04 = str2;
        this.A00 = str3;
        this.A05 = str4;
        this.A02 = str5;
        this.A01 = str6;
    }
}
