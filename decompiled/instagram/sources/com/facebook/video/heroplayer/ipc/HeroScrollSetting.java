package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class HeroScrollSetting implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(90);
    public final int A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "mEnableExoPlayerThreadScrollAware=" + this.A02 + ",mEnableLoaderChunkTaskQueueExecutorThreadScrollAware=" + this.A03 + ",mScrollAwareThreadDowngradePriority=" + this.A00 + ",mDisableExoPlayerBornScrollAware=" + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02 ? 1 : 0);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public HeroScrollSetting() {
        this.A02 = false;
        this.A03 = false;
        this.A00 = 19;
        this.A01 = false;
    }

    public HeroScrollSetting(Parcel parcel) {
        boolean z = false;
        this.A02 = parcel.readInt() == 1;
        this.A03 = parcel.readInt() == 1;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() == 1 ? true : z;
    }
}
