package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass000;
import p000X.C25948Bd0;

public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(147);
    public final String A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (!this.A00.equals(textInformationFrame.A00) || !C25948Bd0.A0D(this.A00, textInformationFrame.A00) || !C25948Bd0.A0D(this.A01, textInformationFrame.A01)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = (527 + this.A00.hashCode()) * 31;
        String str = this.A00;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        String str2 = this.A01;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return AnonymousClass000.A0O(this.A00, ": description=", this.A00, ": value=", this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public TextInformationFrame(String str, String str2) {
        super(str);
        this.A00 = null;
        this.A01 = str2;
    }
}
