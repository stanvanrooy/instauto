package com.facebook.common.payments.paymentmethods.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.DGW;

public class PayPalBillingAgreement implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(56);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public PayPalBillingAgreement(DGW dgw) {
        this.A03 = dgw.A03;
        this.A04 = dgw.A02;
        this.A05 = dgw.A01;
        this.A00 = dgw.A00;
        this.A01 = null;
        this.A02 = null;
        this.A06 = false;
    }

    public PayPalBillingAgreement(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A06 = parcel.readInt() == 0 ? false : true;
    }
}
