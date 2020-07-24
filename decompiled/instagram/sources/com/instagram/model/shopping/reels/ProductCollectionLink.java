package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ProductCollectionLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(415);
    public ShoppingDestinationMetadata A00;
    public String A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProductCollectionLink productCollectionLink = (ProductCollectionLink) obj;
            if (!AnonymousClass17M.A00(this.A02, productCollectionLink.A02) || !AnonymousClass17M.A00(this.A01, productCollectionLink.A01) || !AnonymousClass17M.A00(this.A00, productCollectionLink.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A01, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public ProductCollectionLink() {
    }

    public ProductCollectionLink(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (ShoppingDestinationMetadata) parcel.readParcelable(ShoppingDestinationMetadata.class.getClassLoader());
    }

    public ProductCollectionLink(String str, ShoppingDestinationMetadata shoppingDestinationMetadata) {
        this.A02 = "seller_product_collection";
        this.A01 = str;
        this.A00 = shoppingDestinationMetadata;
    }
}
