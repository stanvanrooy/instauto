package com.google.android.gms.internal.p051authapiphone;

import android.os.IBinder;
import android.os.IInterface;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zza */
public class zza implements IInterface {
    public final IBinder A00;
    public final String A01 = "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";

    public zza(IBinder iBinder) {
        int A03 = AnonymousClass0Z0.A03(-1128324677);
        this.A00 = iBinder;
        AnonymousClass0Z0.A0A(531508785, A03);
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0Z0.A03(976510229);
        IBinder iBinder = this.A00;
        AnonymousClass0Z0.A0A(-848440143, A03);
        return iBinder;
    }
}
