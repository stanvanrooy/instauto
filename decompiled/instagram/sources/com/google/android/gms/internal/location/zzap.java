package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.location.LocationSettingsRequest;
import p000X.AnonymousClass0Z0;

public final class zzap extends zza implements zzao {
    public zzap(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
        AnonymousClass0Z0.A0A(-1204576125, AnonymousClass0Z0.A03(1060166363));
    }

    /* JADX INFO: finally extract failed */
    public final void BvO(LocationSettingsRequest locationSettingsRequest, zzaq zzaq, String str) {
        int A03 = AnonymousClass0Z0.A03(-1405276506);
        int A032 = AnonymousClass0Z0.A03(-1139458719);
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.A01);
        AnonymousClass0Z0.A0A(-1656881308, A032);
        if (locationSettingsRequest == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            locationSettingsRequest.writeToParcel(obtain, 0);
        }
        obtain.writeStrongBinder(zzaq == null ? null : zzaq.asBinder());
        obtain.writeString(str);
        int A033 = AnonymousClass0Z0.A03(837726784);
        Parcel obtain2 = Parcel.obtain();
        try {
            this.A00.transact(63, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0Z0.A0A(-1597982852, A033);
            AnonymousClass0Z0.A0A(-1085267826, A03);
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            AnonymousClass0Z0.A0A(1956625907, A033);
            throw th;
        }
    }
}
