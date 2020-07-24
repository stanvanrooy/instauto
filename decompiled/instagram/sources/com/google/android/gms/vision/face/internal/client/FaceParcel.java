package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(243);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final int A0A;
    public final LandmarkParcel[] A0B;
    public final zza[] A0C;
    public final int A0D;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, zza[] zzaArr) {
        this.A0D = i;
        this.A0A = i2;
        this.A00 = f;
        this.A01 = f2;
        this.A03 = f3;
        this.A02 = f4;
        this.A07 = f5;
        this.A08 = f6;
        this.A09 = f7;
        this.A0B = landmarkParcelArr;
        this.A04 = f8;
        this.A05 = f9;
        this.A06 = f10;
        this.A0C = zzaArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A0D);
        C228479tj.A04(parcel, 2, this.A0A);
        C228479tj.A03(parcel, 3, this.A00);
        C228479tj.A03(parcel, 4, this.A01);
        C228479tj.A03(parcel, 5, this.A03);
        C228479tj.A03(parcel, 6, this.A02);
        C228479tj.A03(parcel, 7, this.A07);
        C228479tj.A03(parcel, 8, this.A08);
        C228479tj.A0F(parcel, 9, this.A0B, i);
        C228479tj.A03(parcel, 10, this.A04);
        C228479tj.A03(parcel, 11, this.A05);
        C228479tj.A03(parcel, 12, this.A06);
        C228479tj.A0F(parcel, 13, this.A0C, i);
        C228479tj.A03(parcel, 14, this.A09);
        C228479tj.A02(parcel, A002);
    }
}
