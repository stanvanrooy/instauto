package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228829vt;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228829vt();
    public int A00;
    public Bundle A01;
    public final int A02;

    public GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A07(parcel, 3, this.A01);
        C228479tj.A02(parcel, A002);
    }
}
