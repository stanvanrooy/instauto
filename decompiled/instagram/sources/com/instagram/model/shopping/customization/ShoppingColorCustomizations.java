package com.instagram.model.shopping.customization;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C13150hy;

public final class ShoppingColorCustomizations implements Parcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(384);
    public ShoppingColor A00;
    public ShoppingColor A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        ShoppingColor shoppingColor = this.A00;
        if (shoppingColor == null) {
            C13150hy.A03("accentColors");
        }
        parcel.writeParcelable(shoppingColor, i);
        ShoppingColor shoppingColor2 = this.A01;
        if (shoppingColor2 == null) {
            C13150hy.A03("contrastColors");
        }
        parcel.writeParcelable(shoppingColor2, i);
    }
}
