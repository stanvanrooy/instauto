package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public final class CredentialPickerConfig extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(159);
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final int A03;

    public CredentialPickerConfig(int i, boolean z, boolean z2, boolean z3, int i2) {
        this.A03 = i;
        this.A02 = z;
        this.A01 = z2;
        int i3 = 1;
        if (i < 2) {
            this.A00 = z3 ? 3 : i3;
        } else {
            this.A00 = i2;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0D(parcel, 1, this.A02);
        C228479tj.A0D(parcel, 2, this.A01);
        boolean z = false;
        if (this.A00 == 3) {
            z = true;
        }
        C228479tj.A0D(parcel, 3, z);
        C228479tj.A04(parcel, 4, this.A00);
        C228479tj.A04(parcel, 1000, this.A03);
        C228479tj.A02(parcel, A002);
    }
}
