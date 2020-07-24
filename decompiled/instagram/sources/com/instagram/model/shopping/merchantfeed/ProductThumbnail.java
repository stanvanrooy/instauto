package com.instagram.model.shopping.merchantfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.productfeed.ProductTile;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ProductThumbnail implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(393);
    public Product A00;
    public ProductTileMedia A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTile)) {
            return false;
        }
        ProductThumbnail productThumbnail = (ProductThumbnail) obj;
        return AnonymousClass17M.A00(this.A00, productThumbnail.A00) && AnonymousClass17M.A00(this.A01, productThumbnail.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductThumbnail() {
    }

    public ProductThumbnail(Parcel parcel) {
        this.A00 = (Product) parcel.readParcelable(Product.class.getClassLoader());
        this.A01 = (ProductTileMedia) parcel.readParcelable(ProductTileMedia.class.getClassLoader());
    }
}
