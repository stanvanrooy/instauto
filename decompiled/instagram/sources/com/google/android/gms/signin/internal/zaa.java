package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C138515vO;
import p000X.C228479tj;
import p000X.C228889w3;

public final class zaa extends AbstractSafeParcelable implements C138515vO {
    public static final Parcelable.Creator CREATOR = new C228889w3();
    public int A00;
    public Intent A01;
    public final int A02;

    public final Status AWn() {
        if (this.A00 == 0) {
            return Status.A08;
        }
        return Status.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        C228479tj.A04(parcel, 2, this.A00);
        C228479tj.A09(parcel, 3, this.A01, i, false);
        C228479tj.A02(parcel, A002);
    }

    public zaa() {
        this(2, 0, (Intent) null);
    }

    public zaa(int i, int i2, Intent intent) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = intent;
    }
}
