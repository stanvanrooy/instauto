package com.instagram.model.shopping.reels;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ProductCollectionLinkMetadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(416);
    public ProductCollectionReviewStatus A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public ProductCollectionLinkMetadata() {
    }

    public ProductCollectionLinkMetadata(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = (ProductCollectionReviewStatus) parcel.readParcelable(ProductCollectionReviewStatus.class.getClassLoader());
        this.A01 = parcel.readString();
    }

    public ProductCollectionLinkMetadata(String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
    }
}
