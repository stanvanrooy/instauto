package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.productfeed.producttilemetadata.ProductTileMetadata;
import java.util.Arrays;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass9RP;

public class ProductTile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(406);
    public Product A00;
    public AnonymousClass9RP A01;
    public ProductTileMedia A02;
    public ProductTileMetadata A03;

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
        ProductTile productTile = (ProductTile) obj;
        return AnonymousClass17M.A00(this.A00, productTile.A00) && this.A01 == productTile.A01 && AnonymousClass17M.A00(this.A02, productTile.A02);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01, this.A02});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        int i2 = 1;
        if (this.A01 == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        AnonymousClass9RP r0 = this.A01;
        if (r0 != null) {
            parcel.writeString(r0.A00);
        }
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
    }

    public ProductTile() {
    }

    public ProductTile(Parcel parcel) {
        this.A00 = (Product) parcel.readParcelable(Product.class.getClassLoader());
        if (parcel.readInt() == 1) {
            AnonymousClass9RP r0 = (AnonymousClass9RP) AnonymousClass9RP.A01.get(parcel.readString());
            this.A01 = r0 == null ? AnonymousClass9RP.MERCHANT_NAME : r0;
        }
        this.A03 = (ProductTileMetadata) parcel.readParcelable(ProductTileMetadata.class.getClassLoader());
        this.A02 = (ProductTileMedia) parcel.readParcelable(ProductTileMedia.class.getClassLoader());
    }
}
