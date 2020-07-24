package com.google.android.gms.internal.base;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public class zab extends Binder implements IInterface {
    public zab(String str) {
        int A03 = AnonymousClass0Z0.A03(1502747780);
        attachInterface(this, str);
        AnonymousClass0Z0.A0A(1912880798, A03);
    }

    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(-915419910, AnonymousClass0Z0.A03(1067394249));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(-75446214, AnonymousClass0Z0.A03(-1937372195));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A00;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-187010873);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            A00 = true;
            i3 = 984591939;
        } else {
            A00 = A00(i, parcel, parcel2, i2);
            i3 = 714703134;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A00;
    }
}
