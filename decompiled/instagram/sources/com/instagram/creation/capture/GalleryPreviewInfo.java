package com.instagram.creation.capture;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.creation.base.CropInfo;
import com.instagram.creation.photo.util.ExifImageData;

public class GalleryPreviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(296);
    public CropInfo A00;
    public ExifImageData A01;
    public String A02;
    public float[] A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloatArray(this.A03);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public GalleryPreviewInfo() {
    }

    public GalleryPreviewInfo(Parcel parcel) {
        this.A03 = parcel.createFloatArray();
        this.A02 = parcel.readString();
        this.A00 = (CropInfo) parcel.readParcelable(CropInfo.class.getClassLoader());
        this.A01 = (ExifImageData) parcel.readParcelable(ExifImageData.class.getClassLoader());
    }
}
