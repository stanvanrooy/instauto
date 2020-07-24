package com.instagram.save.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.AnonymousClass1NJ;
import p000X.C06270Ok;
import p000X.C30541Ug;

public class SaveToCollectionsParentInsightsHost implements C30541Ug, Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(453);
    public final C06270Ok A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;

    public final int describeContents() {
        return 0;
    }

    public final C06270Ok BYN() {
        C06270Ok r0 = this.A00;
        if (r0 == null) {
            return C06270Ok.A00();
        }
        return r0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A02 ? (byte) 1 : 0);
    }

    public SaveToCollectionsParentInsightsHost(String str, boolean z, boolean z2, C06270Ok r4) {
        this.A01 = str;
        this.A03 = z;
        this.A02 = z2;
        this.A00 = r4;
    }

    public final boolean Ago() {
        return this.A02;
    }

    public final boolean Ahq() {
        return this.A03;
    }

    public final C06270Ok BYO(AnonymousClass1NJ r2) {
        return BYN();
    }

    public final String getModuleName() {
        return this.A01;
    }
}
