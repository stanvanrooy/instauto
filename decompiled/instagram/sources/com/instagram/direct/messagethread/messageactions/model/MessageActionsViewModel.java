package com.instagram.direct.messagethread.messageactions.model;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.C0003R;
import com.facebook.redex.PCreatorEBaseShape1S0000000_I1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p000X.C58022fB;
import p000X.C73893Ls;

public class MessageActionsViewModel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new PCreatorEBaseShape1S0000000_I1(316);
    public final long A00;
    public final PointF A01;
    public final C58022fB A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final List A08;
    public final boolean A09;

    public final int describeContents() {
        return 0;
    }

    public static MessageActionsViewModel A00(Context context, String str, String str2, long j, List list, boolean z, C58022fB r26, PointF pointF, String str3, boolean z2) {
        long j2 = j;
        long millis = TimeUnit.MICROSECONDS.toMillis(j2);
        List list2 = list;
        String str4 = str2;
        String str5 = str3;
        boolean z3 = z2;
        PointF pointF2 = pointF;
        String str6 = str;
        Context context2 = context;
        C58022fB r14 = r26;
        if (!z || list2.size() <= 3) {
            return new MessageActionsViewModel(str6, str4, list2, Collections.emptyList(), C73893Ls.A00(context2, Long.valueOf(j2)), millis, r26, pointF, str3, z2);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list2.subList(0, 2));
        arrayList.add(context2.getString(C0003R.string.more));
        return new MessageActionsViewModel(str6, str4, arrayList, list2.subList(2, list2.size()), C73893Ls.A00(context2, Long.valueOf(j2)), millis, r14, pointF2, str5, z3);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05);
        parcel.writeList(this.A07);
        parcel.writeList(this.A08);
        parcel.writeString(this.A06);
        parcel.writeLong(this.A00);
        parcel.writeInt(this.A02.ordinal());
        parcel.writeString(this.A04);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
    }

    public MessageActionsViewModel(Parcel parcel) {
        this.A05 = parcel.readString();
        Class<String> cls = String.class;
        this.A07 = parcel.readArrayList(cls.getClassLoader());
        this.A08 = parcel.readArrayList(cls.getClassLoader());
        this.A06 = parcel.readString();
        this.A00 = parcel.readLong();
        this.A02 = C58022fB.values()[parcel.readInt()];
        this.A04 = parcel.readString();
        this.A01 = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
        this.A03 = parcel.readString();
        this.A09 = parcel.readByte() != 1 ? false : true;
    }

    public MessageActionsViewModel(String str, String str2, List list, List list2, String str3, long j, C58022fB r8, PointF pointF, String str4, boolean z) {
        this.A05 = str;
        this.A04 = str2;
        this.A07 = list;
        this.A08 = list2;
        this.A06 = str3;
        this.A02 = r8;
        this.A01 = pointF;
        this.A03 = str4;
        this.A00 = j;
        this.A09 = z;
    }
}
