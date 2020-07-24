package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import p000X.AnonymousClass0Z0;

public class zza implements IInterface {
    public final IBinder A00;
    public final String A01;

    public zza(IBinder iBinder, String str) {
        int A03 = AnonymousClass0Z0.A03(-1922308296);
        this.A00 = iBinder;
        this.A01 = str;
        AnonymousClass0Z0.A0A(2054450109, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(1813310896);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(-65678159, A03);
        return iBinder;
    }
}
