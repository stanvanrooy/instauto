package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class ParcelableXProcessTrafficShapingCommunication implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(94);
    public long A00;
    public long A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLongArray(new long[]{this.A00, this.A01});
    }

    public ParcelableXProcessTrafficShapingCommunication(Parcel parcel) {
        long[] jArr = new long[2];
        parcel.readLongArray(jArr);
        this.A00 = jArr[0];
        this.A01 = jArr[1];
    }
}
