package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;
import p000X.C228479tj;
import p000X.C228909w9;

public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228909w9();
    public Bundle A00;
    public Map A01;

    public RemoteMessage(Bundle bundle) {
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A07(parcel, 2, this.A00);
        C228479tj.A02(parcel, A002);
    }
}
