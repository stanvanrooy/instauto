package com.fbpay.hub.form.cell.toggle;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.fbpay.hub.form.cell.CellParams;
import p000X.C26537BnE;
import p000X.C26569Bnm;

public class SwitchCellParams extends CellParams {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(115);
    public final int A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
    }

    public SwitchCellParams(C26569Bnm bnm) {
        super((C26537BnE) bnm);
        this.A01 = bnm.A01;
        this.A00 = bnm.A00;
    }

    public SwitchCellParams(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readByte() != 0;
        this.A00 = parcel.readInt();
    }
}
