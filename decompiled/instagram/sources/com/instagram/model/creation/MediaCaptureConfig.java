package com.instagram.model.creation;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.C31161Wr;

public class MediaCaptureConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(53);
    public boolean A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeByte(this.A00 ? (byte) 1 : 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public MediaCaptureConfig(C31161Wr r2) {
        this.A07 = r2.A07;
        this.A06 = r2.A01;
        this.A04 = r2.A06;
        this.A05 = r2.A00;
        this.A00 = r2.A02;
        this.A01 = r2.A03;
        this.A02 = r2.A04;
        this.A03 = r2.A05;
    }

    public MediaCaptureConfig(Parcel parcel) {
        boolean z = true;
        this.A07 = parcel.readByte() != 0;
        this.A06 = parcel.readByte() != 0;
        this.A04 = parcel.readByte() != 0;
        this.A05 = parcel.readByte() != 0;
        this.A00 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A02 = parcel.readByte() != 0;
        this.A03 = parcel.readByte() == 0 ? false : z;
    }
}
