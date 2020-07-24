package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C13150hy;
import p000X.C170677Ro;

public final class ProductShareConfig implements Parcelable {
    public static final C170677Ro A03 = new C170677Ro();
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(418);
    public final int A00;
    public final String A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductShareConfig)) {
            return false;
        }
        ProductShareConfig productShareConfig = (ProductShareConfig) obj;
        return C13150hy.A05(this.A01, productShareConfig.A01) && this.A00 == productShareConfig.A00 && this.A02 == productShareConfig.A02;
    }

    public final int hashCode() {
        String str = this.A01;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.A00) * 31;
        boolean z = this.A02;
        if (z) {
            z = true;
        }
        return hashCode + (z ? 1 : 0);
    }

    public final String toString() {
        return "ProductShareConfig(stickerText=" + this.A01 + ", stickerColor=" + this.A00 + ", isReminderButtonEnabled=" + this.A02 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public ProductShareConfig(String str, int i, boolean z) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = z;
    }
}
