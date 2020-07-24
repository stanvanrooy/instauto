package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(198);
    public final int A00;
    public final int A01;
    public final zzy A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final zzan[] A06;
    public final float A07;
    public final int A08;
    public final zzy A09;
    public final zzy A0A;

    public zzae(zzan[] zzanArr, zzy zzy, zzy zzy2, zzy zzy3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.A06 = zzanArr;
        this.A02 = zzy;
        this.A09 = zzy2;
        this.A0A = zzy3;
        this.A04 = str;
        this.A07 = f;
        this.A03 = str2;
        this.A08 = i;
        this.A05 = z;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0F(parcel, 2, this.A06, i);
        C228479tj.A09(parcel, 3, this.A02, i, false);
        C228479tj.A09(parcel, 4, this.A09, i, false);
        C228479tj.A09(parcel, 5, this.A0A, i, false);
        C228479tj.A0A(parcel, 6, this.A04, false);
        C228479tj.A03(parcel, 7, this.A07);
        C228479tj.A0A(parcel, 8, this.A03, false);
        C228479tj.A04(parcel, 9, this.A08);
        C228479tj.A0D(parcel, 10, this.A05);
        C228479tj.A04(parcel, 11, this.A00);
        C228479tj.A04(parcel, 12, this.A01);
        C228479tj.A02(parcel, A002);
    }
}
