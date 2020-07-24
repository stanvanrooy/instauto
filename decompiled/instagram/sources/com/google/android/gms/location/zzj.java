package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C228479tj;

public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(218);
    public float A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;

    public zzj(boolean z, long j, float f, long j2, int i) {
        this.A04 = z;
        this.A02 = j;
        this.A00 = f;
        this.A03 = j2;
        this.A01 = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof zzj) {
                zzj zzj = (zzj) obj;
                if (!(this.A04 == zzj.A04 && this.A02 == zzj.A02 && Float.compare(this.A00, zzj.A00) == 0 && this.A03 == zzj.A03 && this.A01 == zzj.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.A04), Long.valueOf(this.A02), Float.valueOf(this.A00), Long.valueOf(this.A03), Integer.valueOf(this.A01)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.A04);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.A02);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.A00);
        long j = this.A03;
        if (j != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        int i = this.A01;
        if (i != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0D(parcel, 1, this.A04);
        C228479tj.A06(parcel, 2, this.A02);
        C228479tj.A03(parcel, 3, this.A00);
        C228479tj.A06(parcel, 4, this.A03);
        C228479tj.A04(parcel, 5, this.A01);
        C228479tj.A02(parcel, A002);
    }
}
