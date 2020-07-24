package com.google.android.gms.internal.vision;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.vision.barcode.Barcode;
import p000X.AnonymousClass0Z0;
import p000X.B9m;

public final class zzi extends zza implements zzh {
    public zzi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
        AnonymousClass0Z0.A0A(-1649283523, AnonymousClass0Z0.A03(-1627229400));
    }

    public final Barcode[] BvR(IObjectWrapper iObjectWrapper, zzn zzn) {
        int A03 = AnonymousClass0Z0.A03(-376422009);
        Parcel A00 = A00();
        B9m.A00(A00, iObjectWrapper);
        if (zzn == null) {
            A00.writeInt(0);
        } else {
            A00.writeInt(1);
            zzn.writeToParcel(A00, 0);
        }
        Parcel A01 = A01(1, A00);
        Barcode[] barcodeArr = (Barcode[]) A01.createTypedArray(Barcode.CREATOR);
        A01.recycle();
        AnonymousClass0Z0.A0A(-945769441, A03);
        return barcodeArr;
    }

    public final Barcode[] BvY(IObjectWrapper iObjectWrapper, zzn zzn) {
        int A03 = AnonymousClass0Z0.A03(-413068246);
        Parcel A00 = A00();
        B9m.A00(A00, iObjectWrapper);
        if (zzn == null) {
            A00.writeInt(0);
        } else {
            A00.writeInt(1);
            zzn.writeToParcel(A00, 0);
        }
        Parcel A01 = A01(2, A00);
        Barcode[] barcodeArr = (Barcode[]) A01.createTypedArray(Barcode.CREATOR);
        A01.recycle();
        AnonymousClass0Z0.A0A(86068236, A03);
        return barcodeArr;
    }
}
