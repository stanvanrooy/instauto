package com.instagram.feed.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class ContextualFeedNetworkConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(329);
    public final int A00;
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
        parcel.writeInt(this.A00);
    }

    public ContextualFeedNetworkConfig(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public ContextualFeedNetworkConfig(String str, String str2, String str3, int i) {
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = i;
    }
}
