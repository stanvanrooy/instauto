package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ShoppingDestinationMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(421);
    public ProductCollectionLinkMetadata A00;
    public ShoppingIncentiveMetadata A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ShoppingDestinationMetadata shoppingDestinationMetadata = (ShoppingDestinationMetadata) obj;
            if (!AnonymousClass17M.A00(this.A01, shoppingDestinationMetadata.A01) || !AnonymousClass17M.A00(this.A00, shoppingDestinationMetadata.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A01, this.A00});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public ShoppingDestinationMetadata() {
    }

    public ShoppingDestinationMetadata(Parcel parcel) {
        this.A01 = (ShoppingIncentiveMetadata) parcel.readParcelable(ShoppingIncentiveMetadata.class.getClassLoader());
        this.A00 = (ProductCollectionLinkMetadata) parcel.readParcelable(ProductCollectionLinkMetadata.class.getClassLoader());
    }
}
