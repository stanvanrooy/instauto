package com.instagram.feed.feeditem;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.merchantfeed.MerchantWithProducts;

public class ShoppingPivotItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(328);
    public Product A00;
    public MerchantWithProducts A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ShoppingPivotItem() {
    }

    public ShoppingPivotItem(Parcel parcel) {
        this.A00 = (Product) parcel.readParcelable(Product.class.getClassLoader());
        this.A01 = (MerchantWithProducts) parcel.readParcelable(MerchantWithProducts.class.getClassLoader());
    }
}
