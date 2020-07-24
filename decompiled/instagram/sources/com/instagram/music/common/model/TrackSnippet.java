package com.instagram.music.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass000;
import p000X.AnonymousClass0a4;

public class TrackSnippet implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(437);
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return AnonymousClass000.A08("TrackSnippet[startTimeInMs=", this.A01, ", durationInMs=", this.A00, "]");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public TrackSnippet() {
    }

    public TrackSnippet(int i, int i2) {
        boolean z = true;
        AnonymousClass0a4.A0B(i >= 0, "start time must be 0 or positive");
        AnonymousClass0a4.A0B(i2 <= 0 ? false : z, "duration must be positive");
        this.A01 = i;
        this.A00 = i2;
    }

    public TrackSnippet(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }
}
