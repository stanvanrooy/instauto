package com.instagram.util.gallery;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C205748rN;

public class ImageManager$ImageListParam implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(479);
    public int A00;
    public int A01;
    public Uri A02;
    public C205748rN A03;
    public String A04;
    public boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("ImageListParam{loc=%s,inc=%d,sort=%d,bucket=%s,empty=%b,single=%s}", new Object[]{this.A03, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A04, Boolean.valueOf(this.A05), this.A02});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03.ordinal());
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public ImageManager$ImageListParam() {
    }

    public ImageManager$ImageListParam(Parcel parcel) {
        this.A03 = C205748rN.values()[parcel.readInt()];
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A02 = (Uri) parcel.readParcelable((ClassLoader) null);
        this.A05 = parcel.readInt() != 0;
    }
}
