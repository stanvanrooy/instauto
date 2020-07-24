package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.payments.CurrencyAmountInfo;
import java.util.Arrays;
import p000X.AnonymousClass17M;

public class ShippingAndReturnsMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(378);
    public CurrencyAmountInfo A00;
    public CurrencyAmountInfo A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShippingAndReturnsMetadata)) {
            return false;
        }
        ShippingAndReturnsMetadata shippingAndReturnsMetadata = (ShippingAndReturnsMetadata) obj;
        return AnonymousClass17M.A00(this.A00, shippingAndReturnsMetadata.A00) && AnonymousClass17M.A00(this.A01, shippingAndReturnsMetadata.A01);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = 1;
        int i3 = 0;
        if (this.A00 != null) {
            i3 = 1;
        }
        parcel.writeInt(i3);
        CurrencyAmountInfo currencyAmountInfo = this.A00;
        if (currencyAmountInfo != null) {
            parcel.writeParcelable(currencyAmountInfo, i);
        }
        if (this.A01 == null) {
            i2 = 0;
        }
        parcel.writeInt(i2);
        CurrencyAmountInfo currencyAmountInfo2 = this.A01;
        if (currencyAmountInfo2 != null) {
            parcel.writeParcelable(currencyAmountInfo2, i);
        }
    }

    public ShippingAndReturnsMetadata() {
    }

    public ShippingAndReturnsMetadata(Parcel parcel) {
        if (parcel.readInt() == 1) {
            this.A00 = (CurrencyAmountInfo) parcel.readParcelable(CurrencyAmountInfo.class.getClassLoader());
        }
        if (parcel.readInt() == 1) {
            this.A01 = (CurrencyAmountInfo) parcel.readParcelable(CurrencyAmountInfo.class.getClassLoader());
        }
    }
}
