package com.instagram.partnerprogram.intf.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class PartnerProgramOnboardingNextStepInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(438);
    public int A00;
    public String A01 = "incomplete";
    public String A02;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
    }

    public PartnerProgramOnboardingNextStepInfo() {
    }

    public PartnerProgramOnboardingNextStepInfo(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
    }
}
