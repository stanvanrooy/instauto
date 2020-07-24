package com.google.android.material.bottomnavigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class BottomNavigationPresenter$SavedState implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(246);
    public int A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
    }

    public BottomNavigationPresenter$SavedState() {
    }

    public BottomNavigationPresenter$SavedState(Parcel parcel) {
        this.A00 = parcel.readInt();
    }
}
