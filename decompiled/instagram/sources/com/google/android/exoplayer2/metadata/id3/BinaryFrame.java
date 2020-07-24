package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;

public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(139);
    public final byte[] A00;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BinaryFrame binaryFrame = (BinaryFrame) obj;
            if (!this.A00.equals(binaryFrame.A00) || !Arrays.equals(this.A00, binaryFrame.A00)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.A00.hashCode()) * 31) + Arrays.hashCode(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A00);
    }

    public BinaryFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.createByteArray();
    }
}
