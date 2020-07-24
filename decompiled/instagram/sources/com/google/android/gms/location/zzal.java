package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p000X.C228479tj;
import p000X.C228739vb;

public final class zzal extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228739vb();
    public final PendingIntent A00;
    public final String A01;
    public final List A02;

    public zzal(List list, PendingIntent pendingIntent, String str) {
        this.A02 = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
        this.A00 = pendingIntent;
        this.A01 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0B(parcel, 1, this.A02);
        C228479tj.A09(parcel, 2, this.A00, i, false);
        C228479tj.A0A(parcel, 3, this.A01, false);
        C228479tj.A02(parcel, A002);
    }
}
