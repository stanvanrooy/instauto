package com.instagram.guides.intf.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Objects;

public class MinimalGuide implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(340);
    public Integer A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MinimalGuide)) {
            return false;
        }
        MinimalGuide minimalGuide = (MinimalGuide) obj;
        return Objects.equals(this.A03, minimalGuide.A03) && Objects.equals(this.A04, minimalGuide.A04) && Objects.equals(this.A05, minimalGuide.A05) && Objects.equals(this.A06, minimalGuide.A06) && Objects.equals(this.A07, minimalGuide.A07) && Objects.equals(this.A02, minimalGuide.A02) && Objects.equals(this.A01, minimalGuide.A01) && Objects.equals(this.A00, minimalGuide.A00) && Objects.equals(Boolean.valueOf(this.A0A), Boolean.valueOf(minimalGuide.A0A)) && Objects.equals(this.A09, minimalGuide.A09) && Objects.equals(this.A08, minimalGuide.A08);
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.A03, this.A04, this.A05, this.A06, this.A07, this.A02, this.A01, this.A00, Boolean.valueOf(this.A0A), this.A09, this.A08});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00.intValue());
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
    }

    public MinimalGuide() {
    }

    public MinimalGuide(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = Integer.valueOf(parcel.readInt());
        this.A0A = parcel.readInt() != 1 ? false : true;
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
    }

    public MinimalGuide(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, boolean z) {
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A02 = str6;
        this.A01 = str7;
        this.A00 = Integer.valueOf(i);
        this.A0A = z;
    }
}
