package com.facebook.android.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class LatLngBounds implements Parcelable {
    public static final LatLngBounds A02 = new LatLngBounds(new LatLng(-90.0d, -180.0d), new LatLng(90.0d, 180.0d));
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(29);
    public final LatLng A00;
    public final LatLng A01;

    public static double A00(double d, double d2) {
        double d3 = d - d2;
        int i = 0;
        if (d3 < 0.0d) {
            i = 360;
        }
        return d3 + ((double) i);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.A00.equals(latLngBounds.A00) && this.A01.equals(latLngBounds.A01);
    }

    public final int hashCode() {
        return ((527 + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return getClass().getSimpleName() + "{northeast=" + this.A00 + ", southwest=" + this.A01 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public LatLngBounds(Parcel parcel) {
        Class<LatLng> cls = LatLng.class;
        this.A00 = (LatLng) parcel.readParcelable(cls.getClassLoader());
        this.A01 = (LatLng) parcel.readParcelable(cls.getClassLoader());
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        double d = latLng.A00;
        if (d <= latLng2.A00) {
            this.A01 = latLng;
            this.A00 = latLng2;
            return;
        }
        throw new IllegalArgumentException("Southern latitude (" + d + ") exceeds Northern latitude (" + latLng2.A00 + ").");
    }
}
