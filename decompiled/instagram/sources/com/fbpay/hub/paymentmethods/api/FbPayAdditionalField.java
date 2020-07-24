package com.fbpay.hub.paymentmethods.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import p000X.C228379sv;
import p000X.C239512q;
import p000X.C26626Boi;

public class FbPayAdditionalField implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(120);
    public final ImmutableList A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof FbPayAdditionalField) {
                FbPayAdditionalField fbPayAdditionalField = (FbPayAdditionalField) obj;
                if (!C26626Boi.A03(this.A01, fbPayAdditionalField.A01) || !C26626Boi.A03(this.A00, fbPayAdditionalField.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C26626Boi.A00(C26626Boi.A00(1, this.A01), this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00.size());
        C239512q A0I = this.A00.iterator();
        while (A0I.hasNext()) {
            parcel.writeInt(((C228379sv) A0I.next()).ordinal());
        }
    }

    public FbPayAdditionalField(Parcel parcel) {
        this.A01 = parcel.readString();
        int readInt = parcel.readInt();
        C228379sv[] r3 = new C228379sv[readInt];
        for (int i = 0; i < readInt; i++) {
            r3[i] = C228379sv.values()[parcel.readInt()];
        }
        this.A00 = ImmutableList.A0C(r3);
    }
}
