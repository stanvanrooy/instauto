package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ProductAREffectContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(368);
    public ProductItemWithAR A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }

    public ProductAREffectContainer() {
    }

    public ProductAREffectContainer(Parcel parcel) {
        this.A00 = (ProductItemWithAR) parcel.readParcelable(ProductItemWithAR.class.getClassLoader());
        this.A01 = parcel.readByte() != 0;
    }

    public ProductAREffectContainer(ProductItemWithAR productItemWithAR, boolean z) {
        this.A00 = productItemWithAR;
        this.A01 = z;
    }
}
