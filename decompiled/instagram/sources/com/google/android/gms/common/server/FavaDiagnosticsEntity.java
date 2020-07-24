package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(184);
    public final int A00;
    public final int A01;
    public final String A02;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A0A(parcel, 2, this.A02, false);
        C228479tj.A04(parcel, 3, this.A01);
        C228479tj.A02(parcel, A002);
    }
}
