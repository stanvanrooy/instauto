package com.google.android.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.Format;
import java.util.Arrays;
import p000X.D6U;

public final class TrackGroup implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(149);
    public int A00;
    public final int A01;
    public final Format[] A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TrackGroup trackGroup = (TrackGroup) obj;
            if (this.A01 != trackGroup.A01 || !Arrays.equals(this.A02, trackGroup.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = 527 + Arrays.hashCode(this.A02);
        }
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        for (int i2 = 0; i2 < this.A01; i2++) {
            parcel.writeParcelable(this.A02[i2], 0);
        }
    }

    public TrackGroup(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new Format[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = (Format) parcel.readParcelable(Format.class.getClassLoader());
        }
    }

    public TrackGroup(Format... formatArr) {
        int length = formatArr.length;
        D6U.A03(length > 0);
        this.A02 = formatArr;
        this.A01 = length;
    }
}
