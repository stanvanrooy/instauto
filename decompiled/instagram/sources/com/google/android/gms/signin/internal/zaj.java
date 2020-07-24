package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(230);
    public final ConnectionResult A00;
    public final ResolveAccountResponse A01;
    public final int A02;

    public zaj(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.A02 = i;
        this.A00 = connectionResult;
        this.A01 = resolveAccountResponse;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        C228479tj.A09(parcel, 2, this.A00, i, false);
        C228479tj.A09(parcel, 3, this.A01, i, false);
        C228479tj.A02(parcel, A002);
    }
}
