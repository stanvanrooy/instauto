package com.instagram.model.payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.math.BigDecimal;
import p000X.C222719iT;

public class CurrencyAmountInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(362);
    public int A00;
    public C222719iT A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CurrencyAmountInfo currencyAmountInfo = (CurrencyAmountInfo) obj;
            if (!this.A04.equals(currencyAmountInfo.A04) || !this.A02.equals(currencyAmountInfo.A02) || !this.A03.equals(currencyAmountInfo.A03) || this.A00 != currencyAmountInfo.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
    }

    public CurrencyAmountInfo() {
    }

    public CurrencyAmountInfo(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A01 = new C222719iT(this.A04, new BigDecimal(this.A03), this.A00);
    }
}
