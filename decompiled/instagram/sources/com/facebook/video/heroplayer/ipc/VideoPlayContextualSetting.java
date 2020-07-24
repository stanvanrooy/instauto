package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public final class VideoPlayContextualSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(14);
    public int A00;
    public AbrContextualSetting A01;
    public final boolean A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.A01.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public VideoPlayContextualSetting() {
        this.A01 = new AbrContextualSetting();
        this.A02 = false;
    }

    public VideoPlayContextualSetting(Parcel parcel) {
        this.A01 = (AbrContextualSetting) AbrContextualSetting.CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt() != 1 ? false : true;
    }

    public VideoPlayContextualSetting(AbrContextualSetting abrContextualSetting) {
        this.A01 = abrContextualSetting;
        this.A00 = -1;
        this.A02 = true;
    }
}
