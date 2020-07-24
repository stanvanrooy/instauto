package com.instagram.model.shopping.productfeed.producttilemetadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ProductNameLabelOptions extends ProductTileLabelOptions {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(409);
    public int A00;
    public boolean A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A00;
        if (i2 == 0) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public ProductNameLabelOptions() {
    }

    public ProductNameLabelOptions(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() != 1 ? false : true;
    }
}
