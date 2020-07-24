package com.google.p045a.p046a;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.a.a.b */
public class C0108b implements IInterface {
    public final IBinder A00;
    public final String A01;

    public C0108b(IBinder iBinder, String str) {
        int A03 = AnonymousClass0Z0.A03(-625770092);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0Z0.A0A(693033377, A03);
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0Z0.A03(-1747224355);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(-877319010, A03);
        return obtain;
    }

    public final Parcel A01(int i, Parcel parcel) {
        int A03 = AnonymousClass0Z0.A03(-1538171558);
        parcel = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0Z0.A0A(-485057135, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(-408643749);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(1086304565, A03);
        return iBinder;
    }
}
