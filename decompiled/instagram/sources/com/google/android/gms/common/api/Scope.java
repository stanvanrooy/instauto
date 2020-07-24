package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.AnonymousClass0a2;
import p000X.C228479tj;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(170);
    public final String A00;
    public final int A01;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.A00.equals(((Scope) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public Scope(int i, String str) {
        AnonymousClass0a2.A05(str, "scopeUri must not be null or empty");
        this.A01 = i;
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A01);
        C228479tj.A0A(parcel, 2, this.A00, false);
        C228479tj.A02(parcel, A002);
    }
}
