package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.AnonymousClass000;
import p000X.C25948Bd0;

public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(138);
    public final int A00;
    public final String A01;
    public final String A02;
    public final byte[] A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ApicFrame apicFrame = (ApicFrame) obj;
            if (this.A00 != apicFrame.A00 || !C25948Bd0.A0D(this.A02, apicFrame.A02) || !C25948Bd0.A0D(this.A01, apicFrame.A01) || !Arrays.equals(this.A03, apicFrame.A03)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = (527 + this.A00) * 31;
        String str = this.A02;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (i2 + i) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return ((i4 + i3) * 31) + Arrays.hashCode(this.A03);
    }

    public final String toString() {
        return AnonymousClass000.A0O(this.A00, ": mimeType=", this.A02, ", description=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByteArray(this.A03);
    }

    public ApicFrame(Parcel parcel) {
        super("APIC");
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        this.A03 = parcel.createByteArray();
    }

    public ApicFrame(String str, byte[] bArr) {
        super("APIC");
        this.A02 = str;
        this.A01 = null;
        this.A00 = 3;
        this.A03 = bArr;
    }
}
