package com.fbpay.hub.orders.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C26626Boi;
import p000X.C26628Bom;

public class FBPayOrder implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(119);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final int A06;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayOrder) {
                FBPayOrder fBPayOrder = (FBPayOrder) obj;
                if (!C26626Boi.A03(this.A00, fBPayOrder.A00) || !C26626Boi.A03(this.A01, fBPayOrder.A01) || !C26626Boi.A03(this.A02, fBPayOrder.A02) || !C26626Boi.A03(this.A03, fBPayOrder.A03) || !C26626Boi.A03(this.A04, fBPayOrder.A04) || this.A06 != fBPayOrder.A06 || !C26626Boi.A03(this.A05, fBPayOrder.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00((C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A01), this.A02), this.A03), this.A04) * 31) + this.A06, this.A05);
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
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A01);
        }
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06);
        if (this.A05 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(this.A05);
    }

    public FBPayOrder(C26628Bom bom) {
        this.A00 = bom.A01;
        this.A01 = bom.A02;
        String str = bom.A03;
        C26626Boi.A02(str, "orderId");
        this.A02 = str;
        String str2 = bom.A04;
        C26626Boi.A02(str2, "orderStatus");
        this.A03 = str2;
        String str3 = bom.A05;
        C26626Boi.A02(str3, "orderType");
        this.A04 = str3;
        this.A06 = bom.A00;
        this.A05 = bom.A06;
    }

    public FBPayOrder(Parcel parcel) {
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
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A06 = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.A05 = null;
        } else {
            this.A05 = parcel.readString();
        }
    }
}
