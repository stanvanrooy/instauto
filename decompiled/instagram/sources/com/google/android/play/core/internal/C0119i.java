package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.play.core.internal.i */
public class C0119i implements IInterface {
    public final IBinder A00;
    public final String A01 = "com.google.android.play.core.splitinstall.protocol.ISplitInstallService";

    public C0119i(IBinder iBinder) {
        int A03 = AnonymousClass0Z0.A03(-864078377);
        this.A00 = iBinder;
        AnonymousClass0Z0.A0A(-1113019864, A03);
    }

    public final Parcel A00() {
        int A03 = AnonymousClass0Z0.A03(322957296);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(-466262080, A03);
        return obtain;
    }

    public final void A01(int i, Parcel parcel) {
        int A03 = AnonymousClass0Z0.A03(-626647848);
        try {
            this.A00.transact(i, parcel, (Parcel) null, 1);
        } finally {
            parcel.recycle();
            AnonymousClass0Z0.A0A(1006000985, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(-466926708);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(-499197028, A03);
        return iBinder;
    }
}
