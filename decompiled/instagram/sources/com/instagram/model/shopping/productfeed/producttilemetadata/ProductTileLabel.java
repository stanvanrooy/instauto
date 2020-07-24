package com.instagram.model.shopping.productfeed.producttilemetadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass9RQ;

public class ProductTileLabel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(411);
    public ProductTileLabelLayoutContent A00;
    public AnonymousClass9RQ A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        AnonymousClass9RQ r0 = this.A01;
        if (r0 != null) {
            str = r0.A00;
        } else {
            str = null;
        }
        parcel.writeString(str);
        parcel.writeParcelable(this.A00, i);
    }

    public ProductTileLabel() {
    }

    public ProductTileLabel(Parcel parcel) {
        AnonymousClass9RQ r0 = (AnonymousClass9RQ) AnonymousClass9RQ.A01.get(parcel.readString());
        this.A01 = r0 == null ? AnonymousClass9RQ.UNKNOWN : r0;
        this.A00 = (ProductTileLabelLayoutContent) parcel.readParcelable(ProductTileLabelLayoutContent.class.getClassLoader());
    }
}
