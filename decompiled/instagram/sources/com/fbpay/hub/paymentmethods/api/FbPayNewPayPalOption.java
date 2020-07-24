package com.fbpay.hub.paymentmethods.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C26626Boi;
import p000X.C26653BpC;

public class FbPayNewPayPalOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(123);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewPayPalOption) {
                FbPayNewPayPalOption fbPayNewPayPalOption = (FbPayNewPayPalOption) obj;
                if (!C26626Boi.A03(this.A00, fbPayNewPayPalOption.A00) || !C26626Boi.A03(this.A01, fbPayNewPayPalOption.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A00);
        }
        if (this.A01 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(this.A01);
    }

    public FbPayNewPayPalOption(C26653BpC bpC) {
        this.A00 = bpC.A00;
        this.A01 = bpC.A01;
    }

    public FbPayNewPayPalOption(Parcel parcel) {
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
    }
}
