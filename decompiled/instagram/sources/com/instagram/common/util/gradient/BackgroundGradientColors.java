package com.instagram.common.util.gradient;

import android.os.Parcel;
import android.os.Parcelable;
import p000X.C06050No;
import p000X.C60702kK;

public class BackgroundGradientColors implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C06050No();
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    public final BackgroundGradientColors A00(int i) {
        return new BackgroundGradientColors(C60702kK.A03(this.A01, i), C60702kK.A03(this.A00, i));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public BackgroundGradientColors() {
    }

    public BackgroundGradientColors(int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
    }

    public BackgroundGradientColors(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }
}
