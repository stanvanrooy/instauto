package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ProductItemWithAR implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(373);
    public Product A00;
    public ProductArEffectMetadata A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProductItemWithAR productItemWithAR = (ProductItemWithAR) obj;
            if (!AnonymousClass17M.A00(this.A00, productItemWithAR.A00) || !AnonymousClass17M.A00(this.A01, productItemWithAR.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductItemWithAR() {
    }

    public ProductItemWithAR(Parcel parcel) {
        this.A00 = (Product) parcel.readParcelable(Product.class.getClassLoader());
        this.A01 = (ProductArEffectMetadata) parcel.readParcelable(ProductArEffectMetadata.class.getClassLoader());
    }

    public ProductItemWithAR(Product product, ProductArEffectMetadata productArEffectMetadata) {
        this.A00 = product;
        this.A01 = productArEffectMetadata;
    }
}
