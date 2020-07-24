package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228319sV;
import p000X.C228479tj;

public final class zza extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new C228319sV();
    public final int A00;
    public final PointF[] A01;

    public zza(PointF[] pointFArr, int i) {
        this.A01 = pointFArr;
        this.A00 = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C228479tj.A00(parcel);
        C228479tj.A0F(parcel, 2, this.A01, i);
        C228479tj.A04(parcel, 3, this.A00);
        C228479tj.A02(parcel, A002);
    }
}
