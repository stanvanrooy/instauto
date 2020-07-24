package com.instagram.creation.photo.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.HashMap;
import java.util.Map;

public class ExifImageData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(313);
    public int A00;
    public Double A01;
    public Double A02;
    public HashMap A03 = new HashMap();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        double doubleValue;
        Double d = this.A01;
        double d2 = 200.0d;
        if (d == null) {
            doubleValue = 200.0d;
        } else {
            doubleValue = d.doubleValue();
        }
        parcel.writeDouble(doubleValue);
        Double d3 = this.A02;
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        parcel.writeDouble(d2);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03.size());
        for (Map.Entry entry : this.A03.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public ExifImageData() {
    }

    public ExifImageData(Parcel parcel) {
        Double valueOf;
        double readDouble = parcel.readDouble();
        Double d = null;
        if (readDouble > 180.0d) {
            valueOf = null;
        } else {
            valueOf = Double.valueOf(readDouble);
        }
        this.A01 = valueOf;
        double readDouble2 = parcel.readDouble();
        this.A02 = readDouble2 <= 180.0d ? Double.valueOf(readDouble2) : d;
        this.A00 = parcel.readInt();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            this.A03.put(parcel.readString(), parcel.readString());
        }
    }
}
