package com.instagram.model.shopping.productfeed.producttilemetadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;

public class ProductTileMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(413);
    public ProductTileDecoration A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public ProductTileMetadata() {
    }

    public ProductTileMetadata(Parcel parcel) {
        parcel.readList(this.A01, ProductTileLabel.class.getClassLoader());
        this.A00 = (ProductTileDecoration) parcel.readParcelable(ProductTileDecoration.class.getClassLoader());
    }
}
