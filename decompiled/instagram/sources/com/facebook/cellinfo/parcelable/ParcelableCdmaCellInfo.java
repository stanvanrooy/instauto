package com.facebook.cellinfo.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C229039wb;

public class ParcelableCdmaCellInfo extends C229039wb implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(42);

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeValue(this.A03);
        parcel.writeValue(this.A04);
    }

    public ParcelableCdmaCellInfo(int i, int i2, int i3, Double d, Double d2) {
        super(i, i2, i3, d, d2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public ParcelableCdmaCellInfo(Parcel parcel) {
        super(parcel.readInt(), parcel.readInt(), parcel.readInt(), (Double) parcel.readValue(r1.getClassLoader()), (Double) parcel.readValue(r1.getClassLoader()));
        Class<Double> cls = Double.class;
    }
}
