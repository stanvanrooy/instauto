package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import p000X.Constants;
import p000X.AnonymousClass0C1;
import p000X.AnonymousClass17M;
import p000X.AnonymousClass1NN;
import p000X.C249616t;

public class MicroProduct implements C249616t, Parcelable, AnonymousClass1NN {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(367);
    public Merchant A00;
    public ProductImageContainer A01;
    public ProductImageContainer A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;

    public final void A6t(AnonymousClass0C1 r1) {
    }

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
        if (!(obj instanceof MicroProduct)) {
            return false;
        }
        MicroProduct microProduct = (MicroProduct) obj;
        return AnonymousClass17M.A00(this.A00, microProduct.A00) && AnonymousClass17M.A00(this.A07, microProduct.A07) && AnonymousClass17M.A00(this.A06, microProduct.A06) && this.A08 == microProduct.A08 && AnonymousClass17M.A00(this.A01, microProduct.A01) && AnonymousClass17M.A00(this.A02, microProduct.A02) && AnonymousClass17M.A00(this.A04, microProduct.A04) && AnonymousClass17M.A00(this.A05, microProduct.A05) && AnonymousClass17M.A00(this.A03, microProduct.A03);
    }

    public final Integer AV3() {
        if (this.A08) {
            return Constants.ZERO;
        }
        return Constants.ONE;
    }

    public final void BkJ(Integer num) {
        boolean z = false;
        if (num == Constants.ZERO) {
            z = true;
        }
        this.A08 = z;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A07, this.A06, Boolean.valueOf(this.A08), this.A01, this.A02, this.A04, this.A05, this.A03});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }

    public final Collection AV4() {
        return Collections.emptyList();
    }

    public final boolean AhP() {
        return this.A08;
    }

    public final String getId() {
        return this.A07;
    }

    public MicroProduct() {
    }

    public MicroProduct(Parcel parcel) {
        this.A00 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A08 = parcel.readInt() != 1 ? false : true;
        Class<ProductImageContainer> cls = ProductImageContainer.class;
        this.A01 = (ProductImageContainer) parcel.readParcelable(cls.getClassLoader());
        this.A02 = (ProductImageContainer) parcel.readParcelable(cls.getClassLoader());
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
    }
}
