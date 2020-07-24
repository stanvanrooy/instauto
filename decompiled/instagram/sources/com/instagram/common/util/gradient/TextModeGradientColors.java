package com.instagram.common.util.gradient;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000X.C06000Ni;

public class TextModeGradientColors implements Parcelable {
    public static final List A02 = new ArrayList(Arrays.asList(new Integer[]{-16777216, -16777216}));
    public static final Parcelable.Creator CREATOR = new C06000Ni();
    public int A00;
    public ArrayList A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00);
    }

    public TextModeGradientColors() {
        this.A01 = new ArrayList();
    }

    public TextModeGradientColors(Parcel parcel) {
        this.A01 = new ArrayList();
        this.A01 = parcel.readArrayList(Integer.class.getClassLoader());
        this.A00 = parcel.readInt();
    }

    public TextModeGradientColors(List list, int i) {
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        arrayList.addAll(list);
        this.A00 = i;
    }
}
