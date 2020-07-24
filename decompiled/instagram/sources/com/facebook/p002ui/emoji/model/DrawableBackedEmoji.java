package com.facebook.p002ui.emoji.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

/* renamed from: com.facebook.ui.emoji.model.DrawableBackedEmoji */
public class DrawableBackedEmoji extends Emoji {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(88);
    public final int A00;
    public final String A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DrawableBackedEmoji)) {
            return false;
        }
        DrawableBackedEmoji drawableBackedEmoji = (DrawableBackedEmoji) obj;
        return this.A00 == drawableBackedEmoji.A00 && this.A01.equals(drawableBackedEmoji.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public DrawableBackedEmoji(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }

    public final String A00() {
        return this.A01;
    }
}
