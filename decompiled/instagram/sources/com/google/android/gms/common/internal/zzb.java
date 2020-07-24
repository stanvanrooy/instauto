package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228779vi;

public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228779vi();
    public Bundle A00;
    public Feature[] A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A07(parcel, 1, this.A00);
        C228479tj.A0F(parcel, 2, this.A01, i);
        C228479tj.A02(parcel, A002);
    }

    public zzb() {
    }

    public zzb(Bundle bundle, Feature[] featureArr) {
        this.A00 = bundle;
        this.A01 = featureArr;
    }
}
