package com.instagram.payments.checkout.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.List;
import p000X.C1666979o;

public class ConnectFlowBottomSheetContentParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(442);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
        parcel.writeString(this.A07);
        parcel.writeString(this.A02);
        parcel.writeList((List) null);
    }

    public ConnectFlowBottomSheetContentParams(C1666979o r2) {
        this.A06 = r2.A07;
        this.A05 = r2.A06;
        this.A03 = r2.A04;
        this.A04 = r2.A05;
        this.A01 = r2.A02;
        this.A00 = r2.A01;
        this.A07 = r2.A00;
        this.A02 = r2.A03;
    }

    public ConnectFlowBottomSheetContentParams(Parcel parcel) {
        this.A06 = parcel.readString();
        this.A05 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A07 = parcel.readString();
        this.A02 = parcel.readString();
        parcel.readList((List) null, String.class.getClassLoader());
    }
}
