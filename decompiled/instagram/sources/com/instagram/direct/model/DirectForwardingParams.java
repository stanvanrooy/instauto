package com.instagram.direct.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class DirectForwardingParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(319);
    public String A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public DirectForwardingParams() {
    }

    public DirectForwardingParams(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }

    public DirectForwardingParams(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
