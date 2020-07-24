package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import p000X.AnonymousClass0Z0;
import p000X.B9m;

public final class zzk extends zza implements zzj {
    public zzk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
        AnonymousClass0Z0.A0A(-697981690, AnonymousClass0Z0.A03(-2033252923));
    }

    public final zzh BvA(IObjectWrapper iObjectWrapper, zze zze) {
        zzh zzi;
        int A03 = AnonymousClass0Z0.A03(1460412595);
        Parcel A00 = A00();
        B9m.A00(A00, iObjectWrapper);
        if (zze == null) {
            A00.writeInt(0);
        } else {
            A00.writeInt(1);
            zze.writeToParcel(A00, 0);
        }
        Parcel A01 = A01(1, A00);
        IBinder readStrongBinder = A01.readStrongBinder();
        if (readStrongBinder == null) {
            zzi = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
            if (queryLocalInterface instanceof zzh) {
                zzi = (zzh) queryLocalInterface;
            } else {
                zzi = new zzi(readStrongBinder);
            }
        }
        A01.recycle();
        AnonymousClass0Z0.A0A(1891365775, A03);
        return zzi;
    }
}
