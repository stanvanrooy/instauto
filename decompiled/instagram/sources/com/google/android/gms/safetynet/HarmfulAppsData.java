package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public class HarmfulAppsData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(224);
    public final int A00;
    public final String A01;
    public final byte[] A02;

    public HarmfulAppsData(String str, byte[] bArr, int i) {
        this.A01 = str;
        this.A02 = bArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A0E(parcel, 3, this.A02, false);
        C228479tj.A04(parcel, 4, this.A00);
        C228479tj.A02(parcel, A002);
    }
}
