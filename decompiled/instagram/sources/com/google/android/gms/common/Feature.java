package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C228479tj;
import p000X.C228489tz;

public class Feature extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(186);
    public final String A00;
    public final int A01;
    public final long A02;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, Long.valueOf(A00())});
    }

    public final long A00() {
        long j = this.A02;
        if (j == -1) {
            return (long) this.A01;
        }
        return j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            String str = this.A00;
            if (((str == null || !str.equals(feature.A00)) && (str != null || feature.A00 != null)) || A00() != feature.A00()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final String toString() {
        C228489tz r2 = new C228489tz(this);
        r2.A00("name", this.A00);
        r2.A00("version", Long.valueOf(A00()));
        return r2.toString();
    }

    public Feature(String str, int i, long j) {
        this.A00 = str;
        this.A01 = i;
        this.A02 = j;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 1, this.A00, false);
        C228479tj.A04(parcel, 2, this.A01);
        C228479tj.A06(parcel, 3, A00());
        C228479tj.A02(parcel, A002);
    }
}
