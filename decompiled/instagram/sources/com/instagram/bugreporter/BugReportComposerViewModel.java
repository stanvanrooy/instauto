package com.instagram.bugreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;

public class BugReportComposerViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(256);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A00);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
    }

    public BugReportComposerViewModel(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A00 = parcel.readString();
        boolean z = true;
        this.A03 = parcel.readByte() != 0;
        this.A04 = parcel.readByte() == 0 ? false : z;
    }

    public BugReportComposerViewModel(String str, String str2, String str3, boolean z, boolean z2) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
        this.A03 = z;
        this.A04 = z2;
    }
}
