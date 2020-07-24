package com.fbpay.hub.form.cell.address;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.locale.Country;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.fbpay.hub.form.cell.CellParams;
import p000X.C26508Bml;
import p000X.C26537BnE;

public class AddressCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(105);
    public final Country A00;
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
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
    }

    public AddressCellParams(C26508Bml bml) {
        super((C26537BnE) bml);
        this.A01 = bml.A01;
        this.A02 = bml.A02;
        this.A03 = bml.A03;
        this.A00 = bml.A00;
        this.A04 = bml.A04;
        this.A05 = bml.A05;
        this.A06 = bml.A06;
    }

    public AddressCellParams(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = (Country) parcel.readParcelable(Country.class.getClassLoader());
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
    }
}
