package com.instagram.payments.checkout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.DGX;

public class CheckoutScreenEntity implements CheckoutScreenComponent {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(440);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public CheckoutScreenEntity(DGX dgx) {
        this.A04 = dgx.A04;
        this.A03 = dgx.A03;
        this.A02 = dgx.A02;
        this.A00 = dgx.A00;
        this.A01 = dgx.A01;
    }

    public CheckoutScreenEntity(Parcel parcel) {
        this.A04 = parcel.readInt() == 0 ? false : true;
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
