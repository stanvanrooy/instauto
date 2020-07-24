package com.instagram.model.shopping.sizechart;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass0a4;

public class SizeChartMeasurement implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(424);
    public Integer A00;
    public Integer A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        if (this.A00 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.A00.intValue());
        }
        if (this.A01 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(this.A01.intValue());
        }
        parcel.writeString(this.A03);
    }

    public SizeChartMeasurement() {
    }

    public SizeChartMeasurement(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass0a4.A06(readString);
        this.A02 = readString;
        if (parcel.readByte() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Integer.valueOf(parcel.readInt());
        }
        this.A03 = parcel.readString();
    }
}
