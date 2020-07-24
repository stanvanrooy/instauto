package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p000X.AnonymousClass9w7;
import p000X.C228479tj;

public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final List A01 = Collections.emptyList();
    public static final Parcelable.Creator CREATOR = new AnonymousClass9w7();
    public final List A00;

    public LocationResult(List list) {
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.A00.size() == this.A00.size()) {
                Iterator it = this.A00.iterator();
                for (Location time : locationResult.A00) {
                    if (((Location) it.next()).getTime() != time.getTime()) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Location time : this.A00) {
            long time2 = time.getTime();
            i = (i * 31) + ((int) (time2 ^ (time2 >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.A00);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0C(parcel, 1, this.A00, false);
        C228479tj.A02(parcel, A002);
    }
}
