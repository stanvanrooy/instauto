package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public class EffectConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(46);
    public AttributionUser A00;
    public EffectActionSheet A01;
    public ThumbnailImage A02;
    public String A03;
    public String A04;
    public String A05;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
    }

    public EffectConfig() {
    }

    public EffectConfig(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = (AttributionUser) parcel.readParcelable(AttributionUser.class.getClassLoader());
        this.A05 = parcel.readString();
        this.A02 = (ThumbnailImage) parcel.readParcelable(ThumbnailImage.class.getClassLoader());
    }
}
