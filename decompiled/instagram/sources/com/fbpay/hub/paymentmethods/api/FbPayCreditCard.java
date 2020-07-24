package com.fbpay.hub.paymentmethods.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.fbpay.hub.contactinfo.address.api.FBPayAddress;
import p000X.C229599y8;
import p000X.C26626Boi;
import p000X.C26654BpE;

public class FbPayCreditCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(121);
    public final FBPayAddress A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final C229599y8 A05;
    public final FbPayPaymentDefaultInfo A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayCreditCard) {
                FbPayCreditCard fbPayCreditCard = (FbPayCreditCard) obj;
                if (!C26626Boi.A03(this.A00, fbPayCreditCard.A00) || !C26626Boi.A03(this.A07, fbPayCreditCard.A07) || this.A05 != fbPayCreditCard.A05 || !C26626Boi.A03(this.A08, fbPayCreditCard.A08) || !C26626Boi.A03(this.A09, fbPayCreditCard.A09) || !C26626Boi.A03(this.A01, fbPayCreditCard.A01) || !C26626Boi.A03(this.A02, fbPayCreditCard.A02) || !C26626Boi.A03(this.A03, fbPayCreditCard.A03) || this.A0B != fbPayCreditCard.A0B || this.A0C != fbPayCreditCard.A0C || !C26626Boi.A03(this.A04, fbPayCreditCard.A04) || !C26626Boi.A03(this.A06, fbPayCreditCard.A06) || !C26626Boi.A03(this.A0A, fbPayCreditCard.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int ordinal;
        int A002 = C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A07);
        C229599y8 r0 = this.A05;
        if (r0 == null) {
            ordinal = -1;
        } else {
            ordinal = r0.ordinal();
        }
        return C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A01(C26626Boi.A01(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00((A002 * 31) + ordinal, this.A08), this.A09), this.A01), this.A02), this.A03), this.A0B), this.A0C), this.A04), this.A06), this.A0A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.A00.writeToParcel(parcel, i);
        }
        if (this.A07 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A07);
        }
        parcel.writeInt(this.A05.ordinal());
        if (this.A08 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A08);
        }
        parcel.writeString(this.A09);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeString(this.A04);
        if (this.A06 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeParcelable(this.A06, i);
        }
        if (this.A0A == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(this.A0A);
    }

    public FbPayCreditCard(C26654BpE bpE) {
        this.A00 = bpE.A00;
        this.A07 = null;
        C229599y8 r1 = bpE.A01;
        C26626Boi.A02(r1, "cardType");
        this.A05 = r1;
        this.A08 = null;
        String str = bpE.A02;
        C26626Boi.A02(str, "credentialId");
        this.A09 = str;
        String str2 = bpE.A03;
        C26626Boi.A02(str2, "expireMonth");
        this.A01 = str2;
        String str3 = bpE.A04;
        C26626Boi.A02(str3, "expireYear");
        this.A02 = str3;
        String str4 = bpE.A05;
        C26626Boi.A02(str4, "id");
        this.A03 = str4;
        this.A0B = false;
        this.A0C = false;
        String str5 = bpE.A06;
        C26626Boi.A02(str5, "lastFourDigits");
        this.A04 = str5;
        this.A06 = null;
        this.A0A = null;
    }

    public FbPayCreditCard(Parcel parcel) {
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (FBPayAddress) FBPayAddress.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = parcel.readString();
        }
        this.A05 = C229599y8.values()[parcel.readInt()];
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
        this.A09 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        boolean z = false;
        this.A0B = parcel.readInt() == 1;
        this.A0C = parcel.readInt() == 1 ? true : z;
        this.A04 = parcel.readString();
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = (FbPayPaymentDefaultInfo) parcel.readParcelable(FbPayPaymentDefaultInfo.class.getClassLoader());
        }
        if (parcel.readInt() == 0) {
            this.A0A = null;
        } else {
            this.A0A = parcel.readString();
        }
    }
}
