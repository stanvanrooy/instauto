package com.instagram.creation.base;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.AnonymousClass000;

public class CropInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(29);
    public int A00;
    public int A01;
    public Rect A02;

    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return AnonymousClass000.A0E(String.format("CropInfo: Original dims : %d x %d\t", new Object[]{Integer.valueOf(this.A01), Integer.valueOf(this.A00)}), this.A02.toString());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A02, i);
    }

    public CropInfo(int i, int i2, Rect rect) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = rect;
    }

    public CropInfo(Parcel parcel) {
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = (Rect) parcel.readParcelable(Rect.class.getClassLoader());
    }
}
