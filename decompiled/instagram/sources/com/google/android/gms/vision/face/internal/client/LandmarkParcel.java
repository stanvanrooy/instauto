package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(245);
    public final float A00;
    public final float A01;
    public final int A02;
    public final int A03;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.A03 = i;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A03(parcel, 2, this.A00);
        C228479tj.A03(parcel, 3, this.A01);
        C228479tj.A04(parcel, 4, this.A02);
        C228479tj.A02(parcel, A002);
    }
}
