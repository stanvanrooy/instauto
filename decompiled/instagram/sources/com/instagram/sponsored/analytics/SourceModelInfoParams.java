package com.instagram.sponsored.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class SourceModelInfoParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(472);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
    }

    public SourceModelInfoParams(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
    }

    public SourceModelInfoParams(String str, int i, int i2) {
        this.A06 = str;
        this.A02 = i;
        this.A00 = i2;
    }

    public SourceModelInfoParams(String str, String str2, String str3, int i, int i2, String str4) {
        this.A07 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A01 = i;
        this.A03 = i2;
        this.A06 = str4;
    }
}
