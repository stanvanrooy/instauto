package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public final class VideoProtocolProps implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(99);
    public final String A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "subscriptionUrl: '" + this.A00 + "', broadcasterForcedPlayback: " + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public VideoProtocolProps() {
        this.A00 = "";
        this.A01 = false;
    }

    public VideoProtocolProps(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readInt() != 1 ? false : true;
    }
}
