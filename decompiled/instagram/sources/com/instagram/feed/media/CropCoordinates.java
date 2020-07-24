package com.instagram.feed.media;

import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public class CropCoordinates implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(44);
    public float A00;
    public float A01;
    public float A02;
    public float A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A00);
    }

    public CropCoordinates() {
    }

    public CropCoordinates(float f, float f2) {
        this.A01 = BaseViewManager.CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER;
        this.A03 = f;
        this.A02 = 1.0f;
        this.A00 = f2;
    }

    public CropCoordinates(RectF rectF) {
        this.A01 = rectF.left;
        this.A03 = rectF.top;
        this.A02 = rectF.right;
        this.A00 = rectF.bottom;
    }

    public CropCoordinates(Parcel parcel) {
        this.A01 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A00 = parcel.readFloat();
    }
}
