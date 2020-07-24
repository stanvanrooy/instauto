package com.instagram.music.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.io.File;

public class DownloadedTrack implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(432);
    public int A00;
    public int A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final int A00(int i) {
        int i2 = this.A01;
        boolean z = false;
        if (i2 != -1) {
            z = true;
        }
        if (!z) {
            return i;
        }
        if (i >= i2 && i <= this.A00 + i2) {
            return i - i2;
        }
        throw new IllegalStateException("requested absolute time not in track segment");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public DownloadedTrack() {
    }

    public DownloadedTrack(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public DownloadedTrack(File file, int i, int i2) {
        this.A02 = file.getPath();
        this.A01 = i;
        this.A00 = i2;
    }
}
