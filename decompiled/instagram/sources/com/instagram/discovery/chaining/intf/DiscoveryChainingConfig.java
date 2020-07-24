package com.instagram.discovery.chaining.intf;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.instagram.discovery.chaining.model.DiscoveryChainingItem;
import com.instagram.explore.topiccluster.ExploreTopicCluster;
import com.instagram.model.direct.DirectShareTarget;
import java.util.HashMap;
import p000X.AnonymousClass11J;
import p000X.C939844r;

public class DiscoveryChainingConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(320);
    public final Bundle A00;
    public final DiscoveryChainingItem A01;
    public final ExploreTopicCluster A02;
    public final DirectShareTarget A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A0D ? (byte) 1 : 0);
        parcel.writeByte(this.A0E ? (byte) 1 : 0);
        parcel.writeBundle(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A08);
        parcel.writeMap(this.A09);
        parcel.writeMap(this.A0A);
    }

    public DiscoveryChainingConfig(C939844r r2) {
        DiscoveryChainingItem discoveryChainingItem = r2.A01;
        AnonymousClass11J.A00(discoveryChainingItem);
        this.A01 = discoveryChainingItem;
        String str = r2.A04;
        AnonymousClass11J.A00(str);
        this.A04 = str;
        String str2 = r2.A05;
        AnonymousClass11J.A00(str2);
        this.A05 = str2;
        String str3 = r2.A07;
        AnonymousClass11J.A00(str3);
        this.A07 = str3;
        String str4 = r2.A06;
        AnonymousClass11J.A00(str4);
        this.A06 = str4;
        this.A02 = r2.A02;
        this.A0C = r2.A0C;
        this.A0B = r2.A0B;
        this.A0D = r2.A0D;
        this.A0E = false;
        this.A0A = r2.A0A;
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A08 = r2.A08;
        this.A09 = r2.A09;
    }

    public DiscoveryChainingConfig(Parcel parcel) {
        this.A01 = (DiscoveryChainingItem) parcel.readParcelable(DiscoveryChainingItem.class.getClassLoader());
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A02 = (ExploreTopicCluster) parcel.readParcelable(ExploreTopicCluster.class.getClassLoader());
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        boolean z = true;
        this.A0C = parcel.readByte() != 0;
        this.A0B = parcel.readByte() != 0;
        this.A0D = parcel.readByte() != 0;
        this.A0E = parcel.readByte() == 0 ? false : z;
        this.A00 = parcel.readBundle();
        this.A03 = (DirectShareTarget) parcel.readParcelable(DirectShareTarget.class.getClassLoader());
        this.A08 = parcel.readString();
        this.A09 = parcel.readHashMap((ClassLoader) null);
        this.A0A = parcel.readHashMap((ClassLoader) null);
    }
}
