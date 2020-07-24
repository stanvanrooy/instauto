package com.facebook.common.payments.paymentmethods.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.DGV;

public class CreditCard implements PaymentCredential {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(53);
    public final AdditionalFields A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }

    public CreditCard(DGV dgv) {
        this.A03 = dgv.A03;
        this.A06 = dgv.A06;
        this.A01 = dgv.A01;
        this.A02 = dgv.A02;
        this.A04 = dgv.A04;
        this.A05 = dgv.A05;
        this.A00 = dgv.A00;
    }

    public CreditCard(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A00 = (AdditionalFields) parcel.readParcelable(AdditionalFields.class.getClassLoader());
    }
}
