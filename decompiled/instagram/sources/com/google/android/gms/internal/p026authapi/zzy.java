package com.google.android.gms.internal.p026authapi;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

/* renamed from: com.google.android.gms.internal.auth-api.zzy */
public final class zzy extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(188);
    public final Credential A00;

    public zzy(Credential credential) {
        this.A00 = credential;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 1, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }
}
