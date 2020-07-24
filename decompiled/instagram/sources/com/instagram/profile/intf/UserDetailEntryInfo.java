package com.instagram.profile.intf;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.List;
import p000X.C28798Cmu;

public class UserDetailEntryInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(448);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public List A0B;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeString(this.A08);
        parcel.writeStringList(this.A0B);
        parcel.writeString(this.A09);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A0A);
    }

    public UserDetailEntryInfo(C28798Cmu cmu) {
        this.A04 = cmu.A04;
        this.A05 = cmu.A05;
        this.A03 = cmu.A03;
        this.A06 = cmu.A06;
        this.A07 = cmu.A07;
        this.A02 = cmu.A02;
        this.A08 = cmu.A08;
        this.A0B = cmu.A0B;
        this.A09 = cmu.A09;
        this.A01 = cmu.A01;
        this.A00 = cmu.A00;
        this.A0A = cmu.A0A;
    }

    public UserDetailEntryInfo(Parcel parcel) {
        this.A04 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        this.A08 = parcel.readString();
        if (this.A0B == null) {
            this.A0B = new ArrayList();
        }
        parcel.readStringList(this.A0B);
        this.A09 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A0A = parcel.readString();
    }
}
