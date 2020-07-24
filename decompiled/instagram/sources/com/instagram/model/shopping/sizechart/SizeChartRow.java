package com.instagram.model.shopping.sizechart;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0a4;

public class SizeChartRow implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(425);
    public String A00;
    public List A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeTypedList(this.A01);
    }

    public SizeChartRow() {
    }

    public SizeChartRow(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass0a4.A06(readString);
        this.A00 = readString;
        ArrayList createTypedArrayList = parcel.createTypedArrayList(SizeChartMeasurement.CREATOR);
        AnonymousClass0a4.A06(createTypedArrayList);
        this.A01 = createTypedArrayList;
    }
}
