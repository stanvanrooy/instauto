package com.facebook.ads.internal.androidx.support.p025v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.internal.androidx.support.p043v4.view.AbsSavedState;
import p000X.C29288CvI;
import p000X.C30733DiM;

/* renamed from: com.facebook.ads.internal.androidx.support.v7.widget.RecyclerView$SavedState */
public class RecyclerView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C29288CvI();
    public Parcelable A00;

    public RecyclerView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readParcelable(classLoader == null ? C30733DiM.class.getClassLoader() : classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, 0);
    }
}
