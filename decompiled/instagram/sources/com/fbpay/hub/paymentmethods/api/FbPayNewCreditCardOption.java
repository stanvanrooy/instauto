package com.fbpay.hub.paymentmethods.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import p000X.AnonymousClass9y9;
import p000X.C229599y8;
import p000X.C229609yA;
import p000X.C239512q;
import p000X.C26626Boi;

public class FbPayNewCreditCardOption implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(122);
    public final ImmutableList A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final String A03;
    public final String A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayNewCreditCardOption) {
                FbPayNewCreditCardOption fbPayNewCreditCardOption = (FbPayNewCreditCardOption) obj;
                if (!C26626Boi.A03(this.A00, fbPayNewCreditCardOption.A00) || !C26626Boi.A03(this.A03, fbPayNewCreditCardOption.A03) || !C26626Boi.A03(this.A01, fbPayNewCreditCardOption.A01) || !C26626Boi.A03(this.A02, fbPayNewCreditCardOption.A02) || !C26626Boi.A03(this.A04, fbPayNewCreditCardOption.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(C26626Boi.A00(1, this.A00), this.A03), this.A01), this.A02), this.A04);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(this.A00.size());
            C239512q A0I = this.A00.iterator();
            while (A0I.hasNext()) {
                parcel.writeParcelable((FbPayAdditionalField) A0I.next(), i);
            }
        }
        if (this.A03 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(this.A03);
        }
        if (this.A01 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(this.A01.size());
            C239512q A0I2 = this.A01.iterator();
            while (A0I2.hasNext()) {
                parcel.writeInt(((AnonymousClass9y9) A0I2.next()).ordinal());
            }
        }
        if (this.A02 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(this.A02.size());
            C239512q A0I3 = this.A02.iterator();
            while (A0I3.hasNext()) {
                parcel.writeInt(((C229599y8) A0I3.next()).ordinal());
            }
        }
        if (this.A04 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeString(this.A04);
    }

    public FbPayNewCreditCardOption(C229609yA r2) {
        this.A00 = null;
        this.A03 = null;
        this.A01 = null;
        this.A02 = null;
        this.A04 = r2.A00;
    }

    public FbPayNewCreditCardOption(Parcel parcel) {
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            int readInt = parcel.readInt();
            FbPayAdditionalField[] fbPayAdditionalFieldArr = new FbPayAdditionalField[readInt];
            for (int i = 0; i < readInt; i++) {
                fbPayAdditionalFieldArr[i] = (FbPayAdditionalField) parcel.readParcelable(FbPayAdditionalField.class.getClassLoader());
            }
            this.A00 = ImmutableList.A0C(fbPayAdditionalFieldArr);
        }
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt2 = parcel.readInt();
            AnonymousClass9y9[] r3 = new AnonymousClass9y9[readInt2];
            for (int i2 = 0; i2 < readInt2; i2++) {
                r3[i2] = AnonymousClass9y9.values()[parcel.readInt()];
            }
            this.A01 = ImmutableList.A0C(r3);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt3 = parcel.readInt();
            C229599y8[] r2 = new C229599y8[readInt3];
            for (int i3 = 0; i3 < readInt3; i3++) {
                r2[i3] = C229599y8.values()[parcel.readInt()];
            }
            this.A02 = ImmutableList.A0C(r2);
        }
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            this.A04 = parcel.readString();
        }
    }
}
