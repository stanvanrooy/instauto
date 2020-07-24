package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C138515vO;
import p000X.C228479tj;

public final class zzad extends AbstractSafeParcelable implements C138515vO {
    public static final zzad A01 = new zzad(Status.A08);
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(194);
    public final Status A00;

    public zzad(Status status) {
        this.A00 = status;
    }

    public final Status AWn() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 1, AWn(), i, false);
        C228479tj.A02(parcel, A002);
    }
}
