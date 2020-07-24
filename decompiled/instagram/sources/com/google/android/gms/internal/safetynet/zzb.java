package com.google.android.gms.internal.safetynet;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public class zzb extends Binder implements IInterface {
    public zzb() {
        int A03 = AnonymousClass0Z0.A03(307524680);
        attachInterface(this, "com.google.android.gms.safetynet.internal.ISafetyNetCallbacks");
        AnonymousClass0Z0.A0A(463478961, A03);
    }

    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(-1332166715, AnonymousClass0Z0.A03(172867647));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(1162498016, AnonymousClass0Z0.A03(1315444279));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A00;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-1670519701);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            A00 = true;
            i3 = -1419468264;
        } else {
            A00 = A00(i, parcel, parcel2, i2);
            i3 = -283988315;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A00;
    }
}
