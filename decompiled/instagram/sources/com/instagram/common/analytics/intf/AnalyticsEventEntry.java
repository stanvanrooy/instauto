package com.instagram.common.analytics.intf;

import android.os.Parcel;
import android.os.Parcelable;
import p000X.C06940Rc;

public class AnalyticsEventEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C06940Rc();
    public AnalyticsEventDebugInfo A00;
    public Object A01;
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeValue(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public AnalyticsEventEntry(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A01 = parcel.readValue(Object.class.getClassLoader());
        this.A00 = (AnalyticsEventDebugInfo) parcel.readParcelable(AnalyticsEventDebugInfo.class.getClassLoader());
    }

    public AnalyticsEventEntry(String str, AnalyticsEventDebugInfo analyticsEventDebugInfo) {
        this.A02 = str;
        this.A00 = analyticsEventDebugInfo;
    }

    public AnalyticsEventEntry(String str, Object obj) {
        this.A02 = str;
        this.A01 = obj;
    }
}
