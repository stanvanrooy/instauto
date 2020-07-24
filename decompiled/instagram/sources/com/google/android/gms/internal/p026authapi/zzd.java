package com.google.android.gms.internal.p026authapi;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.gms.internal.auth-api.zzd */
public class zzd extends Binder implements IInterface {
    public zzd(String str) {
        int A03 = AnonymousClass0Z0.A03(487828915);
        attachInterface(this, str);
        AnonymousClass0Z0.A0A(-1645184199, A03);
    }

    public boolean A01(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(-728989864, AnonymousClass0Z0.A03(-780266879));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(-1361085318, AnonymousClass0Z0.A03(-1360005574));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A01;
        int i3;
        int A03 = AnonymousClass0Z0.A03(-1659093635);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            z = false;
        }
        if (z) {
            A01 = true;
            i3 = -1994094237;
        } else {
            A01 = A01(i, parcel, parcel2, i2);
            i3 = 893567149;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A01;
    }
}
