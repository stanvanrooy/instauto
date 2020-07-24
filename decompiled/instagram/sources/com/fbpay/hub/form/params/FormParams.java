package com.fbpay.hub.form.params;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import com.fbpay.hub.form.cell.CellParams;
import com.fbpay.logging.FBPayLoggerData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import p000X.C26343Bjo;

public class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(117);
    public FormLogEvents A00;
    public FBPayLoggerData A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final ImmutableList A05;
    public final String A06;
    public final String A07;
    public final boolean A08;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeList(this.A05);
        parcel.writeInt(this.A03);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A00, i);
    }

    public FormParams(C26343Bjo bjo) {
        this.A02 = bjo.A04;
        this.A05 = bjo.A02;
        this.A04 = bjo.A06;
        this.A07 = bjo.A09;
        this.A06 = bjo.A08;
        this.A03 = bjo.A05;
        this.A08 = bjo.A03;
        this.A01 = bjo.A01;
        this.A00 = bjo.A00;
    }

    public FormParams(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A07 = parcel.readString();
        this.A06 = parcel.readString();
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, CellParams.class.getClassLoader());
        this.A05 = ImmutableList.A09(arrayList);
        this.A03 = parcel.readInt();
        this.A08 = parcel.readByte() != 0;
        this.A01 = (FBPayLoggerData) parcel.readParcelable(FBPayLoggerData.class.getClassLoader());
        this.A00 = (FormLogEvents) parcel.readParcelable(FormLogEvents.class.getClassLoader());
    }
}
