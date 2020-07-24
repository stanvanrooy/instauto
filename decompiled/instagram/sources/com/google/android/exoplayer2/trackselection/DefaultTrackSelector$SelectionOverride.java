package com.google.android.exoplayer2.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;

public final class DefaultTrackSelector$SelectionOverride implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(152);
    public final int A00;
    public final int A01;
    public final int[] A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DefaultTrackSelector$SelectionOverride defaultTrackSelector$SelectionOverride = (DefaultTrackSelector$SelectionOverride) obj;
            if (this.A00 != defaultTrackSelector$SelectionOverride.A00 || !Arrays.equals(this.A02, defaultTrackSelector$SelectionOverride.A02)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (this.A00 * 31) + Arrays.hashCode(this.A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02.length);
        parcel.writeIntArray(this.A02);
    }

    public DefaultTrackSelector$SelectionOverride(Parcel parcel) {
        this.A00 = parcel.readInt();
        int readByte = parcel.readByte();
        this.A01 = readByte;
        int[] iArr = new int[readByte];
        this.A02 = iArr;
        parcel.readIntArray(iArr);
    }
}
