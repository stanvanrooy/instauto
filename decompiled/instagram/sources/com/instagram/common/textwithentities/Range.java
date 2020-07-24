package com.instagram.common.textwithentities;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class Range implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(285);
    public int A00;
    public int A01;
    public Entity A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public Range() {
    }

    public Range(Parcel parcel) {
        this.A02 = (Entity) parcel.readParcelable(Entity.class.getClassLoader());
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
