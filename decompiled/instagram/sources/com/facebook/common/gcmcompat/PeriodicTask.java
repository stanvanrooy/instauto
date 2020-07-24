package com.facebook.common.gcmcompat;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.B66;
import p000X.B6A;

public class PeriodicTask extends Task {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(48);
    public long A00;
    public long A01;

    public final void A02(Bundle bundle) {
        super.A02(bundle);
        bundle.putLong("period", this.A01);
        bundle.putLong("period_flex", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public PeriodicTask(B6A b6a) {
        super((B66) b6a);
        long j = b6a.A01;
        this.A01 = j;
        this.A00 = Math.min(b6a.A00, j);
    }

    public PeriodicTask(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readLong();
        this.A00 = Math.min(parcel.readLong(), this.A01);
    }
}
