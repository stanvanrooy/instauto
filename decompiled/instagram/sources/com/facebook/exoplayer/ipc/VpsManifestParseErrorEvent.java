package com.facebook.exoplayer.ipc;

import android.os.Parcel;

public class VpsManifestParseErrorEvent extends VideoPlayerServiceEvent {
    public Exception A00;
    public String A01;

    public VpsManifestParseErrorEvent(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = (Exception) parcel.readSerializable();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeSerializable(this.A00);
    }
}
