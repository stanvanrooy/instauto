package com.instagram.feed.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.C43091tn;

public class EffectPreview implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(47);
    public AttributionUser A00;
    public EffectActionSheet A01;
    public ThumbnailImage A02;
    public C43091tn A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeSerializable(this.A03);
    }

    public EffectPreview() {
    }

    public EffectPreview(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A09 = parcel.readString();
        this.A00 = (AttributionUser) parcel.readParcelable(AttributionUser.class.getClassLoader());
        this.A08 = parcel.readString();
        this.A01 = (EffectActionSheet) parcel.readParcelable(EffectActionSheet.class.getClassLoader());
        this.A02 = (ThumbnailImage) parcel.readParcelable(ThumbnailImage.class.getClassLoader());
        this.A03 = (C43091tn) parcel.readSerializable();
    }
}
