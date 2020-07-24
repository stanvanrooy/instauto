package com.instagram.creation.base;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.filterkit.filter.IgFilterGroup;

public class PhotoSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(292);
    public float A00;
    public int A01;
    public Location A02;
    public CropInfo A03;
    public IgFilterGroup A04;
    public IgFilterGroup A05;
    public String A06;
    public String A07;
    public boolean A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeString(this.A07);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeFloat(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public PhotoSession() {
    }

    public PhotoSession(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A03 = (CropInfo) parcel.readParcelable(CropInfo.class.getClassLoader());
        Class<IgFilterGroup> cls = IgFilterGroup.class;
        this.A04 = (IgFilterGroup) parcel.readParcelable(cls.getClassLoader());
        this.A05 = (IgFilterGroup) parcel.readParcelable(cls.getClassLoader());
        this.A07 = parcel.readString();
        this.A08 = parcel.readByte() != 1 ? false : true;
        this.A00 = parcel.readFloat();
        this.A02 = (Location) parcel.readParcelable(Location.class.getClassLoader());
    }
}
