package com.google.android.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.Arrays;
import p000X.C25948Bd0;

public final class EventMessage implements Metadata.Entry {
    public static final Format A06 = Format.A00("application/id3");
    public static final Format A07 = Format.A00("application/x-scte35");
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(133);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EventMessage eventMessage = (EventMessage) obj;
            if (this.A01 != eventMessage.A01 || this.A02 != eventMessage.A02 || !C25948Bd0.A0D(this.A03, eventMessage.A03) || !C25948Bd0.A0D(this.A04, eventMessage.A04) || !Arrays.equals(this.A05, eventMessage.A05)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        if (this.A00 == 0) {
            String str = this.A03;
            int i2 = 0;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            int i3 = (527 + i) * 31;
            String str2 = this.A04;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            long j = this.A01;
            long j2 = this.A02;
            this.A00 = ((((((i3 + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + Arrays.hashCode(this.A05);
        }
        return this.A00;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.A03 + ", id=" + this.A02 + ", durationMs=" + this.A01 + ", value=" + this.A04;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }

    public EventMessage(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public EventMessage(String str, String str2, long j, long j2, byte[] bArr) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j;
        this.A02 = j2;
        this.A05 = bArr;
    }
}
