package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;
import p000X.C228849vv;

public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228849vv();
    public final PendingIntent A00;
    public final String A01;

    public zzah(String str, PendingIntent pendingIntent) {
        AnonymousClass0a2.A02(str);
        this.A01 = str;
        AnonymousClass0a2.A02(pendingIntent);
        this.A00 = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, 1);
        C228479tj.A0A(parcel, 2, this.A01, false);
        C228479tj.A09(parcel, 3, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }
}
