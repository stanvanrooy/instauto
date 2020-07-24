package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p000X.C228479tj;

public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(171);
    public ParcelFileDescriptor A00;
    public final int A01;
    public final int A02;

    public final void writeToParcel(Parcel parcel, int i) {
        if (this.A00 == null) {
            throw null;
        }
        int A002 = C228479tj.A00(parcel);
        C228479tj.A04(parcel, 1, this.A02);
        C228479tj.A09(parcel, 2, this.A00, i | 1, false);
        C228479tj.A04(parcel, 3, this.A01);
        C228479tj.A02(parcel, A002);
        this.A00 = null;
    }

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.A02 = i;
        this.A00 = parcelFileDescriptor;
        this.A01 = i2;
    }
}
