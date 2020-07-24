package com.instagram.business.insights.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class GrowthDataPoint implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(263);
    public int A00;
    public int A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public GrowthDataPoint() {
    }

    public GrowthDataPoint(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
    }

    public GrowthDataPoint(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }
}
