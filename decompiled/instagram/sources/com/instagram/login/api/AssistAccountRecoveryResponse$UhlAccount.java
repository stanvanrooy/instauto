package com.instagram.login.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class AssistAccountRecoveryResponse$UhlAccount implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(349);
    public String A00;
    public String A01;
    public String A02;
    public String A03;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }

    public AssistAccountRecoveryResponse$UhlAccount() {
    }

    public AssistAccountRecoveryResponse$UhlAccount(Parcel parcel) {
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
    }
}
