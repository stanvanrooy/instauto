package com.instagram.music.common.model;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class MusicBrowseCategory implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(433);
    public final Bundle A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeBundle(this.A00);
    }

    public MusicBrowseCategory(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readBundle(getClass().getClassLoader());
    }

    public MusicBrowseCategory(String str, String str2, String str3, Bundle bundle) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = bundle;
    }
}
