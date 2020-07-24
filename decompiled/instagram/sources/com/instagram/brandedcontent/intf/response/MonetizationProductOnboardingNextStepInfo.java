package com.instagram.brandedcontent.intf.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class MonetizationProductOnboardingNextStepInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(254);
    public int A00;
    public String A01;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
    }

    public MonetizationProductOnboardingNextStepInfo() {
    }

    public MonetizationProductOnboardingNextStepInfo(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
    }
}
