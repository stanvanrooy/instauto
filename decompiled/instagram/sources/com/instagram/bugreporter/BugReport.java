package com.instagram.bugreporter;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class BugReport implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(255);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final HashMap A09;

    public final int describeContents() {
        return 0;
    }

    public static void A00(BugReport bugReport) {
        Iterator it = bugReport.A07.iterator();
        while (it.hasNext()) {
            new File((String) it.next()).delete();
        }
        Iterator it2 = bugReport.A08.iterator();
        while (it2.hasNext()) {
            new File((String) it2.next()).delete();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A07);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A06);
        parcel.writeString(this.A00);
        parcel.writeString(this.A05);
        parcel.writeSerializable(this.A09);
        parcel.writeString(this.A04);
    }

    public BugReport(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A08 = parcel.createStringArrayList();
        this.A07 = parcel.createStringArrayList();
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A06 = parcel.readString();
        this.A00 = parcel.readString();
        this.A05 = parcel.readString();
        this.A09 = (HashMap) parcel.readSerializable();
        this.A04 = parcel.readString();
    }

    public BugReport(String str, ArrayList arrayList, ArrayList arrayList2, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, String str7) {
        this.A03 = str;
        this.A08 = arrayList;
        this.A07 = arrayList2;
        this.A01 = str2;
        this.A02 = str3;
        this.A06 = str4;
        this.A00 = str5;
        this.A05 = str6;
        this.A09 = hashMap;
        this.A04 = str7;
    }
}
