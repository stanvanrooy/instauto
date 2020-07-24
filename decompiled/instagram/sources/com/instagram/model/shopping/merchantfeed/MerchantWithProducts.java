package com.instagram.model.shopping.merchantfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Merchant;
import com.instagram.model.shopping.Product;
import java.util.List;
import p000X.C28691Ms;

public class MerchantWithProducts extends C28691Ms implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(392);
    public Merchant A00;
    public String A01;
    public List A02;
    public List A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeTypedList(this.A03);
        parcel.writeTypedList(this.A02);
    }

    public MerchantWithProducts() {
    }

    public MerchantWithProducts(Parcel parcel) {
        this.A00 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
        this.A01 = parcel.readString();
        this.A03 = parcel.createTypedArrayList(Product.CREATOR);
        this.A02 = parcel.createTypedArrayList(ProductThumbnail.CREATOR);
    }

    public MerchantWithProducts(Merchant merchant, String str, List list, List list2) {
        this.A00 = merchant;
        this.A01 = str;
        this.A03 = list;
        this.A02 = list2;
    }
}
