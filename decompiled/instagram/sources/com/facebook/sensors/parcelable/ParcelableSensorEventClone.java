package com.facebook.sensors.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.C228979wO;

public class ParcelableSensorEventClone extends C228979wO implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(84);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C228979wO)) {
            ParcelableSensorEventClone parcelableSensorEventClone = (ParcelableSensorEventClone) obj;
            if (this.A00 == parcelableSensorEventClone.A00 && this.A01 == parcelableSensorEventClone.A01 && this.A02 == parcelableSensorEventClone.A02) {
                return Arrays.equals(this.A03, parcelableSensorEventClone.A03);
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.A02;
        return (((((this.A00 * 31) + this.A01) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A03.length);
        parcel.writeFloatArray(this.A03);
    }

    public ParcelableSensorEventClone(int i, int i2, long j, float[] fArr) {
        super(i, i2, j, fArr);
    }

    public ParcelableSensorEventClone(Parcel parcel) {
        super(parcel.readInt(), parcel.readInt(), parcel.readLong(), new float[parcel.readInt()]);
        parcel.readFloatArray(this.A03);
    }
}
