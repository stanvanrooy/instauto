package com.instagram.shopping.model.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C13150hy;

public final class ShoppingExploreLoggingInfo implements Parcelable {
    public static final PCreatorEBaseShape1S0000000_I1 CREATOR = new PCreatorEBaseShape1S0000000_I1(463);
    public final Long A00;
    public final Long A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShoppingExploreLoggingInfo)) {
            return false;
        }
        ShoppingExploreLoggingInfo shoppingExploreLoggingInfo = (ShoppingExploreLoggingInfo) obj;
        return C13150hy.A05(this.A04, shoppingExploreLoggingInfo.A04) && C13150hy.A05(this.A01, shoppingExploreLoggingInfo.A01) && C13150hy.A05(this.A05, shoppingExploreLoggingInfo.A05) && C13150hy.A05(this.A06, shoppingExploreLoggingInfo.A06) && C13150hy.A05(this.A07, shoppingExploreLoggingInfo.A07) && C13150hy.A05(this.A03, shoppingExploreLoggingInfo.A03) && C13150hy.A05(this.A02, shoppingExploreLoggingInfo.A02) && C13150hy.A05(this.A00, shoppingExploreLoggingInfo.A00);
    }

    public final int hashCode() {
        String str = this.A04;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.A01;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        String str2 = this.A05;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A06;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.A07;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.A03;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.A02;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Long l2 = this.A00;
        if (l2 != null) {
            i = l2.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "ShoppingExploreLoggingInfo(sessionId=" + this.A04 + ", surfaceCategoryId=" + this.A01 + ", topicClusterId=" + this.A05 + ", topicClusterTitle=" + this.A06 + ", topicClusterType=" + this.A07 + ", parentMPk=" + this.A03 + ", chainingSessionId=" + this.A02 + ", chainingPosition=" + this.A00 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C13150hy.A02(parcel, "parcel");
        parcel.writeString(this.A04);
        parcel.writeValue(this.A01);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeValue(this.A00);
    }

    public ShoppingExploreLoggingInfo(String str, Long l, String str2, String str3, String str4, String str5, String str6, Long l2) {
        this.A04 = str;
        this.A01 = l;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A02 = str6;
        this.A00 = l2;
    }
}
