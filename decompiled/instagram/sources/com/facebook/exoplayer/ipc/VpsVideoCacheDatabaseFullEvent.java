package com.facebook.exoplayer.ipc;

import android.os.Parcel;

public class VpsVideoCacheDatabaseFullEvent extends VideoPlayerServiceEvent {
    public final String A00;

    public VpsVideoCacheDatabaseFullEvent(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
