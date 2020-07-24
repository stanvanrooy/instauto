package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.typedurl.ImageUrl;

public class ProfilePicture implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(48);
    public ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ProfilePicture() {
    }

    public ProfilePicture(Parcel parcel) {
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
    }
}
