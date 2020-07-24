package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.C25948Bd0;

public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(141);
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
            if (this.A02 != chapterTocFrame.A02 || this.A01 != chapterTocFrame.A01 || !C25948Bd0.A0D(this.A00, chapterTocFrame.A00) || !Arrays.equals(this.A03, chapterTocFrame.A03) || !Arrays.equals(this.A04, chapterTocFrame.A04)) {
                return false;
            }
        }
        return true;
    }

    public ChapterTocFrame(Parcel parcel) {
        super("CTOC");
        this.A00 = parcel.readString();
        boolean z = true;
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() == 0 ? false : z;
        this.A03 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.A04 = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A04[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = (((true + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31;
        String str = this.A00;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(this.A04.length);
        for (Id3Frame writeParcelable : this.A04) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
