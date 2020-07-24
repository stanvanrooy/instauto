package com.facebook.ads.internal.androidx.support.p025v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

/* renamed from: com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState */
public class LinearLayoutManager$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(8);
    public int A00;
    public int A01;
    public boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public LinearLayoutManager$SavedState() {
    }

    public LinearLayoutManager$SavedState(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() != 1 ? false : true;
    }
}
