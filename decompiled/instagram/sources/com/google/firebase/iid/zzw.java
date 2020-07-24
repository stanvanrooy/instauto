package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public final class zzw implements zzu {
    public final IBinder A00;

    public zzw(IBinder iBinder) {
        int A03 = AnonymousClass0Z0.A03(1649432063);
        this.A00 = iBinder;
        AnonymousClass0Z0.A0A(548812633, A03);
    }

    public final void BfA(Message message) {
        int A03 = AnonymousClass0Z0.A03(-2136292354);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.A00.transact(1, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
            AnonymousClass0Z0.A0A(-726090006, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(749586810);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(-996721452, A03);
        return iBinder;
    }
}
