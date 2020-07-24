package com.instagram.model.shopping.sizechart;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;
import p000X.AnonymousClass0a4;

public class SizeChart implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(423);
    public String A00;
    public List A01;
    public List A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A01);
        parcel.writeTypedList(this.A02);
        parcel.writeString(this.A00);
    }

    public SizeChart() {
    }

    public SizeChart(Parcel parcel) {
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        AnonymousClass0a4.A06(createStringArrayList);
        this.A01 = createStringArrayList;
        ArrayList createTypedArrayList = parcel.createTypedArrayList(SizeChartRow.CREATOR);
        AnonymousClass0a4.A06(createTypedArrayList);
        this.A02 = createTypedArrayList;
        this.A00 = parcel.readString();
    }
}
