package com.instagram.business.insights.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import p000X.Constants;
import p000X.C7M;

public class InsightsChartFilterData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(264);
    public final Integer A00;
    public final String A01;
    public final ArrayList A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(C7M.A00(this.A00));
        parcel.writeList(this.A02);
    }

    public InsightsChartFilterData(Parcel parcel) {
        Integer num;
        this.A01 = parcel.readString();
        String readString = parcel.readString();
        if (readString.equals("ACCOUNT_CONTENT")) {
            num = Constants.ZERO;
        } else if (readString.equals("ACCOUNT_ACTIVITY")) {
            num = Constants.ONE;
        } else if (readString.equals("ACCOUNT_AUDIENCE")) {
            num = Constants.A0C;
        } else if (readString.equals("AGE_RANGE_ALL")) {
            num = Constants.A0N;
        } else if (readString.equals("AGE_RANGE_MEN")) {
            num = Constants.A0Y;
        } else if (readString.equals("AGE_RANGE_WOMEN")) {
            num = Constants.A0j;
        } else if (readString.equals("APPLY_BUTTON")) {
            num = Constants.A0u;
        } else if (readString.equals("CANCEL_BUTTON")) {
            num = Constants.A12;
        } else if (readString.equals("CREATE_POST")) {
            num = Constants.A14;
        } else if (readString.equals("CREATE_PROMOTION")) {
            num = Constants.A15;
        } else if (readString.equals("CREATE_STORY")) {
            num = Constants.A02;
        } else if (readString.equals("EDUCATION_VIEW_OPENER")) {
            num = Constants.A03;
        } else if (readString.equals("FOLLOWERS_HOURS")) {
            num = Constants.A04;
        } else if (readString.equals("FOLLOWERS_DAYS")) {
            num = Constants.A05;
        } else if (readString.equals("POST_GRID_ITEM")) {
            num = Constants.A06;
        } else if (readString.equals("POST_INSIGHTS_PEEK")) {
            num = Constants.A07;
        } else if (readString.equals("POST_INSIGHTS_PDP_OPENER")) {
            num = Constants.A08;
        } else if (readString.equals("SEE_MORE_BUTTON")) {
            num = Constants.A09;
        } else if (readString.equals("STORY_GRID_ITEM")) {
            num = Constants.A0A;
        } else if (readString.equals("SUMMARY")) {
            num = Constants.A0B;
        } else if (readString.equals("TOP_LOCATIONS_COUNTRIES")) {
            num = Constants.A0D;
        } else if (readString.equals("TOP_LOCATIONS_CITIES")) {
            num = Constants.A0E;
        } else if (readString.equals("CREATOR_LIST_ITEM")) {
            num = Constants.A0F;
        } else {
            throw new IllegalArgumentException(readString);
        }
        this.A00 = num;
        ArrayList arrayList = new ArrayList();
        this.A02 = arrayList;
        arrayList.addAll(parcel.readArrayList(DataPoint.class.getClassLoader()));
    }

    public InsightsChartFilterData(String str, Integer num, ArrayList arrayList) {
        this.A01 = str;
        this.A00 = num;
        this.A02 = arrayList;
    }
}
