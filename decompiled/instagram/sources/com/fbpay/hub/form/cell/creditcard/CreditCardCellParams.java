package com.fbpay.hub.form.cell.creditcard;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.fbpay.hub.form.cell.CellParams;
import p000X.C26537BnE;
import p000X.C26570Bnn;

public class CreditCardCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(106);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public CreditCardCellParams(C26570Bnn bnn) {
        super((C26537BnE) bnn);
        this.A01 = bnn.A01;
        this.A00 = bnn.A00;
    }

    public CreditCardCellParams(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
