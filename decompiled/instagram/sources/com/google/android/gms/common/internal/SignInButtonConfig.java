package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(173);
    public final int A00;
    public final int A01;
    public final Scope[] A02;
    public final int A03;

    public SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.A03 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A04(parcel, 3, this.A01);
        C228479tj.A0F(parcel, 4, this.A02, i);
        C228479tj.A02(parcel, A002);
    }
}
