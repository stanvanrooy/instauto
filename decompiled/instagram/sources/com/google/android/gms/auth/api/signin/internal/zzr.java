package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.internal.p026authapi.zzd;
import p000X.AnonymousClass0Z0;

public abstract class zzr extends zzd implements zzq {
    public zzr() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
        AnonymousClass0Z0.A0A(-2057842463, AnonymousClass0Z0.A03(821852889));
    }

    public final boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0Z0.A03(-1718543385);
        boolean z = true;
        if (i == 1) {
            Bvk();
            i3 = 1679719464;
        } else if (i != 2) {
            z = false;
            i3 = 1080875349;
        } else {
            Bvl();
            i3 = 1679719464;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return z;
    }
}
