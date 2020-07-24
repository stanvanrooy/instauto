package com.instagram.shopping.fragment.pdp.lightbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.shopping.Product;

public class LightboxArguments implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(460);
    public final Product A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final Parcelable[] A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeParcelableArray(this.A08, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
    }

    public LightboxArguments(Parcel parcel) {
        this.A07 = parcel.readInt() != 1 ? false : true;
        Class<?> cls = getClass();
        this.A08 = parcel.readParcelableArray(cls.getClassLoader());
        this.A00 = (Product) parcel.readParcelable(cls.getClassLoader());
        this.A06 = parcel.readString();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public LightboxArguments(boolean z, Parcelable[] parcelableArr, Product product, String str, String str2, String str3, String str4, String str5, String str6) {
        this.A07 = z;
        this.A08 = parcelableArr;
        this.A00 = product;
        this.A06 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A03 = str6;
    }
}
