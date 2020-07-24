package com.instagram.avatar;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class AddAvatarHelper$LoadedImage$LoadedImageMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(253);
    public final int A00;
    public final Uri A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, 0);
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(int i, Uri uri) {
        this.A00 = i;
        this.A01 = uri;
    }

    public AddAvatarHelper$LoadedImage$LoadedImageMetadata(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
    }
}
