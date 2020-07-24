package com.instagram.model.shopping.productfeed;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.shopping.Merchant;
import p000X.AnonymousClass17M;

public class ProductTileMedia implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(407);
    public ImageInfo A00;
    public Merchant A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTileMedia)) {
            return false;
        }
        ProductTileMedia productTileMedia = (ProductTileMedia) obj;
        return AnonymousClass17M.A00(this.A02, productTileMedia.A02) && AnonymousClass17M.A00(this.A00, productTileMedia.A00) && AnonymousClass17M.A00(this.A03, productTileMedia.A03) && AnonymousClass17M.A00(this.A01, productTileMedia.A01);
    }

    public final int hashCode() {
        int i;
        int hashCode = ((this.A02.hashCode() * 31) + this.A00.hashCode()) * 31;
        String str = this.A03;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        Merchant merchant = this.A01;
        if (merchant != null) {
            i2 = merchant.hashCode();
        }
        return i3 + i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductTileMedia() {
    }

    public ProductTileMedia(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A00 = (ImageInfo) parcel.readParcelable(ImageInfo.class.getClassLoader());
        this.A03 = parcel.readString();
        this.A01 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
    }

    public ProductTileMedia(String str, ImageInfo imageInfo, Merchant merchant) {
        this.A02 = str;
        this.A00 = imageInfo;
        this.A01 = merchant;
    }
}
