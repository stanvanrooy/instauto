package com.instagram.simplewebview;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.C53742Uc;

public class SimpleWebViewConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(82);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A02);
    }

    public SimpleWebViewConfig(C53742Uc r2) {
        this.A04 = r2.A0E;
        this.A01 = r2.A01;
        this.A03 = r2.A03;
        this.A0E = r2.A0D;
        this.A06 = r2.A05;
        this.A09 = r2.A08;
        this.A0A = r2.A09;
        this.A0C = r2.A0B;
        this.A0D = r2.A0C;
        this.A08 = r2.A07;
        this.A07 = r2.A06;
        this.A0B = r2.A0A;
        this.A05 = r2.A04;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }

    public SimpleWebViewConfig(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        boolean z = true;
        this.A0E = parcel.readByte() != 0;
        this.A06 = parcel.readByte() != 0;
        this.A09 = parcel.readByte() != 0;
        this.A0A = parcel.readByte() != 0;
        this.A0C = parcel.readByte() != 0;
        this.A0D = parcel.readByte() != 0;
        this.A08 = parcel.readByte() != 0;
        this.A07 = parcel.readByte() != 0;
        this.A0B = parcel.readByte() != 0;
        this.A05 = parcel.readByte() == 0 ? false : z;
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
