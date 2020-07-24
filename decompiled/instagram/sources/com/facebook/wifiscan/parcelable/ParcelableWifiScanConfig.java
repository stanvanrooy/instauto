package com.facebook.wifiscan.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.C50912Ii;

public class ParcelableWifiScanConfig extends C50912Ii implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(18);

    public final int describeContents() {
        return 0;
    }

    public final int A01() {
        return this.A01;
    }

    public final int A02() {
        return this.A02;
    }

    public final int A03() {
        return this.A03;
    }

    public final long A04() {
        return this.A04;
    }

    public final boolean A05() {
        return this.A07;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A01);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ParcelableWifiScanConfig(Parcel parcel) {
        super(r1, r2, r4, r6, (long) parcel.readInt(), (long) parcel.readInt(), (long) parcel.readInt(), parcel.readInt() > 0);
        boolean z = parcel.readInt() > 0;
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        long readLong3 = parcel.readLong();
        parcel.readLong();
    }
}
