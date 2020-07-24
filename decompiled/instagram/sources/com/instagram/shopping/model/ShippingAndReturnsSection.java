package com.instagram.shopping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C120115Dg;

public class ShippingAndReturnsSection implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(462);
    public C120115Dg A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public ShippingAndReturnsSection() {
    }

    public ShippingAndReturnsSection(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
