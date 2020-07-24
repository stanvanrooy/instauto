package com.instagram.creation.base;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.PendingMedia;

public class VideoSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(293);
    public float A00 = 1.0f;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public Location A09;
    public String A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;

    public final int describeContents() {
        return 0;
    }

    public final void A00(PendingMedia pendingMedia) {
        this.A07 = pendingMedia.A13.A01;
        this.A06 = pendingMedia.A05;
        ClipInfo clipInfo = pendingMedia.A0l;
        this.A05 = clipInfo.A08;
        this.A04 = clipInfo.A06;
        this.A0E = pendingMedia.A33;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A0A);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A0B);
        parcel.writeParcelable(this.A09, i);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        parcel.writeInt(this.A04);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
    }

    public VideoSession() {
    }

    public VideoSession(Parcel parcel) {
        this.A0A = parcel.readString();
        boolean z = false;
        this.A0C = parcel.readByte() == 1;
        this.A0F = parcel.readByte() == 1;
        this.A00 = parcel.readFloat();
        this.A0B = parcel.readString();
        this.A09 = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.A07 = parcel.readInt();
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A0E = parcel.readByte() == 1;
        this.A08 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0D = parcel.readByte() == 1 ? true : z;
    }
}
