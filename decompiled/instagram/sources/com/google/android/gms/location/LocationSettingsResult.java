package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C138515vO;
import p000X.C228479tj;

public final class LocationSettingsResult extends AbstractSafeParcelable implements C138515vO {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(210);
    public final LocationSettingsStates A00;
    public final Status A01;

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.A01 = status;
        this.A00 = locationSettingsStates;
    }

    public final Status AWn() {
        return this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A09(parcel, 1, AWn(), i, false);
        C228479tj.A09(parcel, 2, this.A00, i, false);
        C228479tj.A02(parcel, A002);
    }
}
