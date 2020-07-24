package com.instagram.camera.effect.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;

public class ThumbnailImage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(274);
    public ImageUrl A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public ThumbnailImage() {
    }

    public ThumbnailImage(Parcel parcel) {
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
    }
}
