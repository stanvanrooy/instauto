package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(201);
    public final zzy A00;
    public final String A01;
    public final String A02;
    public final float A03;
    public final zzy A04;
    public final boolean A05;
    public final zzai[] A06;

    public zzan(zzai[] zzaiArr, zzy zzy, zzy zzy2, String str, float f, String str2, boolean z) {
        this.A06 = zzaiArr;
        this.A00 = zzy;
        this.A04 = zzy2;
        this.A02 = str;
        this.A03 = f;
        this.A01 = str2;
        this.A05 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0F(parcel, 2, this.A06, i);
        C228479tj.A09(parcel, 3, this.A00, i, false);
        C228479tj.A09(parcel, 4, this.A04, i, false);
        C228479tj.A0A(parcel, 5, this.A02, false);
        C228479tj.A03(parcel, 6, this.A03);
        C228479tj.A0A(parcel, 7, this.A01, false);
        C228479tj.A0D(parcel, 8, this.A05);
        C228479tj.A02(parcel, A002);
    }
}
