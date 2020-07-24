package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.sizechart.SizeChart;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass9JI;

public class ProductVariantDimension implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(376);
    public AnonymousClass9JI A00;
    public SizeChart A01;
    public String A02;
    public String A03;
    public List A04;
    public final List A05 = new ArrayList();

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductVariantDimension) {
            ProductVariantDimension productVariantDimension = (ProductVariantDimension) obj;
            if (this.A02.equals(productVariantDimension.A02) && this.A03.equals(productVariantDimension.A03) && this.A00 == productVariantDimension.A00) {
                return this.A05.equals(productVariantDimension.A05);
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31) + this.A00.hashCode()) * 31) + this.A05.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A05);
        parcel.writeSerializable(this.A00);
    }

    public ProductVariantDimension() {
    }

    public ProductVariantDimension(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        parcel.readStringList(this.A05);
        this.A00 = (AnonymousClass9JI) parcel.readSerializable();
    }
}
