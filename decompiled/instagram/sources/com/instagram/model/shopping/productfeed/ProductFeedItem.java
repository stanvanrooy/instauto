package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;
import com.instagram.model.shopping.UnavailableProduct;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass9RX;
import p000X.C249616t;

public class ProductFeedItem implements C249616t, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(404);
    public Product A00;
    public UnavailableProduct A01;
    public MultiProductComponent A02;
    public ProductTile A03;
    public Integer A04;

    public final String AWS(AnonymousClass0C1 r2) {
        return null;
    }

    public final boolean Afk() {
        return true;
    }

    public final boolean Agp() {
        return true;
    }

    public final boolean Aho() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductFeedItem)) {
            return false;
        }
        ProductFeedItem productFeedItem = (ProductFeedItem) obj;
        return AnonymousClass17M.A00(this.A00, productFeedItem.A00) && AnonymousClass17M.A00(this.A01, productFeedItem.A01) && AnonymousClass17M.A00(this.A02, productFeedItem.A02) && AnonymousClass17M.A00(this.A03, productFeedItem.A03);
    }

    public final String getId() {
        Product product = this.A00;
        if (product == null) {
            UnavailableProduct unavailableProduct = this.A01;
            if (unavailableProduct != null) {
                return unavailableProduct.getId();
            }
            MultiProductComponent multiProductComponent = this.A02;
            if (multiProductComponent != null) {
                return multiProductComponent.getId();
            }
            ProductTile productTile = this.A03;
            if (productTile != null) {
                product = productTile.A00;
            } else {
                throw new IllegalStateException("There must be a non null feed item field");
            }
        }
        return product.getId();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        Product product = this.A00;
        int i = 0;
        if (product == null) {
            hashCode = 0;
        } else {
            hashCode = product.hashCode();
        }
        int i2 = hashCode * 31;
        UnavailableProduct unavailableProduct = this.A01;
        if (unavailableProduct == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = unavailableProduct.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        MultiProductComponent multiProductComponent = this.A02;
        if (multiProductComponent == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = multiProductComponent.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        ProductTile productTile = this.A03;
        if (productTile != null) {
            i = productTile.hashCode();
        }
        return i4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(AnonymousClass9RX.A00(this.A04));
    }

    public ProductFeedItem() {
    }

    public ProductFeedItem(Parcel parcel) {
        Integer num;
        this.A00 = (Product) parcel.readParcelable(Product.class.getClassLoader());
        this.A02 = (MultiProductComponent) parcel.readParcelable(MultiProductComponent.class.getClassLoader());
        this.A01 = (UnavailableProduct) parcel.readParcelable(UnavailableProduct.class.getClassLoader());
        this.A03 = (ProductTile) parcel.readParcelable(ProductTile.class.getClassLoader());
        String readString = parcel.readString();
        if (readString.equals("PRODUCT_COLLECTION")) {
            num = Constants.ZERO;
        } else if (readString.equals("PRODUCT")) {
            num = Constants.ONE;
        } else if (readString.equals("UNAVAILABLE_PRODUCT")) {
            num = Constants.A0C;
        } else if (readString.equals("PRODUCT_TILE")) {
            num = Constants.A0N;
        } else {
            throw new IllegalArgumentException(readString);
        }
        this.A04 = num;
    }

    public ProductFeedItem(Product product) {
        this.A00 = product;
        this.A04 = Constants.ONE;
    }
}
