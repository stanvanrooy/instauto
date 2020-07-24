package com.instagram.business.insights.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;

public class DaysHourlyFollowersData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(261);
    public String A00;
    public ArrayList A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }

    public DaysHourlyFollowersData() {
    }

    public DaysHourlyFollowersData(Parcel parcel) {
        this.A00 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.A01 = arrayList;
        arrayList.addAll(parcel.readArrayList(DataPoint.class.getClassLoader()));
    }

    public DaysHourlyFollowersData(String str, ArrayList arrayList) {
        this.A00 = str;
        this.A01 = arrayList;
    }
}
