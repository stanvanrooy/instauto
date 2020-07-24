package com.google.android.gms.internal.p051authapiphone;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzb */
public class zzb extends Binder implements IInterface {
    public zzb() {
        int A03 = AnonymousClass0Z0.A03(-1836944656);
        attachInterface(this, "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
        AnonymousClass0Z0.A0A(-1068681729, A03);
    }

    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(1076761056, AnonymousClass0Z0.A03(1474110698));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(-688269044, AnonymousClass0Z0.A03(-926332573));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A00;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-1007757403);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            A00 = true;
            i3 = 2087296780;
        } else {
            A00 = A00(i, parcel, parcel2, i2);
            i3 = -1137030019;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A00;
    }
}
