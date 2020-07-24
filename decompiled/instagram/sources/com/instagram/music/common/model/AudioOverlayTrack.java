package com.instagram.music.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass0a4;

public class AudioOverlayTrack implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(431);
    public int A00;
    public int A01;
    public DownloadedTrack A02;
    public MusicAssetModel A03;
    public String A04;
    public String A05;
    public String A06;

    public final int describeContents() {
        return 0;
    }

    public final void A00(MusicAssetModel musicAssetModel) {
        this.A03 = musicAssetModel;
        if (musicAssetModel != null) {
            this.A04 = musicAssetModel.A07;
            this.A05 = musicAssetModel.A04;
            this.A06 = musicAssetModel.A08;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
    }

    public AudioOverlayTrack() {
    }

    public AudioOverlayTrack(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A06 = parcel.readString();
        this.A03 = (MusicAssetModel) parcel.readParcelable(MusicAssetModel.class.getClassLoader());
        this.A02 = (DownloadedTrack) parcel.readParcelable(DownloadedTrack.class.getClassLoader());
    }

    public AudioOverlayTrack(MusicAssetModel musicAssetModel, int i, int i2) {
        boolean z = true;
        AnonymousClass0a4.A0B(i >= 0, "Snippet start time must be greater than zero");
        AnonymousClass0a4.A0B(i2 <= 0 ? false : z, "Snippet must have a duration longer than zero");
        this.A04 = musicAssetModel.A07;
        this.A05 = musicAssetModel.A04;
        this.A06 = musicAssetModel.A08;
        this.A03 = musicAssetModel;
        this.A01 = i;
        this.A00 = i2;
    }
}
