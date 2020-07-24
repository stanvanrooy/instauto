package com.fbpay.hub.contactinfo.address.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C26625Boh;
import p000X.C26626Boi;

public class FBPayAddress implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(104);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FBPayAddress) {
                FBPayAddress fBPayAddress = (FBPayAddress) obj;
                if (!C26626Boi.A03(this.A00, fBPayAddress.A00) || !C26626Boi.A03(this.A01, fBPayAddress.A01) || !C26626Boi.A03(this.A02, fBPayAddress.A02) || !C26626Boi.A03(this.A03, fBPayAddress.A03) || this.A09 != fBPayAddress.A09 || !C26626Boi.A03(this.A04, fBPayAddress.A04) || !C26626Boi.A03(this.A05, fBPayAddress.A05) || !C26626Boi.A03(this.A06, fBPayAddress.A06) || !C26626Boi.A03(this.A07, fBPayAddress.A07) || !C26626Boi.A03(this.A08, fBPayAddress.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A01(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A01), this.A02), this.A03), this.A09), this.A04), this.A05), this.A06), this.A07), this.A08);
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
        if (this.A02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A02);
        }
        if (this.A03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A03);
        }
        parcel.writeInt(this.A09 ? 1 : 0);
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
        if (this.A08 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(this.A08);
    }

    public FBPayAddress(C26625Boh boh) {
        this.A00 = boh.A00;
        this.A01 = boh.A01;
        this.A02 = boh.A02;
        this.A03 = boh.A03;
        this.A09 = boh.A09;
        this.A04 = boh.A04;
        this.A05 = boh.A05;
        this.A06 = boh.A06;
        this.A07 = boh.A07;
        this.A08 = boh.A08;
    }

    public FBPayAddress(Parcel parcel) {
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
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A09 = parcel.readInt() != 1 ? false : true;
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
        if (parcel.readInt() == 0) {
            this.A08 = null;
        } else {
            this.A08 = parcel.readString();
        }
    }
}
