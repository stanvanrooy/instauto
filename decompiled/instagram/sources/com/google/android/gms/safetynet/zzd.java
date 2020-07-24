package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(225);
    public final int A00;
    public final long A01;
    public final HarmfulAppsData[] A02;
    public final boolean A03;

    public zzd(long j, HarmfulAppsData[] harmfulAppsDataArr, int i, boolean z) {
        this.A01 = j;
        this.A02 = harmfulAppsDataArr;
        this.A03 = z;
        if (z) {
            this.A00 = i;
        } else {
            this.A00 = -1;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A06(parcel, 2, this.A01);
        C228479tj.A0F(parcel, 3, this.A02, i);
        C228479tj.A04(parcel, 4, this.A00);
        C228479tj.A0D(parcel, 5, this.A03);
        C228479tj.A02(parcel, A002);
    }
}
