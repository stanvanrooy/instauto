package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228439tQ;
import p000X.C228479tj;

public class ResolveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228439tQ();
    public ConnectionResult A00;
    public boolean A01;
    public boolean A02;
    public IBinder A03;
    public final int A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ResolveAccountResponse) {
                ResolveAccountResponse resolveAccountResponse = (ResolveAccountResponse) obj;
                if (!this.A00.equals(resolveAccountResponse.A00) || !A00().equals(resolveAccountResponse.A00())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final IAccountAccessor A00() {
        IBinder iBinder = this.A03;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof IAccountAccessor) {
            return (IAccountAccessor) queryLocalInterface;
        }
        return new IAccountAccessor$Stub$zza(iBinder);
    }

    public ResolveAccountResponse(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.A04 = i;
        this.A03 = iBinder;
        this.A00 = connectionResult;
        this.A01 = z;
        this.A02 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A04);
        C228479tj.A08(parcel, 2, this.A03);
        C228479tj.A09(parcel, 3, this.A00, i, false);
        C228479tj.A0D(parcel, 4, this.A01);
        C228479tj.A0D(parcel, 5, this.A02);
        C228479tj.A02(parcel, A002);
    }
}
