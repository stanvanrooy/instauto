package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public final class LiveState implements Parcelable {
    public static final LiveState A09 = new LiveState(0, 0, 0, 0, 0, 0, 0, 0, false);
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(11);
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final boolean A08;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LiveState)) {
            return false;
        }
        LiveState liveState = (LiveState) obj;
        return liveState.A03 == this.A03 && liveState.A00 == this.A00 && liveState.A05 == this.A05 && liveState.A04 == this.A04 && liveState.A06 == this.A06 && liveState.A02 == this.A02 && liveState.A07 == this.A07 && liveState.A01 == this.A01 && liveState.A08 == this.A08;
    }

    public final int hashCode() {
        long j;
        long j2 = this.A03;
        int i = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = (long) this.A00;
        long j4 = this.A05;
        long j5 = this.A04;
        long j6 = this.A06;
        long j7 = this.A02;
        long j8 = this.A07;
        long j9 = this.A01;
        int i2 = (((((((((((((i + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)))) * 31;
        if (this.A08) {
            j = 1;
        } else {
            j = 0;
        }
        return i2 + ((int) (j ^ (j >>> 32)));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A07);
        parcel.writeLong(this.A01);
        parcel.writeInt(this.A08 ? 1 : 0);
    }

    public LiveState(long j, int i, long j2, long j3, long j4, long j5, long j6, long j7, boolean z) {
        this.A03 = j;
        this.A00 = i;
        this.A05 = j2;
        this.A04 = j3;
        this.A06 = j4;
        this.A02 = j5;
        this.A07 = j6;
        this.A01 = j7;
        this.A08 = z;
    }

    public LiveState(Parcel parcel) {
        this.A03 = parcel.readLong();
        this.A00 = parcel.readInt();
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A08 = parcel.readInt() != 1 ? false : true;
    }
}
