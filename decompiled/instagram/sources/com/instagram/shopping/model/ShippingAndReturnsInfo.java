package com.instagram.shopping.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;

public class ShippingAndReturnsInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(461);
    public List A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeTypedList(this.A00);
    }

    public ShippingAndReturnsInfo() {
    }

    public ShippingAndReturnsInfo(Parcel parcel) {
        this.A01 = parcel.readInt() != 0;
        this.A00 = parcel.createTypedArrayList(ShippingAndReturnsSection.CREATOR);
    }

    public ShippingAndReturnsInfo(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }
}
