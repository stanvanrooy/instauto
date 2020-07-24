package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.customization.ShoppingFontCustomizations;
import p000X.C13150hy;
import p000X.C216429Uw;

public final class ProductCollectionTileCustomization implements Parcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(401);
    public ShoppingFontCustomizations A00;
    public C216429Uw A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        parcel.writeParcelable(this.A00, i);
        int i2 = 0;
        if (this.A01 != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        C216429Uw r0 = this.A01;
        if (r0 != null) {
            if (r0 == null) {
                C13150hy.A00();
            }
            parcel.writeParcelable(r0.A00, i);
        }
    }
}
