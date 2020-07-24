package com.instagram.common.gallery;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.common.typedurl.ImageUrl;
import p000X.C46361zc;
import p000X.C76823Xl;
import p000X.C84653m5;

public class RemoteMedia implements C84653m5, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(282);
    public final ImageUrl A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final int AUk() {
        return 0;
    }

    public final boolean Ae6() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return this.A03.equals(((RemoteMedia) obj).AOA());
    }

    public final int hashCode() {
        return this.A03.hashCode();
    }

    public final boolean isValid() {
        return !C46361zc.A02(this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
    }

    public final String AMI() {
        return this.A02;
    }

    public final String AOA() {
        return this.A03;
    }

    public final boolean AiO() {
        return this.A04;
    }

    public final int getDuration() {
        return this.A01;
    }

    public RemoteMedia(Parcel parcel) {
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A03 = parcel.readString();
        this.A04 = parcel.readInt() != 1 ? false : true;
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
    }

    public RemoteMedia(String str, ImageUrl imageUrl, boolean z, int i) {
        this.A03 = str;
        this.A00 = imageUrl;
        this.A04 = z;
        this.A02 = C76823Xl.A01(i);
        this.A01 = i;
    }
}
