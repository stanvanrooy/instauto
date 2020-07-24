package com.google.android.gms.internal.location;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public class zzb extends Binder implements IInterface {
    public zzb() {
        int A03 = AnonymousClass0Z0.A03(-856748819);
        attachInterface(this, "com.google.android.gms.location.internal.ISettingsCallbacks");
        AnonymousClass0Z0.A0A(-1701483193, A03);
    }

    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(-293868126, AnonymousClass0Z0.A03(1942840472));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(440586488, AnonymousClass0Z0.A03(-856015257));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A00;
        int i3;
        int A03 = AnonymousClass0Z0.A03(1075657402);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            A00 = true;
            i3 = 665394251;
        } else {
            A00 = A00(i, parcel, parcel2, i2);
            i3 = 19837141;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A00;
    }
}
