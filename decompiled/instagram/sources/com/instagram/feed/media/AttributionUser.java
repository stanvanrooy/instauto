package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public class AttributionUser implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(39);
    public ProfilePicture A00;
    public String A01;
    public String A02;
    public boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
    }

    public AttributionUser() {
    }

    public AttributionUser(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = (ProfilePicture) parcel.readParcelable(ProfilePicture.class.getClassLoader());
        this.A03 = parcel.readByte() != 0;
    }
}
