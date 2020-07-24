package com.facebook.android.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class CameraPosition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(27);
    public final float A00;
    public final float A01;
    public final float A02;
    public final LatLng A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        if (this.A00 == cameraPosition.A00) {
            LatLng latLng = this.A03;
            if (latLng != null) {
                return latLng.equals(cameraPosition.A03) && this.A01 == cameraPosition.A01 && this.A02 == cameraPosition.A02;
            }
            if (cameraPosition.A03 == null) {
                return true;
            }
        }
    }

    public final int hashCode() {
        LatLng latLng = this.A03;
        float f = 17.0f;
        if (latLng != null) {
            f = 527.0f + ((float) latLng.hashCode());
        }
        return (int) ((((((f * 31.0f) + this.A02) * 31.0f) + this.A01) * 31.0f) + this.A00);
    }

    public final String toString() {
        return getClass().getSimpleName() + "{target=" + this.A03 + ", zoom=" + this.A02 + ", tilt=" + this.A01 + ", bearing=" + this.A00 + "}";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A00);
    }

    public CameraPosition(Parcel parcel) {
        this.A03 = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.A02 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        this.A03 = latLng;
        this.A02 = f;
        this.A01 = f2;
        this.A00 = f3;
    }
}
