package com.google.android.gms.internal.base;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public class zaa implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zaa(IBinder iBinder, String str) {
        int A03 = AnonymousClass0Z0.A03(-1643773090);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0Z0.A0A(-1832426573, A03);
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0Z0.A03(209746410);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(1497862639, A03);
        return obtain;
    }

    public final void A01(int i, Parcel parcel) {
        int A03 = AnonymousClass0Z0.A03(735265798);
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0Z0.A0A(-967961237, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(-1832304334);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(-176232273, A03);
        return iBinder;
    }
}
