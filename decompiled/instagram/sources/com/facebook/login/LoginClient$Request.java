package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LoginClient$Request implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(82);
    public String A00 = null;
    public String A01 = null;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Set A05;
    public final boolean A06;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(new ArrayList(this.A05));
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A06 ? (byte) 1 : 0);
        parcel.writeString(this.A04);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    public LoginClient$Request(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        parcel.readStringList(arrayList);
        this.A05 = new HashSet(arrayList);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A06 = parcel.readByte() != 0;
        this.A04 = parcel.readString();
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public LoginClient$Request(Set set, String str, String str2, boolean z, String str3) {
        this.A05 = set == null ? new HashSet() : set;
        this.A02 = str;
        this.A03 = str2;
        this.A06 = z;
        this.A04 = str3;
    }
}
