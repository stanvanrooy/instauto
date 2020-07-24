package com.google.android.gms.internal.flags;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public class zzb extends Binder implements IInterface {
    public zzb() {
        int A03 = AnonymousClass0Z0.A03(579507904);
        attachInterface(this, "com.google.android.gms.flags.IFlagProvider");
        AnonymousClass0Z0.A0A(-948036037, A03);
    }

    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(163655310, AnonymousClass0Z0.A03(-1841108208));
        return false;
    }

    public IBinder asBinder() {
        AnonymousClass0Z0.A0A(-752924833, AnonymousClass0Z0.A03(829104579));
        return this;
    }

    public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A00;
        int i3;
        int A03 = AnonymousClass0Z0.A03(2082162106);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            A00 = true;
            i3 = -2144055115;
        } else {
            A00 = A00(i, parcel, parcel2, i2);
            i3 = -1923412358;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A00;
    }
}
