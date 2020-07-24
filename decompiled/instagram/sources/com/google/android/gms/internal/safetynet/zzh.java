package com.google.android.gms.internal.safetynet;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.safetynet.SafeBrowsingData;
import com.google.android.gms.safetynet.zza;
import com.google.android.gms.safetynet.zzd;
import com.google.android.gms.safetynet.zzf;
import p000X.AnonymousClass0Z0;
import p000X.C228519v5;

public abstract class zzh extends zzb implements zzg {
    public zzh() {
        AnonymousClass0Z0.A0A(-1111708507, AnonymousClass0Z0.A03(-1516218916));
    }

    public final boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        int A03 = AnonymousClass0Z0.A03(-327317852);
        if (i == 1) {
            BvH((Status) C228519v5.A00(parcel, Status.CREATOR), (zza) C228519v5.A00(parcel, zza.CREATOR));
        } else if (i == 2) {
            BvQ(parcel.readString());
        } else if (i == 3) {
            BvG((Status) C228519v5.A00(parcel, Status.CREATOR), (SafeBrowsingData) C228519v5.A00(parcel, SafeBrowsingData.CREATOR));
        } else if (i == 4) {
            Status status = (Status) C228519v5.A00(parcel, Status.CREATOR);
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            BvL(status, z);
        } else if (i == 6) {
            BvJ((Status) C228519v5.A00(parcel, Status.CREATOR), (zzf) C228519v5.A00(parcel, zzf.CREATOR));
        } else if (i == 8) {
            BvI((Status) C228519v5.A00(parcel, Status.CREATOR), (zzd) C228519v5.A00(parcel, zzd.CREATOR));
        } else if (i == 15) {
            BvK((Status) C228519v5.A00(parcel, Status.CREATOR), (com.google.android.gms.safetynet.zzh) C228519v5.A00(parcel, com.google.android.gms.safetynet.zzh.CREATOR));
        } else if (i == 10) {
            Status status2 = (Status) C228519v5.A00(parcel, Status.CREATOR);
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z2 = true;
            }
            BvX(status2, z2);
        } else if (i != 11) {
            AnonymousClass0Z0.A0A(-1079990223, A03);
            return false;
        } else {
            BvF((Status) C228519v5.A00(parcel, Status.CREATOR));
        }
        AnonymousClass0Z0.A0A(-1675967967, A03);
        return true;
    }
}
