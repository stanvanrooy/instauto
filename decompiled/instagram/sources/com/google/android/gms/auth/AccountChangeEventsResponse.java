package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(166);
    public final int A00;
    public final List A01;

    public AccountChangeEventsResponse(int i, List list) {
        this.A00 = i;
        AnonymousClass0a2.A02(list);
        this.A01 = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A0C(parcel, 2, this.A01, false);
        C228479tj.A02(parcel, A002);
    }
}
