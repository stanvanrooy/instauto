package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;
import p000X.C228479tj;

public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(185);
    public int A00;
    public int A01;
    public final float A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final List A09;
    public final int A0A;
    public final long A0B;
    public final long A0C;
    public final String A0D;

    public WakeLockEvent(int i, long j, int i2, String str, int i3, List list, String str2, long j2, int i4, String str3, String str4, float f, long j3, String str5) {
        this.A0A = i;
        this.A04 = j;
        this.A00 = i2;
        this.A05 = str;
        this.A06 = str3;
        this.A07 = str5;
        this.A03 = i3;
        this.A09 = list;
        this.A0D = str2;
        this.A0C = j2;
        this.A01 = i4;
        this.A08 = str4;
        this.A02 = f;
        this.A0B = j3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A0A);
        C228479tj.A06(parcel, 2, A01());
        C228479tj.A0A(parcel, 4, this.A05, false);
        C228479tj.A04(parcel, 5, this.A03);
        C228479tj.A0B(parcel, 6, this.A09);
        C228479tj.A06(parcel, 8, this.A0C);
        C228479tj.A0A(parcel, 10, this.A06, false);
        C228479tj.A04(parcel, 11, A00());
        C228479tj.A0A(parcel, 12, this.A0D, false);
        C228479tj.A0A(parcel, 13, this.A08, false);
        C228479tj.A04(parcel, 14, this.A01);
        C228479tj.A03(parcel, 15, this.A02);
        C228479tj.A06(parcel, 16, this.A0B);
        C228479tj.A0A(parcel, 17, this.A07, false);
        C228479tj.A02(parcel, A002);
    }
}
