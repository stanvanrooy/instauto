package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public final class AbrContextualSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(8);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public final boolean A0A;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }

    public AbrContextualSetting() {
        this.A0A = false;
    }

    public AbrContextualSetting(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.A02 = i;
        this.A04 = i2;
        this.A03 = i3;
        this.A01 = i4;
        this.A06 = i5;
        this.A07 = i6;
        this.A05 = i7;
        this.A00 = i8;
        this.A08 = i9;
        this.A09 = i10;
        this.A0A = true;
    }

    public AbrContextualSetting(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A0A = parcel.readInt() != 1 ? false : true;
    }
}
