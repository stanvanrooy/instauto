package com.instagram.p009ui.text;

import android.graphics.drawable.GradientDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import com.instagram.common.util.gradient.TextModeGradientColors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p000X.C177387hp;
import p000X.C87063q7;

/* renamed from: com.instagram.ui.text.TextColorScheme */
public class TextColorScheme implements Parcelable {
    public static final TextColorScheme A06 = new TextColorScheme(new C87063q7());
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(85);
    public float A00;
    public int A01;
    public GradientDrawable.Orientation A02;
    public TextColors A03;
    public TextColors A04;
    public List A05;

    public final int describeContents() {
        return 0;
    }

    public static TextModeGradientColors A00(TextColorScheme textColorScheme) {
        ArrayList arrayList = new ArrayList(textColorScheme.A05);
        int i = C177387hp.A00[textColorScheme.A02.ordinal()];
        int i2 = 3;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            Collections.reverse(arrayList);
        }
        int[] iArr = C177387hp.A00;
        GradientDrawable.Orientation orientation = textColorScheme.A02;
        switch (iArr[orientation.ordinal()]) {
            case 1:
            case 5:
                i2 = 0;
                break;
            case 2:
            case 6:
                i2 = 1;
                break;
            case 3:
            case 7:
                break;
            case 4:
            case 8:
                i2 = 2;
                break;
            default:
                throw new IllegalStateException("Unknown drawable orientation " + orientation);
        }
        return new TextModeGradientColors(arrayList, i2);
    }

    public final TextColorScheme A01(int... iArr) {
        C87063q7 r3 = new C87063q7();
        TextColors textColors = this.A04;
        r3.A00(textColors.A00, textColors.A01);
        TextColors textColors2 = this.A03;
        r3.A03 = new TextColors(textColors2.A00, textColors2.A01);
        r3.A01 = this.A01;
        r3.A01(iArr);
        r3.A00 = this.A00;
        r3.A02 = this.A02;
        return new TextColorScheme(r3);
    }

    public final int[] A02() {
        int size = this.A05.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = ((Integer) this.A05.get(i)).intValue();
        }
        return iArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A05);
        parcel.writeFloat(this.A00);
        parcel.writeString(this.A02.name());
    }

    public TextColorScheme() {
    }

    public TextColorScheme(C87063q7 r2) {
        this.A04 = r2.A04;
        this.A03 = r2.A03;
        this.A01 = r2.A01;
        this.A05 = r2.A05;
        this.A00 = r2.A00;
        this.A02 = r2.A02;
    }

    public TextColorScheme(Parcel parcel) {
        Class<?> cls = getClass();
        this.A04 = (TextColors) parcel.readParcelable(cls.getClassLoader());
        this.A03 = (TextColors) parcel.readParcelable(cls.getClassLoader());
        this.A01 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.A05 = arrayList;
        parcel.readList(arrayList, cls.getClassLoader());
        this.A00 = parcel.readFloat();
        this.A02 = GradientDrawable.Orientation.valueOf(parcel.readString());
    }
}
