package com.instagram.music.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableList;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;
import p000X.C198178dx;
import p000X.C198248e9;

public class MusicSearchPlaylist implements Parcelable, C198248e9 {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(436);
    public ImageUrl A00;
    public String A01;
    public String A02;
    public List A03;

    public final int describeContents() {
        return 0;
    }

    public final List ASb() {
        return ImmutableList.A09(this.A03);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeParcelable(this.A00, i);
        parcel.writeList(this.A03);
    }

    public final String AYP() {
        return this.A02;
    }

    public MusicSearchPlaylist() {
    }

    public MusicSearchPlaylist(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = (ImageUrl) parcel.readParcelable(ImageUrl.class.getClassLoader());
        this.A03 = parcel.readArrayList(C198178dx.class.getClassLoader());
    }
}
