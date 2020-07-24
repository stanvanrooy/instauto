package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ShoppingIncentiveMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(422);
    public String A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ShoppingIncentiveMetadata shoppingIncentiveMetadata = (ShoppingIncentiveMetadata) obj;
            if (!AnonymousClass17M.A00(this.A00, shoppingIncentiveMetadata.A00) || !AnonymousClass17M.A00(this.A01, shoppingIncentiveMetadata.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public ShoppingIncentiveMetadata() {
    }

    public ShoppingIncentiveMetadata(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
