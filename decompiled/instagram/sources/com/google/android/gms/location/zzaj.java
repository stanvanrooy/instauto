package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C228479tj;

public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(212);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;

    public zzaj(int i, int i2, long j, long j2) {
        this.A01 = i;
        this.A00 = i2;
        this.A03 = j;
        this.A02 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                zzaj zzaj = (zzaj) obj;
                if (!(this.A01 == zzaj.A01 && this.A00 == zzaj.A00 && this.A03 == zzaj.A03 && this.A02 == zzaj.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Long.valueOf(this.A02), Long.valueOf(this.A03)});
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.A01 + " Cell status: " + this.A00 + " elapsed time NS: " + this.A02 + " system time ms: " + this.A03;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A01);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A06(parcel, 3, this.A03);
        C228479tj.A06(parcel, 4, this.A02);
        C228479tj.A02(parcel, A002);
    }
}
