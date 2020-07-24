package com.facebook.location.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C228419tI;
import p000X.C44121vd;

public class ParcelableGeofenceResult extends C228419tI implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(77);

    public final int describeContents() {
        return 0;
    }

    public ParcelableGeofenceResult(Parcel parcel) {
        super((C44121vd) parcel.readParcelable(ParcelableImmutableLocation.class.getClassLoader()), parcel.readLong(), parcel.readLong(), parcel.readFloat());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((ParcelableImmutableLocation) this.A03, i);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A01);
        parcel.writeFloat(this.A00);
    }
}
