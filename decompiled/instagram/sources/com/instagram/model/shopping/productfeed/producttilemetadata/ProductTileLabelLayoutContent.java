package com.instagram.model.shopping.productfeed.producttilemetadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ProductTileLabelLayoutContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(412);
    public PriceLabelOptions A00;
    public ProductNameLabelOptions A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public ProductTileLabelLayoutContent() {
    }

    public ProductTileLabelLayoutContent(Parcel parcel) {
        this.A01 = (ProductNameLabelOptions) parcel.readParcelable(ProductNameLabelOptions.class.getClassLoader());
        this.A00 = (PriceLabelOptions) parcel.readParcelable(PriceLabelOptions.class.getClassLoader());
    }
}
