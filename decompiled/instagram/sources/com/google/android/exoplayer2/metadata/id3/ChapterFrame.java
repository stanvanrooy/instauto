package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import p000X.C25948Bd0;

public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(140);
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ChapterFrame chapterFrame = (ChapterFrame) obj;
            if (!(this.A01 == chapterFrame.A01 && this.A00 == chapterFrame.A00 && this.A03 == chapterFrame.A03 && this.A02 == chapterFrame.A02 && C25948Bd0.A0D(this.A04, chapterFrame.A04) && Arrays.equals(this.A05, chapterFrame.A05))) {
                return false;
            }
        }
        return true;
    }

    public ChapterFrame(Parcel parcel) {
        super("CHAP");
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new Id3Frame[readInt];
        for (int i = 0; i < readInt; i++) {
            this.A05[i] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final int hashCode() {
        int i;
        int i2 = (((((((527 + this.A01) * 31) + this.A00) * 31) + ((int) this.A03)) * 31) + ((int) this.A02)) * 31;
        String str = this.A04;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return i2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        for (Id3Frame writeParcelable : this.A05) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }
}
