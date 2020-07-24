package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.metadata.Metadata;
import p000X.C25948Bd0;

public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(136);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            IcyHeaders icyHeaders = (IcyHeaders) obj;
            if (this.A00 != icyHeaders.A00 || !C25948Bd0.A0D(this.A02, icyHeaders.A02) || !C25948Bd0.A0D(this.A03, icyHeaders.A03) || !C25948Bd0.A0D(this.A04, icyHeaders.A04) || this.A05 != icyHeaders.A05 || this.A01 != icyHeaders.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3 = (527 + this.A00) * 31;
        String str = this.A02;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i5 = (i3 + i) * 31;
        String str2 = this.A03;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i4 = str3.hashCode();
        }
        return ((((i6 + i4) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.A03 + "\", genre=\"" + this.A02 + "\", bitrate=" + this.A00 + ", metadataInterval=" + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
    }

    public IcyHeaders(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = C25948Bd0.A0C(parcel);
        this.A01 = parcel.readInt();
    }
}
