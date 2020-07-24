package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.List;
import p000X.C228479tj;

public final class LocationSettingsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(209);
    public zzae A00;
    public final List A01;
    public final boolean A02;
    public final boolean A03;

    public LocationSettingsRequest(List list, boolean z, boolean z2, zzae zzae) {
        this.A01 = list;
        this.A02 = z;
        this.A03 = z2;
        this.A00 = zzae;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0C(parcel, 1, Collections.unmodifiableList(this.A01), false);
        C228479tj.A0D(parcel, 2, this.A02);
        C228479tj.A0D(parcel, 3, this.A03);
        C228479tj.A09(parcel, 5, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }
}
