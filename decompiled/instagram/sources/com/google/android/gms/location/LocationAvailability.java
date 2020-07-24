package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import p000X.C228479tj;

public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(206);
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public zzaj[] A04;

    public LocationAvailability(int i, int i2, int i3, long j, zzaj[] zzajArr) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = j;
        this.A04 = zzajArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                LocationAvailability locationAvailability = (LocationAvailability) obj;
                if (!(this.A01 == locationAvailability.A01 && this.A02 == locationAvailability.A02 && this.A03 == locationAvailability.A03 && this.A00 == locationAvailability.A00 && Arrays.equals(this.A04, locationAvailability.A04))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), Integer.valueOf(this.A01), Integer.valueOf(this.A02), Long.valueOf(this.A03), this.A04});
    }

    public final String toString() {
        boolean z = false;
        if (this.A00 < 1000) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(z);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A01);
        C228479tj.A04(parcel, 2, this.A02);
        C228479tj.A06(parcel, 3, this.A03);
        C228479tj.A04(parcel, 4, this.A00);
        C228479tj.A0F(parcel, 5, this.A04, i);
        C228479tj.A02(parcel, A002);
    }
}
