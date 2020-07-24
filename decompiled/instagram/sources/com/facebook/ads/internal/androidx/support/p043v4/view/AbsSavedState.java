package com.facebook.ads.internal.androidx.support.p043v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import p000X.C29287CvE;

/* renamed from: com.facebook.ads.internal.androidx.support.v4.view.AbsSavedState */
public abstract class AbsSavedState implements Parcelable {
    public static final AbsSavedState A01 = new AbsSavedState() {
    };
    public static final Parcelable.Creator CREATOR = new C29287CvE();
    public final Parcelable A00;

    public final int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A00, i);
    }

    public AbsSavedState() {
        this.A00 = null;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.A00 = readParcelable == null ? A01 : readParcelable;
    }
}
