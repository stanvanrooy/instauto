package com.facebook.location.parcelable;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C44121vd;

public class ParcelableImmutableLocation extends C44121vd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(78);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44121vd)) {
            return false;
        }
        C44121vd r7 = (C44121vd) obj;
        return Double.compare(this.A00.getLatitude(), r7.A00.getLatitude()) == 0 && Double.compare(this.A00.getLongitude(), r7.A00.getLongitude()) == 0 && Float.compare(this.A00.getAccuracy(), r7.A00.getAccuracy()) == 0 && this.A00.getTime() == r7.A00.getTime();
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.A00.getLatitude());
        long doubleToLongBits2 = Double.doubleToLongBits(this.A00.getLongitude());
        int i = ((527 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long floatToIntBits = (long) Float.floatToIntBits(this.A00.getAccuracy());
        int i2 = (i * 31) + ((int) (floatToIntBits ^ (floatToIntBits >>> 32)));
        long time = this.A00.getTime();
        return (i2 * 31) + ((int) ((time >>> 32) ^ time));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new Location(this.A00), i);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeByte((byte) 2);
        } else {
            parcel.writeByte(bool.booleanValue() ? (byte) 1 : 0);
        }
    }

    public ParcelableImmutableLocation(Location location, Boolean bool) {
        super(location, bool);
    }
}
