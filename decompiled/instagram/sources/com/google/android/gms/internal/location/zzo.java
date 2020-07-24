package com.google.android.gms.internal.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzr;
import com.google.android.gms.location.zzt;
import p000X.C228479tj;
import p000X.C228699vU;

public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228699vU();
    public int A00;
    public zzaj A01;
    public zzm A02;
    public zzr A03;

    public zzo(int i, zzm zzm, IBinder iBinder, IBinder iBinder2) {
        zzr zzr;
        this.A00 = i;
        this.A02 = zzm;
        zzaj zzaj = null;
        if (iBinder == null || iBinder == null) {
            zzr = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            zzr = queryLocalInterface instanceof zzr ? (zzr) queryLocalInterface : new zzt(iBinder);
        }
        this.A03 = zzr;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface2 instanceof zzaj ? (zzaj) queryLocalInterface2 : new zzal(iBinder2);
        }
        this.A01 = zzaj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A09(parcel, 2, this.A02, i, false);
        zzr zzr = this.A03;
        IBinder iBinder = null;
        C228479tj.A08(parcel, 3, zzr == null ? null : zzr.asBinder());
        zzaj zzaj = this.A01;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        C228479tj.A08(parcel, 4, iBinder);
        C228479tj.A02(parcel, A002);
    }
}
