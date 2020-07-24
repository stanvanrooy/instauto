package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.ProductImageContainer;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class CollectionTileCoverMedia implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(397);
    public ProductImageContainer A00;

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
        if (!(obj instanceof CollectionTileCoverMedia)) {
            return false;
        }
        return AnonymousClass17M.A00(this.A00, ((CollectionTileCoverMedia) obj).A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public CollectionTileCoverMedia() {
    }

    public CollectionTileCoverMedia(Parcel parcel) {
        this.A00 = (ProductImageContainer) parcel.readParcelable(ProductImageContainer.class.getClassLoader());
    }
}
