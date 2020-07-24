package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.location.zzu;
import com.google.android.gms.location.zzw;
import com.google.android.gms.location.zzx;
import com.google.android.gms.location.zzz;
import p000X.C228479tj;
import p000X.C228679vR;

public final class zzbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228679vR();
    public int A00;
    public PendingIntent A01;
    public zzaj A02;
    public zzbd A03;
    public zzu A04;
    public zzx A05;

    public zzbf(int i, zzbd zzbd, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        zzx zzx;
        zzu zzu;
        this.A00 = i;
        this.A03 = zzbd;
        zzaj zzaj = null;
        if (iBinder == null || iBinder == null) {
            zzx = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            zzx = queryLocalInterface instanceof zzx ? (zzx) queryLocalInterface : new zzz(iBinder);
        }
        this.A05 = zzx;
        this.A01 = pendingIntent;
        if (iBinder2 == null || iBinder2 == null) {
            zzu = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            zzu = queryLocalInterface2 instanceof zzu ? (zzu) queryLocalInterface2 : new zzw(iBinder2);
        }
        this.A04 = zzu;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            zzaj = queryLocalInterface3 instanceof zzaj ? (zzaj) queryLocalInterface3 : new zzal(iBinder3);
        }
        this.A02 = zzaj;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A09(parcel, 2, this.A03, i, false);
        zzx zzx = this.A05;
        IBinder iBinder = null;
        C228479tj.A08(parcel, 3, zzx == null ? null : zzx.asBinder());
        C228479tj.A09(parcel, 4, this.A01, i, false);
        zzu zzu = this.A04;
        C228479tj.A08(parcel, 5, zzu == null ? null : zzu.asBinder());
        zzaj zzaj = this.A02;
        if (zzaj != null) {
            iBinder = zzaj.asBinder();
        }
        C228479tj.A08(parcel, 6, iBinder);
        C228479tj.A02(parcel, A002);
    }
}
