package com.instagram.leadads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class LeadAdsDisclaimerResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(344);
    public String A00;
    public boolean A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A01 ? (byte) 1 : 0);
    }

    public LeadAdsDisclaimerResponse() {
    }

    public LeadAdsDisclaimerResponse(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readByte() != 0;
    }

    public LeadAdsDisclaimerResponse(String str, boolean z) {
        this.A00 = str;
        this.A01 = z;
    }
}
