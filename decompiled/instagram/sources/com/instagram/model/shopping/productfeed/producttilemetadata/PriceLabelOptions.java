package com.instagram.model.shopping.productfeed.producttilemetadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class PriceLabelOptions extends ProductTileLabelOptions {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(408);
    public boolean A00;

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public PriceLabelOptions() {
    }

    public PriceLabelOptions(Parcel parcel) {
        this.A00 = parcel.readInt() != 1 ? false : true;
    }
}
