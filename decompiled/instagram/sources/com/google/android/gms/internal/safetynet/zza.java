package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.IInterface;
import p000X.AnonymousClass0Z0;

public class zza implements IInterface {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.safetynet.internal.ISafetyNetService";

    public zza(IBinder iBinder) {
        int A03 = AnonymousClass0Z0.A03(761763215);
        this.A00 = iBinder;
        AnonymousClass0Z0.A0A(219535784, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(240949633);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(625063383, A03);
        return iBinder;
    }
}
