package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass000;
import p000X.C25948Bd0;

public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(143);
    public final String A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            GeobFrame geobFrame = (GeobFrame) obj;
            if (!C25948Bd0.A0D(this.A02, geobFrame.A02) || !C25948Bd0.A0D(this.A01, geobFrame.A01) || !C25948Bd0.A0D(this.A00, geobFrame.A00) || !Arrays.equals(this.A03, geobFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public GeobFrame(Parcel parcel) {
        super("GEOB");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A03 = parcel.createByteArray();
    }

    public final int hashCode() {
        int i;
        int i2;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (527 + i) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str3 = this.A00;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((i5 + i3) * 31) + Arrays.hashCode(this.A03);
    }

    public final String toString() {
        return AnonymousClass000.A0Q(this.A00, ": mimeType=", this.A02, ", filename=", this.A01, ", description=", this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeByteArray(this.A03);
    }
}
