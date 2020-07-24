package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.io.Serializable;

public final class ParcelableFormat implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(12);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((ParcelableFormat) obj).A0B.equals(this.A0B);
    }

    public final int hashCode() {
        return this.A0B.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeFloat(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A06);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A08);
        parcel.writeString(this.A09);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
    }

    public ParcelableFormat(String str, String str2, int i, int i2, float f, int i3, int i4, int i5, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A0B = str;
        this.A0D = str2;
        this.A05 = i;
        this.A04 = i2;
        this.A00 = f;
        this.A01 = i3;
        this.A02 = i4;
        this.A03 = i5;
        this.A0C = str3;
        this.A06 = str4;
        this.A0A = str5;
        this.A08 = str6;
        this.A09 = str7;
        this.A07 = str8;
        this.A0H = z;
        this.A0I = z2;
        this.A0F = z3;
        this.A0E = z4;
        this.A0J = z5;
        this.A0G = z6;
    }
}
