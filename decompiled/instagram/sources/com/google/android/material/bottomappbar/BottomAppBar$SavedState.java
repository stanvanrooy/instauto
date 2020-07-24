package com.google.android.material.bottomappbar;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import p000X.C30626DgQ;

public class BottomAppBar$SavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new C30626DgQ();
    public int A00;
    public boolean A01;

    public BottomAppBar$SavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt() != 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01 ? 1 : 0);
    }
}
