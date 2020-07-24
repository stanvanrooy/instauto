package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228729vZ;

public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228729vZ();
    public final int A00;
    public final int A01;
    public final PendingIntent A02;
    public final byte[] A03;
    public final int A04;
    public final Bundle A05;

    public ProxyResponse(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.A04 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A05 = bundle;
        this.A03 = bArr;
        this.A02 = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A00);
        C228479tj.A09(parcel, 2, this.A02, i, false);
        C228479tj.A04(parcel, 3, this.A01);
        C228479tj.A07(parcel, 4, this.A05);
        C228479tj.A0E(parcel, 5, this.A03, false);
        C228479tj.A04(parcel, 1000, this.A04);
        C228479tj.A02(parcel, A002);
    }
}
