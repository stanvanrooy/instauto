package com.instagram.common.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class FaceCenter implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(280);
    public float A00;
    public float A01;
    public float A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
    }

    public FaceCenter() {
    }

    public FaceCenter(float f, float f2, float f3) {
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
    }

    public FaceCenter(Parcel parcel) {
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }
}
