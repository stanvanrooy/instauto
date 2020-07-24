package com.google.android.gms.internal.p051authapiphone;

import android.os.IBinder;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

/* renamed from: com.google.android.gms.internal.auth-api-phone.zzf */
public final class zzf extends zza implements zze {
    public zzf(IBinder iBinder) {
        super(iBinder);
        AnonymousClass0Z0.A0A(-1882160438, AnonymousClass0Z0.A03(-2005236505));
    }

    /* JADX INFO: finally extract failed */
    public final void BvM(zzg zzg) {
        int A03 = AnonymousClass0Z0.A03(-1832589280);
        int A032 = AnonymousClass0Z0.A03(550403628);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(-1402246316, A032);
        obtain.writeStrongBinder(zzg == null ? null : zzg.asBinder());
        int A033 = AnonymousClass0Z0.A03(-234987751);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0Z0.A0A(269068612, A033);
            AnonymousClass0Z0.A0A(63906323, A03);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0Z0.A0A(-1097175251, A033);
            throw th;
        }
    }
}
