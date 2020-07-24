package com.google.android.gms.common;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzi;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import p000X.AnonymousClass0C5;
import p000X.C228479tj;
import p000X.C228769vh;

public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228769vh();
    public final zze A00;
    public final String A01;
    public final boolean A02;

    public zzk(String str, IBinder iBinder, boolean z) {
        zzi zzi;
        byte[] bArr;
        this.A01 = str;
        zzf zzf = null;
        if (iBinder != null) {
            if (iBinder == null) {
                zzi = null;
            } else {
                try {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(AnonymousClass0C5.$const$string(206));
                    if (queryLocalInterface instanceof zzi) {
                        zzi = (zzi) queryLocalInterface;
                    } else {
                        zzi = new com.google.android.gms.common.internal.zzk(iBinder);
                    }
                } catch (RemoteException e) {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e);
                }
            }
            IObjectWrapper BvU = zzi.BvU();
            if (BvU == null) {
                bArr = null;
            } else {
                bArr = (byte[]) ObjectWrapper.A00(BvU);
            }
            if (bArr != null) {
                zzf = new zzf(bArr);
            } else {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
            }
        }
        this.A00 = zzf;
        this.A02 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 1, this.A01, false);
        zze zze = this.A00;
        if (zze == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            zze = null;
        } else {
            zze.asBinder();
        }
        C228479tj.A08(parcel, 2, zze);
        C228479tj.A0D(parcel, 3, this.A02);
        C228479tj.A02(parcel, A002);
    }
}
