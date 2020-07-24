package com.google.android.gms.internal.safetynet;

import android.os.IBinder;
import android.os.Parcel;
import p000X.AnonymousClass0Z0;

public final class zzj extends zza implements zzi {
    public zzj(IBinder iBinder) {
        super(iBinder);
        AnonymousClass0Z0.A0A(-1621362217, AnonymousClass0Z0.A03(-113475116));
    }

    /* JADX INFO: finally extract failed */
    public final void BvN(zzg zzg, byte[] bArr, String str) {
        int A03 = AnonymousClass0Z0.A03(-1812876441);
        int A032 = AnonymousClass0Z0.A03(-2041824502);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(1015539355, A032);
        obtain.writeStrongBinder(zzg == null ? null : zzg.asBinder());
        obtain.writeByteArray(bArr);
        obtain.writeString(str);
        int A033 = AnonymousClass0Z0.A03(-303491184);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(7, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0Z0.A0A(-634569487, A033);
            AnonymousClass0Z0.A0A(656932770, A03);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0Z0.A0A(1716373439, A033);
            throw th;
        }
    }
}
