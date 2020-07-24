package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.model.payments.CurrencyAmountInfo;
import java.util.Objects;

public class ProductCheckoutProperties implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(67);
    public int A00;
    public int A01;
    public CurrencyAmountInfo A02;
    public ShippingAndReturnsMetadata A03;
    public String A04;
    public String A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductCheckoutProperties) {
            ProductCheckoutProperties productCheckoutProperties = (ProductCheckoutProperties) obj;
            return this.A08 == productCheckoutProperties.A08 && this.A06 == productCheckoutProperties.A06 && this.A00 == productCheckoutProperties.A00 && Objects.equals(this.A02, productCheckoutProperties.A02) && Objects.equals(this.A04, productCheckoutProperties.A04) && Objects.equals(this.A05, productCheckoutProperties.A05) && this.A07 == productCheckoutProperties.A07 && this.A01 == productCheckoutProperties.A01;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{Boolean.valueOf(this.A08), Boolean.valueOf(this.A06), Integer.valueOf(this.A00), this.A02, this.A05, this.A04, this.A03, Integer.valueOf(this.A01), Boolean.valueOf(this.A07)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A05);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
    }

    public ProductCheckoutProperties() {
    }

    public ProductCheckoutProperties(Parcel parcel) {
        boolean z = false;
        this.A08 = parcel.readInt() == 1;
        this.A06 = parcel.readInt() == 1;
        this.A00 = parcel.readInt();
        this.A02 = (CurrencyAmountInfo) parcel.readParcelable(CurrencyAmountInfo.class.getClassLoader());
        this.A05 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = (ShippingAndReturnsMetadata) parcel.readParcelable(ShippingAndReturnsMetadata.class.getClassLoader());
        this.A01 = parcel.readInt();
        this.A07 = parcel.readInt() == 1 ? true : z;
    }
}
