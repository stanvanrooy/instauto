package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Merchant;

public class BrandItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(394);
    public Merchant A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public BrandItem() {
    }

    public BrandItem(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
    }
}
