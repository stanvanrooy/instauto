package com.instagram.p009ui.text;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C0003R;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.C25913Bc3;

/* renamed from: com.instagram.ui.text.TextShadow */
public class TextShadow implements Parcelable {
    public static final TextShadow A03 = new TextShadow(0, C0003R.dimen.text_format_shadow_distance_default, C0003R.dimen.text_format_shadow_radius_default);
    public static final TextShadow A04 = new TextShadow(C25913Bc3.MAX_SIGNED_POWER_OF_TWO, C0003R.dimen.text_format_shadow_distance_default, C0003R.dimen.text_format_shadow_radius_default);
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(87);
    public int A00;
    public int A01;
    public int A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
    }

    public final float A00(Context context) {
        return Math.min((float) context.getResources().getDimensionPixelSize(this.A02), 25.0f);
    }

    public TextShadow() {
    }

    public TextShadow(int i, int i2, int i3) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public TextShadow(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
    }
}
