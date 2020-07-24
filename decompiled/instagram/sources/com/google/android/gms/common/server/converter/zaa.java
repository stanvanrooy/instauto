package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(176);
    public final StringToIntConverter A00;
    public final int A01;

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A01);
        C228479tj.A09(parcel, 2, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }

    public zaa(int i, StringToIntConverter stringToIntConverter) {
        this.A01 = i;
        this.A00 = stringToIntConverter;
    }

    public zaa(StringToIntConverter stringToIntConverter) {
        this.A01 = 1;
        this.A00 = stringToIntConverter;
    }
}
