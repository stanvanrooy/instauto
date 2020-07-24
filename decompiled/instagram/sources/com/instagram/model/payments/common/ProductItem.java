package com.instagram.model.payments.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.payments.CurrencyAmountInfo;

public class ProductItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(364);
    public int A00;
    public CurrencyAmountInfo A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
    }

    public ProductItem() {
    }

    public ProductItem(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = (CurrencyAmountInfo) parcel.readParcelable(CurrencyAmountInfo.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
    }

    public ProductItem(String str, CurrencyAmountInfo currencyAmountInfo, int i, String str2) {
        this.A03 = str;
        this.A01 = currencyAmountInfo;
        this.A00 = i;
        this.A02 = str2;
    }
}
