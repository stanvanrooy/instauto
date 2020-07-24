package com.google.android.gms.clearcut;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C228479tj;

public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(168);
    public final long A00;
    public final long A01;
    public final boolean A02;

    public zzc(boolean z, long j, long j2) {
        this.A02 = z;
        this.A00 = j;
        this.A01 = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzc) {
                zzc zzc = (zzc) obj;
                if (!(this.A02 == zzc.A02 && this.A00 == zzc.A00 && this.A01 == zzc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A02), Long.valueOf(this.A00), Long.valueOf(this.A01)});
    }

    public final String toString() {
        return "CollectForDebugParcelable[skipPersistentStorage: " + this.A02 + ",collectForDebugStartTimeMillis: " + this.A00 + ",collectForDebugExpiryTimeMillis: " + this.A01 + "]";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0D(parcel, 1, this.A02);
        C228479tj.A06(parcel, 2, this.A01);
        C228479tj.A06(parcel, 3, this.A00);
        C228479tj.A02(parcel, A002);
    }
}
