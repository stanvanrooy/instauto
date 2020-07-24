package com.instagram.common.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.Constants;

public class GalleryItem implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(281);
    public final Draft A00;
    public final Medium A01;
    public final RemoteMedia A02;
    public final Integer A03;

    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        switch (this.A03.intValue()) {
            case 1:
                return this.A00.AOA();
            case 2:
                return this.A02.AOA();
            default:
                return this.A01.AOA();
        }
    }

    public final boolean A01() {
        switch (this.A03.intValue()) {
            case 1:
                return this.A00.Ae6();
            case 2:
                return this.A02.Ae6();
            default:
                return this.A01.Ae6();
        }
    }

    public final boolean A02() {
        if (this.A03 == Constants.ONE) {
            return true;
        }
        return false;
    }

    public final boolean A03() {
        if (this.A03 == Constants.ZERO) {
            return true;
        }
        return false;
    }

    public final boolean A04() {
        switch (this.A03.intValue()) {
            case 1:
                return this.A00.AiO();
            case 2:
                return this.A02.AiO();
            default:
                return this.A01.AiO();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GalleryItem)) {
            return false;
        }
        GalleryItem galleryItem = (GalleryItem) obj;
        if (galleryItem.A03() && A03()) {
            return this.A01.equals(galleryItem.A01);
        }
        if (galleryItem.A02() && A02()) {
            return this.A00.equals(galleryItem.A00);
        }
        Integer num = galleryItem.A03;
        Integer num2 = Constants.A0C;
        boolean z = false;
        if (num == num2) {
            z = true;
        }
        if (!z) {
            return false;
        }
        boolean z2 = false;
        if (this.A03 == num2) {
            z2 = true;
        }
        if (z2) {
            return this.A02.equals(galleryItem.A02);
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A02, i);
        switch (this.A03.intValue()) {
            case 1:
                str = "DRAFT";
                break;
            case 2:
                str = "REMOTE_MEDIA";
                break;
            default:
                str = "MEDIUM";
                break;
        }
        parcel.writeString(str);
    }

    public final int hashCode() {
        return A00().hashCode();
    }

    public GalleryItem(Parcel parcel) {
        Integer num;
        this.A01 = (Medium) parcel.readParcelable(Medium.class.getClassLoader());
        this.A00 = (Draft) parcel.readParcelable(Draft.class.getClassLoader());
        this.A02 = (RemoteMedia) parcel.readParcelable(RemoteMedia.class.getClassLoader());
        String readString = parcel.readString();
        if (readString.equals("MEDIUM")) {
            num = Constants.ZERO;
        } else if (readString.equals("DRAFT")) {
            num = Constants.ONE;
        } else if (readString.equals("REMOTE_MEDIA")) {
            num = Constants.A0C;
        } else {
            throw new IllegalArgumentException(readString);
        }
        this.A03 = num;
    }

    public GalleryItem(Draft draft) {
        this.A00 = draft;
        this.A01 = null;
        this.A02 = null;
        this.A03 = Constants.ONE;
    }

    public GalleryItem(Medium medium) {
        this.A01 = medium;
        this.A00 = null;
        this.A02 = null;
        this.A03 = Constants.ZERO;
    }

    public GalleryItem(RemoteMedia remoteMedia) {
        this.A02 = remoteMedia;
        this.A01 = null;
        this.A00 = null;
        this.A03 = Constants.A0C;
    }
}
