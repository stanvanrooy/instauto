package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(244);
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;
    public boolean A05;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 2, this.A02);
        C228479tj.A04(parcel, 3, this.A01);
        C228479tj.A04(parcel, 4, this.A03);
        C228479tj.A0D(parcel, 5, this.A05);
        C228479tj.A0D(parcel, 6, this.A04);
        C228479tj.A03(parcel, 7, this.A00);
        C228479tj.A02(parcel, A002);
    }

    public zze() {
    }

    public zze(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A05 = z;
        this.A04 = z2;
        this.A00 = f;
    }
}
