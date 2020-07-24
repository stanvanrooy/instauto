package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.Arrays;
import p000X.AnonymousClass17M;
import p000X.C173377aw;

public class ProductMention implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(69);
    public int A00;
    public int A01;
    public Product A02;
    public C173377aw A03 = C173377aw.APPROVED;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ProductMention productMention = (ProductMention) obj;
            if (!(this.A00 == productMention.A00 && this.A01 == productMention.A01 && AnonymousClass17M.A00(this.A02.getId(), productMention.A02.getId()) && this.A03 == productMention.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A04, this.A03});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03.A00);
    }

    public ProductMention() {
    }

    public ProductMention(Parcel parcel) {
        this.A02 = (Product) parcel.readParcelable(Product.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A03 = C173377aw.A00(parcel.readString());
    }

    public ProductMention(Product product, int i, int i2) {
        this.A02 = product;
        this.A00 = i;
        this.A01 = i2;
    }
}
