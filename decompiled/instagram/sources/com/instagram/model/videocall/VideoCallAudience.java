package com.instagram.model.videocall;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.List;

public class VideoCallAudience implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(426);
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;
    public final List A05;
    public final boolean A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeList(this.A05);
    }

    public VideoCallAudience(Parcel parcel) {
        Class<ImageUrl> cls = ImageUrl.class;
        this.A04 = parcel.readArrayList(cls.getClassLoader());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        boolean z = false;
        this.A06 = parcel.readByte() == 1;
        this.A07 = parcel.readByte() == 1 ? true : z;
        this.A00 = (ImageUrl) parcel.readParcelable(cls.getClassLoader());
        this.A03 = parcel.readString();
        this.A05 = parcel.readArrayList(String.class.getClassLoader());
    }

    public VideoCallAudience(List list, boolean z, boolean z2, String str, String str2, ImageUrl imageUrl, String str3, List list2) {
        this.A04 = list;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = str;
        this.A02 = str2;
        this.A00 = imageUrl;
        this.A03 = str3;
        this.A05 = new ArrayList(list2);
    }
}
