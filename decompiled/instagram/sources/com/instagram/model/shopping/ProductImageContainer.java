package com.instagram.model.shopping;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.model.mediasize.ImageInfo;
import p000X.AnonymousClass17M;

public class ProductImageContainer implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(68);
    public ImageInfo A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductImageContainer)) {
            return false;
        }
        ProductImageContainer productImageContainer = (ProductImageContainer) obj;
        return AnonymousClass17M.A00(this.A00, productImageContainer.A00) && AnonymousClass17M.A00(this.A01, productImageContainer.A01);
    }

    public final int hashCode() {
        int i;
        int hashCode = this.A00.hashCode() * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
    }

    public ProductImageContainer() {
    }

    public ProductImageContainer(Parcel parcel) {
        this.A00 = (ImageInfo) parcel.readParcelable(ImageInfo.class.getClassLoader());
        this.A01 = parcel.readString();
    }

    public ProductImageContainer(ImageInfo imageInfo) {
        this.A00 = imageInfo;
    }
}
