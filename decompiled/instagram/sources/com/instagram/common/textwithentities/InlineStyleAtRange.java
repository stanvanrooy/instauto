package com.instagram.common.textwithentities;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C25972BdR;

public class InlineStyleAtRange implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(284);
    public int A00;
    public int A01;
    public C25972BdR A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02.A00);
    }

    public InlineStyleAtRange() {
    }

    public InlineStyleAtRange(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = (C25972BdR) C25972BdR.A01.get(parcel.readInt());
    }
}
