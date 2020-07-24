package com.instagram.explore.topiccluster;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape0S0000000_I0;
import p000X.AnonymousClass1NJ;
import p000X.C40181oE;

public class ExploreTopicCluster implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape0S0000000_I0(38);
    public int A00;
    public C40181oE A01;
    public AnonymousClass1NJ A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A04);
        parcel.writeSerializable(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
    }

    public ExploreTopicCluster() {
    }

    public ExploreTopicCluster(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = (C40181oE) parcel.readSerializable();
        this.A00 = parcel.readInt();
        boolean z = false;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1 ? true : z;
    }

    public ExploreTopicCluster(String str, String str2, String str3, C40181oE r4) {
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A01 = r4;
    }
}
