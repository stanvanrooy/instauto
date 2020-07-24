package com.instagram.business.controller.datamodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public class PageSelectionOverrideData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(22);
    public int A00;
    public int A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
    }

    public PageSelectionOverrideData(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = i;
        this.A00 = i2;
        this.A04 = str;
        this.A03 = str2;
        this.A06 = str3;
        this.A02 = str4;
        this.A08 = str5;
        this.A07 = str6;
        this.A05 = str7;
    }

    public PageSelectionOverrideData(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A02 = parcel.readString();
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
    }
}
