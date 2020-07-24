package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class ParcelableTigonStats implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(92);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public String A06;
    public byte[] A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.A07;
        if (bArr != null) {
            parcel.writeByteArray(bArr, 0, this.A00);
            parcel.writeInt(this.A02);
            parcel.writeInt(this.A01);
            parcel.writeInt(this.A03);
            parcel.writeString(this.A06);
            parcel.writeLong(this.A04);
            parcel.writeLong(this.A05);
        }
    }

    public ParcelableTigonStats(Parcel parcel) {
        byte[] createByteArray = parcel.createByteArray();
        this.A07 = createByteArray;
        this.A00 = createByteArray.length;
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A04 = parcel.readLong();
        this.A05 = parcel.readLong();
    }
}
