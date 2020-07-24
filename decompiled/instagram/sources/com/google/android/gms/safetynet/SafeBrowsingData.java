package com.google.android.gms.safetynet;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public class SafeBrowsingData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(228);
    public long A00;
    public ParcelFileDescriptor A01;
    public DataHolder A02;
    public String A03;
    public byte[] A04;

    public SafeBrowsingData() {
        this((String) null, (DataHolder) null, (ParcelFileDescriptor) null, 0, (byte[]) null);
    }

    public SafeBrowsingData(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j, byte[] bArr) {
        this.A03 = str;
        this.A02 = dataHolder;
        this.A01 = parcelFileDescriptor;
        this.A00 = j;
        this.A04 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0A(parcel, 2, this.A03, false);
        C228479tj.A09(parcel, 3, this.A02, i, false);
        C228479tj.A09(parcel, 4, this.A01, i, false);
        C228479tj.A06(parcel, 5, this.A00);
        C228479tj.A0E(parcel, 6, this.A04, false);
        C228479tj.A02(parcel, A002);
        this.A01 = null;
    }
}
