package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zzae extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(208);
    public final String A00;
    public final String A01;
    public final String A02;

    public zzae(String str, String str2, String str3) {
        this.A02 = str;
        this.A00 = str2;
        this.A01 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 1, this.A00, false);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A0A(parcel, 5, this.A02, false);
        C228479tj.A02(parcel, A002);
    }
}
