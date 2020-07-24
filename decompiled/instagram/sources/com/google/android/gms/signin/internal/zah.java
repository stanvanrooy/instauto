package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zah extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(229);
    public final int A00;
    public final ResolveAccountRequest A01;

    public zah(int i, ResolveAccountRequest resolveAccountRequest) {
        this.A00 = i;
        this.A01 = resolveAccountRequest;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A09(parcel, 2, this.A01, i, false);
        C228479tj.A02(parcel, A002);
    }
}
