package com.google.p045a.p046a;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.a.a.a */
public class C0107a extends Binder implements IInterface {
    public C0107a(String str) {
        int A03 = AnonymousClass0Z0.A03(1042924218);
        attachInterface(this, str);
        AnonymousClass0Z0.A0A(-966521154, A03);
    }

    public boolean A00(int i, Parcel parcel, Parcel parcel2, int i2) {
        AnonymousClass0Z0.A0A(-1414063046, AnonymousClass0Z0.A03(-173468987));
        return false;
    }

    public final IBinder asBinder() {
        AnonymousClass0Z0.A0A(-1591200209, AnonymousClass0Z0.A03(746562611));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean z;
        boolean A00;
        int i3;
        int A03 = AnonymousClass0Z0.A03(800765524);
        int A032 = AnonymousClass0Z0.A03(-2074903064);
        if (i > 16777215) {
            z = super.onTransact(i, parcel, parcel2, i2);
            AnonymousClass0Z0.A0A(723194717, A032);
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
            AnonymousClass0Z0.A0A(1082834801, A032);
            z = false;
        }
        if (z) {
            A00 = true;
            i3 = 1431077116;
        } else {
            A00 = A00(i, parcel, parcel2, i2);
            i3 = 1698918462;
        }
        AnonymousClass0Z0.A0A(i3, A03);
        return A00;
    }
}
