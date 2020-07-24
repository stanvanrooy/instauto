package com.facebook.video.heroplayer.ipc;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

public class DynamicPlayerSettings implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(9);
    public final int A00;
    public final boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "LivePrefetchSegmentsNum=" + this.A00 + ", isDebugHeadersEnabled" + this.A01;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public DynamicPlayerSettings() {
        this.A00 = -1;
        this.A01 = false;
    }

    public DynamicPlayerSettings(int i, boolean z) {
        this.A00 = i;
        this.A01 = z;
    }

    public DynamicPlayerSettings(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() != 1 ? false : true;
    }
}
