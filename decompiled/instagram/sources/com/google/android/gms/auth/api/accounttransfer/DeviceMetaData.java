package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public class DeviceMetaData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(158);
    public long A00;
    public boolean A01;
    public final boolean A02;
    public final int A03;

    public DeviceMetaData(int i, boolean z, long j, boolean z2) {
        this.A03 = i;
        this.A01 = z;
        this.A00 = j;
        this.A02 = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A03);
        C228479tj.A0D(parcel, 2, this.A01);
        C228479tj.A06(parcel, 3, this.A00);
        C228479tj.A0D(parcel, 4, this.A02);
        C228479tj.A02(parcel, A002);
    }
}
