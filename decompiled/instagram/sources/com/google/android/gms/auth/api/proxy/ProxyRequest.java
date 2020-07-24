package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;
import p000X.C228719vX;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228719vX();
    public Bundle A00;
    public final int A01;
    public final long A02;
    public final String A03;
    public final byte[] A04;
    public final int A05;

    public final String toString() {
        String str = this.A03;
        int i = this.A01;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.A05 = i;
        this.A03 = str;
        this.A01 = i2;
        this.A02 = j;
        this.A04 = bArr;
        this.A00 = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 1, this.A03, false);
        C228479tj.A04(parcel, 2, this.A01);
        C228479tj.A06(parcel, 3, this.A02);
        C228479tj.A0E(parcel, 4, this.A04, false);
        C228479tj.A07(parcel, 5, this.A00);
        C228479tj.A04(parcel, 1000, this.A05);
        C228479tj.A02(parcel, A002);
    }
}
