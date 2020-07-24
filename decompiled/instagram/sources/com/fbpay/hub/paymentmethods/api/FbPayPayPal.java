package com.fbpay.hub.paymentmethods.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import p000X.C26626Boi;
import p000X.C26627Bok;

public class FbPayPayPal implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(124);
    public final String A00;
    public final String A01;
    public final FbPayPaymentDefaultInfo A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayPayPal) {
                FbPayPayPal fbPayPayPal = (FbPayPayPal) obj;
                if (!C26626Boi.A03(this.A03, fbPayPayPal.A03) || !C26626Boi.A03(this.A04, fbPayPayPal.A04) || this.A08 != fbPayPayPal.A08 || !C26626Boi.A03(this.A05, fbPayPayPal.A05) || !C26626Boi.A03(this.A06, fbPayPayPal.A06) || !C26626Boi.A03(this.A07, fbPayPayPal.A07) || !C26626Boi.A03(this.A00, fbPayPayPal.A00) || !C26626Boi.A03(this.A01, fbPayPayPal.A01) || this.A09 != fbPayPayPal.A09 || !C26626Boi.A03(this.A02, fbPayPayPal.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A01(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A01(C26626Boi.A00(C26626Boi.A00(1, this.A03), this.A04), this.A08), this.A05), this.A06), this.A07), this.A00), this.A01), this.A09), this.A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A03);
        }
        if (this.A04 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A04);
        }
        parcel.writeInt(this.A08 ? 1 : 0);
        if (this.A05 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A05);
        }
        if (this.A06 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A06);
        }
        if (this.A07 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A07);
        }
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A09 ? 1 : 0);
        if (this.A02 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeParcelable(this.A02, i);
    }

    public FbPayPayPal(C26627Bok bok) {
        this.A03 = null;
        this.A04 = null;
        this.A08 = false;
        this.A05 = null;
        this.A06 = null;
        this.A07 = null;
        String str = bok.A00;
        C26626Boi.A02(str, IgReactPurchaseExperienceBridgeModule.EMAIL);
        this.A00 = str;
        String str2 = bok.A01;
        C26626Boi.A02(str2, "id");
        this.A01 = str2;
        this.A09 = false;
        this.A02 = null;
    }

    public FbPayPayPal(Parcel parcel) {
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
        boolean z = false;
        this.A08 = parcel.readInt() == 1;
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
        this.A09 = parcel.readInt() == 1 ? true : z;
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = (FbPayPaymentDefaultInfo) parcel.readParcelable(FbPayPaymentDefaultInfo.class.getClassLoader());
        }
    }
}
