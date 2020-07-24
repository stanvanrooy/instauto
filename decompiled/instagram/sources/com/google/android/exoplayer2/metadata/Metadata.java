package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.Arrays;
import java.util.List;
import p000X.AnonymousClass000;

public final class Metadata implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(132);
    public final Entry[] A00;

    public interface Entry extends Parcelable {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.A00, ((Metadata) obj).A00);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.A00);
    }

    public final String toString() {
        return AnonymousClass000.A0E("entries=", Arrays.toString(this.A00));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.length);
        for (Entry writeParcelable : this.A00) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public Metadata(Parcel parcel) {
        this.A00 = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.A00;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public Metadata(List list) {
        Entry[] entryArr = new Entry[list.size()];
        this.A00 = entryArr;
        list.toArray(entryArr);
    }

    public Metadata(Entry... entryArr) {
        this.A00 = entryArr;
    }
}
