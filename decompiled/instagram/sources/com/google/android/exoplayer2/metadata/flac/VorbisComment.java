package com.google.android.exoplayer2.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.metadata.Metadata;
import p000X.AnonymousClass000;

public final class VorbisComment implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(135);
    public final String A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VorbisComment vorbisComment = (VorbisComment) obj;
            if (!this.A00.equals(vorbisComment.A00) || !this.A01.equals(vorbisComment.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.A00.hashCode()) * 31) + this.A01.hashCode();
    }

    public final String toString() {
        return AnonymousClass000.A0N("VC: ", this.A00, "=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public VorbisComment(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
