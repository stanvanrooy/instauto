package com.instagram.model.shopping.customization;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C13150hy;

public final class ShoppingFontCustomizations implements Parcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(385);
    public Integer A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        parcel.writeValue(this.A00);
    }
}
