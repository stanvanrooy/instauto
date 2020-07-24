package com.facebook.http.protocol;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.io.Serializable;
import p000X.AnonymousClass436;

public class ApiErrorResult implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(72);
    public final int A00;
    public final int A01;
    public final AnonymousClass436 A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeString(this.A02.toString());
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
    }

    public ApiErrorResult(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A08 = parcel.readString();
        this.A02 = (AnonymousClass436) Enum.valueOf(AnonymousClass436.class, parcel.readString());
        boolean z = true;
        this.A0A = (parcel.dataAvail() <= 0 || parcel.readInt() != 1) ? false : z;
        this.A07 = parcel.readString();
        this.A09 = parcel.readString();
    }
}
