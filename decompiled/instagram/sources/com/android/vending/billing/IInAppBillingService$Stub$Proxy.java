package com.android.vending.billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public final class IInAppBillingService$Stub$Proxy implements IInterface {
    public IBinder A00;

    public IInAppBillingService$Stub$Proxy(IBinder iBinder) {
        int A03 = AnonymousClass0Z0.A03(-207109627);
        this.A00 = iBinder;
        AnonymousClass0Z0.A0A(-1917468225, A03);
    }

    public final int A00(int i, String str, String str2) {
        int A03 = AnonymousClass0Z0.A03(-1031161950);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
            obtain.writeInt(i);
            obtain.writeString(str);
            obtain.writeString(str2);
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            return obtain2.readInt();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0Z0.A0A(-785454092, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(-1233497678);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(1495781903, A03);
        return iBinder;
    }
}
