package com.facebook.exoplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class VideoPlayerStreamMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(67);
    public int A00;
    public int A01;
    public VideoPlayerStreamFormat A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, 0);
        parcel.writeString(this.A03);
    }

    public VideoPlayerStreamMetadata() {
    }

    public VideoPlayerStreamMetadata(Parcel parcel) {
        int readInt = parcel.readInt();
        int readInt2 = parcel.readInt();
        String readString = parcel.readString();
        this.A01 = readInt;
        this.A00 = readInt2;
        this.A02 = (VideoPlayerStreamFormat) parcel.readParcelable(VideoPlayerStreamFormat.class.getClassLoader());
        this.A03 = readString;
    }
}
