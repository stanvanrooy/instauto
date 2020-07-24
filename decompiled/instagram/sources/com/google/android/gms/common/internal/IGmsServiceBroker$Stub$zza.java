package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public final class IGmsServiceBroker$Stub$zza implements IGmsServiceBroker {
    public final IBinder A00;

    public IGmsServiceBroker$Stub$zza(IBinder iBinder) {
        int A03 = AnonymousClass0Z0.A03(-1745090537);
        this.A00 = iBinder;
        AnonymousClass0Z0.A0A(-1553543899, A03);
    }

    public final void AVn(IGmsCallbacks iGmsCallbacks, GetServiceRequest getServiceRequest) {
        IBinder iBinder;
        int A03 = AnonymousClass0Z0.A03(220954373);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            if (iGmsCallbacks != null) {
                iBinder = iGmsCallbacks.asBinder();
            } else {
                iBinder = null;
            }
            obtain.writeStrongBinder(iBinder);
            if (getServiceRequest != null) {
                obtain.writeInt(1);
                getServiceRequest.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.A00.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0Z0.A0A(-562595351, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(1040608917);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(1519522528, A03);
        return iBinder;
    }
}
