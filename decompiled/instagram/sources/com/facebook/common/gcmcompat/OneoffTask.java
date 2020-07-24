package com.facebook.common.gcmcompat;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.B66;
import p000X.B6B;

public class OneoffTask extends Task {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(47);
    public long A00;
    public long A01;

    public final void A02(Bundle bundle) {
        super.A02(bundle);
        bundle.putLong("window_start", this.A01);
        bundle.putLong("window_end", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }

    public OneoffTask(B6B b6b) {
        super((B66) b6b);
        this.A01 = b6b.A01;
        this.A00 = b6b.A00;
    }

    public OneoffTask(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readLong();
        this.A00 = parcel.readLong();
    }
}
