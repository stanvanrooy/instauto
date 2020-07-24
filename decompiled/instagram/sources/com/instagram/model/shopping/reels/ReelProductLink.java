package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ReelProductLink implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(420);
    public Product A00;

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return AnonymousClass17M.A00(this.A00, ((ReelProductLink) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ReelProductLink() {
    }

    public ReelProductLink(Parcel parcel) {
        this.A00 = (Product) parcel.readParcelable(Product.class.getClassLoader());
    }

    public ReelProductLink(Product product) {
        this.A00 = product;
    }
}
