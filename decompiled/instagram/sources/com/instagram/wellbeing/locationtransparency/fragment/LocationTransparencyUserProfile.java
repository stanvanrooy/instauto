package com.instagram.wellbeing.locationtransparency.fragment;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;

public class LocationTransparencyUserProfile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(482);
    public ImageUrl A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public boolean A05;
    public boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A02);
        if (Build.VERSION.SDK_INT >= 29) {
            parcel.writeBoolean(this.A05);
            parcel.writeBoolean(this.A06);
            return;
        }
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
    }

    public LocationTransparencyUserProfile(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A02 = parcel.readString();
        if (Build.VERSION.SDK_INT >= 29) {
            this.A05 = parcel.readBoolean();
            this.A06 = parcel.readBoolean();
            return;
        }
        boolean z = false;
        this.A05 = parcel.readInt() == 1;
        this.A06 = parcel.readInt() == 1 ? true : z;
    }

    public LocationTransparencyUserProfile(String str, String str2, String str3, ImageUrl imageUrl, String str4, boolean z, boolean z2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = str3;
        this.A00 = imageUrl;
        this.A02 = str4;
        this.A05 = z;
        this.A06 = z2;
    }
}
