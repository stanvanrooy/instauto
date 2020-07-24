package com.facebook.common.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class Triplet extends ParcelablePair implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(60);
    public final Object A00;

    public Triplet(Object obj, Object obj2, Object obj3) {
        super(obj, obj2);
        this.A00 = obj3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(this.A00);
    }
}
