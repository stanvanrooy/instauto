package com.instagram.clips.audio.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class AudioPageAssetModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(275);
    public final AudioPageModelType A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public AudioPageAssetModel(Parcel parcel) {
        this.A00 = (AudioPageModelType) parcel.readParcelable(AudioPageModelType.class.getClassLoader());
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public AudioPageAssetModel(AudioPageModelType audioPageModelType, String str, String str2) {
        this.A00 = audioPageModelType;
        this.A01 = str;
        this.A02 = str2;
    }
}
