package com.facebook.location.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C229119wm;
import p000X.C229129wn;

public class ParcelableCoordinates extends C229119wm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(74);

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ParcelableCoordinates(Parcel parcel) {
        super(r2);
        C229129wn r2 = new C229129wn();
        r2.A00 = Double.valueOf(parcel.readDouble());
        r2.A01 = Double.valueOf(parcel.readDouble());
        r2.A02 = (Float) parcel.readValue((ClassLoader) null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
        parcel.writeValue(this.A02);
    }
}
