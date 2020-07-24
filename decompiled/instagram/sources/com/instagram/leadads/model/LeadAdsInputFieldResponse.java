package com.instagram.leadads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import p000X.C478025l;

public class LeadAdsInputFieldResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(345);
    public String A00;
    public C478025l A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A01.ordinal());
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
    }

    public LeadAdsInputFieldResponse() {
    }

    public LeadAdsInputFieldResponse(C478025l r1, String str, String str2, String str3) {
        this.A01 = r1;
        this.A00 = str;
        this.A03 = str2;
        this.A02 = str3;
    }

    public LeadAdsInputFieldResponse(Parcel parcel) {
        this.A01 = C478025l.values()[parcel.readInt()];
        this.A00 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
    }
}
