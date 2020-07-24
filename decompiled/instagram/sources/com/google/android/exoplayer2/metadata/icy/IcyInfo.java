package com.google.android.exoplayer2.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.android.exoplayer2.metadata.Metadata;
import p000X.C25948Bd0;
import p000X.D6U;

public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(137);
    public final String A00;
    public final String A01;
    public final String A02;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata=\"%s\"", new Object[]{this.A01, this.A02, this.A00});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C25948Bd0.A0D(this.A00, ((IcyInfo) obj).A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }

    public IcyInfo(Parcel parcel) {
        String readString = parcel.readString();
        D6U.A01(readString);
        this.A00 = readString;
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
