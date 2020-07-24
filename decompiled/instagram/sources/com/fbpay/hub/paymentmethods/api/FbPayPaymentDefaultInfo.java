package com.fbpay.hub.paymentmethods.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C26626Boi;

public class FbPayPaymentDefaultInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(125);
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentDefaultInfo) {
                FbPayPaymentDefaultInfo fbPayPaymentDefaultInfo = (FbPayPaymentDefaultInfo) obj;
                if (!(this.A00 == fbPayPaymentDefaultInfo.A00 && this.A01 == fbPayPaymentDefaultInfo.A01 && this.A02 == fbPayPaymentDefaultInfo.A02 && this.A03 == fbPayPaymentDefaultInfo.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A01(C26626Boi.A01(C26626Boi.A01(C26626Boi.A01(1, this.A00), this.A01), this.A02), this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
    }

    public FbPayPaymentDefaultInfo(Parcel parcel) {
        boolean z = false;
        this.A00 = parcel.readInt() == 1;
        this.A01 = parcel.readInt() == 1;
        this.A02 = parcel.readInt() == 1;
        this.A03 = parcel.readInt() == 1 ? true : z;
    }
}
