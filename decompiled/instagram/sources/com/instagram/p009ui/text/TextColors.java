package com.instagram.p009ui.text;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;

/* renamed from: com.instagram.ui.text.TextColors */
public class TextColors implements Parcelable {
    public static final TextColors A02;
    public static final TextColors A03;
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(86);
    public int A00;
    public TextShadow A01;

    public final int describeContents() {
        return 0;
    }

    static {
        TextShadow textShadow = TextShadow.A03;
        A02 = new TextColors(-1, textShadow);
        A03 = new TextColors(Integer.MAX_VALUE, textShadow);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }

    public TextColors() {
    }

    public TextColors(int i, TextShadow textShadow) {
        this.A00 = i;
        this.A01 = textShadow;
    }

    public TextColors(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = (TextShadow) parcel.readParcelable(getClass().getClassLoader());
    }
}
