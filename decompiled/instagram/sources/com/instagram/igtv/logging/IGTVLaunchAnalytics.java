package com.instagram.igtv.logging;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class IGTVLaunchAnalytics implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(342);
    public int A00 = -1;
    public Boolean A01;
    public String A02;
    public String A03;
    public String A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        Boolean bool = this.A01;
        if (bool == null) {
            i2 = 0;
        } else {
            i2 = 2;
            if (bool.booleanValue()) {
                i2 = 1;
            }
        }
        parcel.writeByte((byte) i2);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
    }

    public IGTVLaunchAnalytics() {
    }

    public IGTVLaunchAnalytics(Parcel parcel) {
        Boolean valueOf;
        byte readByte = parcel.readByte();
        if (readByte == 0) {
            valueOf = null;
        } else {
            valueOf = Boolean.valueOf(readByte != 1 ? false : true);
        }
        this.A01 = valueOf;
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
    }
}
