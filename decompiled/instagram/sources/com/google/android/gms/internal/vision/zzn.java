package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(203);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 2, this.A03);
        C228479tj.A04(parcel, 3, this.A00);
        C228479tj.A04(parcel, 4, this.A01);
        C228479tj.A06(parcel, 5, this.A04);
        C228479tj.A04(parcel, 6, this.A02);
        C228479tj.A02(parcel, A002);
    }

    public zzn() {
    }

    public zzn(int i, int i2, int i3, long j, int i4) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = j;
        this.A02 = i4;
    }
}
