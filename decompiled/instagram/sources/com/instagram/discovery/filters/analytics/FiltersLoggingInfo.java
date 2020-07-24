package com.instagram.discovery.filters.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.google.common.collect.ImmutableMap;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.shopping.Merchant;
import java.util.HashMap;
import java.util.Map;
import p000X.AnonymousClass9YL;

public class FiltersLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(322);
    public AnonymousClass9YL A00;
    public ExploreTopicCluster A01;
    public String A02;
    public HashMap A03;
    public final Merchant A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final String A00() {
        HashMap hashMap = this.A03;
        if (hashMap != null) {
            return (String) hashMap.get("sort_by");
        }
        return null;
    }

    public final Map A01() {
        HashMap hashMap = this.A03;
        if (hashMap == null) {
            return new HashMap();
        }
        HashMap hashMap2 = new HashMap(hashMap);
        hashMap2.remove("sort_by");
        return hashMap2;
    }

    public final Map A02() {
        Map hashMap;
        HashMap hashMap2 = this.A03;
        if (hashMap2 != null) {
            hashMap = ImmutableMap.A01(hashMap2);
        } else {
            hashMap = new HashMap();
        }
        return hashMap;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A04, i);
        parcel.writeSerializable(this.A00);
        parcel.writeString(this.A06);
        parcel.writeSerializable(this.A03);
    }

    public FiltersLoggingInfo(Parcel parcel) {
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
        this.A04 = (Merchant) parcel.readParcelable(Merchant.class.getClassLoader());
        this.A00 = (AnonymousClass9YL) parcel.readSerializable();
        this.A06 = parcel.readString();
        this.A03 = (HashMap) parcel.readSerializable();
    }

    public FiltersLoggingInfo(String str, String str2, Merchant merchant, String str3, ExploreTopicCluster exploreTopicCluster, String str4) {
        this.A07 = str;
        this.A05 = str2;
        this.A04 = merchant;
        this.A06 = str3;
        this.A01 = exploreTopicCluster;
        this.A02 = str4;
    }
}
