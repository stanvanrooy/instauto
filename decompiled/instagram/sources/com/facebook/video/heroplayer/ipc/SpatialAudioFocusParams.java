package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class SpatialAudioFocusParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(98);
    public final double A00;
    public final double A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeDouble(this.A01);
        parcel.writeDouble(this.A00);
    }

    public SpatialAudioFocusParams(Parcel parcel) {
        this.A02 = parcel.readByte() != 1 ? false : true;
        this.A01 = parcel.readDouble();
        this.A00 = parcel.readDouble();
    }
}
