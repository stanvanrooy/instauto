package com.facebook.exoplayer.ipc;

import android.os.Parcel;

public class VpsPrefetchCacheEvictEvent extends VideoPlayerServiceEvent {
    public String A00;

    public VpsPrefetchCacheEvictEvent(Parcel parcel) {
        this.A00 = parcel.readString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A00);
    }
}
