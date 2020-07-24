package com.instagram.tagging.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;

public class MediaSuggestedProductTagProductItemContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(474);
    public float A00;
    public Product A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeFloat(this.A00);
    }

    public MediaSuggestedProductTagProductItemContainer() {
    }

    public MediaSuggestedProductTagProductItemContainer(Parcel parcel) {
        this.A01 = (Product) parcel.readParcelable(Product.class.getClassLoader());
        this.A00 = parcel.readFloat();
    }
}
