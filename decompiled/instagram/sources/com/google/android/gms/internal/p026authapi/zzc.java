package com.google.android.gms.internal.p026authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.gms.internal.auth-api.zzc */
public class zzc implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zzc(IBinder iBinder, String str) {
        int A03 = AnonymousClass0Z0.A03(-564012528);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0Z0.A0A(-81112065, A03);
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0Z0.A03(638585305);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(-1520398991, A03);
        return obtain;
    }

    public final void A01(int i, Parcel parcel) {
        int A03 = AnonymousClass0Z0.A03(1614389296);
        Parcel obtain = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, obtain, 0);
            obtain.readException();
        } finally {
            parcel.recycle();
            obtain.recycle();
            AnonymousClass0Z0.A0A(1403901864, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(1495126699);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(1958321937, A03);
        return iBinder;
    }
}
