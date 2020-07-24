package com.google.android.gms.internal.p051authapiphone;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzh */
public abstract class zzh extends zzb implements zzg {
    public zzh() {
        AnonymousClass0Z0.A0A(294839594, AnonymousClass0Z0.A03(-211190708));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03 = AnonymousClass0Z0.A03(2052438528);
        if (i == 1) {
            BvF((Status) (parcel.readInt() == 0 ? null : (Parcelable) Status.CREATOR.createFromParcel(parcel)));
            AnonymousClass0Z0.A0A(1521730461, A03);
            return true;
        }
        AnonymousClass0Z0.A0A(788983981, A03);
        return false;
    }
}
