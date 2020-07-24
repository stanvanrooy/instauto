package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C228479tj;

public final class LocationRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(207);
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public boolean A04;
    public float A05;
    public int A06;
    public long A07;

    public LocationRequest() {
        this.A00 = 102;
        this.A01 = 3600000;
        this.A02 = 600000;
        this.A04 = false;
        this.A07 = Long.MAX_VALUE;
        this.A06 = Integer.MAX_VALUE;
        this.A05 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A03 = 0;
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = j2;
        this.A04 = z;
        this.A07 = j3;
        this.A06 = i2;
        this.A05 = f;
        this.A03 = j4;
    }

    public static void A00(long j) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LocationRequest) {
                LocationRequest locationRequest = (LocationRequest) obj;
                if (this.A00 == locationRequest.A00) {
                    long j = this.A01;
                    long j2 = locationRequest.A01;
                    if (j == j2 && this.A02 == locationRequest.A02 && this.A04 == locationRequest.A04 && this.A07 == locationRequest.A07 && this.A06 == locationRequest.A06 && this.A05 == locationRequest.A05) {
                        long j3 = this.A03;
                        if (j3 < j) {
                            j3 = j;
                        }
                        long j4 = locationRequest.A03;
                        if (j4 < j2) {
                            j4 = j2;
                        }
                        if (j3 == j4) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Long.valueOf(this.A01), Float.valueOf(this.A05), Long.valueOf(this.A03)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        int i = this.A00;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (i != 105) {
            sb.append(" requested=");
            sb.append(this.A01);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.A02);
        sb.append("ms");
        long j = this.A03;
        if (j > this.A01) {
            sb.append(" maxWait=");
            sb.append(j);
            sb.append("ms");
        }
        float f = this.A05;
        if (f > BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER) {
            sb.append(" smallestDisplacement=");
            sb.append(f);
            sb.append("m");
        }
        long j2 = this.A07;
        if (j2 != Long.MAX_VALUE) {
            sb.append(" expireIn=");
            sb.append(j2 - SystemClock.elapsedRealtime());
            sb.append("ms");
        }
        int i2 = this.A06;
        if (i2 != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(i2);
        }
        sb.append(']');
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A06(parcel, 2, this.A01);
        C228479tj.A06(parcel, 3, this.A02);
        C228479tj.A0D(parcel, 4, this.A04);
        C228479tj.A06(parcel, 5, this.A07);
        C228479tj.A04(parcel, 6, this.A06);
        C228479tj.A03(parcel, 7, this.A05);
        C228479tj.A06(parcel, 8, this.A03);
        C228479tj.A02(parcel, A002);
    }
}
