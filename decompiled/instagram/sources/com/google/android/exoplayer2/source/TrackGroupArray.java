package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;

public final class TrackGroupArray implements Parcelable {
    public static final TrackGroupArray A03 = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(150);
    public int A00;
    public final int A01;
    public final TrackGroup[] A02;

    public final int A00(TrackGroup trackGroup) {
        for (int i = 0; i < this.A01; i++) {
            if (this.A02[i] == trackGroup) {
                return i;
            }
        }
        return -1;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
            if (this.A01 != trackGroupArray.A01 || !Arrays.equals(this.A02, trackGroupArray.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = Arrays.hashCode(this.A02);
        }
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        for (int i2 = 0; i2 < this.A01; i2++) {
            parcel.writeParcelable(this.A02[i2], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new TrackGroup[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.A02 = trackGroupArr;
        this.A01 = trackGroupArr.length;
    }
}
