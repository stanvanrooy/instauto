package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass17M;
import p000X.C249616t;

public class UnavailableProduct implements C249616t, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(382);
    public Merchant A00;
    public String A01;

    public final String AWS(AnonymousClass0C1 r2) {
        return null;
    }

    public final boolean Afk() {
        return true;
    }

    public final boolean Agp() {
        return true;
    }

    public final boolean Aho() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UnavailableProduct)) {
            return false;
        }
        UnavailableProduct unavailableProduct = (UnavailableProduct) obj;
        return AnonymousClass17M.A00(this.A00, unavailableProduct.A00) && AnonymousClass17M.A00(this.A01, unavailableProduct.A01);
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public final String getId() {
        return this.A01;
    }

    public UnavailableProduct() {
    }

    public UnavailableProduct(Parcel parcel) {
        this.A00 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
        this.A01 = parcel.readString();
    }
}
