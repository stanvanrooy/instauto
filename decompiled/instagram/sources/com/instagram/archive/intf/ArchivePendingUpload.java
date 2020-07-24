package com.instagram.archive.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ArchivePendingUpload implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(252);
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final boolean A04;
    public final boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeByte(this.A05 ? (byte) 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
    }

    public ArchivePendingUpload(Parcel parcel) {
        this.A03 = parcel.readString();
        boolean z = true;
        this.A05 = parcel.readByte() != 0;
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readByte() == 0 ? false : z;
    }

    public ArchivePendingUpload(String str, boolean z, int i, int i2, int i3, boolean z2) {
        this.A03 = str;
        this.A05 = z;
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A04 = z2;
    }
}
