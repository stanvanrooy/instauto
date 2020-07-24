package com.facebook.common.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass8OS;

public class Quartet extends Triplet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(59);
    public final Object A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    public Quartet(Parcel parcel) {
        super(r3, r2, r1);
        Object A002 = AnonymousClass8OS.A00(parcel);
        Object A003 = AnonymousClass8OS.A00(parcel);
        Object A004 = AnonymousClass8OS.A00(parcel);
        Object A005 = AnonymousClass8OS.A00(parcel);
        this.A00 = A005;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A00);
    }
}
