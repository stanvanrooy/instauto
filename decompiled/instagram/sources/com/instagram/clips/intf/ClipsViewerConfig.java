package com.instagram.clips.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.clips.audio.model.AudioPageModelType;

public class ClipsViewerConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(277);
    public String A00;
    public String A01;
    public final AudioPageModelType A02;
    public final ClipsViewerSource A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final int A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A08);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public ClipsViewerConfig(Parcel parcel) {
        this.A03 = (ClipsViewerSource) parcel.readParcelable(ClipsViewerSource.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A08 = parcel.readString();
        this.A09 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A02 = (AudioPageModelType) parcel.readParcelable(AudioPageModelType.class.getClassLoader());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public ClipsViewerConfig(ClipsViewerSource clipsViewerSource, String str, String str2, String str3, String str4, int i, String str5, AudioPageModelType audioPageModelType, String str6, String str7) {
        this.A03 = clipsViewerSource;
        this.A07 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A08 = str4;
        this.A09 = i;
        this.A04 = str5;
        this.A02 = audioPageModelType;
        this.A00 = str6;
        this.A01 = str7;
    }
}
