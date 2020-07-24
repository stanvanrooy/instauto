package com.instagram.model.business;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass612;

public class BusinessInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(352);
    public Address A00;
    public PublicPhoneContact A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A0E);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0G ? (byte) 1 : 0);
        parcel.writeByte(this.A0I ? (byte) 1 : 0);
        parcel.writeByte(this.A0J ? (byte) 1 : 0);
        parcel.writeByte(this.A0H ? (byte) 1 : 0);
    }

    public BusinessInfo(AnonymousClass612 r2) {
        this.A07 = r2.A07;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
        this.A01 = r2.A01;
        this.A0E = r2.A0E;
        this.A00 = r2.A00;
        this.A0F = r2.A0F;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A04 = r2.A04;
        this.A05 = r2.A05;
        this.A06 = r2.A06;
        this.A0G = r2.A0G;
        this.A0A = r2.A0A;
        this.A0B = r2.A0B;
        this.A0C = r2.A0C;
        this.A0D = r2.A0D;
        this.A0I = r2.A0I;
        this.A0J = r2.A0J;
        this.A0H = r2.A0H;
    }

    public BusinessInfo(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readString();
        this.A01 = (PublicPhoneContact) parcel.readParcelable(PublicPhoneContact.class.getClassLoader());
        this.A0E = parcel.readString();
        this.A00 = (Address) parcel.readParcelable(Address.class.getClassLoader());
        this.A0F = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        boolean z = true;
        this.A0G = parcel.readByte() != 0;
        this.A0I = parcel.readByte() != 0;
        this.A0J = parcel.readByte() != 0;
        this.A0H = parcel.readByte() == 0 ? false : z;
    }
}
