package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class VideoPlayerStreamEvaluation implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(65);
    public int A00;
    public int A01;
    public VideoPlayerStreamFormat A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A02, 0);
    }

    public VideoPlayerStreamEvaluation() {
    }

    public VideoPlayerStreamEvaluation(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = (VideoPlayerStreamFormat) parcel.readParcelable(VideoPlayerStreamFormat.class.getClassLoader());
    }
}
