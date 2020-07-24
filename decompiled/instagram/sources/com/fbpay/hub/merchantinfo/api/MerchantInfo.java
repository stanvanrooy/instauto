package com.fbpay.hub.merchantinfo.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C26626Boi;

public class MerchantInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(118);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof MerchantInfo) {
                MerchantInfo merchantInfo = (MerchantInfo) obj;
                if (!C26626Boi.A03(this.A00, merchantInfo.A00) || !C26626Boi.A03(this.A01, merchantInfo.A01) || !C26626Boi.A03(this.A02, merchantInfo.A02) || !C26626Boi.A03(this.A04, merchantInfo.A04) || !C26626Boi.A03(this.A03, merchantInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A01), this.A02), this.A04), this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
    }

    public MerchantInfo(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
    }
}
