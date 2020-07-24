package com.instagram.business.insights.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;

public class FollowersGrowthData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(262);
    public int A00;
    public String A01;
    public ArrayList A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A02);
    }

    public FollowersGrowthData() {
    }

    public FollowersGrowthData(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A00 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.addAll(parcel.readArrayList(DataPoint.class.getClassLoader()));
    }

    public FollowersGrowthData(String str, int i, ArrayList arrayList) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = arrayList;
    }
}
