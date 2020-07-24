package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(IBinder iBinder, String str) {
        int A03 = AnonymousClass0Z0.A03(405041720);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0Z0.A0A(-425717769, A03);
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0Z0.A03(159583685);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(105086946, A03);
        return obtain;
    }

    public final Parcel A01(int i, Parcel parcel) {
        int A03 = AnonymousClass0Z0.A03(-537110946);
        parcel = Parcel.obtain();
        try {
            this.A00.transact(i, parcel, parcel, 0);
            parcel.readException();
            return parcel;
        } catch (RuntimeException e) {
            throw e;
        } finally {
            parcel.recycle();
            AnonymousClass0Z0.A0A(57432942, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(74523336);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(-119483795, A03);
        return iBinder;
    }
}
