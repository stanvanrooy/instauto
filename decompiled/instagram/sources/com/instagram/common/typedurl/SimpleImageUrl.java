package com.instagram.common.typedurl;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import java.util.List;

public class SimpleImageUrl implements ImageUrl {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(27);
    public int A00;
    public int A01;
    public String A02;

    public final List ALI() {
        return null;
    }

    public final String AV6() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final String AZc() {
        return this.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SimpleImageUrl simpleImageUrl = (SimpleImageUrl) obj;
            if (this.A01 == simpleImageUrl.A01 && this.A00 == simpleImageUrl.A00) {
                return this.A02.equals(simpleImageUrl.A02);
            }
        }
        return false;
    }

    public final int getHeight() {
        return this.A00;
    }

    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A01) * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public SimpleImageUrl() {
    }

    public SimpleImageUrl(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public SimpleImageUrl(String str) {
        this(str, -1, -1);
    }

    public SimpleImageUrl(String str, int i, int i2) {
        this.A02 = str;
        this.A01 = i;
        this.A00 = i2;
    }
}
