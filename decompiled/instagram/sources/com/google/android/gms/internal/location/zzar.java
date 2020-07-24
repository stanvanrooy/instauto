package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationSettingsResult;
import p000X.AnonymousClass0Z0;

public abstract class zzar extends zzb implements zzaq {
    public zzar() {
        AnonymousClass0Z0.A0A(-613255056, AnonymousClass0Z0.A03(-1792917731));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03 = AnonymousClass0Z0.A03(28918962);
        if (i == 1) {
            BvP((LocationSettingsResult) (parcel.readInt() == 0 ? null : (Parcelable) LocationSettingsResult.CREATOR.createFromParcel(parcel)));
            AnonymousClass0Z0.A0A(-1786491787, A03);
            return true;
        }
        AnonymousClass0Z0.A0A(269685856, A03);
        return false;
    }
}
