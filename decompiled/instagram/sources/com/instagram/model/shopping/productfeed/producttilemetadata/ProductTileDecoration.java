package com.instagram.model.shopping.productfeed.producttilemetadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ProductTileDecoration implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(410);
    public boolean A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public ProductTileDecoration() {
    }

    public ProductTileDecoration(Parcel parcel) {
        boolean z = false;
        this.A01 = parcel.readInt() == 1;
        this.A00 = parcel.readInt() == 1 ? true : z;
    }
}
