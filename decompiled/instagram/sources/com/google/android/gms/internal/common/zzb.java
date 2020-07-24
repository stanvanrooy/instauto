package com.google.android.gms.internal.common;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public class zzb extends Binder implements IInterface {
    public zzb(String str) {
        int A03 = AnonymousClass0Z0.A03(2129696633);
        attachInterface(this, str);
        AnonymousClass0Z0.A0A(871699425, A03);
    }

    public boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(1990838751, AnonymousClass0Z0.A03(-589545027));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(-1755128171, AnonymousClass0Z0.A03(-877249015));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A02;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-190635185);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            A02 = true;
            i3 = 1174896707;
        } else {
            A02 = A02(i, parcel, parcel2, i2);
            i3 = 484715494;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A02;
    }
}
