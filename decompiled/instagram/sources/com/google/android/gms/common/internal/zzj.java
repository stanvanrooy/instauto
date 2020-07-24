package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.common.zzb;
import p000X.AnonymousClass0Z0;
import p000X.C25250BAb;

public abstract class zzj extends zzb implements zzi {
    public zzj() {
        super("com.google.android.gms.common.internal.ICertData");
        AnonymousClass0Z0.A0A(-1308007898, AnonymousClass0Z0.A03(-1946962488));
    }

    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0Z0.A03(-46205967);
        boolean z = true;
        if (i == 1) {
            IObjectWrapper BvU = BvU();
            parcel2.writeNoException();
            C25250BAb.A00(parcel2, BvU);
            i3 = -8663447;
        } else if (i != 2) {
            z = false;
            i3 = 1011009537;
        } else {
            int BvZ = BvZ();
            parcel2.writeNoException();
            parcel2.writeInt(BvZ);
            i3 = -8663447;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return z;
    }
}
