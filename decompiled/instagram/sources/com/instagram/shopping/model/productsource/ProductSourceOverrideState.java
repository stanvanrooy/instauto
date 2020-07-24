package com.instagram.shopping.model.productsource;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.ProductSource;
import p000X.C13150hy;
import p000X.CNU;

public final class ProductSourceOverrideState implements Parcelable {
    public static final CNU A03 = new CNU();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(469);
    public final ProductSource A00;
    public final ProductSourceOverrideStatus A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductSourceOverrideState)) {
            return false;
        }
        ProductSourceOverrideState productSourceOverrideState = (ProductSourceOverrideState) obj;
        return C13150hy.A05(this.A01, productSourceOverrideState.A01) && C13150hy.A05(this.A02, productSourceOverrideState.A02) && C13150hy.A05(this.A00, productSourceOverrideState.A00);
    }

    public final int hashCode() {
        ProductSourceOverrideStatus productSourceOverrideStatus = this.A01;
        int i = 0;
        int hashCode = (productSourceOverrideStatus != null ? productSourceOverrideStatus.hashCode() : 0) * 31;
        String str = this.A02;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        ProductSource productSource = this.A00;
        if (productSource != null) {
            i = productSource.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ProductSourceOverrideState(overrideStatus=" + this.A01 + ", overrideMerchantId=" + this.A02 + ", currentProductSource=" + this.A00 + ")";
    }

    public ProductSourceOverrideState(ProductSourceOverrideStatus productSourceOverrideStatus, String str, ProductSource productSource) {
        C13150hy.A02(productSourceOverrideStatus, "overrideStatus");
        this.A01 = productSourceOverrideStatus;
        this.A02 = str;
        this.A00 = productSource;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
    }
}
