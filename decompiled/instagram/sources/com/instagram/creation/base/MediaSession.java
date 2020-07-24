package com.instagram.creation.base;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.Constants;

public class MediaSession implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(291);
    public PhotoSession A00;
    public VideoSession A01;
    public Integer A02;

    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        if (this.A02 == Constants.ZERO) {
            return this.A00.A07;
        }
        return this.A01.A0B;
    }

    public final String A01() {
        if (this.A02 == Constants.ZERO) {
            return this.A00.A06;
        }
        return this.A01.A0A;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02.intValue());
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
    }

    public MediaSession(Parcel parcel) {
        this.A02 = Constants.ZERO(2)[parcel.readInt()];
        this.A00 = (PhotoSession) parcel.readParcelable(PhotoSession.class.getClassLoader());
        this.A01 = (VideoSession) parcel.readParcelable(VideoSession.class.getClassLoader());
    }

    public MediaSession(PhotoSession photoSession) {
        this.A00 = photoSession;
        this.A02 = Constants.ZERO;
    }

    public MediaSession(VideoSession videoSession) {
        this.A01 = videoSession;
        this.A02 = Constants.ONE;
    }
}
