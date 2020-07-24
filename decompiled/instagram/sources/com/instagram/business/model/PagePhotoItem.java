package com.instagram.business.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class PagePhotoItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(268);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A00);
    }

    public PagePhotoItem(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readInt() != 1 ? false : true;
        this.A00 = parcel.readString();
    }

    public PagePhotoItem(String str, String str2, boolean z, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = z;
        this.A00 = str3;
    }
}
