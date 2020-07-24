package com.facebook.location.signalpackage.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C229089wh;

public class ParcelableDetectedActivity extends C229089wh implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(80);

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C229089wh)) {
            C229089wh r5 = (C229089wh) obj;
            return this.A01 == r5.A01 && this.A00 == r5.A00;
        }
        return false;
    }

    public final int hashCode() {
        return (this.A01 * 31) + this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public ParcelableDetectedActivity(int i, int i2) {
        super(i, i2);
    }
}
