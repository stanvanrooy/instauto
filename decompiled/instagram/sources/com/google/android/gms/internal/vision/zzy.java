package com.google.android.gms.internal.vision;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(204);
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public zzy(int i, int i2, int i3, int i4, float f) {
        this.A02 = i;
        this.A03 = i2;
        this.A04 = i3;
        this.A01 = i4;
        this.A00 = f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 2, this.A02);
        C228479tj.A04(parcel, 3, this.A03);
        C228479tj.A04(parcel, 4, this.A04);
        C228479tj.A04(parcel, 5, this.A01);
        C228479tj.A03(parcel, 6, this.A00);
        C228479tj.A02(parcel, A002);
    }
}
