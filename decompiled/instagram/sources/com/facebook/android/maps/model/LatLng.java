package com.facebook.android.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class LatLng implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(28);
    public final double A00;
    public final double A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Math.abs(this.A00 - latLng.A00) < 0.002d && Math.abs(this.A01 - latLng.A01) < 2.0E-4d;
    }

    public final int hashCode() {
        return (int) (((527.0d + this.A00) * 31.0d) + this.A01);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{latitude=" + this.A00 + ", longitude=" + this.A01 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.A00);
        parcel.writeDouble(this.A01);
    }

    public LatLng(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public LatLng(Parcel parcel) {
        this.A00 = parcel.readDouble();
        this.A01 = parcel.readDouble();
    }
}
