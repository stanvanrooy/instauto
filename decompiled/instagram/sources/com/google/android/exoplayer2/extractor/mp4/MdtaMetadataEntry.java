package com.google.android.exoplayer2.extractor.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p000X.AnonymousClass000;

public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(131);
    public final int A00;
    public final int A01;
    public final String A02;
    public final byte[] A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
            if (!this.A02.equals(mdtaMetadataEntry.A02) || !Arrays.equals(this.A03, mdtaMetadataEntry.A03) || this.A00 != mdtaMetadataEntry.A00 || this.A01 != mdtaMetadataEntry.A01) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((((((527 + this.A02.hashCode()) * 31) + Arrays.hashCode(this.A03)) * 31) + this.A00) * 31) + this.A01;
    }

    public final String toString() {
        return AnonymousClass000.A0E("mdta: key=", this.A02);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03.length);
        parcel.writeByteArray(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public MdtaMetadataEntry(Parcel parcel) {
        this.A02 = parcel.readString();
        byte[] bArr = new byte[parcel.readInt()];
        this.A03 = bArr;
        parcel.readByteArray(bArr);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.A02 = str;
        this.A03 = bArr;
        this.A00 = i;
        this.A01 = i2;
    }
}
