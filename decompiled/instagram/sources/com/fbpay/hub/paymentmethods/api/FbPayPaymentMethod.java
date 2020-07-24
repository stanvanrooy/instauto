package com.fbpay.hub.paymentmethods.api;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C26516Bmt;
import p000X.C26626Boi;

public class FbPayPaymentMethod implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(126);
    public final int A00;
    public final Uri A01;
    public final FbPayCreditCard A02;
    public final FbPayPayPal A03;
    public final String A04;
    public final String A05;
    public final FbPayNewCreditCardOption A06;
    public final FbPayNewPayPalOption A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPaymentMethod) {
                FbPayPaymentMethod fbPayPaymentMethod = (FbPayPaymentMethod) obj;
                if (!C26626Boi.A03(this.A02, fbPayPaymentMethod.A02) || !C26626Boi.A03(this.A03, fbPayPaymentMethod.A03) || !C26626Boi.A03(this.A01, fbPayPaymentMethod.A01) || !C26626Boi.A03(this.A06, fbPayPaymentMethod.A06) || !C26626Boi.A03(this.A07, fbPayPaymentMethod.A07) || !C26626Boi.A03(this.A04, fbPayPaymentMethod.A04) || !C26626Boi.A03(this.A05, fbPayPaymentMethod.A05) || this.A00 != fbPayPaymentMethod.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A02), this.A03), this.A01), this.A06), this.A07), this.A04), this.A05) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A02, i);
        }
        if (this.A03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A03, i);
        }
        if (this.A01 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A01, i);
        }
        if (this.A06 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A06, i);
        }
        if (this.A07 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A07, i);
        }
        if (this.A04 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A04);
        }
        if (this.A05 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A05);
        }
        parcel.writeInt(this.A00);
    }

    public FbPayPaymentMethod(C26516Bmt bmt) {
        this.A02 = bmt.A02;
        this.A03 = bmt.A03;
        this.A01 = bmt.A01;
        this.A06 = null;
        this.A07 = null;
        this.A04 = bmt.A04;
        this.A05 = bmt.A05;
        this.A00 = bmt.A00;
    }

    public FbPayPaymentMethod(Parcel parcel) {
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (FbPayCreditCard) parcel.readParcelable(FbPayCreditCard.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = (FbPayPayPal) parcel.readParcelable(FbPayPayPal.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (FbPayNewCreditCardOption) parcel.readParcelable(FbPayNewCreditCardOption.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = (FbPayNewPayPalOption) parcel.readParcelable(FbPayNewPayPalOption.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        this.A00 = parcel.readInt();
    }
}
