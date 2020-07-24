package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public final class zzaf extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(191);
    public final String A00;
    public final byte[] A01;

    public zzaf(String str, byte[] bArr) {
        AnonymousClass0a2.A02(str);
        this.A00 = str;
        AnonymousClass0a2.A02(bArr);
        this.A01 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, 1);
        C228479tj.A0A(parcel, 2, this.A00, false);
        C228479tj.A0E(parcel, 3, this.A01, false);
        C228479tj.A02(parcel, A002);
    }
}
