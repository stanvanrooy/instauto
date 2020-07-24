package com.instagram.creation.capture.quickcapture.analytics;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p000X.C184267u9;

public class ShareMediaLoggingInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(297);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Integer A04;
    public Integer A05;
    public Integer A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public HashMap A0B;
    public HashMap A0C;
    public List A0D;
    public List A0E;
    public List A0F;
    public List A0G;
    public List A0H;

    public final int describeContents() {
        return 0;
    }

    public static Bundle A00(Map map) {
        Bundle bundle = new Bundle(map.size());
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static LinkedHashMap A01(Bundle bundle) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(bundle.size());
        for (String str : bundle.keySet()) {
            linkedHashMap.put(str, bundle.getString(str));
        }
        return linkedHashMap;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeStringList(this.A0E);
        parcel.writeStringList(this.A0F);
        parcel.writeStringList(this.A0D);
        parcel.writeBundle(A00(this.A0B));
        parcel.writeString(this.A09);
        parcel.writeBundle(A00(this.A0C));
        parcel.writeStringList(this.A0G);
        parcel.writeStringList(this.A0H);
        parcel.writeString(this.A08);
        parcel.writeString(this.A07);
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A05.intValue());
        parcel.writeInt(this.A06.intValue());
    }

    public ShareMediaLoggingInfo() {
    }

    public ShareMediaLoggingInfo(C184267u9 r2) {
        this.A03 = r2.A03;
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A02 = r2.A02;
        this.A0E = r2.A0E;
        this.A0F = r2.A0F;
        this.A0D = r2.A0D;
        this.A0B = A01(r2.A04);
        this.A09 = r2.A0A;
        this.A0C = r2.A0C;
        this.A0G = r2.A0G;
        this.A0H = r2.A0H;
        this.A08 = r2.A09;
        this.A07 = r2.A08;
        this.A04 = r2.A05;
        this.A0A = r2.A0B;
        this.A05 = r2.A06;
        this.A06 = r2.A07;
    }

    public ShareMediaLoggingInfo(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A02 = parcel.readInt();
        ArrayList arrayList = new ArrayList();
        this.A0E = arrayList;
        parcel.readStringList(arrayList);
        ArrayList arrayList2 = new ArrayList();
        this.A0F = arrayList2;
        parcel.readStringList(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        this.A0D = arrayList3;
        parcel.readStringList(arrayList3);
        Class<?> cls = getClass();
        this.A0B = A01(parcel.readBundle(cls.getClassLoader()));
        this.A09 = parcel.readString();
        this.A0C = A01(parcel.readBundle(cls.getClassLoader()));
        ArrayList arrayList4 = new ArrayList();
        this.A0G = arrayList4;
        parcel.readStringList(arrayList4);
        ArrayList arrayList5 = new ArrayList();
        this.A0H = arrayList5;
        parcel.readStringList(arrayList5);
        this.A08 = parcel.readString();
        this.A07 = parcel.readString();
        this.A04 = (Integer) parcel.readSerializable();
        this.A0A = parcel.readString();
        this.A05 = Integer.valueOf(parcel.readInt());
        this.A06 = Integer.valueOf(parcel.readInt());
    }
}
