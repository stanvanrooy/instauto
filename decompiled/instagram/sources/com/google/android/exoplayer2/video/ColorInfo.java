package com.google.android.exoplayer2.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.C25948Bd0;

public final class ColorInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(154);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ColorInfo colorInfo = (ColorInfo) obj;
            if (!(this.A02 == colorInfo.A02 && this.A01 == colorInfo.A01 && this.A03 == colorInfo.A03 && Arrays.equals(this.A04, colorInfo.A04))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            this.A00 = ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Arrays.hashCode(this.A04);
        }
        return this.A00;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.A02);
        sb.append(", ");
        sb.append(this.A01);
        sb.append(", ");
        sb.append(this.A03);
        sb.append(", ");
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        int i2 = 0;
        if (this.A04 != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        byte[] bArr = this.A04;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A04 = C25948Bd0.A0C(parcel) ? parcel.createByteArray() : null;
    }
}
