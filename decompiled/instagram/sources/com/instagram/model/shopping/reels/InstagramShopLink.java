package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass000;
import p000X.C13150hy;

public final class InstagramShopLink implements Parcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(414);
    public boolean A00;

    public InstagramShopLink() {
        this(false);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof InstagramShopLink) && this.A00 == ((InstagramShopLink) obj).A00;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A00;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return AnonymousClass000.A0U("InstagramShopLink(isEnabled=", this.A00, ")");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        parcel.writeInt(this.A00 ? 1 : 0);
    }

    public InstagramShopLink(boolean z) {
        this.A00 = z;
    }
}
