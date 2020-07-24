package com.google.android.material.bottomnavigation;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p000X.C30627DgR;

public class BottomNavigationView$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C30627DgR();
    public Bundle A00;

    public BottomNavigationView$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readBundle(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeBundle(this.A00);
    }
}
