package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(192);
    public final String A00;

    public zzv(String str) {
        AnonymousClass0a2.A02(str);
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, 1);
        C228479tj.A0A(parcel, 2, this.A00, false);
        C228479tj.A02(parcel, A002);
    }
}
