package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass9JI;

public class ProductVariantValue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(377);
    public AnonymousClass9JI A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductVariantValue) {
            ProductVariantValue productVariantValue = (ProductVariantValue) obj;
            return this.A01.equals(productVariantValue.A01) && this.A02.equals(productVariantValue.A02) && this.A03.equals(productVariantValue.A03) && this.A00 == productVariantValue.A00 && this.A04 == productVariantValue.A04;
        }
        return false;
    }

    public final int hashCode() {
        return (((((((this.A01.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + (this.A04 ? 1 : 0)) * 31) + this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A00.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public ProductVariantValue() {
    }

    public ProductVariantValue(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = AnonymousClass9JI.A00(parcel.readString());
        this.A04 = parcel.readInt() != 1 ? false : true;
    }
}
