package com.instagram.shopping.model.destination.home;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.productfeed.BrandsHscroll;
import com.instagram.model.shopping.productfeed.ProductCollectionTileHscroll;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ShoppingHomeSectionContent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(467);
    public BrandsHscroll A00;
    public ProductCollectionTileHscroll A01;
    public ProductSection A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingHomeSectionContent)) {
            return false;
        }
        ShoppingHomeSectionContent shoppingHomeSectionContent = (ShoppingHomeSectionContent) obj;
        return AnonymousClass17M.A00(this.A00, shoppingHomeSectionContent.A00) && AnonymousClass17M.A00(this.A02, shoppingHomeSectionContent.A02) && AnonymousClass17M.A00(this.A01, shoppingHomeSectionContent.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A02, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A01, i);
    }

    public ShoppingHomeSectionContent() {
    }

    public ShoppingHomeSectionContent(Parcel parcel) {
        this.A00 = (BrandsHscroll) parcel.readParcelable(BrandsHscroll.class.getClassLoader());
        this.A02 = (ProductSection) parcel.readParcelable(ProductSection.class.getClassLoader());
        this.A01 = (ProductCollectionTileHscroll) parcel.readParcelable(ProductCollectionTileHscroll.class.getClassLoader());
    }
}
