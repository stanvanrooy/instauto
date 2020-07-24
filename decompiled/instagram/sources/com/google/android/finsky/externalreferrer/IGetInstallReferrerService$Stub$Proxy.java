package com.google.android.finsky.externalreferrer;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public final class IGetInstallReferrerService$Stub$Proxy implements IGetInstallReferrerService {
    public IBinder A00;

    public IGetInstallReferrerService$Stub$Proxy(IBinder iBinder) {
        int A03 = AnonymousClass0Z0.A03(1802072860);
        this.A00 = iBinder;
        AnonymousClass0Z0.A0A(-2002729854, A03);
    }

    public final Bundle ANr(Bundle bundle) {
        Bundle bundle2;
        int A03 = AnonymousClass0Z0.A03(-1688150585);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (bundle != null) {
                obtain.writeInt(1);
                bundle.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
            } else {
                bundle2 = null;
            }
            return bundle2;
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0Z0.A0A(128906760, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(885191365);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(1073965488, A03);
        return iBinder;
    }
}
